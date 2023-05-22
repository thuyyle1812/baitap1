public class xaydunglophinhtron {
    double radius;// kbao bien
    String color;

    public xaydunglophinhtron(double radius) {// ktao doi tuong
        this.radius = radius;
    }

    public String color(String color) {
        this.color = color;
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {// tinh dien tich
        return Math.PI * this.radius * this.radius;
    }

}




