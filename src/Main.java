public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        Shape ellipse = new Ellipse();

        ShapePrinter circlePrinter = new ShapePrinter(circle);
        ShapePrinter squarePrinter = new ShapePrinter(square);
        ShapePrinter rectanglePrinter = new ShapePrinter(rectangle);
        ShapePrinter trianglePrinter = new ShapePrinter(triangle);
        ShapePrinter ellipsePrinter = new ShapePrinter(ellipse);

        circlePrinter.print();
        squarePrinter.print();
        rectanglePrinter.print();
        trianglePrinter.print();
        ellipsePrinter.print();

    }
}