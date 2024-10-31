package task1;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        EducationCenter school = new School("5", "Bishkek", LocalDate.of(2004, 3, 3));
        EducationCenter college = new School("Peaksoft", "Bishkek", LocalDate.of(2004, 3, 3));
        EducationCenter university = new School("KNU", "Bishkek", LocalDate.of(2004, 3, 3));
        Student student1 = new Student("Fatima", "Altynbek kyzy", "FEMALE", LocalDate.of(2024, 10, 8), school);
        Student student2 = new Student("Bektur", "Akylbekov", "MALE", LocalDate.of(2024, 10, 8), university);
        Student student3 = new Student("Adilet", "Egemberdiev", "MALE", LocalDate.of(2024, 10, 8), college);
        Student student4 = new Student("Azmar", "Kubandykov", "MALE", LocalDate.of(2024, 10, 8), school);
        Student student5 = new Student("Nursultan", "Alymbekov", "FEMALE", LocalDate.of(2024, 10, 8), college);

        Student[] students = {student1, student2, student3, student4, student5};
        getInfo(students);


    }

    public static void getInfo(Student[] students) {
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + "\n"+
                    "Education center: " + student.getEducationCenter() + "\n"+
                    "Date of start: " + student.getDateOfStart());
        }
    }
}