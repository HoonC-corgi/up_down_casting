package up_down_casting;

abstract class Shape {
    // 클래스 내 추상 메소드가 있으면 추상 클래스가 되어야 함. 객체 생성 불가
    public abstract void draw();    // 추상메소드
}

class Line extends Shape {
    @Override
    public void draw() {
        System.out.println("선 그리기");
    }
}

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("사각형 그리기");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("원 그리기");
    }
}

public class Main {

    public static void main(String [] args) {
        Shape s = new Line();   // 업캐스팅
        s.draw();
        Line l = (Line)s;   // 다운캐스팅, 형변환 해주어야 함
        s = new Circle();
        s.draw();

        Shape shapes [] = new Shape[5];
        shapes[0] = new Line();
        shapes[1] = new Rect();
        shapes[2] = new Circle();
        shapes[3] = new Circle();
        shapes[4] = new Line();

        for(Shape _s : shapes) {
            _s.draw();
        }
    }
}
