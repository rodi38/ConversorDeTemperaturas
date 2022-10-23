package conversor.temperatura;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidacaoDados {
    private final static Scanner scanner = new Scanner(System.in);
    static double validaDouble(String mensagem, String error){
        double retorna;
        while(true){
            try {
                System.out.print(mensagem);
                retorna = Double.parseDouble(scanner.next().replace(",","."));
                break;
            } catch (Exception e){
                System.out.print(error);

            }
        }
        return retorna;
    }
    static int validaInt(String mensagem, String error){
        int retorna;
        while(true){
            try {
                System.out.print(mensagem);
                retorna = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e){
                System.out.println(error);

            }
        }
        return retorna;
    }
    static String nomeTemperatura(String mensagem, String error){
        String retorno, base = "CFK";
        Map<String, String>m = new HashMap<>();
        m.put("C","Celcius");
        m.put("F","Fahrenheit");
        m.put("K","Kelvin");
        while(true){
            try{
                System.out.print(mensagem);
                retorno = scanner.next().toUpperCase();
                if (base.contains(retorno) && retorno.length() == 1){
                    retorno = m.get(retorno);
                    break;
                }
            } catch (Exception e){
                System.out.println(error);
            }
        }
        return retorno;
    }
    static String printConversor(double[] vetor, String simbolo){
        String string = "";
        simbolo = simbolo.substring(0,1);
        for (int i = 0; i < vetor.length; i++) {
            string += String.format("%.2f%sº", vetor[i], simbolo );
            if (i<vetor.length -1){
                string += " ";
            }
        }
        return string;
    }
}
