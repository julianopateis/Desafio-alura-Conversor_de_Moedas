import java.util.Scanner;

public class ConversorDeMoeda {
    public static void main(String[] args) {
        System.out.println("Escolha '1' para converter a quantidade de dinheiro em Real para todas as moedas no programa");
        System.out.println("Escolha '2' para converter a quantidade de dinheiro em Dólar para todas as moedas no programa");
        System.out.println("Escolha '3' para converter a quantidade de dinheiro em Euro para todas as moedas no programa");
        System.out.println("Escolha '4' para converter a quantidade de dinheiro em Libra para todas as moedas no programa");

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o número escolhido:");
            int escolha = sc.nextInt();
            System.out.println("Coloque a quantidade desejada:");
            double quantidade = sc.nextDouble();

            switch (escolha) {
                case 1:
                    realParaOutro(quantidade);
                    break;
                case 2:
                    dolarParaOutro(quantidade);
                    break;
                case 3:
                    euroParaOutro(quantidade);
                    break;
                case 4:
                    libraParaOutro(quantidade);
                    break;
                default:
                    System.out.println("Escolha entre os números 1, 2, 3 e 4.");
            }
        }
    }

    public static void realParaOutro(double quant) {
        System.out.println("1 Real equivale a " + 0.18 + " Dólar(es)");
        System.out.println(quant + " Real(is) equivale a " + (quant * 0.20) + " Dólar(es)");
        System.out.println();
        System.out.println("1 Real equivale a " + 0.16 + " Euro(s)");
        System.out.println(quant + " Real(is) equivale a " + (quant * 0.18) + " Euro(s)");
        System.out.println();
        System.out.println("1 Real equivale a " + 0.14 + " Libra(s)");
        System.out.println(quant + " Real(is) equivale a " + (quant * 0.16) + " Libra(s)");
        System.out.println();
        System.out.println("1 Real equivale a " + 26.83 + " Yuan(s)");
        System.out.println(quant + " Real(is) equivale a " + (quant * 1.39) + " Yuan(s)");
        System.out.println();
    }

    public static void dolarParaOutro(double quant) {
        System.out.println("1 Dólar equivale a " + 5.10 + " Real(is)");
        System.out.println(quant + " Dólar(es) equivale a " + (quant * 5.10) + " Real(is)");
        System.out.println();
        System.out.println("1 Dólar equivale a " + 0.93 + " Euro(s)");
        System.out.println(quant + " Dólar(es) equivale a " + (quant * 0.93) + " Euro(s)");
        System.out.println();
        System.out.println("1 Dólar equivale a " + 0.80 + " Libra(s)");
        System.out.println(quant + " Dólar(es) equivale a " + (quant * 0.80) + " Libra(s)");
        System.out.println();
        System.out.println("1 Dólar equivale a " + 7.24 + " Yuan(s)");
        System.out.println(quant + " Dólar(es) equivale a " + (quant * 7.24) + " Yuan(s)");
        System.out.println();
    }

    public static void euroParaOutro(double quant) {
        System.out.println("1 Euro equivale a " + 5.49 + " Real(is)");
        System.out.println(quant + " Euro(s) equivale a " + (quant * 5.49) + " Real(is)");
        System.out.println();
        System.out.println("1 Euro equivale a " + 1.08 + " Dólar(es)");
        System.out.println(quant + " Euro(s) equivale a " + (quant * 1.08) + " Dólar(es)");
        System.out.println();
        System.out.println("1 Euro equivale a " + 0.86 + " Libra(s)");
        System.out.println(quant + " Euro(s) equivale a " + (quant * 0.86) + " Libra(s)");
        System.out.println();
        System.out.println("1 Euro equivale a " + 7.79 + " Yuan(s)");
        System.out.println(quant + " Euro(s) equivale a " + (quant * 7.79) + " Yuan(s)");
        System.out.println();
    }

    public static void libraParaOutro(double quant) {
        System.out.println("1 Libra equivale a " + 6.40 + " Real(is)");
        System.out.println(quant + " Libra(s) equivale a " + (quant * 6.40) + " Real(is)");
        System.out.println();
        System.out.println("1 Libra equivale a " + 1.25 + " Dólar(es)");
        System.out.println(quant + " Libra(s) equivale a " + (quant * 1.25) + " Dólar(es)");
        System.out.println();
        System.out.println("1 Libra equivale a " + 1.17 + " Euro(s)");
        System.out.println(quant + " Libra(s) equivale a " + (quant * 1.17) + " Euro(s)");
        System.out.println();
        System.out.println("1 Libra equivale a " + 9.08 + " Yuan(s)");
        System.out.println(quant + " Libra(s) equivale a " + (quant * 9.08) + " Yuan(s)");
        System.out.println();
    }
}
