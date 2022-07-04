package Ejercicios;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Eduardo
 */
public class Ejercicio_1_2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cual es tu edad?");

        int edad = teclado.nextInt();
        edad = edad + 1;
        System.out.println("la edad que tendra dentro de 1 año es de " + edad);
    }

}
