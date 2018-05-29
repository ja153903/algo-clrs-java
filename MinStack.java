import java.lang.IndexOutOfBoundsException;
import java.util.ArrayList;

public class MinStack {
    private ArrayList<MinStackTuple> minStack;
    private int minAtInsert = Integer.MAX_VALUE;

    private class MinStackTuple {
        private int val;
        private int minAtInsertInner; // minimum value at the time
    
        public MinStackTuple(int val) {
            this.val = val;
            this.minAtInsertInner = Math.min(val, minAtInsert);
            minAtInsert = minAtInsertInner; // keep track of minValue
        }
    
        public int getVal() {
            return val;
        }
    
        public int getMin() {
            return minAtInsertInner;
        }
    }

    public MinStack() {
        minStack = new ArrayList<>();
    }

    public void push(int item) {
        minStack.add(new MinStackTuple(item));
    }

    public void pop() {
        try {
            MinStackTuple popped = minStack.remove(minStack.size()-1);
            System.out.println(popped.getVal() + " was popped");
        } catch(Exception e) {
            throw new IndexOutOfBoundsException("Empty stack");
        }
    }

    public int getMin() {
        try {
            return minStack.get(minStack.size()-1).getMin();
        } catch(Exception e) {
            throw new IndexOutOfBoundsException("Empty stack");
        }
        
    }

    public int peek() {
        try {
            MinStackTuple tail = minStack.get(minStack.size()-1);
            return tail.getVal();
        } catch(Exception e) {
            throw new IndexOutOfBoundsException("Empty stack");
        }
    }
}