import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Esta é uma linha de comentário que será ignorada pelo compilador
        /* Este é um exemplo de comentário
        de várias linhas em Java
        que será ignorado pelo compilador */

        //CRIAÇÃO DE STRINGS
        /*Para criar uma String em Java,
        basta utilizar aspas duplas para delimitar o texto.
        Por exemplo: */

        String nome = "Alura";
        /*Nesse exemplo, a variável nome recebe uma String com o texto "Alura".
        É possível concatenar duas ou mais Strings utilizando o operador +,
        por exemplo: */

        String saudacao = "Olá, ";
        String mensagem = saudacao + nome + "!";


        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento:" + anoDeLancamento);
        double media = (9.8 + 6.3 + 8) /3;
      /*  boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        //Média calculada pelas 3 notas da Jack, Paulo e Suelem
        double media = (9.8 + 6.3 + 8) / 3;
        String sinopse = """
        Filme Top Gun
        Filme de aventura com galã dos anos 80
        Muito bom!
        """;
        System.out.println(sinopse);*/


        int classificacao;
        classificacao = (int) (media /2);//convertendo a media de double para int
        System.out.println(classificacao);


        public class Condicional {

            public static void main(String[] args) {

                int anoDeLancamento = 2022;
                boolean incluidoNoPlano = true;
                double notaDoFilme = 8.1;
                String tipoPlano = "plus";

                if(anoDeLancamento >= 2022){
                    System.out.println("Lançamentos que os clientes estão curtindo!");
                } else {
                    System.out.println("Filme retrô que vale a pena assistir!" );
                }

                if(incluidoNoPlano == true || tipoPlano.equals("plus"))
                // Dois "||" significa OU (or)
                // usar .equals() inves de == (comparar)


            }
        }

        //EXEMPLO SCANNER


         public class ExemploScanner {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite seu nome: ");
                String nome = scanner.nextLine();
                System.out.print("Digite sua idade: ");
                int idade = scanner.nextInt();
                System.out.print("Digite o valor que pretende investir esse mês: ");
                double valor = scanner.nextDouble();

                System.out.println(nome + " que tem " + idade + " anos, irá investir R$ " + valor + " esse mês.");

                scanner.close();
            }
        }



    }
}
