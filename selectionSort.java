import java.util.*;
public class selectionSort{
    public static int[] selectionSort(int arr[],int n){
        int i,j;

        for(i=0;i<n;i++){
            int min = i;
            for(j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            // swap arr[i] and arr[min]
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
    public static void main(String[] args){
        int a[],n,i,z[];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        n = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        a = new int[n];
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();

        }
        z=selectionSort(a, n);
        System.out.println("Sorted array:");
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}