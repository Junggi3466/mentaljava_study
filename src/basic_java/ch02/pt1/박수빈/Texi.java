package ch02;

public class Texi {

    String texiName;
    int passengerCount;
    int money;

    public Texi(String texiName) {
        this.texiName = texiName;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showtexiinfo() {

        System.out.println(texiName + "의 수입은 " + money + "원입니다.");
    }
}