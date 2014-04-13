package com.luckyryan.sample.myexcrcises;

/**
 * @author m.abareghi
 *         4/11/14 - 7:48 PM
 */
public interface StackExercise {
    /**
     * Return and remove the most recent item from
     * the top of the stack.
     * Throws StackEmptyException
     * if the stack is empty
     */
    String pop() throws StackEmptyException;

    /**
     * Add an item to the top of the stack.
     */
    void push(String item);
    /**
     * Return but do not remove the most recent
     * item from the top of the stack.
     * Throws StackEmptyException
     * if the stack is empty
     */
    String top() throws StackEmptyException;
    /**
     * Returns true if the stack is empty.
     */
    boolean isEmpty();
}
