package com.plivo.model;

public class Contact {

    private static String STRING_WITH_QUOTES = "'%s'";
    private static String SEPERATOR  = ",";

    private String name;

    private String email;

    private String info;

    public Contact(String email, String name, String info) {
        this.email = email;
        this.name = name;
        this.info = info;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String toQuery() {

        return String.format(STRING_WITH_QUOTES, email) + SEPERATOR +
               String.format(STRING_WITH_QUOTES, name) + SEPERATOR +
               String.format(STRING_WITH_QUOTES, info);
    }
}
