/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradle.project.example;

public class App {
    public String getGreeting() {
        System.out.println("start");
        try {
        	Thread.sleep(1 * 1000);
        	} catch (InterruptedException ie) {
        	Thread.currentThread().interrupt();
        	}
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
