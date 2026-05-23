class Circle {

    private double radius;
    private final double PI = 3.14;

    Circle(double radius) {
        this.radius = radius;
    }

    Circle() {
        this.radius = 0;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return (PI * radius * radius);
    }

    public double computeCircumference() {
        return (2 * PI * radius);
    }


}
