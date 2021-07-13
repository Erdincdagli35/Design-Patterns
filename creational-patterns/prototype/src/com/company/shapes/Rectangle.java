package com.company.shapes;

public class Rectangle extends Shape{

    public int width,height;

    public Rectangle(){}

    public Rectangle(Rectangle target){
        if (target != null){
            this.height= target.height;
            this.width = target.width;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Rectangle) || !(super.equals(object))) return false;
        Rectangle rectangle = (Rectangle) object;
        return rectangle.width == width && rectangle.height == height;
    }
}
