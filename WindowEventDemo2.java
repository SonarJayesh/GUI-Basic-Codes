import javax.swing.*;
import java.awt.event.*;
class WindowEventDemo2 extends WindowAdapter
{
	JFrame frame;
	public 	WindowEventDemo2()
	{
		frame = new JFrame("Window Event");

		frame.addWindowListener(this);

		frame.setSize(400,400);
		frame.setLocation(100,100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void windowActivated(WindowEvent we1)
	{
		System.out.println("Online...");
	}
	public void windowIconified(WindowEvent we2)
	{
		System.out.println("Offline");
	}		

	public static void main(String[] args){
		
		new WindowEventDemo2();
	}
}