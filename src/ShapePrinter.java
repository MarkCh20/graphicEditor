public class ShapePrinter implements Printable {
    private final Shape shape;

    public ShapePrinter(Shape shape) {
        this.shape = shape;
    }
    public void print() {
        System.out.println(shape.getName());
    }
}
