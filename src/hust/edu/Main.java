package hust.edu;

import kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DataBase.addInfo();
        while (true) {
            System.out.println("1. Teacher's ID to class list");
            System.out.println("2. Student's ID to class list");
            System.out.println("3. Class's ID to teacher name");
            System.out.println("4. Add student");
            System.out.println("5. Add teacher");
            System.out.println("6. Add student to class");
            String id;
            Scanner input = new Scanner(System.in);
            int op = Integer.parseInt(input.nextLine());
            switch (op) {
                case 1:
                    System.out.println("Enter teacher's ID");
                    getClassListByTeacherId(input.nextLine());
                    break;
                case 2:
                    System.out.println("Enter student's ID");
                    getClassListByStudentId(input.nextLine());
                    break;
                case 3:
                    System.out.println("Enter class' Id");
                    getTeacherNamebyClassId(input.nextLine());
                    break;
                case 4:
                    addStudent(input);
                    break;
                case 5:
                    addTeacher(input);
                    break;
                case 6:
                    addStudentToClass(input);
                    break;
                default:
                    System.out.println("Terminated");
                    return;
            }
            input.nextLine();
        }
    }

    public static void addStudentToClass(Scanner input) {
        System.out.println("Enter student's ID");
        String studentId = input.nextLine();
        System.out.println("Enter class's ID");
        String classId = input.nextLine();
        Student student = Student.getStudentById(studentId);
        Class curClass = Class.getClassById(classId);
        curClass.addStudent(student);
        System.out.println("Added successfully");
    }

    public static void addTeacher(Scanner input) {
        System.out.println("Teacher's ID");
        String id = input.nextLine();
        System.out.println("Teacher's name");
        String name = input.nextLine();
        System.out.println("Teacher's department");
        String depart = input.nextLine();
        DataBase.teacherList.add(new Teacher(id, name, depart));
        System.out.println("Added successfully!");
    }

    public static void addStudent(Scanner input) {
        System.out.println("Student's ID");
        String id = input.nextLine();
        System.out.println("Student's name");
        String name = input.nextLine();
        DataBase.studentList.add(new Student(id, name));
        System.out.println("Added successfully!");
    }

    public static void getTeacherNamebyClassId(String id) {
        String result = "";
        for (Class u : DataBase.classList) {
            if (u.getId().equals(id)) {
                result += u.getTeacher().getName() + "\n";
            }
        }
        System.out.println(result);
    }

    public static void getClassListByTeacherId(String id) {
        Teacher teacher = Teacher.getTeacherById(id);
        System.out.println(teacher.toString());
    }
    public static void getClassListByStudentId(String id) {
        Student student = Student.getStudentById(id);
        System.out.println(student.toString());
    }
}
