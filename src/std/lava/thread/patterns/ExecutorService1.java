package std.lava.thread.patterns;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorService1 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(1);
        service.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Thread: before sleep");
                    Thread.sleep(1000);
                    System.out.println("Thread: after sleep");
                } catch (InterruptedException e) {
                    System.out.println("Thread: interrupted");
                }
            }
        });
        service.shutdown();
        try {
            System.out.println("Main: Before wait");
            service.awaitTermination(100, TimeUnit.MILLISECONDS);
            service.shutdownNow();
            System.out.println("Main: After wait");
        } catch (InterruptedException e) {
            System.out.println("Main: Interrupted");
        }
    }
}
