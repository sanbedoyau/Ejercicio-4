/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_4;

import java.util.Scanner;
public class Ejercicio_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Byte x;
        int y, z, w;
        System.out.print("Ingrese la edad de Juan:");
        x = input.nextByte();
        y = (2*x)/3;
        z = (4*x)/3;
        w = x + y + z;
        System.out.println("La edad de Juan es: " + x);
        System.out.println("La edad de Alberto es: " + y);
        System.out.println("La edad de Ana es: " + z);
        System.out.println("La edad de la mamá es: " + w);
    }
}
