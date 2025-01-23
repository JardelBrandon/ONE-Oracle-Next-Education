alert('Boas vindas ao jogo do número secreto');
let numeroSecreto = 8;
console.log(numeroSecreto);
let chute;
let tentativas = 0;

// enquanto chute for diferente do número secreto
while (chute != numeroSecreto) {
    chute = prompt('Escolha um número entre 1 e 10');
    tentativas++;
    // se chute for igual ao número secreto
    if (chute == numeroSecreto) {
        alert(`Você acertou o número secreto ${numeroSecreto} em ${tentativas} tentativas!`);
    } else {
        if (chute > numeroSecreto) {
            alert(`O número secreto é menor que ${chute}`);
        } else {
            alert(`O número secreto é maior que ${chute}`);
        }
    }
}
