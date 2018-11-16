package hust.edu;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static List<Student> studentList = new ArrayList<Student>();
    public static List<Teacher> teacherList = new ArrayList<Teacher>();
    public static List<Course> courseList = new ArrayList<Course>();
    public static List<Class> classList = new ArrayList<Class>();
    public static List<Project> projectList = new ArrayList<Project>();

    public static void addInfo() {
        Student[] demoStudent = new Student[50];
        demoStudent[0] = new Student("20164767", "Nguyen Dinh Tuan Anh");
        demoStudent[1] = new Student("20164977", "Nguyen Tu Xuan Cong");
        demoStudent[2] = new Student("20164765", "Hoang Viet Cuong");
        demoStudent[3] = new Student("20164820", "Nguyen Hung Cuong");
        demoStudent[4] = new Student("20160447", "Nguyen Thanh Chung");
        demoStudent[5] = new Student("20164773", "Dau Trung Dung");
        demoStudent[6] = new Student("20160656", "Le Duc Dung");
        demoStudent[7] = new Student("20164844", "Le Anh Duc");
        demoStudent[8] = new Student("20164764", "Le Ba Truong Giang");
        demoStudent[9] = new Student("20164835", "Le Kha Hai");
        demoStudent[10] = new Student("20161599", "Vuong Trung Hieu");
        demoStudent[11] = new Student("20164850", "Nguyen Nhu Hoang");
        demoStudent[12] = new Student("20164778", "Tran Quang Huy");
        demoStudent[13] = new Student("20162031", "Nguyen Tuan Hung");
        demoStudent[14] = new Student("20162573", "Nguyen Dinh Lich");
        demoStudent[15] = new Student("20162567", "Nguyen Dai Loi");
        demoStudent[16] = new Student("20164851", "Tran Duc Manh");
        demoStudent[17] = new Student("20164776", "Phan Minh Nghia");
        demoStudent[18] = new Student("20164836", "Chu Trong Nhan");
        demoStudent[19] = new Student("20163206", "Nguyen Huu Phung");
        demoStudent[20] = new Student("20164811", "Le Minh Quang");
        demoStudent[21] = new Student("20164837", "Nguyen Tien Tai");
        demoStudent[22] = new Student("20164861", "Ho Anh Tien");
        demoStudent[23] = new Student("20164843", "Nguyen Anh Tu");
        demoStudent[24] = new Student("20164770", "Nguyen Doan Thanh Tung");
        demoStudent[25] = new Student("20164812", "Tran Thanh Tung");
        demoStudent[26] = new Student("20164834", "Le Cong Thanh");
        demoStudent[27] = new Student("20164842", "Vo Hai Thien");
        demoStudent[28] = new Student("20164197", "Nguyen Huu Trang");
        demoStudent[29] = new Student("20164768", "Luong Quoc Trung");
        demoStudent[30] = new Student("20165736", "Nguyen Hoang Anh");
        demoStudent[31] = new Student("20160195", "Nguyen Tuan Anh");
        demoStudent[32] = new Student("20160427", "Nguyen Quoc Chien");
        demoStudent[33] = new Student("20164849", "Ngo Sy Dung");
        demoStudent[34] = new Student("20161418", "Duong Gia Hien");
        demoStudent[35] = new Student("20161755", "Nguyen Dac Hong");
        demoStudent[36] = new Student("20166264", "Nguyen Van Huong");
        demoStudent[37] = new Student("20162115", "Do Manh Khang");
        demoStudent[38] = new Student("20163161", "Vu Duc Phong");
        demoStudent[39] = new Student("20163327", "Tran Minh Quang");
        demoStudent[40] = new Student("20167485", "Tran Nhat Quang");
        demoStudent[41] = new Student("20163333", "Vu Minh Quang");
        demoStudent[42] = new Student("20166677", "Nguyen Hung Son");
        demoStudent[43] = new Student("20163618", "Vu Nguyen Thanh Tam");
        demoStudent[44] = new Student("20164828", "Dao Anh Tuan");
        demoStudent[45] = new Student("20163871", "Tran Manh Thang");
        demoStudent[46] = new Student("20163940", "Luong Hoai Thu");
        demoStudent[47] = new Student("20164640", "Chu Duc Viet");
        demoStudent[48] = new Student("20164759", "Nguyen Thi Hai Yen");
        demoStudent[49] = new Student("20164848", "Ngo Thi Tra");
        for (Student u : demoStudent) {
            studentList.add(u);
        }

        Course[] demoCourse = new Course[10];
        demoCourse[0] = new Course("EM1110", "Phap luat dai cuong", 2);
        demoCourse[1] = new Course("MI1110", "Giai tich 1", 4);
        demoCourse[2] = new Course("MI1140", "Dai so", 4);
        demoCourse[3] = new Course("MIL1110", "Duong loi quan su", 0);
        demoCourse[4] = new Course("PE1010", "Giao duc the chat A", 0);
        demoCourse[5] = new Course("PH1110", "Vat ly dai cuong 1", 3);
        demoCourse[6] = new Course("SSH1110", "Nhung NLCB cua CNML 1", 2);
        demoCourse[7] = new Course("EM1010", "Quan tri hoc dai cuong", 2);
        demoCourse[8] = new Course("MI1120", "Giai tich 2", 3);
        demoCourse[9] = new Course("MI1130", "Giai tich 3", 3);
        for (Course u : demoCourse) {
            courseList.add(u);
        }

        Teacher[] demoTeacher = new Teacher[10];
        demoTeacher[0] = new Teacher("1234", "Nguyen Xuan Thao", "Vien Toan ung dung - Tin hoc");
        demoTeacher[1] = new Teacher("5621", "Nguyen Thanh Xuan", "Khoa Ly luan chinh tri");
        demoTeacher[2] = new Teacher("8547", "Tong Dinh Quy", "Vien Toan ung dung - Tin hoc");
        demoTeacher[3] = new Teacher("9563", "Thai Thu Thuy", "Vien Kinh te - Quan ly");
        demoTeacher[4] = new Teacher("1024", "Nguyen Dinh Thang", "Vien Dien");
        demoTeacher[5] = new Teacher("7542", "Bui Minh Thanh", "Khoa Giao duc quoc phong");
        demoTeacher[6] = new Teacher("1358", "Tran Hoang Minh", "Khoa Giao duc the chat");
        demoTeacher[7] = new Teacher("7452", "Dang Duc Dung", "Vien Vat ly Ky thuat");
        demoTeacher[8] = new Teacher("1728", "Ngo Hong Son", "Vien Cong nghe thong tin - Truyen thong");
        demoTeacher[9] = new Teacher("7956", "Nguyen Thanh Hung", "Vien Cong nghe thong tin - Truyen thong");
        for (Teacher u : demoTeacher) {
            teacherList.add(u);
        }

        Class[] demoClass = new Class[15];
        demoClass[0] = new Class("103965", "EM1110", "9563");
        demoClass[1] = new Class("152664", "MI1110", "1234");
        demoClass[2] = new Class("152665", "MI1110", "8547");
        demoClass[3] = new Class("142685", "MI1140", "8547");
        demoClass[4] = new Class("142686", "MI1140", "8547");
        demoClass[5] = new Class("125612", "MIL1110", "7542");
        demoClass[6] = new Class("106329", "PE1010", "1358");
        demoClass[7] = new Class("106330", "PE1010", "1358");
        demoClass[8] = new Class("154287", "PH1110", "7452");
        demoClass[9] = new Class("142986", "SSH1110", "5621");
        demoClass[10] = new Class("148951", "EM1010", "9563");
        demoClass[11] = new Class("163547", "MI1120", "8547");
        demoClass[12] = new Class("163548", "MI1120", "1234");
        demoClass[13] = new Class("163259", "MI1130", "8547");
        demoClass[14] = new Class("163260", "MI1130", "1234");
        for (Class u : demoClass) {
            classList.add(u);
        }

        Project[] demoProject = new Project[5];
        demoProject[0] = new Project("00123", "Nghien cuu Giai tich ham", "20164778", "1234");
        demoProject[1] = new Project("00124", "Project 1", "20162567", "1234");
        demoProject[2] = new Project("00125", "Phat trien cong nghe AI", "20164844", "1728");
        demoProject[3] = new Project("00126", "Nghien cuu Giai tich phuc", "20164850", "1234");
        demoProject[4] = new Project("00127", "Ung dung thuat toan Deep Learning", "20164811", "1728");
        for (Project u : demoProject) {
            projectList.add(u);
        }
    }
}
