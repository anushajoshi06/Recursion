/*Check Number in Array

Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
Do this recursively.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format : true or false
Constraints : 1 <= N <= 10^3
Sample Input :
3
9 8 10
8
Sample Output :
true
*/

public class Solution {
	
	public static boolean checkNumber(int input[], int x) {
		
		 if(input.length==0){
        return false;
        
      }
      if (input[0]==x){
        return true;
      }else{
        int smallInput[]=new int[input.length-1];
        for(int i=1;i<input.length;i++){
          smallInput[i-1]=input[i];
        
        }
        boolean smallAns=checkNumber(smallInput,x);
        return smallAns;
      
      }
	}
}