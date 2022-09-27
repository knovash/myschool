package com.solvd.school;

import java.util.List;

public class Subject {

    private Long id;
    private String subjectName; // изучаемый предмет
    private Long limitInWeek; // предмет не более раз в неделю для класса изучающего предмет
    private Long limitInDay; // предмет не более раз в день для класса изучающего предмет
    private Teacher teacher; // учитель по этому предмету для класса изучающего предмет
}
