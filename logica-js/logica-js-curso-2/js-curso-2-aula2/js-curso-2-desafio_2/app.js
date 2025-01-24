// Desafio 1
// Criar uma função que exibe "Olá, mundo!" no console.
function olaMundo() {
    console.log("Olá, mundo!");
}
olaMundo();

// Desafio 2
// Criar uma função que recebe um nome como parâmetro e exibe "Olá, [nome]!" no console.
function olaNome(nome) {
    console.log("Olá, " + nome + "!");
}   
olaNome("Jardel Brandon");

// Desafio 3
// Criar uma função que recebe um número como parâmetro e retorna o dobro desse número.
function dobroNumero(numero) {
    return numero * 2;
}
console.log(dobroNumero(5));

// Desafio 4
// Criar uma função que recebe três números como parâmetros e retorna a média deles.
function mediaNumeros(numero1, numero2, numero3) {
    return (numero1 + numero2 + numero3) / 3;
}
console.log(mediaNumeros(5, 10, 15));

// Desafio 5
// Criar uma função que recebe dois números como parâmetros e retorna o maior deles.
function maiorNumero(numero1, numero2) {
    return numero1 > numero2 ? numero1 : numero2;
}
console.log(maiorNumero(10, 20));

// Desafio 6
// Criar uma função que recebe um número como parâmetro e retorna o resultado da multiplicação desse número por ele mesmo
function quadradoNumero(numero) {
    return numero * numero;
}
console.log(quadradoNumero(5));