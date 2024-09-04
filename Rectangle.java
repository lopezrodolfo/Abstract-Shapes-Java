public class Rectangle extends Polygon {
    private float height;
    private float width;

    public Rectangle(String name, float height, float width) {
        super(name);
        this.height = height;
        this.width = width;
    }

    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }

    public String toString() {
        return super.toString() + "height " + height + " " + "width " + width;
    }
    
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rectangle other = (Rectangle) obj;
        if (Float.floatToIntBits(height) != Float.floatToIntBits(other.height))
            return false;
        if (Float.floatToIntBits(width) != Float.floatToIntBits(other.width))
            return false;
        return true;
    }
    
    public float area() {
        return height * width;
    }

    public float perimeter() {
        return 2 * (width + height);
    }
       
}
