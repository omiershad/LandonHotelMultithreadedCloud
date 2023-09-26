package edu.wgu.d387_sample_code.lctFiles;


import java.util.*;


public class ShowMessage implements Runnable {

    private Locale locale;
    private String message;

    public ShowMessage(Locale locale) {
        this.locale = locale;
    }

    public String getMessage() {
        if (message == null) {
            ResourceBundle resourceBundle = ResourceBundle.getBundle("welcome", locale);
            message = resourceBundle.getString("welcomeMessage");
        }
        return message;
    }




    @Override
    public void run() {
        System.out.println(getMessage());
    }
}
