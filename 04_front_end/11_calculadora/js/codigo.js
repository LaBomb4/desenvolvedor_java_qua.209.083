const form = document.querySelector("form");

const calcular = () => {
    // Declaração de variáveis locais
    let x = document.querySelector('#x').value;
    let y = document.querySelector('#y').value;
    let operador = document.querySelector("#operador").value;
    let result = 0;
    
    // Verifica a operação selecionada
    switch (operador){
        case "soma":
            result = x + y;
            document.querySelector("#result").innerHTML = result;
        break;
        case "subtração":
            result = x - y;
            document.querySelector("#result").innerHTML = result;
        break   
        case "multiplicação":
            result = x * y;
    // TODO: Terminar a verificação
    }
    // TODO: Terminar função calculadora
}

form.addEventListener("submit", function(event){
    event.preventDefault();
    calcular();
});