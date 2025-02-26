package com.example.haarmonika;

public class MessageRepository {


    //region System Messages
    public String systemAppStartMessage() {
        return "System has started";
    }

    public String systemAppCloseMessage() {
        return "Closing down system";
    }
    //endregion


    //region Login Messages
    public String loginUserNameNotFoundMessage() {
        return "Found no matching username";
    }

    public String loginUserNameFoundMessage() {
        return "Matching username found";
    }

    public String loginUserLoginFoundNoMatchMessage() {
        return "Password does not match login attempt";
    }

    public String loginMaxAttemptsExceededMessage() {
        return "Max login attempts exceeded";
    }

    public String loginSuccessfulMessage() {
        return "Login successful";
    }
    //endregion


    //region Exception Messages
    public String ExampleEceptionMessage00() {
        return "Example Eception dialog";
    }

    public String ExampleEceptionMessage01() {
        return "Example Eception dialog";
    }
    //endregion


}
