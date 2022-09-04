public class StackTest {

    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println(stack.push("0"));
        System.out.println(stack.push("1"));
        System.out.println(stack.push("2"));
        System.out.println(stack.push("3"));
        System.out.println(stack.push("4"));
        System.out.println(stack.push("5"));

        System.out.println("Capasity: " + stack.getCapacity());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Size: " + stack.size());
        stack.showElements();

        System.out.println("***********************");
        System.out.println("Pop: " + stack.pop());
        System.out.println("Size: " + stack.size());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Size: " + stack.size());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Size: " + stack.size());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Size: " + stack.size());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Size: " + stack.size());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());

        System.out.println("*************************");
        System.out.println(stack.push("5"));
        System.out.println("Size: " + stack.size());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Empty: " + stack.isEmpty());

    }
}
