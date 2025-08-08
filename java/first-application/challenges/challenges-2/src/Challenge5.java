/* 5. Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado. */

public class Challenge5 {
     public static void main(String[] args) {
         double valorEmDolares = 10.5;
         double cotacaoDolarReal = 4.94;
         double valorEmReais = valorEmDolares * cotacaoDolarReal;

         System.out.println("""
                 Valor em Dolares: %.2f
                 Valor em Real: %.2f                
                 _______________________
                 Cotação adotada: %.2f
                 """.formatted(valorEmDolares, valorEmReais, cotacaoDolarReal));
     }
}
