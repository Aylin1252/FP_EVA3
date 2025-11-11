/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_sobrecarga;

import java.util.Scanner;

/**
 *
 * @author aylin
 */
public class EVA3_13_SOBRECARGA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String resu;
       resu=capturar("introduce el nombre del cliente:");
       System.out.println(resu);
      double valor;
      valor=capturar("salario del empleado:",0.0);
      System.out.println(valor);
      int edad;
      edad =capturar("edad del usuario:" ,1);
              System.out.println(edad);
        
    }
        public static String capturar(String mensaje){
            Scanner captu=new Scanner (System.in);
            System.out.println(mensaje);
            return captu.nextLine();
        }
         public static double capturar(String mensaje,double dommy){
            Scanner captu=new Scanner (System.in);
            System.out.println(mensaje);
            return captu.nextDouble();
         }
         public static int capturar(String mensaje,int dommy){
            Scanner captu=new Scanner (System.in);
            System.out.println(mensaje);
            return captu.nextInt();
         }
}
         
