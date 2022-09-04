package Collection.Queue;

import java.util.PriorityQueue;

public class Practice {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();

        priorityQueue.add("A");
        priorityQueue.add("B");
        priorityQueue.add("C");
        priorityQueue.add("D");
        priorityQueue.offer("D"); // insertion order maintained , duplicates allowed

        System.out.println(priorityQueue);

        System.out.println(priorityQueue.element());
        System.out.println(priorityQueue.peek());


        priorityQueue.remove("D");
        System.out.println(priorityQueue);

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);

    }

}
