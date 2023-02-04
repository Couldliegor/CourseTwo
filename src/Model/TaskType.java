package Model;

public enum TaskType {
    PERSONAL_TASK("Личная задача"),
    WORK_TASK("Рабочая задача");

    private final String taskType;

    TaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getTaskType() {
        return taskType;
    }

    @Override
    public String toString() {
        return taskType;
    }
}
