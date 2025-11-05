/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_metodos;

import java.util.Scanner;

/**
 *
 * @author aylin
 */
public class EVA3_3_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu=new Scanner (System.in);
        int valor;
        do{
        imprimirMenu();
        valor=captu.nextInt();
        switch(valor){
            case 1:
                System.out.println("sumar dos numeros");;
                realizarSuma();
            break;
            case 2:
                System.out.println("calcular la potencia");
                realizarPotencia();
            break;
            case 3:
                break;
                    
        }
        }while (valor!=4);
    }
    //IMPRIMIR UN MENU
    public static void imprimirMenu(){
        System.out.println("bienvenido al sistema");
        System.out.println("elige la opcion que necesitas");
        System.out.println("1-calcular una suma");
        System.out.println("2-calcular una potencia");
         System.out.println("3-imprimir un mensaje");
         System.out.println("4-terminar");
    }
    //
    public static void realizarSuma(){
      Scanner captu = new Scanner (System.in);
      int val1,val2;
      System.out.println("valor 1:");
      val1=captu.nextInt();
      System.out.println("valor 2:");
      val2=captu.nextInt();
      int resu = sumar(val1,val2);
      System.out.println("la suma es"+ resu);
    }
    public static int sumar (int num1,int num2){
        return num1 + num2;
    }
    //calcular una potencia
    public static void realizarPotencia(){
        Scanner captu = new Scanner (System.in);
      int val1,val2;
      System.out.println("base:");
      val1=captu.nextInt();
      System.out.println("exponente:");
      val2=captu.nextInt();
    
    }
    public static int calcularPotencia(int base,int expo){
        //ciclo-->for
        //acumulador --->multiplicacion
        
        
        int pot = 1;
        for(int i=1;i<=expo;i++){
            pot= pot+base;
        }
        return pot;
    }
}
