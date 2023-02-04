package Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import Model.Task;
import Exception.TaskNotFoundException;

public class TaskService {
    private final Map<Integer, Task> taskMap = new HashMap<>();
    private final List<Task> taskArchive = new ArrayList<>();

    public void addTask(Task task) {
        this.taskMap.put(task.getId(), task);
    }

    public void removeTask(Integer taskId) throws TaskNotFoundException {
        if (this.taskMap.containsKey(taskId)) {
            System.out.println("Задача удалена " + taskArchive.add(getTaskMap().remove(taskId)));
            this.taskMap.remove(taskId);
        } else {
            throw new TaskNotFoundException(taskId);
        }
    }

    public void printDeleteTask() {
        for (Task task : taskArchive) {
            System.out.println(task);
        }
    }

    public Collection<Task> getAllByDate(LocalDate date) {
        Collection<Task> tasksByDay = new ArrayList<>();
        Collection<Task> allTasks = taskMap.values();

        for (Task task : allTasks) {
            LocalDateTime currentDateTime = task.getTaskTime();

            if (currentDateTime.toLocalDate().equals(date)) {
                tasksByDay.add(task);
                break;
            }

            LocalDateTime taskNextTime = currentDateTime;

            do {
                taskNextTime = task.getTaskNextTime(taskNextTime);

                if (taskNextTime == null) {
                    break;
                }

                if (taskNextTime.toLocalDate().equals(date)) {
                    tasksByDay.add(task);
                    break;
                }

            } while (taskNextTime.toLocalDate().isBefore(date));
        }
        return tasksByDay;
    }

    private Map<Integer, Task> getTaskMap() {
        return taskMap;
    }
}