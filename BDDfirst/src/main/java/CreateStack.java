import java.util.Stack;

public class CreateStack {

    private Stack stack = new Stack();

    public Object pop() {
        return stack.pop();
    }

    public void push(Object o) {
        stack.push(o);
    }

    public int size() {
        return stack.size();
    }

}