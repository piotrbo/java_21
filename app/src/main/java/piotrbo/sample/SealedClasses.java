package piotrbo.sample;

/**
 * Sealed Classes Sample
 */
public class SealedClasses {

    public sealed class Shape permits Circle, Square, Rectangle {

    }

    //must be final:
    public final class Circle extends Shape {
        public float radius;
    }

    //the class below is not allowed to extend sealed class: SealedClasses.Shape (as it is not listed in its 'permits' clause)
    // public final class Anything extends Shape { 
    //     public float radius;
    // }


    public non-sealed class Square extends Shape { 
        public double side;
     }
     
     //Square drops seal so you can extend 
    public class SquareB extends Square {}

     public sealed class Rectangle extends Shape permits FilledRectangle {
        public double length, width;
    }

    public final class FilledRectangle extends Rectangle {
        public int red, green, blue;
    }
}
