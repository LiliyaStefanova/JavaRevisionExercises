package Concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ResponsiveInterface {

    private static List<Integer> completedTasks=new ArrayList<Integer>();

    public static void main(String[] args) {

        ResponsiveInterface rui=new ResponsiveInterface();
        rui.launch();
        }

        public void launch(){
            for (int i = 1; i <= 10; i++) {
                System.out.print("Enter duration(in ms) of task " + i + ": ");
                Scanner sc = new Scanner(System.in);
                int time = sc.nextInt();
                TaskRun task = new TaskRun(time, i);
                Thread newThread = new Thread(task);
                newThread.start();

            }
        }

        public static void updateCompletedTasks(int taskID){
                completedTasks.add(taskID);
    }


}
