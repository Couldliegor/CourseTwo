package Model;

import java.time.LocalDateTime;
import Exception.IncorrectArgumenException;

public class SingleTime extends Task {
    public SingleTime(String heading, String description, TaskType taskType, LocalDateTime taskTime) throws IncorrectArgumenException {
        super(heading, description, taskType, taskTime);
    }

    @Override
    public LocalDateTime getTaskNextTime(LocalDateTime dateTime) {
        return null;
    }
}
