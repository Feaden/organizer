package project.organizer.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("Couldn't  find user" + id);
    }
}

