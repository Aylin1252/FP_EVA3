/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_4_temperatura;

import java.util.Scanner;

/**
 *
 * @author aylin
 */
public class EVA_4_TEMPERATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        double far , resu,kel,Cels;
        System.out.println("Grados fahrenheit");
        far=captu.nextDouble();
        resu=covertirFarCelsius(far);
        System.out.println(far+"Farenheit="+resu+"c");
        System.out.println("Grados kelvin");
        kel=captu.nextDouble();
        resu=covertirCelKelvin(kel);
        System.out.println(kel +"kelvin="+resu+"c");
        System.out.println("Grados Celsius");
        Cels=captu.nextDouble();
        resu=covertirKelCelsius(Cels);
        System.out.println(Cels +"Celsius="+resu+"c");
    }
    public static double covertirFarCelsius(double far){
        double resu = (far-32)/1.8;
        return resu;
    }
    public static double covertirCelKelvin(double kel){
       
        double resu = (kel+273.15);
        return resu;
    }
    public static double covertirKelCelsius(double Cels){
       
        double resu = (Cels-273.15);
        return resu;
    }
   public static void imprimirMenu(){
        System.out.println("bienvenido al sistema");
        System.out.println("elige la opcion que necesitas");
        System.out.println("1-calcular Fahrenheit a Celsius");
        System.out.println("2-calcular Celsius a Kelvin");
         System.out.println("3-Calcular kelvin a celsius");
         System.out.println("4-terminar");
   }
}
