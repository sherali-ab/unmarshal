package com.example;

import jakarta.xml.bind.*;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        JAXBContext context = JAXBContext.newInstance(Students.class);

        Unmarshaller unmarshaller = context.createUnmarshaller();
        File inputFile = new File("src/main/resources/students.xml");
        Students students = (Students) unmarshaller.unmarshal(inputFile);

        for (Student s : students.getStudentList()) {
            s.getSkills().add("Teamwork");
        }

        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        File outputFile = new File("src/main/resources/students_modified.xml");
        marshaller.marshal(students, outputFile);

        System.out.println("Готово! Новый XML: students_modified.xml");
    }
}