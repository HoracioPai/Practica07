import java.util.Random;
/**
 *programa para ver funcion quicksort
 *@author mares cruz tlacaelel horacio
 */
public class Quick{
    //declaramos argumentos 
    public static void main(String [] args){

	Random rnd = new Random();
	int [] arr = new int [100000];
	
	for(int i = 0; i < arr.length; i++){
	    arr[i] = rnd.nextInt(100000);
	}

	System.out.print("\n");

	System.out.println();

	quickSort(arr, 0, arr.length-1);

	for(int i = 0; i< arr.length; i++){
	    System.out.print(arr [i]+ ", ");
	}
    }
    /**
     *definicon de quicksort
     */
    public static void quickSort(int[] arr, int izq, int der){
     /*@param int [] arr
     *@param int izq
     *@param int der
     */
	int pivote = arr[izq];
	int i = izq;
	int j = der;

	while(i<j){
	    while(arr[i] <= pivote && i<j){
		i++;
	    }
	    
	    while(arr[j]>pivote){
		j--;
	    }
	    
	    if(i<j){
		cambiar(arr, i, j);
	    }
	    
	}
	
	arr[izq] = arr[j];
	arr[j] = pivote;

	if(izq < (j - 1)){
	    quickSort(arr, izq, j - 1);
	}
	if(j + 1 < der){
	    quickSort(arr, j + 1, der);
	}
    }

    private static void cambiar(int[] arr, int a, int b){
	int aux = arr[a];
	arr[a] = arr[b];
	arr[b] = aux;
    }
}
