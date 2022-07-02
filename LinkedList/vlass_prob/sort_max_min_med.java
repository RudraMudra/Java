package vlass_prob;

public class sort_max_min_med {
public static void main(String[] args) {
	int arr[]= {3,7,12,19,0,15,23,13};
	int i=0,j=arr.length;
	while(i<j)
	{
	int min=findmin(arr,i,j);
	int max=findmax(arr,i,j);
	int mid=findmed(arr,i,j);
	i++;
	j--;
}
}
private static int findmed(int[] arr, int i, int j) {
	int mid=(i+j)/2;
	return arr[mid];
}
public static int findmax(int[] arr, int i, int j) {

	int m=arr[i];
	for(int k=i+1;k<j;k++)
	{
		if(m<arr[k])
		{
			m=arr[k];
		}
	}
	return m;
}
public static int findmin(int arr[],int i,int j)
{	
	int m=arr[i];
	for(int k=i+1;k<j;k++)
	{
		if(m>arr[k])
		{
			m=arr[k];
		}
	}
	return m;
}
}
