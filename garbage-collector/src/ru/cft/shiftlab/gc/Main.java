package ru.cft.shiftlab.gc;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> task = () -> {
            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < 500; i++) {
                builder.append(i);
            }

            return builder.toString();
        };

        ExecutorService service = Executors.newFixedThreadPool(4);

        for (;;) {
            Future<String> result = service.submit(task);
            System.out.println(result.get());
        }
    }
}
