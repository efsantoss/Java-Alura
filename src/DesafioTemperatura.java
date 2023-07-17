/*public class Main {
    public static void main(String[] args) {

        String saudacao = "Olá, meu nome é ";
        String nome = "Alice ";
        String continuacao = "e minha idade é ";
        int idade = 17;
        System.out.println(saudacao + nome + continuacao + idade);

        /*

        //Desafio converter temperatura concluido
        System.out.println("Programa para converter Celcius para Fahrenheit");
        int grau_C = 30;
        double grau_F = (30 * 1.8) + 32;
        int Temperatura = (int) grau_F;
        System.out.println("A temperatura convertida em graus F é: " + Temperatura);
     }
 }
 */

public class DesafioTemperatura {

    public static void main(String[] args) {
        double temperaturaEmCelsius = 30.4;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaEmCelsius, temperaturaEmFahrenheit);

        System.out.println(mensagem);

        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);

    }

}
