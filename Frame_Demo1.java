import java.awt.*;
import awt.paint;

public class Frame_Demo1 extends Component {

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setSize(400, 400);
        frame.setLocation(50,50);
        frame.setTitle("My Frame");
        frame.add(new Frame_Demo1());
        frame.setVisible(true);

    }   
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 100);

        g.setColor(Color.ORANGE);
        g.fillOval(50, 50, 100, 100);
        
        g.setColor(Color.BLUE);
        g.drawLine(50, 50, 150, 150);
    } 
}
