package Stack.com;

import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,3,2,5,8,1};
        Stack<Integer> s=new Stack<>();
        int n= arr.length;
        int[] nex=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty()&&s.peek()<arr[i])
                s.pop();

            if(!s.isEmpty())
                nex[i]=s.peek();
            else
                nex[i]=arr[i];

            s.push(arr[i]);
        }
       for (int i=0;i<n;i++)
           System.out.print(nex[i]+" ");

    }
}
