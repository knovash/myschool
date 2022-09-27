package com.solvd.school;

import java.util.List;

public class School {

    private Long id;
    private Long schoolNumber;
    private List<Teacher> teachers; // все учителя школы. разных предметов. может быть несколько учителей с одинаковым предметов
    private List<Class> classes; // все классы в школе. у каждого класса свой список изучаемых предметов
}
