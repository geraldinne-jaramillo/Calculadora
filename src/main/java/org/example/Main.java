package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("➖Dividamos 2 números➖");

        try {
            System.out.print("\uD83E\uDD16 Digita el primer número entero ");
            Integer num1 = scanner.nextInt();

            System.out.print("\uD83E\uDD16 Digita el segundo número entero ");
            Integer num2 = scanner.nextInt();

            Integer resultado = dividirDosNumeros(num1,num2);
            System.out.println("El resultado de la división es: " +resultado);

    }catch (InputMismatchException error) {
        System.out.println("❌ Error: Utilizaste una entrada prohibida ❌");
    } catch (Exception error) {
        System.out.println("upss, " +error.getMessage());
    }finally {
        System.out.println("Gracias, vuelva pronto.");
        scanner.close();
    }
}

public static Integer dividirDosNumeros (Integer nunm1, Integer num2) {
    if (num2 <= 0) {
        throw new ArithmeticException("❌No puedes dividir por cero.");
    }
    return num2;
}

}