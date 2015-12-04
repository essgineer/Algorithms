/**************
******Me*******
***************/
/* this program supplies a resizable table, with random integer values*/
//package tableGenerator;
import java.util.Random;
public class Generator {
	
	public static void main (String arg[]){
		int size=10; //size of table;
		Generator gen= new Generator();
		
		int[]tab = gen.gentab(size);
		for (int i:tab){
		System.out.print(" | tab:"+i);
	    }
	}
	public int[] gentab(int size){ 
		int[] tab=new int[size];                             //specification of the table and size
		for(int i=0;i<size;i++){
			Random rnd= new Random();
			tab[i]= rnd.nextInt(101);                        //random.nextInt(max - min + 1) + min
		}
		/*for (int i:tab){
			System.out.print(" | tab:"+i);
		}*/
		return tab;
	}
}
