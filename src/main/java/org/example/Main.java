package org.example;

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[4];
        students[0] = new Student("Ivan", "Ivanenko", "101B", 3.8);
        students[1] = new Student("Alina", "Popova", "202A", 4.5);
        students[2] = new Aspirant("Oleksandr", "Makarenko", "11B", 5.0, "Quantum Computing");
        students[3] = new Aspirant("Inna", "Svyatenko", "22A", 4.7, "Higher mathematics");


        for (Student student : students) {
            String result = student.firstName + " " + student.lastName + " " + student.group + " " + student.getScholarship() + "UA";
            if (student instanceof Aspirant aspirant) {
                result += " " + aspirant.scientificWork;
            }
            System.out.println(result);
        }


        IPow powFunction = (number, degree) -> {
            int result = 1;
            for (int i = 0; i < degree; i++) {
                result *= number;
            }
            return result;
        };

        int result = powFunction.pow(4, 3);
        System.out.println("4 in 3 degree: " + result);
    }
}