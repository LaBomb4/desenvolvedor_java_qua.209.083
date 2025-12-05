// server/server.js
const express = require('express');
const path = require('path');
const app = express();
const PORT = process.env.PORT || 3000;

app.use(express.static(path.join(__dirname, '..', 'public')));

// API simples retornando o catálogo (poderia vir de DB)
app.get('/api/videos', (req, res) => {
  res.json([
    {
      id: "movie1",
      title: "Demo: Filme 1",
      description: "Exemplo com HLS e MP4.",
      thumb: "/thumbnails/movie1.jpg",
      sources: { hls: "/videos/movie1.m3u8", mp4: "/videos/movie1.mp4" },
      subtitles: "/subtitles/movie1.vtt"
    }
    // ...
  ]);
});

app.listen(PORT, () => console.log(`Server rodando em http://localhost:${PORT}`));