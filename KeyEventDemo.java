import javax.swing.*;
import java.awt.event.*;
class KeyEventDemo{

	JFrame F;
	JPanel P;
	JTextField txtMessage;
	JLabel lblStatus;

	public KeyEventDemo()
	{
		F= new JFrame("Key Event Demo");
		P = new JPanel();
		txtMessage = new JTextField();
		lblStatus = new JLabel("Status");
		
		P.setLayout(null);

		txtMessage.setBounds(50,50,150,30);
		P.add(txtMessage);

		txtMessage.addKeyListener(new KeyListener()
		{
			public void keyPressed(KeyEvent ke1)
			{
				//lblStatus.setText("Ststus: Typing...");
			}
			public void keyReleased(KeyEvent ke2)
			{
				lblStatus.setText("Status: Online");
			}
			public void keyTyped(KeyEvent ke3)
			{
				lblStatus.setText("Status: Typing...");
			}
		});

		lblStatus.setBounds(50,90,150,30);
		P.add(lblStatus);

		F.add(P);
		F.setSize(600,600);
		F.setLocation(100,100);
		F.setVisible(true);
	}
	public static void main(String[] args)
	{
		new KeyEventDemo();
	}
}