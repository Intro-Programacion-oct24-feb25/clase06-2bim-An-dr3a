/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Ejemplo12 {

    public static void main(String[] args) {
        /*Realizar un proceso repetitivo que permita realizar la división de 
        números ingresados por teclado; el resultado de cada división debe ir 
        almacenandose en cada posición del arreglo. Considerar las excepciones
        posibles*/
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese numero de cuantas divisones quiere realizar");
        int valor = entrada.nextInt();
        int[] resultados = new int[valor];

        for (int i = 0; i < valor; i++) {
            boolean bandera = true;
            while (bandera) {
                try {
                    entrada.nextLine();
                    System.out.println("Ingrese el dividendo");
                    int val1 = entrada.nextInt();
                    System.out.println("Ingrese el divisor");
                    int val2 = entrada.nextInt();

                    resultados[i] = val1 / val2;

                    bandera = false;
                } catch (ArithmeticException e) {
                    System.out.printf("(ArithmeticException) Ocurrió una "
                            + "excepción %s\n", e);
                } catch (InputMismatchException inputMismatchException) {
                    System.out.printf("(InputMismatchException) Ocurrió una "
                            + "excepción %s\n", inputMismatchException);

                }
                System.out.printf("%d\n", resultados[i]);
            }
        }

    }
}
