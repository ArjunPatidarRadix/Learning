import java.util.*;
class permutation {
    public static void main(String[] args){
        // Scanner input = new Scanner(System.in);

        // System.out.print("Enter string for permutation : ");
        // String str = input.next();

        // ArrayList<String> list = permutations(str);

        // System.out.println("permutations string : "+list.size());

        int arr[] = {1, 2, 3};

        permutations(arr);

        // input.close();

    }

    public static ArrayList<int []> permutations(int[] a){
        ArrayList<int[]> results = new ArrayList<int[]>();
        permutationss(a, 0, results);
        return results;
    }

    public static Void permutationss(int[] a, int start, ArrayList<int[]> results){
        if(start >= a.length){
            results.add(a.clone());
        } else {
            for(int i = start; i < a.length; i++) {
                swap(a, start, i);
                permutation(a, start + 1, results);
                swap(a, start, i);

            }
        }
    }

    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // public static ArrayList<String> permutations(String str){
    //     ArrayList<String> results = new ArrayList<String>();
    //     permutations("", str, results);
    //     return results;
    // }

    // public static permutations(String prefix, String suffix, ArrayList<String> results){
    //     if(suffix.length() == 0){
    //         results.add(prefix);
    //     }else{
    //         for(int i = 0; i < suffix.length(); i++){
    //             permutations(prefix + suffix.charAt(i), suffix.substring(0, 1) + suffix.substring(i+1, suffix.length()));
    //         }
    //     }
    // }

}
