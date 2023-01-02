package ch02;

public class TakeTransTest2 {
        public static void main(String[] args) {

            Student studentE = new Student("Edward", 20000);

            Texi texi1 = new Texi("잘나간다 운수");
            studentE.takeTaxi(texi1);

            studentE.showInfo();
            texi1.showtexiinfo();
        }
}
