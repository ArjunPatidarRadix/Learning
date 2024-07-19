import java.util.*;

public class KthLargestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the numbers : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter to find the kth largest element : ");;
        int number = input.nextInt();

        input.close();

        //sorting list in descending order
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] < arr[j]) { // for kth smallest element change condition to if(arr[i] > arr[j])
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if(i == number -1 ){
                System.out.println(number+"th largest element is : " + arr[i]);
                break;
            }
        }
    }
}
