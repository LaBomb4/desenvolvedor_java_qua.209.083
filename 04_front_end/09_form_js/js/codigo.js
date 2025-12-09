// Declaração de váriaveis
const form = document.querySelector("form");

// Eventos
// ativar evento
form.addEventListener('submit', function(event) {
    // Desativar o submit
    event.preventDefault();

    // Declaração de variáveis locais // # = id
    let texto = document.querySelector('#texto').value;

    // Exibe o texto em forma de caixa de diálogo
    alert(texto);
});