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

        //Comparação de Strings

        /*
        Em Java, é possível comparar duas Strings utilizando o operador ==.
        Porém, esse operador verifica apenas se as duas variáveis apontam
        para o mesmo objeto na memória, e não se o conteúdo das Strings é igual.
        Para comparar o conteúdo de duas Strings, é necessário utilizar o
        método equals(). Por exemplo:
         */

        String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }

        /*Nesse caso, o método equals() é utilizado para comparar o
        conteúdo da variável senha com a String "12345".
        Se as duas Strings forem iguais, a mensagem "Acesso autorizado!" será impressa,
        caso contrário, a mensagem "Senha incorreta." será impressa.
         */

        //Sintaxe do Text Block
       /* Para criar um Text Block em Java,
       basta utilizar três aspas duplas para delimitar o texto,
       seguidas de uma quebra de linha. Por exemplo:
        */

        String message = """
                  Olá, mundo!
                  Este é um Text Block.
                  Ele permite escrever textos com múltiplas linhas
                  sem precisar usar caracteres de escape ou quebras de linha manualmente ou concatenações.
                  """;


    }

}
