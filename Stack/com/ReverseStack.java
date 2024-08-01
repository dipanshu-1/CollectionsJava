package Stack.com;

import java.util.Stack;

public class ReverseStack {
    public static void insert(Stack<Integer> St,int n){
        if(St.isEmpty()){
            St.push(n);
            return;
        }
        int top=St.peek();
        St.pop();
        insert(St,n);
        St.push(top);

    }
   public static void reverse(Stack<Integer> St){
        if(St.size()==0)
        {

        }
else {
            int a = St.peek();
            St.pop();
            reverse(St);
            insert(St,a);
        }

    }
    public static void main(String[] args) {
        Stack<Integer> St=new Stack<>();
        St.push(1);
        St.push(2);
        St.push(3);
        St.push(4);
        St.push(5);
        System.out.println(St);
        reverse(St);
        System.out.println(St);


    }
}
