/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_metodos;

/**
 *
 * @author aylin
 */
public class EVA3_2_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        repetirMensaje("hola",5);//no regresa ningun valor
    }
    public static void repetirMensaje(String mensaje,int repeticion){
      for (int i=1; i<=repeticion; i++){
          System.out.println(mensaje);
      }
      }
}
