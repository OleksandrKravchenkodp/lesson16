package ua.com.hilell.krvchenko.lesson16.services;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper {

    public Helper() {
    }

    public String stringForEntry;

    public Helper(String stringForEntry) {
        this.stringForEntry = stringForEntry;
    }

    public Optional<String> checkString(String stringForEntry){
        if (stringForEntry == null || stringForEntry.length() == 0 || !emailCheck(stringForEntry)){
            return Optional.empty(); //В методе можно применить Optional.ofNullable(string), но там вроде проще
            // для понимания читать
        }else{
            return Optional.of(stringForEntry);
        }
    }

    public boolean emailCheck (String stringForEntry){
        Pattern pattern = Pattern.compile("^(\\w+\\@\\w+\\.\\w{1,5}$)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(stringForEntry);
        return matcher.find();
    }
}
