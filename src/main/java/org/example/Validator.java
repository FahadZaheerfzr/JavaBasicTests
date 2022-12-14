package org.example;

import java.util.regex.Pattern;

public class Validator {
    /*
        This regex matches against:
        - a-z characters of the alphabet
        - A-Z characters of the alphabet
        - 0-9 numbers
        - @
     */

    private static final String regex = "^[a-zA-Z0-9@]+$";

    /**
     * A Valid name is:
     * - between 6 and 12 characters long
     * - Alphanumeric: letters and numbers only
     *
     * @param name Username to be validated against
     * @return Whether username is valid or not
     */

    public static boolean validateUsername(String name){
        if (name == null) return false;
        if (name.length() < 6 || name.length()>12) return false;

        //initializes the regex pattern, gives it the username, and returns true or false if they match
        return Pattern.compile(regex).matcher(name).matches();
    }
}
