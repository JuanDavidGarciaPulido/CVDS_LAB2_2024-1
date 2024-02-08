package edu.eci.cvds.patterns.Shape;

import edu.eci.cvds.patterns.Shape.concrete.Quadrilateral;
import edu.eci.cvds.patterns.Shape.concrete.hexagon;
import edu.eci.cvds.patterns.Shape.concrete.pentagon;
import edu.eci.cvds.patterns.Shape.concrete.triangle;

public class ShapeFactory {

    public static Shape create(RegularShapeType type){
        Shape shape = null;
        switch (type){
            case Triangle:
                shape = new triangle();
            case Hexagon:
                shape = new hexagon();
                break;
            case Pentagon:
                shape = new pentagon();
                break;
            case Quadrilateral:
                shape = new Quadrilateral();
                break;
        }
        return shape;
    }
}
