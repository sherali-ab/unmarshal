package com.example;

import jakarta.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "students")
@XmlAccessorType(XmlAccessType.FIELD)
public class Students {

    @XmlElement(name = "student")
    private List<Student> studentList;

    public List<Student> getStudentList() { return studentList; }
    public void setStudentList(List<Student> studentList) { this.studentList = studentList; }
}