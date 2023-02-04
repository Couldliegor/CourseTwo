package Exception;

public class IncorrectArgumenException extends Exception {
    public IncorrectArgumenException(String argument) {
        this.argument = argument;
    }

    private final String argument;

    @Override
    public String getMessage() {
        return "Параметр " + argument + " задан некорректно";
    }
}