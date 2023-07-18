/*
Uma alternativa ao if/else é o switch case, que é uma estrutura
de controle de fluxo que permite executar diferentes
ações com base no valor de uma expressão.
É uma forma mais simplificada e legível de escrever
vários blocos if/else encadeados.

A sintaxe do switch case em Java é a seguinte:
 */
/*
        switch(expressão){
        case valor1:
        // código a ser executado se a expressão for igual a valor1
        break;
        case valor2:
        // código a ser executado se a expressão for igual a valor2
        break;
        case valor3:
        // código a ser executado se a expressão for igual a valor3
        break;
        ...
default:
        // código a ser executado se a expressão não for igual a nenhum valor
        break;
        }

*/
public class Main {
    public static void main(String[] args) {

        int dia = 3;
        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda-feira";
                break;
            case 3:
                nomeDia = "terça-feira";
                break;
            case 4:
                nomeDia = "quarta-feira";
                break;
            case 5:
                nomeDia = "quinta-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }

        System.out.println("O dia " + dia + " é " + nomeDia);


    }
}