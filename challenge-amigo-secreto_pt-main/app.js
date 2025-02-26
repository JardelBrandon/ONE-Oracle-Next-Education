//O principal objetivo deste desafio é fortalecer suas habilidades em lógica de programação. 
// Aqui você deverá desenvolver a lógica para resolver o problema.

let amigos = [];
let sorteados = [];
let inputNome =document.getElementById('amigo');

inputNome.addEventListener('keypress', function (event) {
    if (event.key === 'Enter') {
        event.preventDefault();
        adicionarAmigo();
    }
});

function adicionarAmigo() {
    let nome = inputNome.value;
    if (!nome || nome.trim() === '') {
        alert('Por favor, insira um nome.');
        return;
    }
    if (amigos.includes(nome)) {
        alert('Nome já adicionado');
        return;
    }
    if (sorteados.includes(nome)) {
        alert('Nome já sorteado');
        return;
    }
    amigos.push(nome);    
    inputNome.value = '';
    inputNome.focus();
    atualizarAmigos();
}

function atualizarAmigos() {
    let listaAmigos = document.getElementById('listaAmigos');
    listaAmigos.innerHTML = '';
    console.log('amigos:', amigos);
    amigos.forEach(nome => {
        let item = document.createElement('li');
        item.textContent = nome;
        listaAmigos.appendChild(item);
    })

    let listaSorteados = document.getElementById('listaSorteados');
    listaSorteados.innerHTML = '';
    console.log('sorteados: ', sorteados);
    sorteados.forEach((nome, index) => {
        let item = document.createElement('li');
        item.textContent = index + 1 + 'º ' + nome;
        listaSorteados.appendChild(item);
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
    document.getElementById('resultado').textContent = `Sorteado: ${sorteado}`;
    sorteados.push(amigos.splice(indexAmigoSorteado, 1)[0]);
    atualizarAmigos();
}