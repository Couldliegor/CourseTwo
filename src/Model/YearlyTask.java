package Model;

import java.time.LocalDateTime;
import Exception.IncorrectArgumenException;
public class YearlyTask extends Task {

    public YearlyTask(String heading, String description, TaskType taskType, LocalDateTime taskTime) throws IncorrectArgumenException {
        super(heading, description, taskType, taskTime);
    }

    @Override
    public LocalDateTime getTaskNextTime(LocalDateTime dateTime) {
        return dateTime.plusYears(1);
    }
}
