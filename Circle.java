public class Circle extends Oval {
        private float radius;
        private final float  pi = 3.1415f;
    
        public Circle(String name, float radius) {
            super(name);
            this.radius = radius;
        }
        
        public String toString() {
            return super.toString() + "radius " + radius;

        }

        public float area() {
            return pi * radius * radius;
        }
    
        public float perimeter() {
            return pi * radius * 2;
        }
        
}
    
