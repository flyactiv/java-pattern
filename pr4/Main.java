package pr4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = new NewExecutorService(2);
        Future<String> future = executor.submit(() -> "First submit");
        executor.submit(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Run");
        });
        executor.shutdown();
        // executor.shutdownNow();
        if (future.isDone() && !future.isCancelled()) {
            System.out.println("Future result: " + future.get());
        }
    }
}
