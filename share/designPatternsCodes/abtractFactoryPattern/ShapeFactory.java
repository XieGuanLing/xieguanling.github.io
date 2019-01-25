package abtractFactoryPattern;

import abtractFactoryPattern.Shape.Circle;
import abtractFactoryPattern.Shape.Rectangle;
import abtractFactoryPattern.Shape.Shape;
import abtractFactoryPattern.Shape.Square;
import abtractFactoryPattern.color.Color;

/**
 * Created by 59177 on 2017/12/20.
 */
public class ShapeFactory extends AbstractFactory {
    Color getColor(String colorType) {
        return null;
    }

    Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
