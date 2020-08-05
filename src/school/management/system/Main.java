package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Andy = new Teacher(1, "Andy", 500);
        Teacher David = new Teacher(2, "David", 700);
        Teacher Bianca = new Teacher(3, "Bianca", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Andy);
        teacherList.add(David);
        teacherList.add(Bianca);

        Student Roger = new Student(1, "Roger", 8);
        Student Cole = new Student(2, "Cole", 12);
        Student Nicole = new Student(3, "Nicole", 3);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Roger);
        studentList.add(Cole);
        studentList.add(Nicole);

        School ZHA = new School(teacherList, studentList);

        Nicole.payFees(9000);
        Cole.payFees(5000);
        System.out.println("ZHA has earned $" + ZHA.getTotalMoneyEarned());

        David.receiveSalary(David.getSalary());
        System.out.println("ZHA payed the teacher: " + David.getName()
        + ", and the school budget is now: " + ZHA.getTotalMoneyEarned());

        System.out.println(Nicole);
        System.out.println(David);

    }
}
