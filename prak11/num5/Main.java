package prak11.num5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        int size = 300000; // Размер списка
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        funTime("Вставка в ArrayList", () -> {
            for (int i = 0; i < size; i++) {
                arrayList.add(i);
            }
        });
        funTime("Вставка в LinkedList", () -> {
            for (int i = 0; i < size; i++) {
                linkedList.add(i);
            }
        });

        funTime("Удаление из ArrayList", () -> {
            Iterator<Integer> iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }
        });
        funTime("Удаление из LinkedList", () -> {
            Iterator<Integer> iterator = linkedList.iterator();
            while (iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }
        });

        funTime("Поиск в ArrayList", () -> {
            arrayList.contains(999);
        });
        funTime("Поиск в LinkedList", () -> {
            linkedList.contains(999);
        });
    }

    private static void funTime(String operation, Runnable run) {
        long currentTime = System.nanoTime();
        run.run();
        long endTime = System.nanoTime();
        long duration = (endTime - currentTime) / 1000000;
        System.out.println(operation + " заняла " + duration + " миллисекунд ");
    }
}
