import javax.swing.*;
import java.awt.event.*;
class WindowEventDemo
{
	JFrame frame;
	public 	WindowEventDemo()
	{
		frame = new JFrame("Window Event");
		
		frame.addWindowListener(new WindowListener()
		{
			public void windowDeactivated(WindowEvent wd1)
			{
				System.out.println("Window Deactivated");	
			}
			public void windowActivated(WindowEvent wa2)
			{
				System.out.println("Window Activated");
			}
			public void  windowDeiconified(WindowEvent wd3)
			{
				System.out.println("Window Deiconified");
			}
			public void  windowIconified(WindowEvent wi4)
			{
				System.out.println("Window Iconified");
			}
			public void windowClosed(WindowEvent wc5)
			{
				System.out.println("Window Closed");
			}
			public void windowClosing(WindowEvent wc6)
			{
				System.out.println("Window Closing");
			}
			public void windowOpened(WindowEvent wo7)
			{
				System.out.println("Window Opened");
			}

		});

		frame.setSize(400,400);
		frame.setLocation(100,100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		
		new WindowEventDemo();
	}
}