/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_capturar.clientes;

import java.util.Scanner;

/**
 *
 * @author aylin
 */
public class EVA3_11_CAPTURARCLIENTES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] clientes= new String[10];
        double[]credito = new double[10];
        capturarClientes(clientes,credito);
        imprimirArreglo(clientes);
    }
    public static void capturarClientes(String[]clientes,double credito[]){
        Scanner captu = new Scanner(System.in);
        for(int i=0;i<clientes.length;i++){
            System.out.println("nombre del cliente:");
            clientes[i]=captu.nextLine();
            System.out.println("credito:");
            credito[i]=captu.nextDouble();
            captu.nextLine();
        }
                
    }
    public static void imprimirArreglo(String[]arreglo){
        for (int i=0;i<arreglo.length;i++){
            System.out.println("["+arreglo[i]+"]");
    }
    System.out.println("");
    }
    public static void imprimirCredito(double[]credito){
        for (int i=0;i<credito.length;i++){
            System.out.println("["+credito[i]+"]");
    }
    }
    
}
