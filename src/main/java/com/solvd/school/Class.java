package com.solvd.school;

import java.util.List;

public class Class {
    private Long id;
    private String classNumber;
    private List<Subject> classSubjects; // список предметов которые изучают в этом класс
    private List<Lesson> lessons; // список всех уроков класса
}
