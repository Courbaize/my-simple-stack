/**
 *
 */
package but.rcou;

import java.util.EmptyStackException;

/**
 *
 */
public interface SimpleStack {

    /**
     * Tests if this stack is empty.
     * @return true si vide, false sinon
     */
    boolean isEmpty();

    /**
     * @return Returns the number of items in this stack.
     */
    int getSize();

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     * @param item Item to pushed
     */
    void push(Item item);

    /**
     * Looks at the object at the top of this stack without removing
     * it from the stack.
     * @return The object at the top of this stack
     * @throws EmptyStackException La liste est vide.
     */
    Item peek() throws EmptyStackException;

    /**
     * Removes the object at the top of this stack and returns
     * that object as the value of this function.
     * @return The object at the top of this stack
     * @throws EmptyStackException if this stack is empty.
     */
    Item pop() throws EmptyStackException;
}
