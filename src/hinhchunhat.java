public class hinhchunhat {
    double width, height;// kbao bien


    public hinhchunhat(double width, double height) {//khoi tao doi tuong
        this.width = width;
        this.height = height;

    }

    public double getArea() {// ktao phuong thuc cua dien tich
        return this.width * this.height;
    }

    public double getPerimeter() {// ktao phuong thuc chu vi
        return (this.width + this.height) * 2;
    }
    public String display() {//
    return "hinhchunhat{"+"width="+width+", height=" + height+ "}";
    }
}


