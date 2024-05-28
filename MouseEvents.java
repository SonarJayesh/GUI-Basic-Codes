import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class MouseEvents{

	JFrame F;
	JPanel P;
	JTextField txtMessage, txtMessage2;
	JLabel lblStatus,lblPosition;

	public MouseEvents()
	{
		F= new JFrame("MouseEvents Demo");
		P = new JPanel();
		txtMessage = new JTextField();
		lblStatus = new JLabel("Status");
		txtMessage2 = new JTextField();
		lblPosition = new JLabel("Position: ");
		
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
		
		lblStatus.setOpaque(true);	
		lblStatus.addMouseListener(new MouseListener()
		{
			public void mouseEntered(MouseEvent me1)
			{
				lblStatus.setBackground(Color.RED);
			}
			public void mouseExited(MouseEvent me2)
			{
				lblStatus.setBackground(Color.YELLOW);

			}
			public void mousePressed(MouseEvent me3)
			{
				lblStatus.setBackground(Color.GREEN);

			}
			public void mouseReleased(MouseEvent me4)
			{
				lblStatus.setBackground(Color.LIGHT_GRAY);

			}
			public void mouseClicked(MouseEvent me5)
			{
				lblStatus.setBackground(Color.YELLOW);

			}	
		});

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
		
		lblPosition.setBounds(10,530,150,30);
		P.add(lblPosition);

		F.addMouseListener(new MouseListener()
		{
			public void mousePressed(MouseEvent me1)
			{
				lblPosition.setText("Position: "+me1.getX()+","+me1.getY());
			}
			public void mouseReleased(MouseEvent me2)
			{
				lblPosition.setText("Position: "+me2.getX()+","+me2.getY());
			}
			public void mouseEntered(MouseEvent me3)
			{
				lblPosition.setText("Position: "+me3.getX()+","+me3.getY());
			}
			public void mouseExited(MouseEvent me4)
			{
				lblPosition.setText("Position: "+me4.getX()+","+me4.getY());
			}
			public void mouseClicked(MouseEvent me5)
			{
				lblPosition.setText("Position: "+me5.getX()+","+me5.getY());
			}	

		});

		F.add(P);
		F.setSize(600,600);
		F.setLocation(100,100);
		F.setVisible(true);
	}
	public static void main(String[] args)
	{
		new MouseEvents();
	}
}