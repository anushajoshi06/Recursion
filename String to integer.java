/*String to Integer

Write a recursive function to convert a given string into the number it represents. 
That is input will be a numeric string that contains only numbers, you need to convert 
the string into corresponding integer and return the answer.

Input format :
Numeric string (string, Eg. "1234")
Output format :
Corresponding integer (int, Eg. 1234)
Sample Input 1 :
1231
Sample Output 1:
1231
Sample Input 2 :
12567
Sample Output 2 :
12567
*/

import java.util.*;
public class solution {
static int x =0;
static int counter = 0;
	public static int convertStringToInt(String input){
		// Write your code here
  if(input.length()==1){
       x= Integer.parseInt(input.substring(0,1));
        return x;
    }
    else{
        x = (x*10)+Integer.parseInt(input.substring(0,1));
        counter++;
        return convertStringToInt(input.substring(counter,input.length()-1));
    }
	}
}
