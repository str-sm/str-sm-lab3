package edu.tucn.str.ex6;

/**
 * @author <a href="mailto:radu.miro@aut.utcluj.ro">Radu Miron</a>
 */

public record Task(String content) {
    public void execute() {
        // Simulate task execution
        System.out.println("Executing task: " + content.toUpperCase());
        try {
            Thread.sleep(500); // Simulate time taken to execute the task
        } catch (InterruptedException ignore) {
        }
    }
}
