package threads;

public class ThreadedReverseGreeting {
	// Write a program that creates a thread (Thread 1) that creates another thread
	// (Thread 2);
	// Thread 2 creates Thread 3; and so on, up to Thread 50.
	// Each thread should print "Hello from Thread <num>!",
	// but you should structure your program such that the threads print their
	// greetings in reverse order.

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> threadCreation());
		t1.start();
	}

	static void threadCreation() {
		for (int i = 51; i > 0; i--) {
			System.out.println("Hello from Thread <" + (i - 1) + ">");
		}
	}

}
