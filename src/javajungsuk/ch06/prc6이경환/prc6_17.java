//package prc6;
//
//public class prc6_17 {
//    public static void main(String[] args) {
//        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(java.util.Arrays.toString(original));
//
//        int[] result = shuffle(original);
//        System.out.println(java.util.Arrays.toString(result));
//    }
//
//
//    class shuffle{
//        public static int[] shuffle(int[] arr) {
//            if (arr == null || arr.length == 0) {
//                return arr;
//
//            }
//            for (int i = 0; i < arr.length; i++) {
//                int j = (int) (Math.random() * arr.length);
//                int tem = arr[i];
//                arr[i] = arr[j];
//                arr[j] = tem;
//            }
//            return arr;
//        }
//    }
//}
//}