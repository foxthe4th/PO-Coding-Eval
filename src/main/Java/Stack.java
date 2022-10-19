import java.util.Vector;

public class Stack<E> extends Vector {

    public Stack() {

    }

    public E push(E item) {
        add(item);
        return item;
    }

    public E pop() {

        if (isEmpty()) {
            throw new Error("Stack does not have any elements");
        } else {
            Object a = get(0);
            remove(0);

            return (E) a;
        }
    }

        public static void main (String[]args){

            Stack stack = new Stack();
            java.util.Stack test = new java.util.Stack<>();
            stack.add(0, 1);
            stack.add(1, 2);
            stack.add(2, 3);
            stack.add(3, 4);
            stack.add(4, 5);

            test.add(0);

//            test.add(1, 2);
//            test.add(2, 3);

            test.pop();
            System.out.println(test);
        }

}
