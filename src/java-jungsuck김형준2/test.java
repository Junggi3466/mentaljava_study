

interface javaking{
    void haha();

}



class javababy implements javaking{
    public void haha(){
        System.out.println("haha");
    }
}

class kk implements javaking{
    public void haha(){
        System.out.println("kk");
    }
}



public class test {
    public static void main(String[] args){
        javaking aa = new javababy();
        aa.haha();
        javaking bb =  new kk();
        bb.haha();

    }
}