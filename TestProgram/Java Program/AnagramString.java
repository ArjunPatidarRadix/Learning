import java.util.*;
class AnagramString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String first = input.next();

        System.out.println("Enter second string: ");
        String second = input.next();

        first = first.replaceAll(" ", "");
        second = second.replaceAll(" ", "");

        first = first.toLowerCase();
        second = second.toLowerCase();

        char a[] = first.toCharArray();
        char b[] = second.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        boolean result = Arrays.equals(a, b);

        if(result){
            System.out.println("String is anagram");
        }else{
            System.out.println("String is not anagram");
        }

        boolean isAnagram = isAnagram(first, second);
        System.out.println("String anagram or not : " + isAnagram);
        
        input.close();
    }

    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int[] letters = new int[1<<8];

        for(char c : s1.toCharArray()) {
            letters[c]++;
        }

        for(char c : s2.toCharArray()){
            letters[c]--;
        }

        for (int i : letters) {
            if(i != 0) return false;
        }

        return true;
    }
}