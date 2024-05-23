import java.awt.*;
class Frame_LayoutDemo{
	
	Frame frame;
	Panel panel;
	Button btnNorth,btnSouth,btnWest,btnEast,btnCenter;
	public Frame_LayoutDemo(){
		
		frame = new Frame();
		panel = new Panel();
		btnNorth = new Button("NORTH");
		btnSouth = new Button("SOUTH");
		btnWest = new Button("WEST");
		btnEast = new Button("EAST");
		btnCenter = new Button("CENTER");

		panel.setLayout(new BorderLayout());

		panel.add(btnNorth,BorderLayout.NORTH);
		panel.add(btnEast,BorderLayout.EAST);
		panel.add(btnSouth,BorderLayout.SOUTH);
		panel.add(btnWest,BorderLayout.WEST);
		panel.add(btnCenter,BorderLayout.CENTER);

		frame.add(panel);	
		frame.setSize(600,600);
		frame.setLocation(100,100);
		frame.setTitle("Layout Demo");
		frame.setVisible(true);
		
	}
	public static void main(String[] args){
		
		new Frame_LayoutDemo();		

	}
}