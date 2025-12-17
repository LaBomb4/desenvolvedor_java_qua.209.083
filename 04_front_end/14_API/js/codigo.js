const form = document.querySelector("form");
const telefoneMask = document.querySelector("#telefone");
const cpfMask = document.querySelector("#cpf");
const cepMask = document.querySelector("#cep");
const emailMask = document.querySelector("#email");
const pesquisaCep = document.querySelector("#cep");

const vassoura = () => {
    document.querySelector("#estado").value = ("");
    document.querySelector("#cidade").value = ("");
    document.querySelector("#bairro").value = ("");
    document.querySelector("#logradouro").value = ("");
    document.querySelector("#estado").value = ("");
    document.querySelector("#complemento").value = ("");
    document.querySelector("#complemento").value = ("");
}

const meuCallback = (conteudo) => {
    if (!("erro" in conteudo)) {
        document.querySelector("#estado").value = (conteudo.uf);
        document.querySelector("#cidade").value = (conteudo.localidade);
        document.querySelector("#bairro").value = (conteudo.bairro);
        document.querySelector("#logradouro").value = (conteudo.logradouro);
        document.querySelector("#complemento").value = (conteudo.complemento);
    } else {
        vassoura();
        alert("CEP NÃO ENCONTRADO!");
    }
}

if (telefoneMask) {
  telefoneMask.addEventListener("input", function () {
    let v = this.value.replace(/\D/g, "");          // apenas números
    if (v.length > 11) v = v.slice(0, 11);          // limita a 11 dígitos

    if (v.length <= 10) {
      // formato (XX) XXXX-XXXX
      v = v.replace(/^(\d{2})(\d{0,4})(\d{0,4}).*/, "($1) $2-$3");
    } else {
      // formato (XX) 9XXXX-XXXX (11 dígitos)
      v = v.replace(/^(\d{2})(\d{5})(\d{0,4}).*/, "($1) $2-$3");
    }

    // remove hífen final vazio, caso exista
    this.value = v.replace(/-$/, "");
  });
}

// Máscara de CPF (XXX.XXX.XXX-XX)
if (cpfMask) {
  cpfMask.addEventListener("input", function () {
    let v = this.value.replace(/\D/g, "");     // apenas números
    if (v.length > 11) v = v.slice(0, 11);     // limita a 11 dígitos

    v = v.replace(/(\d{3})(\d)/, "$1.$2");
    v = v.replace(/(\d{3})(\d)/, "$1.$2");
    v = v.replace(/(\d{3})(\d{1,2})$/, "$1-$2");

    this.value = v;
  });
}

pesquisaCep.addEventListener("blur", function(){
    let cep = document.querySelector("#cep").value.replace(/\D/g, '');

    if (cep != ''){
        let validarCep = /^[0-9]{8}$/;

        if (validarCep.test(cep)){
            document.querySelector("#estado").value = "loading...";
            document.querySelector("#cidade").value = "loading...";
            document.querySelector("#bairro").value = "loading...";
            document.querySelector("#logradouro").value = "loading...";
            document.querySelector("#complemento").value = "loading...";

            let scripter = document.createElement("script");

            scripter.src = "https://viacep.com.br/ws/" + cep + "/json/?callback=meuCallback";

            document.body.appendChild(scripter);
        }
        else{
            vassoura();
            alert("Formato do CEP Inválido!");
        }
    }
    else{
        vassoura();
    }
});

if (cepMask) {
  // Máscara ao digitar: 00000-000
  cepMask.addEventListener("input", function () {
    let v = this.value.replace(/\D/g, ""); // só números
    if (v.length > 8) v = v.slice(0, 8);   // limita a 8 dígitos
    v = v.replace(/^(\d{5})(\d)/, "$1-$2"); // aplica o traço após 5 dígitos
    this.value = v;
  });

  // Ao sair do campo: garante formato e (opcional) busca por endereço
  cepMask.addEventListener("blur", function () {
    let v = this.value.replace(/\D/g, "");
    if (v.length === 8) {
      // já está completo — mantém o formato 00000-000
      this.value = v.replace(/^(\d{5})(\d{3})$/, "$1-$2");

    } else {
      // não está completo — opcionalmente limpar ou avisar
      this.value = v ? v.replace(/^(\d{5})(\d{0,3})/, "$1-$2").replace(/-$/, "") : "";
    }
  });
}

// TODO: 2º FUNÇÕES DE MÁSCARA DE ENTRADA E FUNÇÃO PESQUISACEP
const exibirDados = () => {
    const nome = document.querySelector("#nome").value;
    const email = document.querySelector("#email").value;
    const nascimento = document.querySelector("#nascimento").value;
    const telefone = document.querySelector("#telefone").value;
    const cpf = document.querySelector("#cpf").value;
    const cep = document.querySelector("#cep").value;
    const estado = document.querySelector("#estado").value;
    const cidade = document.querySelector("#cidade").value;
    const bairro = document.querySelector("#bairro").value;
    const logradouro = document.querySelector("#logradouro").value;
    const complemento = document.querySelector("#complemento").value;
    const numero = document.querySelector("#numero").value;

    const setResult = (selector, html) => {
        const el = document.querySelector(selector);
        if (el) el.innerHTML = html;
    };

    setResult("#nomeResult", `<b>Nome:</b> ${nome}`);
    setResult("#emailResult", `<b>E-mail:</b> ${email}`);
    setResult("#nascimentoResult", `<b>Nascimento:</b> ${nascimento}`);
    setResult("#telefoneResult", `<b>Telefone:</b> ${telefone}`);
    setResult("#cpfResult", `<b>CPF:</b> ${cpf}`);
    setResult("#cepResult", `<b>CEP:</b> ${cep}`);
    setResult("#estadoResult", `<b>Estado:</b> ${estado}`);
    setResult("#cidadeResult", `<b>Cidade:</b> ${cidade}`);
    setResult("#bairroResult", `<b>Bairro:</b> ${bairro}`);
    setResult("#logradouroResult", `<b>Logradouro:</b> ${logradouro}`);
    setResult("#complementoResult", `<b>Complemento:</b> ${complemento}`);
    setResult("#numeroResult", `<b>Número:</b> ${numero}`);
};


form.addEventListener('submit', function(event){
    event.preventDefault("");
})