class AdultDoggi2{
    protected void hunting(){
        System.out.println("쥐를 잡자");
    }
    void fastRun(){
        System.out.println("빠르게 뜁니다.");
    }
}

class BabyDoggi2 extends AdultDoggi2{

    AdultDoggi2 teach;
    void eatMilk(){
        System.out.println("우유를 마십니다.");
    }

    void motherSkill(){
        teach = new AdultDoggi2();
        teach.hunting();
    }


}
class OtherDoggi{
    AdultDoggi2 teach;
    void motherSkill(){
        teach = new AdultDoggi2();
        teach.hunting();
    }
}

public class Test3 {
    public static void main(String[] args) {
        AdultDoggi2 aa = new BabyDoggi2();
        BabyDoggi2 bb = (BabyDoggi2) aa;
        aa.fastRun();
        bb.eatMilk();

        //aa.eatMilk(); ((BabyDoggi2) aa).eatMilk(); 하위로로 캐스팅하면 하위클래스 사용가능
        //aa.motherSkill(); 다운 캐스팅으로 하위클래스의 객체 사용불가. 오직상위클래스만 사용가능.


       // OtherDoggi ee = new OtherDoggi();
        //ee.motherSkill();
        //OtherDoggi의 motherSkill()메서드에서 AdultDoggi의
        // protected 메서드를 출력시키려고 해서 예외발생
    }
}