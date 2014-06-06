package Concurrency;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 26/05/14
 * Time: 14:05
 * To change this template use File | Settings | File Templates.
 */
public class TaskRun implements Runnable {

    private int taskDuration;
    private int taskID;
    private boolean isAwake;

    public TaskRun(int taskDuration, int taskID) {
        this.taskDuration = taskDuration;
        this.taskID = taskID;
        isAwake=false;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(taskDuration);
        } catch (InterruptedException ex) {
            //nothing to do-sleep less
        }
        ResponsiveInterface.updateCompletedTasks(taskID);
    }

    public int getId() {
        return taskID;
    }
    public boolean isAwake(){
        return isAwake;
    }
}
