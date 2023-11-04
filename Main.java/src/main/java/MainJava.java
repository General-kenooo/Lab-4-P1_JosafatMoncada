/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main.java;

import java.util.Scanner;
public class MainJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
       Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del cuadrado: ");
        int cube = 0;
        for (int i = 0; i < cube; i++) {
            cube.append("* ");
        }
        cube.append("\n");
 
        // Generate the middle lines of the cube
        for (int i = 0; i < size - 2; i++) {
            cube.append("*");
            for (int j = 0; j < size - 2; j++) {
                if (j == i || j == size - 3 - i) {
                    cube.append("*");
                } else {
                    cube.append(" ");
                }
            }
            cube.append("*\n");
        }
 
        // Generate the bottom face of the cube
        for (int i = 0; i < size; i++) {
            cube.append("* ");
        }
        // Validación del tamaño del cuadrado
       
            }
        }
    }
}

   

