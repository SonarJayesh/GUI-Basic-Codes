import javax.swing.*;
import java.awt.event.*;
class GUI_AdditionDemo1{
	
	JFrame frame;
	JPanel panel; 
	JLabel lblMessage;
	JLabel lblNo1, lblNo2, lblAdd;
	JTextField txtNo1, txtNo2, txtAdd;
	JButton btnAdd , btnCancel;
	
	GUI_AdditionDemo1(){

		frame = new JFrame();
		panel = new JPanel();
		lblMessage = new JLabel();
		lblNo1 = new JLabel();
		txtNo1 = new JTextField();
		lblNo2 = new JLabel(); 
		txtNo2 = new JTextField();
		lblAdd = new JLabel();
		txtAdd = new JTextField();
		btnAdd = new JButton("ADDITION");
		btnCancel = new JButton("CANCEL");
		panel.setLayout(null);

		
		lblMessage.setText("Welcome User");
		lblMessage.setBounds(250,50,100,30);
		panel.add(lblMessage);

		lblNo1.setText("Enter the First Number:");
		lblNo1.setBounds(50,100,250,30);
		panel.add(lblNo1);

		txtNo1.setBounds(50,140,250,30);
		panel.add(txtNo1);

		lblNo2.setText("Enter the Second Number:");
		lblNo2.setBounds(50,190,250,30);
		panel.add(lblNo2);

		txtNo2.setBounds(50,230,250,30);
		panel.add(txtNo2);
		
		lblAdd.setText("Addition is:");
		lblAdd.setBounds(50,270,250,30);
		panel.add(lblAdd);
		
		txtAdd.setBounds(50,310,250,30);
		panel.add(txtAdd);
		
		btnAdd.setBounds(50,350,120,30);
		panel.add(btnAdd);
		
		btnAdd.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)	
			{
				int a = Integer.parseInt(txtNo1.getText().toString()); 
				int b = Integer.parseInt(txtNo2.getText().toString());
				int c =a+b;
				txtAdd.setText(String.valueOf(c));

				txtNo1.setText("");
				txtNo2.setText("");

				txtNo1.requestFocus();
			}
		});
				

		btnCancel.setBounds(180,350,120,30);
		panel.add(btnCancel);	

		btnCancel.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				//System.exit(0);
				frame.hide();
			}
		});
		
			
		frame.add(panel);
		frame.setSize(600,600);
		frame.setLocation(100,100);
		frame.setTitle("GUI AdditionDemo1");
		frame.setVisible(true);
	}
	public static void main(String[] args){
		
		new GUI_AdditionDemo1();
	}
}