/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Ejercicio_1_3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el año actual");

        int actual = teclado.nextInt();

        System.out.println("Introduce cuando naciste");

        int nacimiento = teclado.nextInt();

        int resultado = actual - nacimiento;

        System.out.println("Usted tiene " + resultado + " años");
    }

}
