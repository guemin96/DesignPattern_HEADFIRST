# 디자인패턴 3강 데코레이션 패턴(10/26)

## 데코레이터 패턴이란?
객체에 추가 요소를 동적으로 더할 수 있다. 데코레이터를 사용하면 서브클래스를 만들 때보다 훨씬 유연하게 기능을 확장할 수 있다.
<br>
데코레이터 패턴에서 상속은 형식(즉 타입)을 상속하는 데에 사용되고 행동(메소드)은 오버라이딩을 통해 새로운 행동을 추가하거나 수정하는 데에 사용한다.<br>
따라서, 데코레이터 패턴은 상속을 활용하여 형식을 유지하면서 객체의 행동을 동적으로 확장하는 방법을 제공하는 디자인 패턴이다.


### 데코레이터 패턴이 적용된 예 : 자바I/O


### 데코레이터 패턴의 단점 
1. 데코레이터를 끼워넣어도 클라이언트는 데코레이터를 사용하고 있다는 사실을 전혀 알 수 없고 특정 형식에 의존하는 코드에 데코레이터를 적용하면 엉망이 된다.
<br>
```
잘못된 예시
class Coffee {
    private String type;
    private double cost;
       
    // 다른 첨가물을 추가하고 싶으면 Coffee 클래스의 생성자 코드를 수정하여야 한다. 개방폐쇄원칙에 위배가 됨
    public Coffee(String type) {
        this.type = type;
        if (type.equals("SimpleCoffee")) {
            cost = 2.0;
        } else if (type.equals("CoffeeWithSugar")) {
            cost = 3.0;
        } else if (type.equals("CoffeeWithMilk")) {
            cost = 2.5;
        }
    }

    public double getCost() {
        return cost;
    }

    public String getDescription() {
        return type;
    }
}

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee coffee1 = new Coffee("SimpleCoffee");
        System.out.println("Cost: " + coffee1.getCost());         // Cost: 2.0
        System.out.println("Description: " + coffee1.getDescription()); // Description: SimpleCoffee

        Coffee coffee2 = new Coffee("CoffeeWithSugar");
        System.out.println("Cost: " + coffee2.getCost());         // Cost: 3.0
        System.out.println("Description: " + coffee2.getDescription()); // Description: CoffeeWithSugar
    }
}
```

2. 구성요소를 초기화하는데 필요한 코드가 훨씬 복잡해진다
```
Coffee coffee = new SimpleCoffee();       // 기본 커피
coffee = new SugarDecorator(coffee);     // 설탕 추가
coffee = new MilkDecorator(coffee);      // 우유 추가
// 내가 원하는 커피를 만들기 위해서는 이렇게 3줄의 코드를 쳐야됨
```

### 핵심 정리

1. 구성와 위임으로 실행 중에 새로운 행동을 추가할 수 있다 -> 데코레이터 패턴 사용 ex) coffee = new SugarDecorator(coffee)
2. 데코레이터 클래스의 형식은 그 클래스가 감싸는 클래스 형식을 반영한다(상속이나 인터페이스 구현으로 자신이 감쌀 클래스와 같은 형식을 가진다.)
3. 자기가 감싸고 있는 구성 요소의 메소드를 호출한 결과에 새로운 기능을 더함으로써 행동을 확장
4. 구성 요소를 감싸는 데코레이터의 개수에는 제한이 없다.