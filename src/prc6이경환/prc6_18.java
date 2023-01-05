package prc6이경환;

public class prc6_18 {
    public static boolean isNumber(String str) {
        if (str == null || str.equals("")) { //문자열 비교는 equals로 한다
            return false;
        } else {
            for (int i = 0; i < str.length(); i++) {    //length() 은 뭔지 모르겠네요
                char ch = str.charAt(i); // charAt() String 에서 하나씩 불러오기
                if (ch < '0' || ch > '9') {
                    return false;
                }
            } //for
        } //else
        return true;
    }




    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));
        str = "1234o";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));
    }
}

