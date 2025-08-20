import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    CurrencyConverter converter = new CurrencyConverter();

    public void show() {
        int opcao;
        do {
            System.out.println("""
                    Seja bem vindo ao conversor de moeda!
                    
                    Selecione a opção desejada:
                    
                    1) USD -> ARS
                    2) ARS -> USD
                    3) USD -> BRL
                    4) BRL -> USD
                    5) USD -> COP
                    6) COP -> USD
                    
                    7) Sair
                    """);

            opcao = scanner.nextInt();
            if (opcao == 7) { continue;}
            System.out.println("Digite o valor que deseja converter: ");
            double value = scanner.nextDouble();

            switch (opcao) {
                case 1:
                    converter.money("USD", "ARS", value);
                    break;
                case 2:
                    converter.money("ARS", "USD", value);
                    break;
                case 3:
                    converter.money("USD", "BRL", value);
                    break;
                case 4:
                    converter.money("BRL", "USD", value);
                    break;
                case 5:
                    converter.money("USD", "COP", value);
                    break;
                case 6:
                    converter.money("COP", "USD", value);
                    break;
                case 7:
                    System.out.println("Obrigado, atá mais!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;

            }
        } while (opcao != 7);
    }
}