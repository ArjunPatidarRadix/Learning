import java.util.*;

class GenerateParenthesis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of parenthesis to generate : ");
        int n = input.nextInt();
        input.close();
        List<String> result = generateParenth(n);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));

        }
    }

    public static List<String> generateParenth(int n){
        List<String> result = new ArrayList();
        findAll("(", 1, 0, result, n);
        return result;
    }

    public static void findAll(String current, int open, int close, List<String> result, int n){
        if(current.length() == 2*n){
            result.add(current);
            return;
        }
        
        if(open < n) findAll(current + "(", open + 1, close, result, n);
        if(close < open) findAll(current + ")", open, close + 1, result, n);
    }
}
