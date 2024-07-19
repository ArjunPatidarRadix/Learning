import java.util.*;
class stringcompression {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string to compress ");
        String str = input.next();

        String compressedStr = compressString(str);

        System.out.println("Compressed string : "+compressedStr);
        input.close();
    }

    public static String compressString(String str){
        String s = str.charAt(0) + "";
        int count = 1;

        for (int i = 1; i < str.length(); i++){
            char current = str.charAt(i);
            char previous = str.charAt(i - 1);

            if (current == previous){
                count++;
            }else{
                if(count > 1){
                    s += count;
                    count = 1;
                }
                s += current;
            }
        }
        if(count > 1){
            s += count;
            count = 1;
        }

        return s;
    }
}
