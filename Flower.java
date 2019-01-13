public class Flower {
    private int x;
    private int y;

    public Flower(int theX, int theY) {
        this.x = theX;
        this.y = theY;

        Ellipse p1 = new Ellipse(x, y, 20, 20);
        p1.draw();
        p1.setColor(Color.PINK);
        p1.fill();
        Ellipse p2 = new Ellipse(x, y + 40, 20, 20);
        p2.draw();
        p2.setColor(Color.PINK);
        p2.fill();
        Ellipse p3 = new Ellipse(x + 20, y + 20, 20, 20);
        p3.draw();
        p3.setColor(Color.PINK);
        p3.fill();
        Ellipse p4 = new Ellipse(x - 20, y + 20, 20, 20);
        p4.draw();
        p4.setColor(Color.PINK);
        p4.fill();
        Ellipse p5 = new Ellipse(x, y + 20, 20, 20);
        p5.draw();
        p5.setColor(Color.YELLOW);
        p5.fill();
        Line l1 = new Line(x + 10, y + 60, x + 10, y + 120);
        l1.draw();
        l1.setColor(Color.GREEN);
    }

    public void draw() {

    }
}
