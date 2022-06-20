package Queue;
public class TestGenericQueue {
    public static void main(String[] args) {
        // Create a stack
//    GenericStack<String> stack = new GenericStack<String>();
//
//    // Add elements to the stack
//    stack.push("Tom"); // Push it to the stack
//    System.out.println("(1) " + stack);
//
//    stack.push("Susan"); // Push it to the the stack
//    System.out.println("(2) " + stack);
//
//    stack.push("Kim"); // Push it to the stack
//    stack.push("Michael"); // Push it to the stack
//    System.out.println("(3) " + stack);
//
//    // Remove elements from the stack
//    System.out.println("(4) " + stack.pop());
//    System.out.println("(5) " + stack.pop());
//    System.out.println("(6) " + stack);

        GenericQueue<String> queue = new GenericQueue<String>();
        queue.enqueue("Tom");
        System.out.println("(7) " + queue);
        queue.enqueue("Susan");
        System.out.println("(8) " + queue);
        queue.enqueue("Kim");
        queue.enqueue("Michael");
        System.out.println("(9) " + queue);
        System.out.println("(10) " + queue.dequeue());
        System.out.println("(11) " + queue.dequeue());
        System.out.println("(12) " + queue);
    }
}