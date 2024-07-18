import java.awt.*;

public class TrafficLight {
    private int x;
    private int y;
    public static final int WIDTH = 80;
    public static final int HEIGHT = WIDTH * 3;
    public static final int MARGIN = 4;

    public TrafficLight(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void paint(Graphics graphics) {
        // Draw the outer rectangle (black background)
        graphics.setColor(Color.BLACK);
        graphics.fillRect(this.x, this.y, WIDTH, HEIGHT);

        // Draw the red light
        graphics.setColor(Color.RED);
        graphics.fillOval(this.x + MARGIN, this.y + MARGIN, WIDTH - MARGIN * 2, HEIGHT / 3 - MARGIN * 2);

        // Draw the yellow light
        graphics.setColor(Color.YELLOW); // Corrected case to uppercase for Color.YELLOW
        graphics.fillOval(this.x + MARGIN, this.y + HEIGHT / 3 + MARGIN, WIDTH - MARGIN * 2, HEIGHT / 3 - MARGIN * 2);

        // Draw the green light
        graphics.setColor(Color.GREEN);
        graphics.fillOval(this.x + MARGIN, this.y + 2 * HEIGHT / 3 + MARGIN, WIDTH - MARGIN * 2, HEIGHT / 3 - MARGIN * 2);
    }
}