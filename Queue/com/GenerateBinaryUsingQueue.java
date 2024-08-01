package Queue.com;

import java.util.ArrayDeque;
import java.util.Queue;
public class GenerateBinaryUsingQueue {

        public static void generate(int n)
        {

            Queue<String> q = new ArrayDeque<>();
            q.add("1");


            int i = 1;
            while (i++ <= n)
            {

                q.add(q.peek() + '0');
                q.add(q.peek() + '1');

                // remove the front element and print it
                System.out.print(q.poll() + ' ');
            }
        }

    public static void main(String[] args) {
        int n=16;
        generate(n);
    }
}
