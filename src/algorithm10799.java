import java.util.Scanner;
import java.util.Stack;

public class algorithm10799 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Integer> stk = new Stack<Integer>();
        int cnt = 0;

        for (int i =0; i< str.length(); i++){

            if (str.charAt(i) == '(') {
                stk.push(i);
            } else if(str.charAt(i) == ')'){
                if (i-stk.pop() == 1){
                    cnt += stk.size();
                } else {
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}
