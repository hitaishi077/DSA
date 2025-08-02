import java.util.Arrays;
import java.util.*;
public class inbuiltSort{
    public static void main(String args[]) {
        Integer i, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
         n = sc.nextInt();
        Integer arr[] = new Integer[n];

        System.out.println("Enter the elements of array:");
        for ( i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr,0,4,Collections.reverseOrder()); // Using inbuilt sort

        System.out.println("Sorted array:");
        for ( i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}