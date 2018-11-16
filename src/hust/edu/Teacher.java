package hust.edu;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private String department;

    Teacher(String id, String name, String department) {
        super(id, name);
        this.setDepartment(department);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static Teacher getTeacherById(String id) {
        for (Teacher teacher : DataBase.teacherList) {
            if (teacher.id.equals(id)) {
                return teacher;
            }
        }
        System.out.println("Can't find teacher with id = " + id);
        return null;
    }

    public List<Class> listClasses() {
        List<Class> result = new ArrayList<Class>();
        for (Class u : DataBase.classList)  {
            if (u.getTeacher().id.equals(this.id)) {
                result.add(u);
            }
        }
        return result;
    }

    public List<Project> listProjects() {
        List<Project> result = new ArrayList<>();
        for (Project u : DataBase.projectList) {
            if (u.getTeacher().id.equals(this.id)) {
                result.add(u);
            }
        }
        return result;
    }


    @Override
    public String toString() {
        String res = "Teacher\n" +
                "name='" + name + "\'\n" +
                "department='" + department + "\'\n" +
                "id='" + id + "\'\n" +
                "list classes:\n";
        List<Class> listClasses = this.listClasses();
        if (listClasses.isEmpty()) {
            res += "\t<no class>\n";
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