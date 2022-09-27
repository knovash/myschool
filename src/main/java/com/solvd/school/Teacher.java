package com.solvd.school;

import java.util.List;

public class Teacher {

    private Long id;
    private String teacherName;
    private String teacherSubject; // преподаваемый предмет. возможно енам
    private List<Lesson> teacherLessons;
    // список уроков учителя. возможность подсчитать что б не превышало 40 в месяц
    // 3 в день 5 дней 4 недели = 60 уроков (

}
