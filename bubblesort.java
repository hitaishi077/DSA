import java.util.*;
public class BubbleSort {
public static int[] bubbleSort(int arr[],int n){
int i,j;
  for(i=0;i<n;i++){
    for(j=0;j<n-i-1;j++){
        if(arr[j]>arr[j+1]){
            // swap arr[j] and arr[j+1]
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
        
    }
  }
return arr;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of elements: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter elements:");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    
    bubbleSort(arr, n);
    
    System.out.println("Sorted array:");
    for (int i : arr) {
        System.out.print(i + " ");
    }
}
}
