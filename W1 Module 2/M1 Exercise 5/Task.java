public class Task {
    private String taskId;
    private String taskName;
    private String status;

    public Task(String taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }

    public String obtainTaskId() {
        return taskId;
    }

    public String obtainTaskName() {
        return taskName;
    }

    public String obtainTaskStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "taskId='" + taskId + '\'' + ", taskName='" + taskName + '\'' + ", status='" + status + '\'';
    }
}
