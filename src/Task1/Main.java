package Task1;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

//Разработать приложение, имитирующее очередь запросов к серверу. Должны быть клиенты, посылающие
//        запросы на сервер, у каждого из которых есть свой приоритет.
//        Каждый новый клиент попадает в очередь в зависимости от своего приоритета.
//        Для решения задачи используйте подходящий класс из Java Collections Framework.
public class Main {
    public static void main(String[] args) {
        Queue<Client> queue = new PriorityQueue<>(5, new Comparator<Client>() {
            @Override
            public int compare(Client o1, Client o2) {
                return o2.priority - o1.priority;
            }
        });
        Client c1 = new Client(3, "Alex");
        Client c2 = new Client(2, "Oleh");
        Client c3 = new Client(1, "Max");
        Client c4 = new Client(5, "Peter");
        Client c5 = new Client(4, "Vladimir");

        queue.offer(c1);
        queue.offer(c2);
        queue.offer(c3);
        queue.offer(c4);
        queue.offer(c5);

        int testSize = queue.size();

        for (int i = 0; i < testSize; i++) {
            System.out.println(queue.poll());
        }
    }
}