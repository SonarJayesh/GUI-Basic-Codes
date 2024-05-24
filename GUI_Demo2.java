import javax.swing.*;
class GUI_Demo2
{
	JFrame frame;	
	JPanel panel;
	JLabel lblGender; 
	JRadioButton rbMale,rbFemale,rbOthers;
	ButtonGroup bg;	
	JLabel lblDoc;
	JCheckBox chkAadhar, chkPan, chkLC, chkTC;
	JLabel lblClass;
	JComboBox cmbClass;
	JList lstSubject;
	String[] Sub = {"C-Lang","C++ Lang","Java","PHP","ASP.Net","Data_Structure"};

	public GUI_Demo2()
	{
		frame = new JFrame();
		panel = new JPanel();
		lblGender = new JLabel("Select the Gender:");
		rbMale = new JRadioButton("Male");
		rbFemale = new JRadioButton("Female");
		rbOthers = new JRadioButton("Others");
		bg = new ButtonGroup();
		lblDoc = new JLabel("Select the Documents:");
		chkAadhar = new JCheckBox("Aadhar");
		chkPan = new JCheckBox("Pan");
		chkLC = new JCheckBox("LC");
		chkTC = new JCheckBox("TC");
		lblClass = new JLabel("Select Class:");
		cmbClass = new JComboBox();
		lstSubject = new JList(Sub);
		
		
		bg.add(rbMale);
		bg.add(rbFemale);	      
		bg.add(rbOthers);

		panel.setLayout(null);


		lblGender.setBounds(20,20,150,30);
		panel.add(lblGender);
		rbMale.setBounds(20,60,60,30);
		panel.add(rbMale);
		rbFemale.setBounds(90,60,80,30);
		panel.add(rbFemale);
		rbOthers.setBounds(180,60,80,30);
		panel.add(rbOthers);
		lblDoc.setBounds(20,150,150,30);
		panel.add(lblDoc);

		chkAadhar.setBounds(20,190,100,30);
		panel.add(chkAadhar);
		chkPan.setBounds(130,190,100,30);
		panel.add(chkPan);
		chkLC.setBounds(20,230,100,30);
		panel.add(chkLC);
		chkTC.setBounds(130,230,100,30);
		panel.add(chkTC);

		lblClass.setBounds(20,270,100,30);
		panel.add(lblClass);
		cmbClass.setBounds(130,270,100,30);
		cmbClass.addItem("FYBCA");
		cmbClass.addItem("SYBCA");
		cmbClass.addItem("TYBCA");
		panel.add(cmbClass);
				
		lstSubject.setBounds(240,270,100,150);
		panel.add(lstSubject);
		


		frame.add(panel);
		frame.setSize(600,600);
		frame.setLocation(100,100);
		frame.setTitle("GUI DEMO2");
		frame.setVisible(true);
		
	}

	public static void main(String[] args){
		
		new GUI_Demo2();
	}
}