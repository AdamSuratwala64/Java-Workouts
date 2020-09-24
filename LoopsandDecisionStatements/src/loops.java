
public class loops {

	public static void main(String[] args) {
		// For this program I will be trying out loop statements of while, do-while and for
		int a = 0;
		while (a<4)
		{
			System.out.println("Iteration : " + a);
			a++;
		}
		
		int b = 6;
		do {
			System.out.println("\n\n\nValue of variable b should not exceed 5");
			System.out.println("Current value of variable b : "+b);
		}
		while(b<=5);
		
		
		System.out.println("\n\n\nNow executing for loop");
		int arr[] = {1,2,3,4,5};
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
			
	}

}
