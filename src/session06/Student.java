package session06;

public class  Student {
    private String idStudent;
    private String fullname;
    private String dob;
    private double score;

    public Student(String idStudent, String fullname, String dob, double score) {
        this.idStudent = idStudent;
        this.fullname = fullname;
        this.dob = dob;
        this.score = score;
    }

    public void printInfo() {
        System.out.println("Mã SV: " + idStudent);
        System.out.println("Tên SV: " + fullname);
        System.out.println("Ngày sinh: " + dob);
        System.out.println("Điểm TB: " + score);
    }
}