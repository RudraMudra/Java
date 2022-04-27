package rudra;
import java.util.Scanner;
public class IndexArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array ");
		int n= sc.nextInt();
		int[]arr= {-1,2,3,4,5,6,7,8,9};
		for (int i=0; i< arr.length; i++) {
			while (arr[i]!=-1 && arr[i]!=i) {
				int temp = arr[i];
				arr[i] = arr[arr[i]];
				arr[temp] = temp;
		   }
		}
     
		
	}

}
