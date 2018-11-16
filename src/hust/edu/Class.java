package hust.edu;

import java.util.ArrayList;
import java.util.List;

public class Class extends HustObject {
    private Course course;
    private Teacher teacher;
    List<Student> students;

    public Class(String id, Course course, Teacher teacher) {
        super(id);
        this.setCourse(course);
        this.setTeacher(teacher);
        students = new ArrayList<Student>();
    }

    public Class(String id, String courseId, String teacherId) {
        this(id, Course.getCourseById(courseId), Teacher.getTeacherById(teacherId));
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public static Class getClassById(String id) {
        for (Class u : DataBase.classList) {
            if (u.getId().equals(id)) {
                return u;
            }
        }
        System.out.println("Can't find class with id = " + id);
        return null;
    }

    @Override
    public String toString() {
        return "id=\'" + this.getId() + "\'\tcourseName=\'" + this.getCourse().getName() + "\'\n";
    }
}