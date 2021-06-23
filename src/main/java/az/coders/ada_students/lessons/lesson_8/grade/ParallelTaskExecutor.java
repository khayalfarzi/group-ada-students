package az.coders.ada_students.lessons.lesson_8.grade;

import java.util.Queue;

public class ParallelTaskExecutor extends Thread {
    private final Queue<CsvModel> tasks;

    public ParallelTaskExecutor(String name, Queue<CsvModel> tasks) {
        super(name);
        this.tasks = tasks;
    }

    @Override
    public void run() {
        System.out.println(tasks.size());
        int count = 1;
        while (!tasks.isEmpty()) {
            // pick a task
            CsvModel curTask = tasks.poll();

            // execute
            System.out.println(
                    this.getName() + " EXECUTING " + curTask.getName() + " with country " + curTask.getCountry());

            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(this.getName() + " COMPLETED " + curTask.getName() + " with country "
                    + curTask.getCountry() + "\n");

            count++;

            System.out.println(count);
        }
    }

}