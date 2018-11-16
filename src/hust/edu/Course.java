package hust.edu;

public class Course extends HustObject {
    private int credit;

    public Course(String id, String name, int credit) {
        super(id, name);
        this.setCredit(credit);
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public static Course getCourseById(String id) {
        for (Course course : DataBase.courseList) {
            if (course.id.equals(id)) {
                return course;
            }
        }
        System.out.println("Can't find course with id = " + id);
        return null;
    }
}