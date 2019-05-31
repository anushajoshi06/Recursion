/*Print all Codes

Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. Write a program to print the list of all possible codes that can be generated from the given string.
Note : The order of codes are not important. Just print them in different lines.
Input format : A numeric string

Sample Input:
1123
Sample Output:
aabc
kbc
alc
aaw
kw
*/

public class solution {

	public static void printAllPossibleCodes(String input) {
		// Write your code here
      printCodes(input,"");
    }
 private static void printCodes(String input, String ans) {
    if (input.length() == 0) {
        System.out.println(ans);
        return;
    }

    String ch1 = input.substring(0, 1);
    String restOfTheString1 = input.substring(1);

    if (Integer.parseInt(ch1, 10) > 0) {
        char code = (char) (Integer.parseInt(ch1, 10) + 'a' - 1);
        printCodes(restOfTheString1, ans + code);
    }

    if (input.length() >= 2) {
        String ch12 = input.substring(0, 2);
        String ros2 = input.substring(2);

        if (Integer.parseInt(ch12, 10) > 0 && Integer.parseInt(ch12) <= 26) {
            char code = (char) (Integer.parseInt(ch12, 10) + 'a' - 1);
            printCodes(ros2, ans + code);
        }
        if (Integer.parseInt(ch12, 10) == 0) {
            printCodes(ros2, ans);
        }
    }
	}
}
