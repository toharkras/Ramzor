import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Scene extends JPanel{
    private ArrayList<TrafficLight>trafficLights;
    public Scene(int x, int y, int width, int height){
        this.setBounds(x,y, width, height);
        this.trafficLights= new ArrayList<>();
        this.trafficLights.add(new TrafficLight(20,20));
        this.trafficLights.add(new TrafficLight(200,20));
        this.trafficLights.add(new TrafficLight(350,20));


    }


    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        for (TrafficLight trafficLight1: trafficLights){
            trafficLight1.paint(graphics);
        }
    }
}
