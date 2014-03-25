/** (#)escalMat.java
 1. Escriba un programa escalMat.java que realice el escalado de matrices de n�meros reales. Escriba tambi�n un programa 
 UsaescalMat.java que lo utilice. Utilizando la t�cnica de implementaci�n de la interfaz Runnable, escriba ahora una clase 
 escalMatConcurrente.java que "paralelice" para escalar concurrentemente matrices. Dicho pograma podr�a dedicar un hilo por fila -o 
 por columna- para escalar cada fila -o columna- de forma paralela. Escriba tambi�n un programa UsamatConcurrente.java que la 
 utilice.
 
 * @author �lvaro Izquierdo D�az 
 * @version 1.00 2012/11/15
 */

import java.util.*;
public class escalMat {

    private double [][] p;
    private double k;

    /** @param q Representa a la matriz de precisi�n doble que ser� escalada
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