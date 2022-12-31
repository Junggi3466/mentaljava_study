package ch08;

public class People {
    //키가 180이고 몸무게가 78 킬로인 남성이 있습니다. 이름은 Tomas 이고 나이는 37세 입니다.

    int tall;
    double weight;
    String gender;
    String name;
    int age;

    People(){}

    People(int tall,double weight,String gender,String name,int age){
        this.tall = tall;
        this.weight = weight;
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    void showpeople(){
        System.out.println("키가"+tall+"이고 몸무게가"+weight+"킬로인 "+gender+"이 있습니다. 이름은"+name+"이고 나이는 "+age+"세입니다.");
    }

}
