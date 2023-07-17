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


        /* Em Java, é possível formatar textos e números de diversas maneiras.
        Isso pode ser útil em diversas situações, como ao exibir valores para
        o usuário de uma maneira mais legível.
        Uma das maneiras mais comuns de se formatar textos em Java é utilizando
        o método format(), da classe String.
        Esse método permite formatar um texto utilizando diversos placeholders,
        que são representados pelo caractere % seguido de uma letra
        que indica o tipo de dado que será inserido no placeholder.
        Por exemplo, %s indica que uma String será inserida no placeholder, %d indica um valor inteiro
        e %f indica um valor decimal. Vamos ver um exemplo:
         */

        String name = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", name, idade, valor));

        /*"Meu nome é Maria, eu tenho 30 anos e hoje gastei 55,99 reais".
        Perceba também que o placeholder %.2f indica que o valor deve ser
        formatado com duas casas decimais.
         */

        /*Esse exemplo do que foi feito para o String.format também pode ser usado
        com Text Block, onde usa-se o método que citei em aula, o formatted,
        para informar as variáveis que deverão ser utilizadas no lugar dos placeholders.
        Veja esse exemplo:
         */


        String nome2 = "Joao";
        int aulas = 4;

        String mensagem2 = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome2, aulas);

        System.out.println(mensagem);


      /*

      Existem dois tipos de casting, o casting implícito e o explícito.
      Quando precisamos efetivamente dizer para ele, é o que chamamos de casting
      explícito, é o que fizemos agora.

      A tabela abaixo mostra, pelo tamanho, o que cabe dentro do outro.

        DE / PARA :	byte	short	char	int	long	float	double
        byte	    ---	    Impl.	(char)	Impl.	Impl.	Impl.	Impl.
        short	    (byte)	---	    (char)	Impl.	Impl.	Impl.	Impl.
        char	    (byte)	(char)	--- 	Impl.	Impl.	Impl.	Impl.
        int	        (byte)	(char)	(char)	---	    Impl.	Impl.	Impl.
        long	    (byte)	(char)	(char)	(int)	---	    Impl.	Impl.
        float	    (byte)	(char)	(char)	(int)	(long)	---	    Impl.
        double	    (byte)	(char)	(char)	(int)	(long)	(float)	 ---

     */

        /*
        Casting implícito
        O casting implícito é realizado automaticamente pelo compilador quando
        o tipo de dado de origem é compatível com o tipo de dado de destino.
        Por exemplo, é possível atribuir um valor de tipo int a uma variável
        do tipo double, pois o tipo double é maior e suporta todos os valores
        que o tipo int pode armazenar:
         */

        int x = 10;
        double y = x; // casting implícito

        /*
        Casting explícito
        O casting explícito é realizado quando o tipo de dado de origem é
        incompatível com o tipo de dado de destino.
        Nesse caso, devemos utilizar o operador de casting para realizar a
        conversão:
         */

        double z = 10.5;
        int r = (int) z; // casting explícito

    }

}
