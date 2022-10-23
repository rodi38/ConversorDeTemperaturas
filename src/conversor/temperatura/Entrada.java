package conversor.temperatura;

import java.util.Scanner;

public class Entrada {
    static Scanner scanner = new Scanner(System.in);
    /*
    static String temperaturaOriginal(){
        String temperaturaOrigem;
        String msg = "Digite a letra inicial da temperatura de origem: (ex: C = Celsius, F = Fahrenheit)";
        temperaturaOrigem = ValidacaoDados.nomeTemperatura(msg, "Informe a inicial corretamente.");
        return temperaturaOrigem;
    }
    */
    /*static String temperaturaTransformada(){
        String temperaturaTransformada;
        String msg = "Digite letra inicial da temperatura a ser transformada: (ex: C = Celsius, F = Fahrenheit)";
        temperaturaTransformada = ValidacaoDados.nomeTemperatura(msg, "Digite a inicial corretamente.");
        return temperaturaTransformada;
    }
    */
    static double[] entradaDeTemperaturas(int quantidade, String origem, String transformada){
        System.out.printf("Digite as temperaturas em %s a serem convertidas para %s: \n",
                origem, transformada);
        double[] temperaturasArmazenadas = new double[quantidade];
        for (int i = 0; i < temperaturasArmazenadas.length; i++) {
            temperaturasArmazenadas[i] = ValidacaoDados.validaDouble("", "Informe a temperatura " +
                    String.format("em %s corretamente. ", transformada));
        }
        return temperaturasArmazenadas;
    }
}
