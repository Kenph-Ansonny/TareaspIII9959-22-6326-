/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package javaapplication16;

import java.util.Arrays;

/**
 *
 * @author kenph
 */
public class JavaApplication16 {
    int [] numeros  = {7,2,4,8,3,9,1,5,10,6};
        Arrays.sort(numeros);
        //numeros = new int[5];
        
        //Burbuja
        int cantIntercambios = 0;
        int [] lista = {7,2,4,8,3,9,1,5,10,6};
        //Usamos un bucle anidado, saldra cuando este ordenado el array
        for (boolean ordenado=false;!ordenado;){
            for (int i=0;i<lista.length-1;i++){
                if (lista[i]>lista[i+1]){
                    //Intercambiamos valores
                    int variableauxiliar=lista[i];
                    lista[i]=lista[i+1];
                    lista[i+1]=variableauxiliar;
                    //indicamos que hay un cambio
                    cuentaintercambios++;
                }
            }
            //Si no hay intercambios, es que esta ordenado.
            if (cantIntercambios==0){
                ordenado=true;
            }
            //Inicializamos la variable de nuevo para que empiece a contar de nuevo
            cantIntercambios=0;
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
