package conversor.temperatura;

import java.util.Scanner;

public class ConversorDeTemperaturas {
    static Scanner scanner = new Scanner(System.in);

    public static double conversorCelsius(double celsius, String temperaturaTransformada){
        if (temperaturaTransformada.charAt(0) == 'F'){
            return (celsius * (double)9/5)+32;
        } else if(temperaturaTransformada.charAt(0) == 'K') {
            return celsius + 273.15;
        }
        return celsius;
    }
    public static double conversorKelvin(double kelvin, String temperaturaTransformada){
        if (temperaturaTransformada.charAt(0) == 'C'){
            return kelvin - 273.15;
        } else if (temperaturaTransformada.charAt(0) == 'F') {
            return (kelvin - 273.15) * (double)9/5 + 32;
        }
        return kelvin;
    }
    public static double conversorFahrenheit(double fahrenheit, String temperaturaTransformada){
        if (temperaturaTransformada.charAt(0) == 'C'){
            return (fahrenheit - 32) * (double)5/9;
        } else if (temperaturaTransformada.charAt(0) == 'K') {
            return (fahrenheit - 32) * (double)5/9 + 273.15;
        }
        return fahrenheit;
    }
}
