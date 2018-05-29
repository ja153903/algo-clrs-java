public class MinStackTest {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(3);
        minStack.push(1);
        minStack.push(9);

        System.out.println("Min is " + minStack.getMin());

        minStack.pop();
        minStack.pop();

        System.out.println("Min is " + minStack.getMin());

        minStack.pop();

        System.out.println("Min is " + minStack.getMin());
    }
}