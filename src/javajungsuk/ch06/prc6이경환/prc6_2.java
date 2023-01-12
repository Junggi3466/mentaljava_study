package prc6이경환;

class Exercise6_2 {
    public static void main(String args[]) {
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();
        System.out.println(card1.info()); //3
        System.out.println(card2.info()); //1K
    }
}
class SutdaCard {


    int num;
    boolean isKwang;

    SutdaCard() {
        this.num = 1;
        this.isKwang = true;

//        this(1,true);
    }
    SutdaCard (int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    public String info(){

//        return num + (isKwang? " K " : " ");

        String a;
        if(isKwang == true) {
            a = num + "K";
        }else {
            a = num + "";
        }
        return a;
    }



    /*
(1) 알맞은 코드를 넣어 완성하시오.
*/
}