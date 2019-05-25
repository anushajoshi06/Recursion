/*Merge Sort

Sort an array A using Merge Sort.
Change in the input array itself. So no need to return or print anything.
Input format :
Line 1 : Integer n i.e. Array size
Line 2 : Array elements (separated by space)
Output format :
Array elements in increasing order (separated by space)
Constraints :
1 <= n <= 1000
Sample Input:
6 
2 6 8 5 4 3
Sample Output:
2 3 4 5 6 8
*/

public class solution {

	public static void mergeSort(int[] input){
		// Write your code here
			 for (int i = 0; i < input.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < input.length; j++){  
                if (input[j] < input[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = input[index];   
            input[index] = input[i];  
            input[i] = smallerNumber;  
        }  
	}
}
