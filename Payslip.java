import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JScrollPane;


public class Payslip extends JFrame implements ActionListener {
        
    	//declare components
        JFrame login_frame,admin_frame,employee_frame ;
        JLabel lblLog, lblUser, lblPass, lblx, lblBG;
        JButton bLoginUser,bLoginAdmin, bCancel, bLogout, bFirstSalary, bSecondSalary, bPrint;
        JTextField txtUser;
        JPasswordField txtPass;
        JTable payslip_summary, prof_summary;
        JScrollPane payslip_pane, prof_pane;
        ImageIcon log = new ImageIcon("file:///C:/Users/Public/Pictures/Sample%20Pictures/log.jpg");
        //int Gross, TotalDeduction, NTHP;


//accessible by Admin Only Start ===========================>>

        String[][] user = {{"May Ann Labitad","40,740","14,030","26,710"}
					      /*{"Analita Autida","22000","3000","19000"},
					      {"Divine Grace Mabilin","22000","7000","15000"},
					      {"Jeanette Alim","30000","5000","25000"},
					      {"Analita Autida","22000","3000","19000"},
					      {"Divine Grace Mabilin","22000","7000","15000"},
					      {"Jeanette Alim","30000","5000","25000"},
					      {"Analita Autida","22000","3000","19000"},
					      {"Divine Grace Mabilin","22000","7000","15000"},
					      {"Jeanette Alim","30000","5000","25000"},
					      {"Analita Autida","22000","3000","19000"},
					      {"Divine Grace Mabilin","22000","7000","15000"},
					      {"Jeanette Alim","30000","5000","25000"},
					      {"Analita Autida","22000","3000","19000"},
					      {"Divine Grace Mabilin","22000","7000","15000"},
					      {"Jeanette Alim","30000","5000","25000"},
					      {"Analita Autida","22000","3000","19000"},
					      {"Divine Grace Mabilin","22000","7000","15000"},
					      {"Jeanette Alim","30000","5000","25000"},
					      {"Analita Autida","22000","3000","19000"},
					      {"Divine Grace Mabilin","22000","7000","15000"},
					      {"Jeanette Alim","30000","5000","25000"},
					      {"Floramae Fuentes","35000","5000","30000"}*/};
					      
		String column1[]= {"Name", "Gross Income", "Total Deduction" , "NTHP"};
		
//accessible by Admin Only End ===========================>>


//accessible by Employee Start ===========================>>
		String[][] emp={{"First Name","May Ann"},{"Middle Name","Yare"},{"Last Name","Labitad"},{"Rank","EMP1"},{"Region of Assignment","Region X"},{"Date of Employment","Friday December 15-2006"},{"WithholdingTax Status","ME1"},{"Philhealth Number","03000227264"},{"Longevity","2"},{"Salary Grade","0"},{"BIR TIN","252-639-453"}};
					   
		String column2[]= {"Data1", "Data2"};
		
		String [][] pay1 = {{"Base Pay", "30,000.00"},{"Long Pay", "6,000.00"}, {"Hazard Pay", "540.00"},{"Subsistence Allow", "4,000.00"},{"Clothing Allow", "200.00"},{"TOTAL EARNINGS","40,740"},{" "," "},{"DEDUCTIONS=====================================================","=========================================================="}, {"Loan-1", "1,000.00"},{"Housing Loan", "3,000.00"},{"Car Loan", "5,000.00"},{"Educational Loan", "4,500.00"},{"Pagibig","100.00"},{"Philhealth","430.00"},{"TOTAL DEDUCTIONS=====================","14,030"},{"Net Take Home Pay","26,710"}};
		
		String column3 []={"Data1", "Data2"};
		
		
		
        
//accessible by Employee End ===========================>>
		
        
    public Payslip() {
    	
    	
    	// ============================ LOGIN FRAME START ============================
    	
 		login_frame = new JFrame();
    	
    	
    	login_frame.setSize(400,380);
    	login_frame.setVisible(true);
    	login_frame.setTitle("User Login");
    	login_frame.setLocationRelativeTo(null);
		
/*    	
    	employee_frame = new JFrame();
    	
    	login_frame.setSize(400,380);
    	login_frame.setVisible(true);
    	login_frame.setTitle("Employee");
    	login_frame.setLocationRelativeTo(null);
*/
	
    	lblBG = new JLabel("file:///C:/Users/Public/Pictures/Sample%20Pictures/log.jpg");
		
	
    	//Login Frame
		bLoginUser = new JButton ("Login");		
    	lblLog = new JLabel("OOP FINANCE SERVICE");
    	lblUser = new JLabel("User Name");	
		bCancel = new JButton ("Cancel");
    	bLoginAdmin = new JButton ("Admin");
    	bLogout = new JButton ("Logout");
		lblPass = new JLabel("Password");
		JTextField txtUser = new JTextField();
		JPasswordField txtPass = new JPasswordField();	
    	
	
    	login_frame.add(lblLog);
      	lblLog.setBounds(100,50,200,50);
      	
      	login_frame.add(lblUser);
      	lblUser.setBounds(50,120,100,30);
    	
    	login_frame.add(txtUser);
      	txtUser.setBounds(130,120,100,30);
      	 	
      	login_frame.add(lblPass);
      	lblPass.setBounds(50,150,100,30);
      	 	
      	login_frame.add(txtPass);
      	txtPass.setBounds(130,150,100,30);
      		
      	 	
      	login_frame.add(bLoginUser);
      	bLoginUser.setBounds(80,230,100, 30);
      	bLoginUser.addActionListener(this);
      	
      	 	
      	login_frame.add(bCancel);
        bCancel.setBounds(140,300,100,30);
        bCancel.addActionListener(this);
        
       	login_frame.add(bLoginAdmin);
        bLoginAdmin.setBounds (200,230,100,30);
        bLoginAdmin.addActionListener(this);	
        
      	 	
      	login_frame.add(lblBG);
      	lblBG.setBounds(0,0,400,500);
      	
      	
      	
      	// ============================ LOGIN FRAME END ============================
      	
      	
      	// ============================ EMPLOYEE FRAME START ============================

    /* 	employee_frame = new JFrame();
      	
      	//JScrollPane jsp = new JScrollPane (jtab);
    	//JTable jtab = new JTable ();
    	employee_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	payslip_summary = new JTable(user, column1);
    	payslip_pane = new JScrollPane(payslip_summary);
    	
    	
    	employee_frame.add(payslip_pane);
    	employee_frame.setSize(new Dimension(1056,550));
    	employee_frame.setVisible(false);
    	employee_frame.setTitle("Employee");
    	employee_frame.setResizable(false);
    	employee_frame.setLocation(155,0);
	
    	employee_frame.add(lblBG);
      	lblBG.setBounds(0,0,400,500); */
    	
    	/*employee_frame.add(bLogoutU);
      	bLogoutU.setBounds(100,100,300, 30); //x,y,w,h
      	bLogoutU.addActionListener(this);*/
    	
    	
    	// ============================ EMPLOYEE FRAME END ============================
    	
    	
    	// ============================ ADMIN FRAME START ============================
    	
    					


    
    	// ============================ ADMIN FRAME END ============================

	
    }	
    
	
	//ActionPerformed
		
	public void actionPerformed(ActionEvent e){	
					
    	if (e.getSource()==bLoginUser){	
    		/*String a = txtUser.getText();
 		int Basepay=30000, Longpay=6000, Hazardpay=540, Suballowance=4000, Clothingallowance=240; //earnings
    	int Loan1=1000, Housingloan=3000,Carloan=5000,Educloan=4500,Pagibig=100,Philhealth=430; //deduction 
    	int Gross = Basepay+Longpay+Hazardpay+Suballowance+Clothingallowance;
    	int Deductions = Loan1+ Housingloan+Carloan+Educloan+Pagibig+Philhealth;
    	int NHTP = Gross-Deductions;
    		if (a.equals("Labitad")){
    			
    			
    		}
    		
    		
    	
		/*login verify = new login();
		String a = txt_user.getText();
		String b = txt_pass.getText();
		
		
			
		Boolean result = verify.v(a,b);
		if (result == true){
			
			JOptionPane.showMessageDialog(null,"WELCOME " + a);
			setVisible(true);
			l.setVisible(false);
		
		}
		else{
		
			
			JOptionPane.showMessageDialog(null,"INVALID USER!" );
	}*/
	
	
    		login_frame.setVisible(false);
    		employee_frame = new JFrame();
    		
    		
    		bLogout = new JButton ("Logout");
    		bLogout.setBackground(new Color(149,209,239));
	    	lblBG = new JLabel();
	    	bFirstSalary = new JButton ("First Salary");
	    	bFirstSalary.setBackground(new Color(148,240,152));
	    	bSecondSalary = new JButton ("Second Salary");
	    	bSecondSalary.setBackground(new Color(246,142,216));
	    	bPrint = new JButton("Print via Adobe Reader");
	    	bPrint.setBackground(new Color(245,253,135));
			
			employee_frame.add(bLogout);
	      	bLogout.setBounds(850,400,130, 30); //x,y,w,h
	      	bLogout.addActionListener(this); 
	      	
	      	employee_frame.add(bFirstSalary);
	      	bFirstSalary.setBounds(60,365,130,30);
	      	bFirstSalary.addActionListener(this);
	      	
	      	employee_frame.add(bSecondSalary);
	      	bSecondSalary.setBounds(60,400,130,30);
	      	bSecondSalary.addActionListener(this);
	      	
	      	employee_frame.add(bPrint);
	      	bPrint.setBounds(850,365,130,30);
	      	bPrint.addActionListener(this);
    		
    		employee_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    		payslip_summary = new JTable(emp, column2);
	    	payslip_pane = new JScrollPane(payslip_summary);
	    	
	    	prof_summary=new JTable(pay1,column3);
	    	prof_pane = new JScrollPane(prof_summary);
    		
    		employee_frame.add(payslip_pane);
    		employee_frame.setSize(new Dimension(1056,550));
    		employee_frame.setVisible(true);
    		employee_frame.setTitle("Employee");
    		employee_frame.setResizable(false);
    		employee_frame.setLocation(155,0);
    		//login_frame.setLocationRelativeTo(null);
	    	
	    	//JScrollPane jsp = new JScrollPane (jtab);
	    	//JTable jtab = new JTable (); 
	    	
	    	JTabbedPane tp= new JTabbedPane();
	    	tp.setBounds(50,10,940,425);
	    	tp.add("Profile",payslip_pane);
	    	tp.add("Payslip",prof_pane);
	    	
	    	
	    	employee_frame.add(tp);
	    	

	      	
	      	employee_frame.add(lblBG);
      		lblBG.setBounds(0,0,400,500);
      //}//end of login functions						
		}
		if (e.getSource()==bCancel){
    		login_frame.setVisible(false);
    				
		}
		if (e.getSource()==bLoginAdmin){
    		login_frame.setVisible(false);
    		admin_frame = new JFrame();
    		
    		bLogout = new JButton ("Logout");
    		bLogout.setBackground(new Color(153,235,227));
	    	lblBG = new JLabel();
			
			admin_frame.add(bLogout);
	      	bLogout.setBounds(850,450,100, 30); //x,y,w,h
	      	bLogout.addActionListener(this); 
    		
    		admin_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    		payslip_summary = new JTable(user, column1);
	    	payslip_pane = new JScrollPane(payslip_summary);
    		
    		admin_frame.add(payslip_pane);
    		admin_frame.setSize(new Dimension(1056,550));
    		admin_frame.setVisible(true);
    		admin_frame.setTitle("Employee");
    		admin_frame.setResizable(false);
    		admin_frame.setLocation(155,0);
    		//login_frame.setLocationRelativeTo(null);
	    	
	    	//JScrollPane jsp = new JScrollPane (jtab);
	    	//JTable jtab = new JTable (); 
	    	
	    	
	      	
	      	admin_frame.add(lblBG);
      		lblBG.setBounds(0,0,400,500);
    				
		}
		
		if (e.getSource()==bLogout){
    		login_frame.setVisible(true);
    		admin_frame.setVisible(false);
    		employee_frame.setVisible(false);
    				
		}
		if (e.getSource()==bFirstSalary){
			JOptionPane.showMessageDialog(null, "Your First Salary is P13,355.00. To be released on 15th!" );
		}
		if (e.getSource()==bSecondSalary){
			JOptionPane.showMessageDialog(null, "Your First Salary is P13,355.00. To be released on 29th!" );
		}
		
	}

    public static void main(String[] args) {
        Payslip P = new Payslip();
    	P.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

