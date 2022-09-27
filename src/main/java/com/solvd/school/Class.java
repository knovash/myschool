package com.solvd.school;

import java.util.List;

public class Class {
    private Long id;
    private String classNumber; // номер класса в школе. для каждого класса свой список предметов с лимитами предмета в неделю
    private List<Subject> classSubjects; // список предметов которые изучают в этом класс
    // в объекте предмета лимиты на колличество в день и в неделю
    // у предмета для каждого класса свой учитель

    private Schedule schedule; // расписание для этого класса

}
