package abtractFactoryPattern;

import abtractFactoryPattern.Shape.Shape;
import abtractFactoryPattern.color.Color;

/**
 * Created by 59177 on 2017/12/20.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}
