package edu.cmu.cs.cs214.lab02;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Square;
import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(2.0);
        Shape square = new Square(4.0);
        Shape rectangle = new Rectangle(2, 3);

        Renderer circleRenderer = new Renderer(circle);
        Renderer squareRenderer = new Renderer(square);
        Renderer rectangleRenderer = new Renderer(rectangle);
//aaqwhgjfq fgit JFGASGHFGHAGKFGKAGFAGFHGALGFGAKFGKAGFKGAOFGOYWQEGFLGAOYEQGOAY
        circleRenderer.draw();
        squareRenderer.draw();
        rectangleRenderer.draw();
    }
}


