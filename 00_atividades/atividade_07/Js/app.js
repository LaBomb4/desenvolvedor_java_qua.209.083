// app.js
const catalogEl = document.getElementById('catalog');
const searchInput = document.getElementById('searchInput');
const videoPlayer = document.getElementById('videoPlayer');
const playerTitle = document.getElementById('playerTitle');
const playerModalEl = document.getElementById('playerModal');
const playerModal = new bootstrap.Modal(playerModalEl, { keyboard: true });

let hls; // instancia hls.js

// Exemplo de dados locais; em app real, buscar /api/videos
const videos = [
  {
    id: "movie1",
    title: "Demo: Filme 1",
    description: "Exemplo com HLS e MP4.",
    thumb: "thumbnails/movie1.jpg",
    sources: {
      hls: "videos/movie1.m3u8",
      mp4: "videos/movie1.mp4"
    },
    subtitles: "subtitles/movie1.vtt"
  },
  {
    id: "movie2",
    title: "Demo: Filme 2 (MP4)",
    description: "Apenas MP4 para fallback.",
    thumb: "thumbnails/movie2.jpg",
    sources: {
      mp4: "videos/movie2.mp4"
    },
    subtitles: null
  }
];

// Cria cards no catálogo
function renderCatalog(list) {
  catalogEl.innerHTML = '';
  list.forEach(v => {
    const col = document.createElement('div');
    col.className = 'col-6 col-md-4 col-lg-3';
    col.innerHTML = `
      <div class="card bg-dark text-white h-100">
        <img src="${v.thumb}" class="card-img-top" alt="${v.title}">
        <div class="card-body d-flex flex-column">
          <h5 class="card-title">${v.title}</h5>
          <p class="card-text small text-muted mb-2">${v.description}</p>
          <div class="mt-auto">
            <button class="btn btn-primary w-100" onclick='openPlayer("${v.id}")'>
              <i class="bi bi-play-fill"></i> Assistir
            </button>
          </div>
        </div>
      </div>
    `;
    catalogEl.appendChild(col);
  });
}

// Filtrar por busca
searchInput.addEventListener('input', () => {
  const q = searchInput.value.toLowerCase();
  const filtered = videos.filter(v => v.title.toLowerCase().includes(q) || (v.description && v.description.toLowerCase().includes(q)));
  renderCatalog(filtered);
});

// Abre player com suporte HLS
function openPlayer(id) {
  const video = videos.find(v => v.id === id);
  if(!video) return;

  playerTitle.textContent = video.title;

  // Remove tracks and sources limpos
  while (videoPlayer.firstChild) videoPlayer.removeChild(videoPlayer.firstChild);
  videoPlayer.removeAttribute('src');
  videoPlayer.load();

  // Adiciona legendas se existir
  if (video.subtitles) {
    const track = document.createElement('track');
    track.kind = "subtitles";
    track.label = "Português";
    track.srclang = "pt";
    track.src = video.subtitles;
    track.default = true;
    videoPlayer.appendChild(track);
  }

  // Determinar source: prefer HLS
  const hlsUrl = video.sources.hls;
  const mp4Url = video.sources.mp4;

  if (hlsUrl && Hls.isSupported()) {
    // usa hls.js
    if (hls) { hls.destroy(); hls = null; }
    hls = new Hls();
    hls.loadSource(hlsUrl);
    hls.attachMedia(videoPlayer);
    hls.on(Hls.Events.MANIFEST_PARSED, function() {
      videoPlayer.play().catch(()=>{});
    });
  } else if (hlsUrl && videoPlayer.canPlayType('application/vnd.apple.mpegurl')) {
    // Safari native HLS
    videoPlayer.src = hlsUrl;
    videoPlayer.addEventListener('loadedmetadata', () => videoPlayer.play().catch(()=>{}), { once: true });
  } else if (mp4Url) {
    // Fallback para MP4
    videoPlayer.src = mp4Url;
    videoPlayer.addEventListener('loadedmetadata', () => videoPlayer.play().catch(()=>{}), { once: true });
  } else {
    alert('Fonte do vídeo não disponível.');
    return;
  }

  playerModal.show();
}

// keyboard shortcuts: espaço pause/play
document.addEventListener('keydown', (e) => {
  if (playerModalEl.classList.contains('show')) {
    if (e.code === 'Space') {
      e.preventDefault();
      if (videoPlayer.paused) videoPlayer.play(); else videoPlayer.pause();
    }
    if (e.code === 'KeyF') {
      // full screen
      if (document.fullscreenElement) document.exitFullscreen(); else videoPlayer.requestFullscreen();
    }
  }
});

// init
renderCatalog(videos);
