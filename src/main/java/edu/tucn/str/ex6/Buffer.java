package edu.tucn.str.ex6;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author <a href="mailto:radu.miro@aut.utcluj.ro">Radu Miron</a>
 */

public class Buffer {
    private Queue<Task> queue = new LinkedList<>();
    private int capacity;

    public Buffer(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Adds a task to the buffer. This method is called by the producer.
     */
    public synchronized void addTask(Task task) throws InterruptedException {
        // todo: wait if queue is full
        if (queue.size() == capacity) { wait();}
        queue.add(task);
        notify();
        // todo: notify the consumer that there is a new task
    }

    /**
     * Removes a task from the buffer. This method is called by the consumer.
     */
    public synchronized void executeTask() throws InterruptedException {
        // todo: wait if queue is empty
        if (queue.isEmpty()) { wait();}
        queue.poll().execute();
        notify();
        // todo: notify the producer that there is space in the queue
    }
}
