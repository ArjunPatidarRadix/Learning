import java.util.*;

public class FirstLastIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the numbers : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);

        System.out.print("Enter the number to find the index : ");
        int data = input.nextInt();
        input.close();

        //We are using binary search to find the index
        //for getting first Index
        int low = 0;
        int high = arr.length - 1;
        int firstIndex = -1;

        while(low <= high) {
            int mid = (low + high) / 2;
            if (data > arr[mid]) {
                low = mid + 1;
            }else if (data < arr[mid]) {
                high = mid - 1;
            }else {
                firstIndex = mid;
                high = mid - 1;
            }
        }
        System.out.println("Fist index is: " + firstIndex);

        //for getting last index
        low = 0;
        high = arr.length - 1;
        int lastIndex = -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if (data > arr[mid]) {
                low = mid + 1;
            }else if (data < arr[mid]) {
                high = mid - 1;
            }else {
                lastIndex = mid;
                low = mid + 1;
            }
        }
        System.out.println("Last index is: " + lastIndex);

    }
}
