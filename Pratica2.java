package praticas;

import java.util.Scanner;

public class Pratica2 {
    public static void main(String[] args) {
        System.out.print("Digite a temperatura em graus Celsius (°C): ");
        double celsius = scanner.nextDouble(); // Lê a temperatura em Celsius

        // Calcula a temperatura em Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Calcula a temperatura em Kelvin
        double kelvin = celsius + 273.15;

        // Exibe os resultados
        System.out.println("\n--- Resultados da Conversão ---");
        System.out.println("Temperatura em Celsius: " + String.format("%.2f", celsius) + " °C");
        System.out.println("Temperatura em Fahrenheit: " + String.format("%.2f", fahrenheit) + " °F");
        System.out.println("Temperatura em Kelvin: " + String.format("%.2f", kelvin) + " K");

        scanner.close(); // Fecha o objeto Scanner
    }
}