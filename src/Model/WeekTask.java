package Model;

import Exception.IncorrectArgumenException;
import java.time.LocalDateTime;

public class WeekTask extends Task {
    public WeekTask(String heading, String description, TaskType taskType, LocalDateTime taskTime) throws IncorrectArgumenException {
        super(heading, description, taskType, taskTime);
    }

    @Override
    public LocalDateTime getTaskNextTime(LocalDateTime dateTime) {
        return dateTime.plusWeeks(1);
    }
}
