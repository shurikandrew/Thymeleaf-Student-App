package com.shurikandrew.thymeleaf.model;

import java.util.List;

public class Student {

    public String firstName;
    public String lastName;
    public String country;
    public String lang;
    public List<String> os;

    public List<String> getOs() {
        return os;
    }

    public void setOs(List<String> os) {
        this.os = os;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
