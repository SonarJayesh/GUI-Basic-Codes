import javax.swing.*;
class GUI_Demo1{
	
	JFrame frame;
	JPanel panel; 
	JLabel lblMessage;
	JLabel lblUserName, lblPassWord;
	JTextField txtUserName, txtPassWord;
	JButton btnLogin , btnCancel;
	
	GUI_Demo1(){

		frame = new JFrame();
		panel = new JPanel();
		lblMessage = new JLabel();
		lblUserName = new JLabel();
		txtUserName = new JTextField();
		lblPassWord = new JLabel();
		txtPassWord = new JTextField();
		btnLogin = new JButton("Login");
		btnCancel = new JButton("Cancel");
		panel.setLayout(null);

		
		lblMessage.setText("Welcome User");
		lblMessage.setBounds(250,50,100,30);
		panel.add(lblMessage);

		lblUserName.setText("Enter the UserName:");
		lblUserName.setBounds(50,100,150,30);
		panel.add(lblUserName);

		txtUserName.setBounds(50,140,150,30);
		panel.add(txtUserName);

		lblPassWord.setText("Enter the PassWord:");
		lblPassWord.setBounds(50,190,150,30);
		panel.add(lblPassWord);

		txtPassWord.setBounds(50,230,150,30);
		panel.add(txtPassWord);

		btnLogin.setBounds(50,270,70,30);
		panel.add(btnLogin);

		btnCancel.setBounds(130,270,70,30);
		panel.add(btnCancel);		

		frame.add(panel);
		frame.setSize(600,600);
		frame.setLocation(100,100);
		frame.setTitle("GUI DEMO");
		frame.setVisible(true);
	}
	public static void main(String[] args){
		
		new GUI_Demo1();
	}
}