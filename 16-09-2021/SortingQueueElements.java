import java.util.LinkedList;
import java.util.Queue;

public class SortingQueueElements {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(11);//0
        queue.add(5);//1
        queue.add(4);//2
        queue.add(21);//3

        System.out.println("initial queue" + queue);

        for (int i = 1; i <= queue.size(); i++) 
        {
            int minimumElementIndex = getMinimumElementIndex(queue, queue.size() - i); // queue and last element
            insertMinimumValueAtEnd(queue, minimumElementIndex); // queue and min inde
        }
        System.out.println("final queue" + queue);
    }

    public static void insertMinimumValueAtEnd(Queue<Integer> queue,int min_index) {
        int min_value = 0;
        int s = queue.size();
        for (int i = 0; i < s; i++) {
            int current = queue.remove();
            if (i != min_index)
                queue.add(current);
            else
                min_value = current;
        }
        queue.add(min_value);
    }

    private static int getMinimumElementIndex(Queue<Integer> queue, int sortedQueueIndex) {
        int minimumIndex = -1;
        int minimumValue = Integer.MAX_VALUE;
        for (int j = 0; j < queue.size(); j++) {
            int currentElementValue = queue.remove();
            if (currentElementValue <= minimumValue && j <= sortedQueueIndex) {
                minimumIndex = j;
                minimumValue = currentElementValue;
            }
            queue.add(currentElementValue);
        }
        return minimumIndex;
    }
}