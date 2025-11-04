/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_metodos;

/**
 *
 * @author aylin
 */
public class EVA3_1_METODOS {
//public y static son modificadores
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //invocar el metodo
        //llamada procedimiento o funcion
        //1.si queremos recuperar el valor
        //2.usar el valor sin guardar
        int resu=calcularCuadrado(100);
        System.out.println("el cuadrado de 100es" + resu);
                System.out.println("el cuadrado de 100 es"+ calcularCuadrado(4));
                //no me interesa el resultado
                calcularCuadrado(4);
    }
    //modificadores
    //modificador de acceso:public,private,protcted,default
    //static-->se necesita para usar otros metodos en el main
    //public static
             //valor de retorno(tipo de dato)
    //nombre del metodo usar verbo
    //lista e parametros
    //cero o N CANTIDAD
    public static  int calcularCuadrado(int num){ //encabezado(header)
        //{}-->implementacion del metodo(cuerpo del metodo)
   
        int cuadrado = num+num;
    
        return cuadrado;
                
    

}
}

