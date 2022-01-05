import java.util.Scanner;
import java.util.Stack;

public class algorithm17413 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> stk = new Stack<>();

        boolean flag =false;

        for(int i =0; i < str.length(); i++){
            if (str.charAt(i) == '<'){
                flag = true;

                while(!stk.isEmpty()){
                    System.out.print(stk.pop());
                }
                System.out.print(str.charAt(i));
            } else if(str.charAt(i)=='>'){
                flag = false;
                System.out.print(str.charAt(i));
            } else if(flag){
                System.out.print(str.charAt(i));
            } else if(!flag){
                if (str.charAt(i) == ' '){
                    while (!stk.isEmpty()){
                        System.out.print(stk.pop());
                    }

                    System.out.print(str.charAt(i));
                } else {
                    stk.push(str.charAt(i));
                }
            }
        }
        while (!stk.isEmpty()){
            System.out.print(stk.pop());
        }
    }
}
