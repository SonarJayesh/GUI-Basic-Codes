import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Focus_Listener{

	JFrame F;
	JPanel P;
	JTextField txtMessage, txtMessage2;
	JLabel lblStatus;

	public Focus_Listener()
	{
		F= new JFrame("Focus_Listener Demo");
		P = new JPanel();
		txtMessage = new JTextField();
		lblStatus = new JLabel("Status");
		txtMessage2 = new JTextField();
		
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
		
		txtMessage.addFocusListener(new FocusListener()
		{
			public void focusGained(FocusEvent fe1)
			{	
				txtMessage.setBackground(Color.LIGHT_GRAY);	
			}
			public void focusLost(FocusEvent fe2)
			{
				txtMessage.setBackground(Color.WHITE);
			}			
		});

		lblStatus.setBounds(50,90,150,30);
		P.add(lblStatus);

		txtMessage2.setBounds(50,130,150,30);
		P.add(txtMessage2);

		txtMessage2.addFocusListener(new FocusListener()
		{
			public void focusGained(FocusEvent fe1)
			{	
				txtMessage2.setBackground(Color.LIGHT_GRAY);	
			}
			public void focusLost(FocusEvent fe2)
			{
				txtMessage2.setBackground(Color.WHITE);
			}			
		});


		F.add(P);
		F.setSize(600,600);
		F.setLocation(100,100);
		F.setVisible(true);
	}
	public static void main(String[] args)
	{
		new Focus_Listener();
	}
}