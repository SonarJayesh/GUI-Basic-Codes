import javax.swing.*;

class GUISwingDemo1{
	
	JFrame frame;
	JPanel panel;
	JLabel lblUserName,lblPassWord;
	JTextField txtUserName,txtPassWord;
	JButton btnLogin,btnCancel;
	

	public GUISwingDemo1(){

		frame = new JFrame();
		panel = new JPanel();
		lblUserName = new JLabel();
		txtUserName = new JTextField();
		lblPassWord = new JLabel("Enter the PassWord: ");
		txtPassWord = new JTextField();
		btnLogin = new JButton("Login");
		btnCancel = new JButton("Cancel");
		

		
		panel.setLayout(null);
		

		frame.add(panel);
		frame.setSize(400,400);
		frame.setLocation(50,50);
		frame.setTitle("GUI Demo");

		lblUserName.setText("Enter the UserName: ");
		lblUserName.setBounds(50,50,170,30);
		panel.add(lblUserName);

		txtUserName.setBounds(50,90,170,30);
		panel.add(txtUserName);

		lblPassWord.setBounds(50,130,170,30);
		panel.add(lblPassWord);

		txtPassWord.setBounds(50,170,170,30);
		panel.add(txtPassWord);

		btnLogin.setBounds(50,210,80,30);
		panel.add(btnLogin);

		btnCancel.setBounds(135,210,80,30);
		panel.add(btnCancel);

		frame.setVisible(true);	

		

	}
	public static void main(String[] args){
	
		new GUISwingDemo1();
	}
}