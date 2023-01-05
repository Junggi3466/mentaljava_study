package prc6이경환;


public class prc6_4 {
    public static void main(String[] args) {


        Student1 s = new Student1();
        s.name = "이경환";
        s.ban = 1;
        s.no = 1;
        s.kor = 80;
        s.eng = 70;
        s.math = 100;

        System.out.println("이름 : " + s.name);
        System.out.println("총점 : " + s.getTotal());
        System.out.println("평균 : " + s.getAverage());
    }
}

class Student1 {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;


    public int getTotal() {
        int result = 0;
        result = kor + eng + math;
        return result;
    }


    public double getAverage() {
        double result = 0;
        double s;
        s = ((double)(kor + eng + math)/3);
        result = (double)(Math.round(s*10))/10;
        return result;
    }


}
