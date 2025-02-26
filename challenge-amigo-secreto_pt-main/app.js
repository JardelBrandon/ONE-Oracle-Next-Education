//O principal objetivo deste desafio é fortalecer suas habilidades em lógica de programação. 
// Aqui você deverá desenvolver a lógica para resolver o problema.

let amigos = [];

function adicionarAmigo() {
    let nome = document.querySelector('input').value;
    if (nome == '') {
        alert('Por favor, insira um nome.');
        return;
    }
    if (amigos.includes(nome)) {
        alert('Nome já adicionado');
        return;
    }
    amigos.push(nome);
    console.log(amigos);
    document.querySelector('input').value = '';
    atualizarAmigos();
}

function atualizarAmigos() {
    let listaAmigos = document.getElementById('listaAmigos');
    listaAmigos.innerHTML = '';
    amigos.forEach(nome => {
        let item = document.createElement('li');
        item.textContent = nome;
        listaAmigos.appendChild(item);
    })
}

function sortearAmigo() {
    if (amigos.length < 1) {
        alert('Adicione mais amigos para sortear');
        return;
    }
    let indexAmigoSorteado = Math.floor(Math.random() * amigos.length);
    let sorteado = amigos[indexAmigoSorteado];
    console.log(indexAmigoSorteado, sorteado);
    document.getElementById('resultado').textContent = sorteado;
    atualizarAmigos();
}