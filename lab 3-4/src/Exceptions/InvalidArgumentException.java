package Exceptions;

public class InvalidArgumentException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Имя не может быть пустым!";
    }
}