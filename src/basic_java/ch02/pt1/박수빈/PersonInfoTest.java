package ch02;

public class PersonInfoTest {
    public static void main(String[] args) {

        PersonInfo personT = new PersonInfo(180, 78,"Tomas",37);

        String data = personT.showPersonInfo();
        System.out.println(data);
    }
}
