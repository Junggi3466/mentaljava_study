package prc6이경환;

public class prc6_21 {

    public int abs(int value){
        if(value>=0) {
            return value;
        }else{
            return -value;
        } // value>=0? value : -value;
    }

    public static void main(String[] args)
    {
        int value = 5;
        prc6_21 s = new prc6_21();
        System.out.println(value+"의 절대값:"+s.abs(value));
        value = -10;
        System.out.println(value+"의 절대값:"+s.abs(value));
    }
} //static 없이 객체 생성해서 풀어봄

