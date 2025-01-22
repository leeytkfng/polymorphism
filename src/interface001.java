interface Animal {
    String name = "홍길동"; //static - method area , new 관련 x, new 보다 먼저 메모리상
    void eat();
}
class Saram implements Animal { //interface를 구현하기 위한 클래스 이기때문이다.(implements)
    @Override
    public void eat(){
//        name="lee final 선언으로 값을 변경할수 업성!
        System.out.println("식사중~"); // 구현
    }
}
// 1.클래스 부품객체
// 2. 부품객체 상태 + 행위
// 3. 인터페이스 상태(맴버변수): public static final(상수) -> 프로그램 실행과 종료동안 생성되는 불변의 값
// 4. 인터페이스 행위 public abstract : { }
// abstract 클래스보다 추상화 정도가 높다 . 뼈대만 남은수준

// 인터페이스를 사용하는 목적
// 1. 더 추상화가 높은 클래스를 사용함으로써 다형성과 재사용성을 증가
//2. 공통된 상수값을 정의하는 목적

public class interface001 {
    public static void main(String[] args){
        System.out.println(Animal.name);
    }
}
