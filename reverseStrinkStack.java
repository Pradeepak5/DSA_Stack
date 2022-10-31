import java.util.Scanner;
import java.util.Stack;
public class reverseStrinkStack {
	public static String reverseString(String word) {
		Stack<Character> stack=new Stack<>();
		char[] eachChar=word.toCharArray();
		
		for(char c:eachChar) {
			stack.push(c);
		}
		for(int i=0;i<eachChar.length;i++) {
			eachChar[i]=stack.pop();
		}
		return new String(eachChar);
	}

	public static void main(String[] args) {
		reverseStrinkStack r=new reverseStrinkStack();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the word : ");
		String word=s.nextLine();
		System.out.println("Reversed Word : ");
		System.out.println(r.reverseString(word));
		
		

	}

}
