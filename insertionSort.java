import java.util.*;
public class insertionSort{
    public static int[] insertionSort(int arr[], int n){
            int i,j ;
            for(i=1;i<n;i++){
                for(j=i-1;j>=0;j--){
                    if(arr[j] > arr[j+1]){
                        // swap arr[j] and arr[j+1]
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    } else {
                        break; // No need to continue if the order is correct
                    }

                }
            }
            return arr;
    }
    public static void main(String args[]){
        int a[], n, i, z[];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        n = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        a = new int[n]; 
        for(i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        z = insertionSort(a, n);
        System.out.println("Sorted array:");
        for(i = 0; i < n; i++){
            System.out.print(z[i] + " ");
        }

    }
}