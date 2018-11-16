package hust.edu;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String program;

    public Student(String id, String name) {
        super(id, name);
    }

    public Student(String id, String name, String program) {
        super(id, name);
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public static Student getStudentById(String id) {
        for (Student student : DataBase.studentList) {
            if (student.id.equals(id)) {
                return student;
            }
        }
        System.out.println("Can't find any student with id = " + id);
        return null;
    }

    public List<Class> listClasses() {
        List<Class> result = new ArrayList<Class>();
        for (Class u : DataBase.classList)  {
            for (Student v : u.getStudents()) {
                if (v.getId().equals(this.id)) {
                    result.add(u);
                    break;
                }
            }
        }
        return result;
    }

    public List<Project> listProjects() {
        List<Project> result = new ArrayList<>();
        for (Project u : DataBase.projectList) {
            if (u.getStudent().getId().equals(this.id)) {
                result.add(u);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        String res = "Student\n" +
                "name='" + name + "\'\n" +
                "id='" + id + "\'\n" +
                "list classes:\n";
        List<Class> listClasses = this.listClasses();
        if (listClasses.isEmpty()) {
            res += "\t<empty>\n";
        } else {
            for (Class u : listClasses) {
                res += "\t" + u.toString();
            }
        }
        List<Project> listProjects = this.listProjects();
        res += "list projects\n";
        if (listProjects.isEmpty()) {
            res += "\t<no project>\n";
        } else {
            for (Project v : listProjects) {
                res += "\t" + v.toString();
            }
        }
        return res;
    }
}