package but.rcou;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Default simple stack.
 */
public class DefaultSimpleStack implements SimpleStack {

    /**
     * List of items.
     */
    private ArrayList<Item> list = new ArrayList<>();

    /**
     * Tests if this stack is empty.
     * @return true si vide, false sinon
     */
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * @return Returns the number of items in this stack.
     */
    @Override
    public int getSize() {
        return list.size();
    }

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     *
     * @param item Item to pushed
     */
    @Override
    public void push(Item item) {
        list.add(item);
    }

    /**
     * Looks at the object at the top of this stack without removing
     * it from the stack.
     *
     * @return The object at the top of this stack
     * @throws EmptyStackException La liste est vide.
     */
    @Override
    public Item peek() throws EmptyStackException {
        if (list.isEmpty()) {
            throw new EmptyStackException();
        }

        return list.get(list.size() - 1);
    }

    /**
     * Removes the object at the top of this stack and returns
     * that object as the value of this function.
     *
     * @return The object at the top of this stack
     * @throws EmptyStackException if this stack is empty.
     */
    @Override
    public Item pop() throws EmptyStackException {
        if (list.isEmpty()) {
            throw new EmptyStackException();
        }
        Item returnItem = list.get(list.size() - 1);
        list.remove(list.size() - 1);

        return returnItem;
    }
}
