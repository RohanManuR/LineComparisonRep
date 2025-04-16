package com.brlab.linecomparison;

class Point {
    int x, y;
    // constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Line {
    Point p1, p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // Line = sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2)
    public double calculateLength() {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Line)) return false;
        Line other = (Line) obj;
        return Double.compare(this.calculateLength(), other.calculateLength()) == 0;
    }
}

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Point point1 = new Point(2,5);
        Point point2 = new Point(-2,5);
        Line line1 = new Line(point1,point2);
        Line line2 = new Line(point1,point2);
        System.out.println(line1.calculateLength());
        System.out.println(line1.equals(line2));
    }
}
