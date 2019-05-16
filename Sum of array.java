/*Sum of Array

Given an array of length N, you need to find and return the sum of all elements of the array.
Do this recursively.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Output Format : Sum
Constraints : 1 <= N <= 10^3
Sample Input :
3
9 8 9
Sample Output :
26
*/


public class Solution {

	public static int firstIndex(int input[], int x) {
		
		 return firstIndex(input,x,0);
      
    }
  
  
	    public static int firstIndex(int input[],int x,int startIndex){
          
		if(startIndex==input.length){
			return -1;
			
			
		}
		if (input[startIndex]==x){
			return startIndex;
			
			
		}
		else{
			int smallAns=firstIndex(input,x,startIndex+1);
			return smallAns;
		}
	}
	
}