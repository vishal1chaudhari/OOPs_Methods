package Practice_1;
// find area and perimeter of a circle using class.
class Circle{

    void Area(float r){
        float perimeter = 2 * 3.14f * r;
        float area = 3.14f * r * r;

        System.out.println("Perimeter of circle : "+perimeter);
        System.out.println("Area of circle : "+area);
    }

}

public class Problem1 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.Area(10);
    }
}
