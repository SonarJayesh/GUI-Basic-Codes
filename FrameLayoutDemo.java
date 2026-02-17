import java.awt.*;
class FrameLayoutDemo{

	Frame frame;
	Panel panel;
	Button btnNorth,btnSouth,btnEast,btnWest,btnCenter;
	public FrameLayoutDemo(){
		
		frame = new Frame();
		panel = new Panel();
		btnNorth = new Button("NORTH");
		btnSouth = new Button("SOUTH");
		btnEast = new Button("EAST");
		btnWest = new Button("WEST");
		btnCenter = new Button("CENTER");


		panel.setLayout(new BorderLayout());

		panel.add(btnNorth,BorderLayout.NORTH);
		panel.add(btnSouth,BorderLayout.SOUTH);
		panel.add(btnEast,BorderLayout.EAST);
		panel.add(btnWest,BorderLayout.WEST);
		panel.add(btnCenter,BorderLayout.CENTER);


		
		frame.add(panel);
		frame.setSize(400,400);
		frame.setLocation(50,50);
		frame.setTitle("Frame Layout");
		frame.setVisible(true);
	}
	public static void main(String[] args){
		
		new FrameLayoutDemo();	
	
	}
}