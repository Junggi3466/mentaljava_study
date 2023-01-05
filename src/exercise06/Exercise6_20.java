package exercise06;

    public class Exercise6_20 {


        static int[] shuffle(int[] arr){
            int tmp = 0;
            int r = (int)(Math.random() *10);

            for(int i = 0;i<arr.length;i++){
                tmp = arr[i];
                arr[i] = arr[r];
                arr[r] = tmp;
            }
            return arr;

        }
    public static void main(String[] args) {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
