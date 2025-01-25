import java.util.*;
class Quick{
	public static int partition(int[] a,int low,int high){
		int pivot=a[low],i=low+1,j=high;
		while(i<=j){
			while(a[i]<=pivot && i<=j)
				i=i+1;
			while(a[j]>=pivot && i<=j)
				j=j-1;
			if(i<j) swap(a,i,j);
		}
		swap(a,j,low);
		return j;
	}
	public static void Quicksort(int[] a,int low,int high){
		if(low<high){
			int j=partition(a,low,high);
			Quicksort(a,low,j-1);
			Quicksort(a,j+1,high);
			}
	}
	public static void swap(int[] a, int i, int j){
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}
public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			}
		Quicksort(arr,0,n-1);
		System.out.println("Sorted array: ");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
			}
	}
}	
