package conversor.temperatura;
public class Main {
    public static void main(String[] args) {
        Saida.menu();
        int QuantidadeTemperaturas = ValidacaoDados.validaInt("Digite a quantidade de temperaturas a serem transformadas: ",
                "informe um número válido");
        String temperaturaOrigem = ValidacaoDados.nomeTemperatura("\"Digite a letra inicial da temperatura de origem: " +
                "(ex: C = Celsius, F = Fahrenheit)", "Informe a inicial corretamente.");
        String temperaturaTransformada = ValidacaoDados.nomeTemperatura("Digite letra inicial da temperatura a ser transformada:" +
                " (ex: C = Celsius, F = Fahrenheit)", "Informe a inicial corretamente.");
        double[] temperaturas = Entrada.entradaDeTemperaturas(QuantidadeTemperaturas,temperaturaOrigem,temperaturaTransformada);
        double[] conversao  = new double[temperaturas.length];;
        double somaOriginal = 0;
        double somaConvertida = 0;
        double mediaOriginal;
        double mediaConvertida;
        for (int i = 0; i < temperaturas.length ; i++) {
            somaOriginal+=temperaturas[i];
            if (temperaturaOrigem.charAt(0) == 'F'){
                conversao[i] = ConversorDeTemperaturas.conversorFahrenheit(temperaturas[i], temperaturaTransformada);
                somaConvertida +=conversao[i];
            }
            if (temperaturaOrigem.charAt(0) == 'C'){
                conversao[i] = ConversorDeTemperaturas.conversorCelsius(temperaturas[i], temperaturaTransformada);
                somaConvertida +=conversao[i];
            }
            if(temperaturaOrigem.charAt(0) == 'K'){
                conversao[i] = ConversorDeTemperaturas.conversorKelvin(temperaturas[i], temperaturaTransformada);
                somaConvertida +=conversao[i];
            }
        }
        mediaOriginal = somaOriginal/temperaturas.length;
        mediaConvertida = somaConvertida/conversao.length;
        Saida.imprimeTemperaturas(temperaturaOrigem, temperaturaTransformada, temperaturas, conversao);
        Saida.imprimeMedia(mediaOriginal, mediaConvertida);




    }





}
