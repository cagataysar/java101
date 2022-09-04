public class Stack {

    // Default maximum stack size
    public static final int MAX_STACK_SIZE = 5;
    boolean full = false;
    boolean empty = true;

    String[] array = new String[MAX_STACK_SIZE]; //Backing array

    int pointer = 0; // Points to first empty cell

    // Put element on the top
    public boolean push(String newElement) {
        if (!full) {
            array[pointer] = newElement;
            pointer++;
            if (pointer == MAX_STACK_SIZE) {
                full = true;
            }
            return true;
        }
        else {
            return false;
        }
    }

    // Pop element from the top
    public String pop() {
        String lastItem;
        lastItem = array[pointer - 1];
        pointer--;
        if (pointer != MAX_STACK_SIZE) {
            full = false;
        }
        return lastItem;
    }

    // Remove all elements from stack
    public void clear() {

    }

    // Stack status operations
    // Is stack empty?
    public boolean isEmpty() {
        return full;
    }

    // Is stack full?
    public boolean isFull() {
        return empty;
    }
    // How many elements in stack?
    public int size() {
        return 0;
    }
    // Capacity of stack?
    public int getCapacity() {
        return MAX_STACK_SIZE;
    }
    // Outputs the elements in the stack
    public void showElements() {

    }
}
