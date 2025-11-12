/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_14_sobrecarga_de_metodos;

import java.util.Scanner;

/**
 *
 * @author aylin
 */
public class EVA3_14_SOBRECARGA_DE_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu=new Scanner (System.in);
        int valor;
        double resu,ar,base,altura,base2;
        do{
            menu();
            valor =captu.nextInt();
            switch (valor){
                case 1:
                    System.out.println("area de un circulo");
                    System.out.println("introduzca el valor del radio");
                    ar = captu.nextDouble();
                    resu = calcularArea(ar);
                    System.out.println("el area del circulo es:"+resu);
                    break;
                case 2:
                    System.out.println("area de un rectangulo");
                    System.out.println("introduzca el valor de la base");
                    base=captu.nextDouble();
                    System.out.println("introduzca el valor de la altura");
                    altura=captu.nextDouble();
                    resu=calcularArea(base,altura);
                    System.out.println("El area del rectangulo es:"+resu);
                    break;
                case 3:
                    System.out.println("area de un trapecio");
                    base=captu.nextDouble();
                    System.out.println("introduzca el valor de la base");
                    base2=captu.nextDouble();
                    System.out.println("introduzca el valor de la altura");
                    altura=captu.nextDouble();
                    resu=calcularArea(base,base2, altura);
                    System.out.println("el area del trapecion es:"+resu);
                    break;
                case 4:
                    System.out.println("hasta luego");
                            break;
            }
        }while(valor!=4);
    }
    public static void menu(){
        System.out.println("introduzca el numero para saber de que figura quieres calcular el area");
        System.out.println("1-circulo");
        System.out.println("2-rectangulo");
        System.out.println("3-trapecio");
        System.out.println("4-salir");
                                                                                                            
    }
       public static double calcularArea (double radio){
          return 3.1416*(radio*radio); 
       }                     
       public static double calcularArea(double base,double altura){
           return base*altura;
       }                     
     public static double calcularArea(double base,double base2,double altura){
         return((base+base2)*altura)/2;
     }                      
      
}                     
                            
            
        
        
