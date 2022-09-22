import java.util.Scanner;

public class Mercado {
    //Metodo feito para simplificar a 'main'
    public static void semana() {
        System.out.println("Qual o dia da semana?");
        System.out.println("1 - Domingo");
        System.out.println("2 - Segunda");
        System.out.println("3 - Terça");
        System.out.println("4 - Quarta");
        System.out.println("5 - Quinta");
        System.out.println("6 - Sexta");
        System.out.println("7 - Sabado");
    }

    @SuppressWarnings({"resource"})
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual o preço do produto? ");
        double preco = input.nextDouble();

        System.out.println();
        //chamada do metodo semana
        semana();
        /*
         * Proteção para impedir a implementação de um dia fora de questão.
         */
        int dia;
        do {
            dia = input.nextInt();
            if (dia < 1 || dia > 7) {
                System.out.println("Dia incorreto!");
                System.out.printf("Digite Novamente: ");
            }
        } while (dia < 1 || dia > 7);


        System.out.print("Qual a Hora da compra? (Apenas Horas)");
        /*
         * Proteção para impedir a implementação de uma hora incorreta.
         */
        int h;
        do {
            h = input.nextInt();
            if (h < 0 || h >= 24) {
                System.out.println("Hora incorreta!");
                System.out.printf("Digite Novamente: ");
            }
        } while (h < 0 || h >= 24);

        System.out.print("Minutos? (Apenas Minutos)");
        /*
         * Proteção para impedir a implementação de minutos incorretos.
         */
        int m;
        do {
            m = input.nextInt();
            if (m < 0 || m >= 60) {
                System.out.println("Hora incorreta!");
                System.out.printf("Digite Novamente: ");
            }
        } while (m < 0 || m >= 60);

        System.out.print("Segundos? (Apenas Segundos)");
        /*
         * Proteção para impedir a implementação de segundos incorretos.
         */
        int s;
        do {
            s = input.nextInt();
            if (s < 0 || s >= 60) {
                System.out.println("Hora incorreta!");
                System.out.printf("Digite Novamente: ");
            }
        } while (s < 0 || s >= 60);

        //Criando objeto 'COMPRA' e passando os parametros Hora(h) Minutos(m) e Segundos(s)
        HoraCompra COMPRA = new HoraCompra(h, m, s);

        /*
         * Observe que foi passado o objeto 'COMPRA' como parâmetro isso
         * funciona apenas com construtores, não adianta tentar passar em um
         * metodo que vai dar erro!
         */
        Final PF = new Final(dia, preco, COMPRA);

        System.out.println(COMPRA.toString());
        System.out.printf("O Preco do Produto é: %.2f", PF.getPF());
    }
}
