package br.com.mariojp.figureeditor;

import java.awt.Point;
import java.awt.Shape;

public interface ShapeFactory {
    Shape createShape(Point p);
}
