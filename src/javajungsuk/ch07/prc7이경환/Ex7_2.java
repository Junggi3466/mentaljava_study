package prc7이경환;

class SutdaDeck2 {
    final int CARD_NUM = 20;
    SutdaCard2 [] cards = new SutdaCard2 [CARD_NUM];
    SutdaDeck2() {
        for(int i=0;i < cards.length;i++) {
            int num = i%10+1;
            boolean isKwang = (i < 10)&&(num==1||num==3||num==8);
            cards[i] = new SutdaCard2(num,isKwang);
        }
    }

    void shuffle () {
        for(int i = 0;  i < cards.length; i++){
            int j = (int) (Math.random()*cards.length);

            SutdaCard2 tem = cards[i]; //SutdaCard2를 참조변수로 해야하는 이유? 배열인가
            cards[i] = cards[j];
            cards[j] = tem;
        }
    }

    SutdaCard2 pick (int index) {
        if(index < 0 || index >cards.length){
            return null;
        }
        return cards[index];

        // index = (index < 0 || index < 20 ) ? return null : return cards[index];
        // 삼항 연산자로 return 값 반환 하는 법은 뭘까요?

    }

    SutdaCard2 pick() {
            int j = (int)(Math.random()*cards.length);
            return cards[j];
        }


}
class SutdaCard2 {
    int num;
    boolean isKwang;
    SutdaCard2() {
        this(1, true);
    }
    SutdaCard2(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + ( isKwang ? "K":"");  //리턴값이 어디로 가는지 모르겠음
    }
}
class Ex7_2 {
    public static void main(String args[]) {
        SutdaDeck2 deck = new SutdaDeck2();
        for(int i=0; i < deck.cards.length;i++)
            System.out.print(deck.cards[i]+",");
    }
}