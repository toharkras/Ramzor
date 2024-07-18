import javax.swing.*;

public class Window extends JFrame {
    public static final int WIDTH= 800;
    public static final int HEIGHT = 600;

    public Window (){
        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        Menu menu= new Menu(0,0,WIDTH/4, HEIGHT);
        this.add(menu);
        Scene scene = new Scene(WIDTH/4, 0, WIDTH*3/4, HEIGHT);
        this.add(scene);
        this.setVisible(true);

    }


}
