public class TaskManagementList {

    private TaskNode head;

    public void addNewTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        newNode.next = head;
        head = newNode;
        System.out.println("New task added: " + task);
    }

    public Task searchExistingTask(String taskId) {
        TaskNode current = head;
        while (current != null) {
            if (current.task.obtainTaskId().equals(taskId)) {
                return current.task;
            }
            current = current.next;
        }
        System.out.println("The task ID " + taskId + " not found in the records.");
        return null;
    }

    public void traverseTaskList() {
        TaskNode current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    public void deleteExistingTask(String taskId) {
        TaskNode current = head;
        TaskNode prev = null;
        while (current != null && !current.task.obtainTaskId().equals(taskId)) {
            prev = current;
            current = current.next;
        }
        if (current != null) {
            if (prev == null) {
                head = current.next;
            } else {
                prev.next = current.next;
            }
            System.out.println("The task ID " + taskId + " has been deleted.");
        } else {
            System.out.println("Task ID " + taskId + " not found.");
        }
    }
}
