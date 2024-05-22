import java.awt.*;
class Frame_GraphicalShape extends Component{

	public static void main(String[] args){
	
		Frame frame = new Frame();
		frame.setSize(600,600);
		frame.setLocation(100,100);
		frame.setTitle("MyFrame");
		frame.add(new Frame_GraphicalShape());
		frame.setVisible(true);
	}
	
	public void paint(Graphics g){

		g.setColor(Color.BLUE);
		g.fillRect(50,50,200,200);
		g.setColor(Color.YELLOW);
		g.fillOval(50,50,200,200);
		g.drawLine(50,50,250,250);
		g.drawLine(50,250,250,50);
		g.setColor(Color.GREEN);
		g.fillOval(100,100,20,30);
		g.fillOval(180,100,20,30);
		g.setColor(Color.BLUE);
		g.fillArc(100,200,100,10,180,360);
		
	}
}