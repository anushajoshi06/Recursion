/*Print Keypad

Given an integer n, using phone keypad find out and print all the possible strings that can be made using digits of input n.
Note : The order of strings are not important. Just print different strings in new lines.
Input Format :
Integer n
Output Format :
All possible strings in different lines
Constraints :
1 <= n <= 10^6
Sample Input:
23
Sample Output:
ad
ae
af
bd
be
bf
cd
ce
cf
*/

public class solution {

	public static void printKeypad(int input){
		// Write your code here
		String options[]={"","","abc","def","ghi","jkl","mno","pqrs","tru","wxyz"};
      printKeypadHelper(input,"",options);
	}
  public static void printKeypadHelper(int input,String ans,String options[]){
    if(input==0){
      System.out.println(ans);
      return;
    }
    int lastDigit=input%10;
    for(int i=0;i<options[lastDigit].length();i++){
      printKeypadHelper(input/10,options[lastDigit].charAt(i)+ans,options);
    }
    }
}
