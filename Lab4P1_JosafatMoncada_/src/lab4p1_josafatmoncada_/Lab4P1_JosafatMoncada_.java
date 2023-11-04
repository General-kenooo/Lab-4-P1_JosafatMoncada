/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_josafatmoncada_;
import java.util.Scanner;


public class Lab4P1_JosafatMoncada_ {


  
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
       Scanner Scanner= new Scanner (System.in);
       int option;
        System.out.println("******Menu******");
        System.out.println("Ejercicio 1");
        System.out.println("Ejercicio 2");
        System.out.println("Ejercicio 3");
        System.out.println("Ejercicio 4 Salir");
        System.out.println("Ingrese una de estas opciones");
        option = leer.nextInt();
        while (option > 0 && option < 4){
            switch (option){
                case 1:
                    System.out.println("Ingrese la palabra con un maximo de 5 caracteres");
                    String cad = Scanner.nextLine();
                    System.out.println(cad);
                    String acum= Scanner.nextLine();
                    if (cad.length() >= 5){
                        for (int i = cad.length()-1; i >= 0 ; i--){
                        
                               acum = acum + cad.charAt(i);
                       
                        }
                        System.out.println("cadena invertida;" + acum);  
                    }
                      
                    else{
                        System.out.println("Ingrese la palabra con un maximo de 5 caracteres");
                    }
                      break;
                case 2:
                    int num1=0;
                    int num2=0;
                    int num3=0;
                    char num, num_1, num_2;
                    System.out.println("Ingrese la cadena 1");
                    String cad1= Scanner.nextLine();
                    System.out.println("Ingrese la cadena 2");
                    String cad2= Scanner.nextLine();
                    System.out.println("Ingrese la cadena 3");
                    String cad3= Scanner.nextLine();
                    for (int i=0; i<cad1.length();i++){
                        num=cad1.charAt(i);
                        num1=num1+num;
                        
                    }
                    for (int j=0; j<cad2.length(); j++){
                        num_1=cad2.charAt(j);
                        num2=num2+num_1;
                    } 
                    for (int k=0; k<cad3.length(); k++){
                        num_2=cad3.charAt(k);
                        num3=num3+num_2;
                    }
                    System.out.println(""+num1);
                    System.out.println(""+num2);
                    System.out.println(""+num3);
                            
                    
                    break;
                case 3:
                    System.out.println("Ingrese una cadena:");
                    String inputt = Scanner.nextLine();
                    
                    System.out.println("Cadena cifrada:");
                    for (int i = 0; i < inputt.length(); i++){
                        char caracter= inputt.charAt(i);
                        char caractercif= (char) (caracter + 2);
                        System.out.println(caractercif);
                    }
                    System.out.println();
                    
                    break;
                    
            }
            System.out.println("Desea elegir otro ejercicio?");
            option = leer.nextInt();
                    
        }    
       
    }
}

