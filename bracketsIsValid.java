import java.util.Scanner;
import java.util.Stack;

public class bracketsIsValid {
	
	public boolean isValid(String S) {
		Stack<Character> stack=new Stack<>();
		for(char c:S.toCharArray()) {
			if(c=='(' || c=='{' || c=='[') {
				stack.push(c);
			}else {
				if(stack.isEmpty()) {
					return false;
				}else {
					char top=stack.peek();
					if((c==')' && top=='(')||(c==']' && top=='[')||(c=='}' && top=='{')) {
						stack.pop();
					}else {
						return false;
					}
				}
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		bracketsIsValid b=new bracketsIsValid();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter only Brackets to check Whether it is balanced or not : ");
		String S=s.nextLine();
		if(b.isValid(S)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
	}

}
