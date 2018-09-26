public class IntStack {
    
    IntLinkedList myStack;

    IntStack() {
        myStack = new IntLinkedList();
    }

    public void push( int itemToPush ) {
        myStack.prepend( itemToPush );
    }

    public int peek() {
        return myStack.getIteratorAt( 0 ).getCurrentInt();
    }

    public int pop() {
        int answer = peek();
        myStack.setHead( myStack.getIteratorAt( 0 ).getNext() );
        return answer;
    }

    public static void main( String[] args ) {
        IntStack testStack = new IntStack();
        testStack.push(19);
        testStack.push(23);
        testStack.push(29);
        testStack.push(31);
        testStack.push(37);
        testStack.push(41);
        testStack.push(43);
        testStack.push(47);
        testStack.push(51);
        testStack.push(57);
        System.out.println("top of the stack: " + testStack.peek());
        System.out.println("removing the top thing: " + testStack.pop());
        System.out.println("the top of the stack: " + testStack.peek());
        System.out.println("removing the top thing: " + testStack.pop());
        System.out.println("top of the stack: " + testStack.peek());
        System.out.println("removing the top: " + testStack.pop());
        System.out.println("top of the stack: " + testStack.peek());
        testStack.push(testStack.pop() + testStack.pop());
        System.out.println("the top of the stack: " + testStack.peek());
    }
}