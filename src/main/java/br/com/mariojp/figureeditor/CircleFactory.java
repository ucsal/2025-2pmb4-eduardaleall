package br.com.mariojp.figureeditor;

import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class CircleFactory implements ShapeFactory {
    @Override
    public Shape createShape(Point p) {
        int radius = 50;
        return new Ellipse2D.Double(p.x - radius, p.y - radius, 2 * radius, 2 * radius);
    }
}
