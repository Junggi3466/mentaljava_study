package prc6이경환;

public class Prc6_7 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1,1);
        System.out.println(p.getDistance1(2,2));
    }


}

    class MyPoint {
    int x;
    int y;

    MyPoint (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance1(int x,int y) {
        return Math.sqrt((this.x-x)*(this.x-x) + (this.y-y)*(this.y-y));
    }

}