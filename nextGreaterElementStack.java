import java.util.Scanner;
import java.util.Stack;
public class nextGreaterElementStack {
	private int length=0;
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	
	public int[] nextGreaterElement(int[] arr) {
		int[] result=new int[arr.length];
		Stack<Integer> stack=new Stack<>();
		for(int i=arr.length-1;i>=0;i--) {
			if(!stack.isEmpty()) {
				while(!stack.isEmpty() && stack.peek()<=arr[i]) {
					stack.pop();
				}
			}
			if(stack.isEmpty()) {
				result[i]=-1;
			}else {
				result[i]=stack.peek();
			}
			stack.push(arr[i]);
			length++;
		}
		for(int j=0;j<result.length;j++) {
			System.out.print(result[j]+" ");
		}
		return result;
	}

	public static void main(String[] args) {
		nextGreaterElementStack n=new nextGreaterElementStack();
		Stack<Integer> stack=new Stack<>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int arraySize=s.nextInt();
		int[] arr=new int[arraySize];
		for(int i=0;i<arraySize;i++) {
			System.out.println("Enter "+(i+1)+" Element : ");
			arr[i]=stack.push(s.nextInt());
		}
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		System.out.println("Next Greater Elemet is : ");
		n.nextGreaterElement(arr);
	}

}
