package org.example.lessTwo_1;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public double length() {
        return Math.sqrt(x*x+y*y+z*z);
    }

    public double scalar(Vector vector2) {
        return x*getX()+y*getY()+z*getZ();
    }

    public Vector multiply(Vector vector2) {
        return new Vector(
                y*vector2.getZ()-z*vector2.getY(),
                z* vector2.getX()-x* vector2.getZ(),
                x* vector2.getY()-y* vector2.getX()
                );
    }
}
