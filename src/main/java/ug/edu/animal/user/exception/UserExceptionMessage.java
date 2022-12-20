package ug.edu.animal.user.exception;

public enum UserExceptionMessage {

    EMAIL_INVALID("Entered email is invalid"),
    EMAIL_ALREADY_REGISTERED("Entered email is already registered"),
    PASSWORD_OR_EMAIL_DO_NOT_MATCH("You have entered wrong email or password."),
    PASSWORD_INVALID("Password should have at least one numeric, lowercase, uppercase and symbol character." +
                             "Must have 8 characters.");

    private final String message;

    UserExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
