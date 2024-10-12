//implementing Queue using 2 Stacks

import java.util.*;

public class QueueUsing2Stack {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        public void add(int data) {
            //transferring elements from s1 to s2
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            //pushing the given element into s1
            s1.push(data);

            //transferring elements back to s1
            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public int remove() {
            return s1.pop();
        }

        public int peek() {
            return s1.peek();
        }

        public static void main(String[] args) {
            Queue q = new Queue();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);

            while(!q.isEmpty()) {
                System.out.println(q.peek());;
                q.remove();
            }
        }
    }
}
