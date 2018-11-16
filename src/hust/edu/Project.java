package hust.edu;

public class Project extends HustObject {
    Student student;
    Teacher teacher;

    public Project(String id, String name, Student student, Teacher teacher) {
        super(id, name);
        this.student = student;
        this.teacher = teacher;
    }

    public Project(String id, String name, String studentId, String teacherId) {
        this(id, name, Student.getStudentById(studentId), Teacher.getTeacherById(teacherId));
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "id=" + this.getId() + "\tproject_name=" + this.getName() + "\n";
    }
}
