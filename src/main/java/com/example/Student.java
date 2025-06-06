package com.example;

import jakarta.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Student {

    @XmlElement(name = "first_name")
    private String firstName;

    @XmlElement(name = "second_name")
    private String secondName;

    @XmlElementWrapper(name = "skills")
    @XmlElement(name = "skill")
    private List<String> skills;

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getSecondName() { return secondName; }
    public void setSecondName(String secondName) { this.secondName = secondName; }

    public List<String> getSkills() { return skills; }
    public void setSkills(List<String> skills) { this.skills = skills; }
}