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

const IMC = () => {
    // Variáveis
    let nome = document.querySelector("#nome").value;
    let idade = document.querySelector("#idade").value;
    let genero = document.querySelector("#genero").value;
    let email = document.querySelector("#email").value;
    let telefone = document.querySelector("#telefone").value;
    let peso = document.querySelector("#peso").value;
    let altura = document.querySelector("#altura").value;
    let sqr = altura * altura;
    
    const result = peso / sqr;     
}

    form.addEventListener("submit", function(event){
        event.preventDefault();
        IMC();
    });