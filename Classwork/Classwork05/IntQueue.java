public class IntQueue {
    
    IntLinkedList myStack;

    IntQueue() {
        myStack = new IntLinkedList();
    }

    public void enQueue( int itemToEnqueue ) {
        myStack.prepend( itemToEnqueue );
    }

    public int deQueue() {
        int answer = peek();
        myStack.getIteratorAt( 0 ).removeAt( myStack.getSize() - 1 );
        return answer;
    }

    public int peek() {
        return myStack.getIteratorAt( myStack.getSize() - 1 ).getCurrentInt();
    }

    public static void main( String[] args ) {
        IntQueue testQueue = new IntQueue();
        testQueue.enQueue(19);
        testQueue.enQueue(23);
        testQueue.enQueue(29);
        testQueue.enQueue(31);
        testQueue.enQueue(37);
        testQueue.enQueue(41);
        testQueue.enQueue(43);
        testQueue.enQueue(47);
        testQueue.enQueue(51);
        testQueue.enQueue(57);
        System.out.println("front of the queue: " + testQueue.peek());
        System.out.println("removing the front thing: " + testQueue.deQueue());
        System.out.println("front of the queue: " + testQueue.peek());
        System.out.println("removing the front thing: " + testQueue.deQueue());
        System.out.println("front of the queue: " + testQueue.peek());
        System.out.println("removing the front: " + testQueue.deQueue());
        System.out.println("front of the queue: " + testQueue.peek());
        testQueue.enQueue(testQueue.deQueue() + testQueue.deQueue());
        System.out.println("front of the queue: " + testQueue.peek());
        testQueue.deQueue();
        testQueue.deQueue();
        testQueue.deQueue();
        testQueue.deQueue();
        testQueue.deQueue();
        System.out.println("front of the queue after 5 dequeues: " + testQueue.peek());
        testQueue.enQueue(6700);
        testQueue.deQueue();
        System.out.println("front of the queue (6700): " + testQueue.peek());
    }
}