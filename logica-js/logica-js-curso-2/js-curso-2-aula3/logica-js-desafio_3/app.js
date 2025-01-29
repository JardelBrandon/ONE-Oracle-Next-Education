// Desafio 1
// Crie uma função que calcule o índice de massa corporal (IMC) de uma pessoa.
// A partir de sua altura, em metros, e peso, em quilogramas, que serão recebidos como parâmetro.
function calcularIMC(altura, peso) {
    return peso / (altura ** 2);
}
peso = parseFloat(prompt('Digite seu peso em kg:'));
altura = parseFloat(prompt('Digite sua altura em metros:'));
let imc = calcularIMC(altura, peso);
alert(`Seu IMC é ${imc.toFixed(2)}`);

// Desafio 2
// Crie uma função que calcule o valor do fatorial de um número passado como parâmetro.
// O fatorial de um número é calculado pela multiplicação desse número por todos os seus antecessores até 1.
function calcularFatorial(numero) {
    let fatorial = 1;
    for (let i = numero; i > 0; i--) {
        fatorial *= i;
    }
    return fatorial;
}
numero = parseFloat(prompt('Digite um número para calcular o fatorial:'));
let fatorial = calcularFatorial(numero);
alert(`O fatorial de ${numero} é ${fatorial}`);

// Desafio 3
// Crie uma função que converte um valor em dólar, passado como parâmetro, e retorna o valor equivalente em reais. 
// Para isso, considere a cotação do dólar igual a R$4,80.
function converterDolarParaReal(dolar) {
    return dolar * 4.8;
}
dolar = parseFloat(prompt('Digite o valor em dólar:'));
let real = converterDolarParaReal(dolar);
alert(`O valor em reais é R$${real.toFixed(2)}`);

// Desafio 4
// Crie uma função que mostre na tela a área e o perímetro de uma sala retangular. 
// Utilizando altura e largura que serão dadas como parâmetro.
function calcularAreaPerimetroSala(altura, largura) {
    let area = altura * largura;
    debugger;
    let perimetro = 2 * (altura + largura);
    return `Área: ${area} m²\nPerímetro: ${perimetro} m`;
}
altura = parseFloat(prompt('Digite a altura da sala em metros:'));
largura = parseFloat(prompt('Digite a largura da sala em metros:'));
let resultado = calcularAreaPerimetroSala(altura, largura);
alert(resultado);

// Desafio 5
// Crie uma função que mostre na tela a área e o perímetro de uma sala circular. 
// Utilizando seu raio que será fornecido como parâmetro. Considere Pi = 3,14.
function calcularAreaPerimetroSalaCircular(raio) {
    let area = 3.14 * raio ** 2;
    let perimetro = 2 * 3.14 * raio;
    return `Área: ${area} m²\nPerímetro: ${perimetro} m`;
}
raio = parseFloat(prompt('Digite o raio da sala circular em metros:'));
resultado = calcularAreaPerimetroSalaCircular(raio);
alert(resultado);

// Desafio 6
// Crie uma função que mostre na tela a tabuada de um número dado como parâmetro.
function tabuada(numero) {
    let tabuada = '';
    for (let i = 0; i <= 10; i++) {
        tabuada += `${numero} x ${i} = ${numero * i}\n`;
    }
    return tabuada;
}
numero = parseFloat(prompt('Digite um número para ver a tabuada:'));
let tabuadaResultado = tabuada(numero);
alert(tabuadaResultado);