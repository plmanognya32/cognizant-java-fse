public class TaskManagementListMain {
    public static void main(String[] args) {

        TaskManagementList taskList = new TaskManagementList();

        Task t1 = new Task("S54389", "Design Module", "In Progress");
        Task t2 = new Task("S43579", "Implement Module", "Not Started");
        Task t3 = new Task("S46853", "Test Module", "Not Started");
        Task t4 = new Task("S42723", "Deploy Module", "Not Started");

        taskList.addNewTask(t1);
        taskList.addNewTask(t2);
        taskList.addNewTask(t3);
        taskList.addNewTask(t4);

        taskList.traverseTaskList();

        Task t = taskList.searchExistingTask("S46853");
        System.out.println("Task Found: " + t);

        taskList.deleteExistingTask("S42723");

        taskList.traverseTaskList();
    }
}
