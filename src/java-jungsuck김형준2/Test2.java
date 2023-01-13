abstract class AdultDoggi{
    protected void hunting(){
        System.out.println("쥐를 잡자");
    }
    abstract void eat();
}

class BabyDoggi extends AdultDoggi{

    @Override
    void eat(){
        System.out.println("쥐를 먹습니다.");
    }
    void superHunting(){
        System.out.println("쥐를 백마리 잡습니다.");
    }

}

public class Test2{
    public static void main(String[] args){
        AdultDoggi badugi = new BabyDoggi();
        badugi.hunting();
        // badugi.superHunting(); 업캐스팅이라 자식클래스메서드 사용불가
    }
}