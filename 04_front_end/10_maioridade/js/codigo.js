const form = document.querySelector('form');

// Função para calcular a maioridade
const maioridade = () => {
    // Declaração das variáveis locais
    let nome = document.querySelector('#nome').value;
    let idade = document.querySelector('#idade').value;
    const result = (idade >= 18) ? "é maior de idade" : "é menor de idade";

    // Saida de dados
    document.querySelector('#result').innerHTML = `${nome} ${result}`;
}
    // Events
form.addEventListener('submit', function(event) {
    event.preventDefault();
    maioridade();
});