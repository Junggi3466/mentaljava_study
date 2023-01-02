package ch02;

public class PersonInfo {

    public int personAge;
    public String personName;
    public int personHeight;
    public int personWeight;

    public PersonInfo(int personHeight, int personWeight, String personName, int personAge) {
        this.personHeight = personHeight;
        this.personWeight = personWeight;
        this.personName = personName;
        this.personAge = personAge;
    }

    public String showPersonInfo() {
            return "키가 " + personHeight + " 이고 몸무게가 " + personWeight + " 킬로인 남성이 있습니다. " +
                    "이름은 " +  personName + " 이고 나이는 " + personAge + "세입니다.";
    }


}
