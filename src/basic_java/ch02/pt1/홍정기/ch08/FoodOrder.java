package ch08;

public class FoodOrder {
    long Num;
    int PhoneNum;
    String home;
    int day;
    int time;
    int price;
    int menuNum;

    FoodOrder(){}

    FoodOrder(long Num,int PhoneNum,String home,int day,int time,int price,int menuNum){
        this.Num = Num;
        this.PhoneNum = PhoneNum;
        this.home = home;
        this.day = day;
        this.time = time;
        this.price = price;
        this.menuNum = menuNum;
    }

    void showOrder(){
        System.out.println("주문 접수 번호: "+ Num);
        System.out.println("주문 핸드폰 번호: "+ PhoneNum);
        System.out.println("주문 집 주소: "+ home);
        System.out.println("주문 날짜: "+ day);
        System.out.println("주문 시간: "+ time);
        System.out.println("주문 가격: "+ price);
        System.out.println("메뉴 번호: "+ menuNum);
    }
}
