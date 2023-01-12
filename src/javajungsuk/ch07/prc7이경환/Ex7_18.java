package prc7이경환;

public class Ex7_18 {
    static void action(Robot k){
        if(k instanceof DanceRobot ){
            DanceRobot dr = (DanceRobot)k;
            dr.dance();
        }else if(k instanceof SingRobot) {

            SingRobot sr = (SingRobot)k;
            sr.sing();
        }else if(k instanceof DrawRobot){
            DrawRobot dr = (DrawRobot)k;
            dr.draw();
        }

    }

    public static void main(String[] args) {
        //Ex7_18 e = new Ex7_18();
        Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
        for(int i=0; i< arr.length;i++)
            //e.action(arr[i]);
            action(arr[i]);
    } // main
}
class Robot {}
class DanceRobot extends Robot {
    void dance() {
        System.out.println("춤을 춥니다.");
    }
}
class SingRobot extends Robot {
    void sing() {
        System.out.println("노래를 합니다.");
    }
}
class DrawRobot extends Robot {
    void draw() {
        System.out.println("그림을 그립니다.");
    }
}

