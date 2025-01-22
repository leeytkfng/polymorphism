abstract class Animal1{
    String name; int age;
    abstract void eat(); // 추상 메서드가 있을경우 반드시 추상클래스로 만들어주기
    abstract void sleep(); // 추상 메서드의 가장 큰 특징은 구현 부분이 없다. 추후에 오버라이딩 해야함.
    abstract void poo();
}
// 추상화의 가장 큰 특징은 공통적인 속성(변수), 공통적인 행위(메서드)를 하나의 클래스로 정의해서 코드의 재사용성을 크게 높이는것이다.
// 추상클래스 -> 인터페이스
class Cat extends Animal1 {

    @Override
    void eat() {
        System.out.println(name +"고양이 냠냠!");
    }

    @Override
    void sleep() {
        System.out.println(name +"고양이 코!");
    }
    @Override
    void poo(){
        System.out.println(name +"고양이 시원!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal1 animal1 = new Cat(); //여기서 anumail1부분을 인스턴스 화하면 오류가 걸린다 , Animal1 부분은 추상 메서드 부분이 구현이 안되어있기때// 문
        animal1.name ="sally"; animal1.age=25; animal1.eat(); animal1.poo(); animal1.sleep();
    }
}