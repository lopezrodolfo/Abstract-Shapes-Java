public class Triangle extends Polygon {
    private double base;
    private double height;
    

    public Triangle(String name, float base, float height) {
        super(name);
        this.base = base;
        this.height =  height;
    }

    public String toString() {
        return super.toString() + "base " + base + " " + "height " + height;
    }

    public float area() {
        return (float) (base * height * 0.5f);
    }

    public float perimeter() {
        return (float)(base + height + Math.sqrt(Math.pow(base,2) + Math.pow(height,2)));
    }

}
