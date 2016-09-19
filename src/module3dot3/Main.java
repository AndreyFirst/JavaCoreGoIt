package module3dot3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course("Course of Physics", new Date());
        Course course2 = new Course("Course of History", new Date());
        Course course3 = new Course("Course of  English", new Date());
        Course course4 = new Course(36,"Course of History", "Bruce Willis");
        Course course5 = new Course(48,"Course of  English", "William Wallace");

        Course[] courses1 = {course1,course2,course3};
        Course[] courses2 = {course4,course5};

        CollegeStudent collegeStudent1 = new CollegeStudent("Serj","Tankian",49);
        CollegeStudent collegeStudent2 = new CollegeStudent("Hetfield",courses1);
        CollegeStudent collegeStudent3 = new CollegeStudent("Rob","Halford",1,"Judas Priest",30,99669977);

        SpecialStudent specialStudent1 = new SpecialStudent("PeschDorothee","Düsseldor",19);
        SpecialStudent specialStudent2 = new SpecialStudent("Tarja", "Turunen",2,"Finland Kides", 40, 77669977);
        SpecialStudent specialStudent3 = new SpecialStudent("Simone","Simons;",3,77699977);

        Student student1 = new Student("Sharon","Adel,",2);
        Student student2 = new Student("Brink",courses2);
    }

}

