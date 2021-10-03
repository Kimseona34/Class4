public class Circle3 {
    int radius;
    String name;

    public Circle3() {
        radius = 1;
        name = "";
    }
    public Circle3(int r, String n) {
        radius = r;
        name = n;
    }
    public double getArea() {
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Circle3 pizza = new Circle3(10, "자바피자");

        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle3 donut = new Circle3();
        donut.name = "도넛피자";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
