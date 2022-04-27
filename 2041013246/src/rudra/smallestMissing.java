package rudra;

public class smallestMissing {

	public static void main(String[] args) {
  int[] arr= {1,2,4,5,6,7,8,13};
  for (int i=1; i<=arr.length; i++)
  {
	  int f=0;
	  for(int j=0; j<arr.length;j++) {
		  if (arr[j]==i) {
			  f=1;
			  break;
		  }
	  }
	  if (f==0) {
		  System.out.println(i);
		  break;
	  }
  }
	}

}
