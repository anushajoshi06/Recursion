/*Return Keypad

Given an integer n, using phone keypad find out all the possible strings that can be made using digits of input n.
Note : The order of strings are not important.
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
public static String[] helper(int n,String options[]){
    if(n==0){
      String ans[]={""};
      return ans;
      
    }
    int lastDigit=n/10;
  String smallans[]=helper(lastDigit,options);
  String get=options[n%10];
  String ans[]=new String[get.length()*smallans.length];
  int k=0;
    for(int i=0;i<get.length();i++){
      for(int j=0;j<smallans.length;j++){
        ans[k]=smallans[j]+get.charAt(i);
        k++;
      }
    
    }
  return ans;
    }
	
	public static String[] keypad(int n){
		// Write your code here
String options[]={"","","abc","def","ghi","jkl","mno","pqrs","tru","wxyz"};
  return helper(n,options);
	}
	
}
