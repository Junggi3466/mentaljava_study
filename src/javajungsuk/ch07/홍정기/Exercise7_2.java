/*
package ch07;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {

        for(int i = 0;i<cards.length;i++){
            if(i < 10){
                if(i == 0 || i ==2 || i == 7){
                    cards[i] = new SutdaCard(i+1,true);
                    continue;
                }
                cards[i] = new SutdaCard(i+1,false);
            }else{
                cards[i] = new SutdaCard(i % 10 + 1,false);
            }

        }
    }
    public void shuffle(){
        for(int i = 0; i < cards.length; i++){
            int r = (int)(Math.random() * CARD_NUM);

            SutdaCard temp = cards[i];
            cards[i] = cards[r];
            cards[r] = temp;

        }
    }
    SutdaCard pick(int index){
        return cards[index];
    }
    SutdaCard pick(){
        int index = (int)(Math.random() * CARD_NUM);
        return pick(index);
    }


}
class SutdaCard{
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1,true);
    }
    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }
    //info()대신 Object클래스의 toString()을 오버라이딩 했다.
    public String toString() {
        return num + (isKwang ? "K":"");
    }
}

public class Exercise7_2 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i]+",");

        System.out.println();
        System.out.println(deck.pick(0));
    }

}
*/
