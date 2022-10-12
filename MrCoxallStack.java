/*
* MrCoxallStack Class
*
* @author  Daria Bernice Calitis
* @version 11.0.16
* @since   2022-10-03
*/

import java.util.ArrayList;

/**
 * MrCoxallStack Class.
 */
public class MrCoxallStack {
    /**
     * Array stack.
     */
    private ArrayList<Number> stack = new ArrayList<Number>();

    /**
     * The getStack() function.
     *
     * <p>
     * Shows the items of the stack.
     * </p>
     *
     * @return stack - the array list of numbers.
     */
    public ArrayList<Number> getStack() {
        return stack;
    }

    /**
     * The pushItem() function.
     *
     * <p>
     * It adds a number to the stack ArrayList.
     * </p>
     *
     * @param pushedNumber - the number to be added to the stack.
     */
    public void pushItem(int pushedNumber) {
        stack.add(pushedNumber);
    }

    /**
     * The popItem() function.
     *
     * <p>
     * It removes and returns the last number from the stack ArrayList.
     * </p>
     *
     * @return item - the last number in the stack.
     */
    public int popItem() {
        final int size = stack.size();
        final int item;
        if (stack.isEmpty()) {
            item = -1;
            System.out.println("No items to pop in the stack.");
        } else {
            item = (int) stack.get(size - 1);
            stack.remove(size - 1);
        }

        return item;
    }

    /**
     * The peekItem() function.
     *
     * <p>
     * It returns the last number from the stack ArrayList.
     * </p>
     *
     * @return item - the last number in the stack.
     */
    public int peekItem() {
        final int size = stack.size();
        final int item;
        if (stack.isEmpty()) {
            item = -1;
            System.out.println("No items to peek in the stack.");
        } else {
            item = (int) stack.get(size - 1);
        }

        return item;
    }
}
