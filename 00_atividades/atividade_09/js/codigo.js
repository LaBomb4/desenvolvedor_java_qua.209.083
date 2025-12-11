/*
Crie um programa utilizando Boostrap e JS que receba do usuário:
 - nome
 - data de nascimento
 - gênero
 - e-mail
 - telefone
 - peso
 - altura

E mostre na página todos esses dados junto com seu IMC e o seu diagnostico
*/

const form = document.querySelector("form");

const calcularIMC = (peso, altura) => {
    let imc = peso / (altura*altura);
    result = (imc < 18.5) ? " abaixo do peso." : 
             (imc < 25) ? " peso normal." :
             (imc < 30) ? " acima do peso." :
             (imc < 35) ? " obeso." :
             (imc < 40) ? " obesidade 2." : " vai morrer.";

    return `Seu IMC é ${imc.tofixed(2)}, estando assim, ${result}.`;
}

const exhibitA = () => {
    // Declaração de variáveis locais
    let nome = document.querySelector("#nome").value;
    let nascimento = document.querySelector("#nascimento").value;
    let genero = document.querySelector("#genero").value;
    let email = document.querySelector("#email").value;
    let telefone = document.querySelector("#telefone").value;
    let peso = document.querySelector("#peso").value.replace(",", ".");
    let altura = document.querySelector("#altura").value.replace(",", ".");

    // Saída de dados
    document.querySelector("#nomeResult").innerHTML = `Nome: $(nome)`;
    document.querySelector("#nascimentoResult").innerHTML = `Data de Nascimento: $(nascimento)`;
    document.querySelector("#generoResult").innerHTML = `Gênero: ${genero}`;
    document.querySelector("#emailResult").innerHTML = `E-mail: ${email}`;
    document.querySelector("#telefoneResult").innerHTML = `Telefone: ${telefone}`;
    document.querySelector("#pesoResult").innerHTML = `Peso: ${peso}`;
    document.querySelector("#alturaResult").value = `Altura: ${altura}`;
    document.querySelector("#imcResult").innerHTML = calcularIMC(peso, altura);

    // Evento
    form.addEventListener("submit", function(event) {
        event.preventDefault();
        exhibitA();
    });
}
