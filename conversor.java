import java.util.Scanner;

public class ConversorDeMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double taxaDolarParaReal = 5.50; // Substitua pela taxa de câmbio atual
        double taxaEuroParaReal = 6.60; // Substitua pela taxa de câmbio atual
        double taxaLibraParaReal = 7.70; // Substitua pela taxa de câmbio atual
        double taxaPesoArgentinoParaReal = 0.056; // Substitua pela taxa de câmbio atual
        double taxaPesoChilenoParaReal = 0.0070; // Substitua pela taxa de câmbio atual

        System.out.println("Bem-vindo ao Conversor de Moedas!");
        System.out.println("Escolha a opção desejada:");
        System.out.println("1. Converter de Reais para Dólar");
        System.out.println("2. Converter de Reais para Euro");
        System.out.println("3. Converter de Reais para Libras Esterlinas");
        System.out.println("4. Converter de Reais para Peso Argentino");
        System.out.println("5. Converter de Reais para Peso Chileno");
        System.out.println("6. Converter de Dólar para Reais");
        System.out.println("7. Converter de Euro para Reais");
        System.out.println("8. Converter de Libras Esterlinas para Reais");
        System.out.println("9. Converter de Peso Argentino para Reais");
        System.out.println("10. Converter de Peso Chileno para Reais");
        System.out.print("Digite o número da opção desejada: ");

        int opcao = scanner.nextInt();
        double valor;
        double resultado;

        switch (opcao) {
            case 1:
                System.out.print("Digite o valor em Reais: ");
                valor = scanner.nextDouble();
                resultado = valor / taxaDolarParaReal;
                System.out.println("Valor em Dólar: $" + resultado);
                break;
            case 2:
                System.out.print("Digite o valor em Reais: ");
                valor = scanner.nextDouble();
                resultado = valor / taxaEuroParaReal;
                System.out.println("Valor em Euro: €" + resultado);
                break;
            case 3:
                System.out.print("Digite o valor em Reais: ");
                valor = scanner.nextDouble();
                resultado = valor / taxaLibraParaReal;
                System.out.println("Valor em Libras Esterlinas: £" + resultado);
                break;
            case 4:
                System.out.print("Digite o valor em Reais: ");
                valor = scanner.nextDouble();
                resultado = valor / taxaPesoArgentinoParaReal;
                System.out.println("Valor em Peso Argentino: $" + resultado);
                break;
            case 5:
                System.out.print("Digite o valor em Reais: ");
                valor = scanner.nextDouble();
                resultado = valor / taxaPesoChilenoParaReal;
                System.out.println("Valor em Peso Chileno: $" + resultado);
                break;
            case 6:
                System.out.print("Digite o valor em Dólar: $");
                valor = scanner.nextDouble();
                resultado = valor * taxaDolarParaReal;
                System.out.println("Valor em Reais: R$" + resultado);
                break;
            case 7:
                System.out.print("Digite o valor em Euro: €");
                valor = scanner.nextDouble();
                resultado = valor * taxaEuroParaReal;
                System.out.println("Valor em Reais: R$" + resultado);
                break;
            case 8:
                System.out.print("Digite o valor em Libras Esterlinas: £");
                valor = scanner.nextDouble();
                resultado = valor * taxaLibraParaReal;
                System.out.println("Valor em Reais: R$" + resultado);
                break;
            case 9:
                System.out.print("Digite o valor em Peso Argentino: $");
                valor = scanner.nextDouble();
                resultado = valor * taxaPesoArgentinoParaReal;
                System.out.println("Valor em Reais: R$" + resultado);
                break;
            case 10:
                System.out.print("Digite o valor em Peso Chileno: $");
                valor = scanner.nextDouble();
                resultado = valor * taxaPesoChilenoParaReal;
                System.out.println("Valor em Reais: R$" + resultado);
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}