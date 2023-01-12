package prc6이경환;

public class prc6_5 {
    public static void main(String[] args) {
        Student s = new Student("홍길동",1,1,100,60,76);
        System.out.println(s.info());

    }
}


    class Student{

    String name;
    int kor;
    int eng;
    int math;

    int ban;
    int no;

    Student() {}

        Student(String name,int ban, int no, int kor,int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

        }
        public int getTotal() {
        return kor + eng + math;
        }

        public double getAverage() {
        double a = (kor + eng + math)/3;
        return (double)Math.round(a*100)/100;
        }
   public String info() {
        String result = " ";
        result = name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + getTotal() + ", " +getAverage();
        return result;
   }


    }