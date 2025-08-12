package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Restar {
    public static void main(String[] args) {

        //Calculadora
        //Solo numeros enteros
        //Debe: sumar, restar, multiplicar
        //Excepciones: no multiplicar por 0 ni dividir por 0

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa el primer numero: ");
            Integer numeroUno = scanner.nextInt();
            System.out.print("Ingresa el segundo numero: ");
            Integer numeroDos = scanner.nextInt();

            //Llamando al resultado
            Integer resultado = restar(numeroUno, numeroDos);
            System.out.println("El resultado de la resta es:  " + resultado);

        } catch (Exception error){
            System.out.println("Error utilizaste una entrada prohibida ");
        }

    }

    public static Integer restar (Integer numeroUno, Integer numeroDos){

        return numeroUno - numeroDos;
    }
}