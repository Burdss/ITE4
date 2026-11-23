import java.util.LinkedList;
import java.util.Queue;

 public class QueueSample {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();

		queue.add("A");
		queue.add("B");
		queue.add("C");

		System.out.println("Queue: " + queue);

		String removed = queue.poll();
		System.out.println("Polled(Removed): " + removed);
		System.out.println("Updated Queue: " + queue);
		System.out.println();
	}
}
