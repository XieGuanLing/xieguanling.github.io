package abtractFactoryPattern;

import abtractFactoryPattern.Shape.Shape;
import abtractFactoryPattern.color.Blue;
import abtractFactoryPattern.color.Color;
import abtractFactoryPattern.color.Green;
import abtractFactoryPattern.color.Red;

/**
 * Created by 59177 on 2017/12/20.
 */
public class ColorFactory extends AbstractFactory {

    Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }


    Shape getShape(String shape) {
        return null;
    }
}
