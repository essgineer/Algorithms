import java.util.Random;
public class InsertionSort {
	
	private static void tri(int[] A){
		for (int i=0;i<A.length;i++){
			int key =A[i];
			for (int j=i;j>0&& key<A[j-1];j--){
				A[j]=A[j-1];
				A[j-1]=key;				
			}
		}
		for(int k=0;k<A.length;k++){    //table display
			System.out.print(" "+ A[k]);
		}	
    }

    
	/*****************************/
	public static void main (String Arg[]){
		int size=10; 								//size of table;
		Generator gen = new Generator();
		
		int[]tab = gen.gentab(size);
		for (int i:tab){
		System.out.print(" "+i);    //random values display 
	    }
		System.out.println();
		tri(tab);                   // sort valuesdisplay 
	}
	/*******************************/
}
//my version
