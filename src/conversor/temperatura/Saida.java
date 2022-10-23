package conversor.temperatura;

public class Saida {
    static void imprimeTemperaturas(String temperaturaOrigem, String temperaturaTransformada, double[] arrOrigem, double[] arrTransformada){
        System.out.printf("Você escolheu converter de %s para %s \n",
                temperaturaOrigem, temperaturaTransformada);
        System.out.println("Temperaturas enviadas: "+ ValidacaoDados.printConversor(arrOrigem, temperaturaOrigem));
        System.out.println("-------------------------------------------------------------");
        System.out.print("Temperaturas convertidas:"+ ValidacaoDados.printConversor(arrTransformada, temperaturaTransformada));
        System.out.println("\n-------------------------------------------------------------");
    }
    static void imprimeMedia(double mediaOriginal, double mediaTransformada){
        System.out.printf("A media das temperaturas convertidas é: %.1f \n", mediaOriginal);
        System.out.printf("A media das temperaturas convertidas é: %.1f \n", mediaTransformada);
    }
    static void menu(){
        System.out.println("-------------------------------------------------------------");
        System.out.println("Seja bem vindo ao conversor de temperaturas.");
        System.out.println("Neste programa você consegue converter qualquer temperatura");
        System.out.println("-------------------------------------------------------------");
    }
}
