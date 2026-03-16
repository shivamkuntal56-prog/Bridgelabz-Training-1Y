package Level_1;

class Circle {
    double radius;
    Circle(double r) {
        radius = r;
    }
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
    void calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of Circle: " + circumference);
    }
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.calculateArea();
        c.calculateCircumference();
    }
}
