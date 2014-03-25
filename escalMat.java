/** (#)escalMat.java
 1. Escriba un programa escalMat.java que realice el escalado de matrices de números reales. Escriba también un programa 
 UsaescalMat.java que lo utilice. Utilizando la técnica de implementación de la interfaz Runnable, escriba ahora una clase 
 escalMatConcurrente.java que "paralelice" para escalar concurrentemente matrices. Dicho pograma podría dedicar un hilo por fila -o 
 por columna- para escalar cada fila -o columna- de forma paralela. Escriba también un programa UsamatConcurrente.java que la 
 utilice.
 
 * @author Álvaro Izquierdo Díaz 
 * @version 1.00 2012/11/15
 */

import java.util.*;
public class escalMat {

    private double [][] p;
    private double k;

    /** @param q Representa a la matriz de precisión doble que será escalada
     *  @param num Representa el valor con que se va a escalar la matriz
     *  @exception No se producen excepciones
     */

    public escalMat(double[][] q, double num) {
    p = q;
    k = num;
    }
    
    /** @exception No se producen excepciones
     */
    
    public void escalar(){
    	for(int i = 0;i<p.length;i++){
    		for(int j = 0;j<p[i].length;j++){
    		p[i][j] = p[i][j] * k;
    		}
    	}
    
    }
    
   
    
}