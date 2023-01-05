package prc6이경환;

public class prc6_20 {
    public static int max(int[] arr) {  //static 클래스 메서드로 안하면 안되는 이유가 뭔가요?
        //클래스 메서드 호출시 클래스명.클래스메소드 로 해야하는걸로 아는데
        if(arr == null || arr.length == 0){
            return -99999;
        }
    int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
    return max;
    }







    public static void main(String[] args){

        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:"+max(data));
        System.out.println("최대값:"+max(null));
        System.out.println("최대값:"+max(new int[]{}));

    }
}

