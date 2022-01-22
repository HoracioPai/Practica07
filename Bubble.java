/*programa para usar bubblesort
 *@author mares cruz tlacaelel horacio 
*/
import java.util.Random;
    public class Bubble
   {
       public static void main(String[] args){
	//decaramos el arreglo
	Random rnd = new Random();
	int[] ar = new int[10000];

	//aplicamos el metodo bubble
	
	for(int i=0; i < ar .length; i++){
	    ar [i] = rnd.nextInt(10000);
	}

	for(int i=0; i < ar. length; i++){
	    
	    for(int j=0; j<ar .length-1; j++){
		if(ar [j] > ar [j+1]){
		    //@param de los parametros que daran funcionalidad 
		    int aux = ar [j];
		    ar [j] = ar [j+1];
		    ar [j+1] = aux;
		}
	    }
	}

	for(int i = 0; i<ar .length; i++){
 
	    System.out.println(ar [i] + " ");
	}
    }
    
				   
}
