public abstract class Shape extends Object {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String toString() {
        return  "Name: " + name + " ";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof Shape))
            return false;

        Shape other = (Shape) obj;

        return (this.name == other.name);
    }

        
    public abstract float perimeter();
    public abstract float area();
   
}
