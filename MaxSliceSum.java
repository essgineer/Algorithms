public class Solution {
	int sum=0, i=0,j=0;
	public int solution(int[] A){
		int max=A[0];
		while(j<A.length){
			sum+=A[i];
			max= (sum>max)? sum:max;
			i++;  
			if(i==A.length){
				j++;
			  i=j;
			  sum=0;
			}
		}	
		return max; 
	}
}
