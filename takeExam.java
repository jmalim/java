/**
 * @(#)takeExam.java
 *
 *
 * @author 
 * @version 1.00 2019/3/20
 */
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.util.Random;

public class takeExam extends JFrame implements ActionListener {

	Random R = new Random();
	int randomnumber = R.nextInt(4);
	int scores=0;
	String sagot,question1,answers,choices,username,user,password;
	JFrame f1,f2,f3,f4,f5,f6,f7;
	JButton bTake, bTop, bExit, bOk, bBack, btnpass,btnnext,btncancel, btnstart, bFr, bVeg, bFl;
	JLabel lblSname, lblCat, lblExam, lblT,lblx,lblTitle,lblx2,lblx3,lblquestion, lblPix, lblchoices, lblscore;
	JLabel lblTop,lblx4;
	JTextField txtSname, txtanswer;
	Font font3 = new Font("Ravie", Font.BOLD, 20);
	Font font2 = new Font("Arial Black", Font.BOLD, 15);
	
	String[][] fruitquestion = {
			{"The color of an orange is _____","6"},
			{"The color of an apple is ______","10"},
	   		{"The color of an avocado is ______","13"},
	   		{"________ is the color of banana","25"}
   		};

   			
   	String [][] elementarraytwo = {
   			{"orange","6 "},
   			{"red","10"},
   			{"green","13"},
   			{"yellow","25"} };
   			
   String [][] elementChoices = {
   			{"a.	orange  b.	red    	c.  blue",""},
   			{"a.	green   b.	yellow  c.   red ",""},
   			{"a.	orange  b.	yellow  c.	green",""},
   			{"a.	yellow 	b.	red  	c.  green",""}
   			};
   			
   	String [][] students =  {
   			{"mabilin","123"},
   			{"autida","123"},
   			{"labitad","123"},
   			{"alim","123"}
   		 };
        
    
    public takeExam() {
    	f1 = new JFrame();
    	f1.setSize(new Dimension(400,400));
    	f1.setVisible(true);
    	f1.setTitle("Online Exam");
    	f1.setResizable(false);
    	f1.setLocation(400,150);
    	
    	lblT = new JLabel("Online Exam");
    	lblx = new JLabel("");
    	bTake = new JButton("Take Exam");
    	bTop = new JButton("Top Students");
    	
    	f1.add(lblT);
    	lblT.setBounds(150,100,100,20);
    	
    	f1.add(bTake);
    	bTake.setBounds(125,150,120,30);
    	
    	f1.add(bTop);
    	bTop.setBounds(125,200,120,30);
    	
    	f1.add(lblx);
    	setLayout(null);
    	f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//////////////////////////////////////    	
    	f2 = new JFrame();
    	f2.setSize(new Dimension(400,300));
    	f2.setVisible(false);
    	f2.setTitle("STUDENT REGISTRATION");
    	f2.setResizable(false);
    	f2.setLocation(400,150);
    	
    	lblSname = new JLabel("STUDENT NAME");
    	f2.add(lblSname);
    	lblSname.setBounds(150,100,100,20);
    	
    	lblx2 = new JLabel("");
    	
    	txtSname = new JTextField("");
    	f2.add(txtSname);
    	txtSname.setBounds(150,150,100,20);
    	
    	bOk = new JButton("OK");
    	f2.add(bOk);
    	bOk.setBounds(150,175,100,20);
    	
    	f2.add(lblx2);
    	setLayout(null);
    	
    	add(lblx2);
    	setLayout(null);
    	f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  //////////////////////////////////////////////////  	
    	f3 = new JFrame();
    	f3.setSize(new Dimension(400,400));
    	f3.setVisible(false);
    	f3.setTitle("Categories");
    	f3.setResizable(false);
    	f3.setLocation(400,150);
    	
    	JLabel lblCat = new JLabel ("CATEGORIES");
    	JLabel lblx2 = new JLabel("");
    	bFr = new JButton("FRUITS");
    	bFl = new JButton("FLOWERS");
    	bVeg = new JButton("VEGIES");
    	
    	f3.add(lblCat);
    	lblCat.setBounds(80,100,300,40);
    	lblCat.setFont(font3);
    	
    	
    	f3.add(bFr);
    	bFr.setBounds(100,150,150,30);
    	
    	f3.add(bFl);
    	bFl.setBounds(100,200,150,30);
    	
    	f3.add(bVeg);
    	bVeg.setBounds(100,250,150,30);
    	
    	f3.add(lblx2);
    	setLayout(null);
    	
    	add(lblx2);
    	setLayout(null);
    	f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    	
 ////////////////////////////////////////////////////   	
    	f4 = new JFrame();
    	f4.setSize(new Dimension(400,400));
    	f4.setVisible(false);
    	f4.setTitle("FLOWERS");
    	f4.setResizable(false);
    	f4.setLocation(400,150);
 ////////////////////////////////////////////////////   	
    	f5 = new JFrame();
    	f5.setSize(new Dimension(900,600));
    	f5.setVisible(false);
    	f5.setTitle("FRUITS");
    	f5.setResizable(false);
    	f5.setLocation(400,150);
	
		
    	
    	lblquestion = new JLabel ("");
    	f5.add(lblquestion);
    	lblquestion.setBounds(200,200,500,40);
    	
    	lblchoices = new JLabel ("");
    	f5.add(lblchoices);
    	lblchoices.setBounds(200,350,300,40);
    	
    	Random R = new Random();
		int randomnumber = R.nextInt(4);
		question1 = fruitquestion[randomnumber][0];
		answers = elementarraytwo[randomnumber][0];
		choices = elementChoices[randomnumber][0];
		
		btnnext = new JButton("Next");
		f5.add(btnnext);
    	btnnext.setBounds(100,500,100,20);
    	
    	btncancel = new JButton("Cancel");
		f5.add(btncancel);
    	btncancel.setBounds(300,500,100,20);
    	
    	//question1 = fruitquestion[0][0];
    	//choices = elementChoices[0][0];
    	lblquestion.setText(question1);
		lblchoices.setText(choices);  
    	
  /*  	lblquestion = new JLabel(" R   E   A   D   Y  !");
	
		lblchoices = new JLabel(" ");
			
		add(lblquestion);	
		lblquestion.setBounds(100,25,600,300);
		
		add(lblchoices);	
		lblchoices.setBounds(400,135,600,300);
    	
    	question1 = fruitquestion[1][0];
    	choices = elementChoices[0][0];
    	
    	lblquestion.setText(question1);
		lblchoices.setText(choices);    */

   	lblx = new JLabel("");

    	
    	f5.add(lblx);
    	setLayout(null);

    	f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    	

    	
 //////////////////////////////////////////////////   	
    	f6 = new JFrame();
    	f6.setSize(new Dimension(400,400));
    	f6.setVisible(false);
    	f6.setTitle("VEGIES");
    	f6.setResizable(false);
    	f6.setLocation(400,150);
 ////////////////////////////////////////////////   	
    	f7 = new JFrame();
    	f7.setSize(new Dimension(400,400));
    	f7.setVisible(false);
    	f7.setTitle("TOP STUDENTS");
    	f7.setResizable(false);
    	f7.setLocation(400,150);
    	lblTop = new JLabel("Top 10 Students");
    	JLabel lblx3 = new JLabel("");
    	f7.add(lblTop);
    	lblTop.setBounds(0,0,200,20);
    	lblTop.setFont(font2);
    	
    	f7.add(lblx3);
    	setLayout(null);
    	
    	add(lblx3);
    	setLayout(null);
    	
    	
    	
    	//////////////////////////////
    	bTake.addActionListener(this);
    	bTop.addActionListener(this);
    	bOk.addActionListener(this);
    	bFl.addActionListener(this);
    	bFr.addActionListener(this);
    	bVeg.addActionListener(this);
    	btnnext.addActionListener(this);
    	btncancel.addActionListener(this);
    		
    }
     public void actionPerformed (ActionEvent e){
     	if (e.getSource() == bTake){
     		f2.setVisible(true);
     		setVisible(false);
     		}
     	if (e.getSource() == bOk){
     		f3.setVisible(true);

     	}
     	if (e.getSource() == bFl){
     		f4.setVisible(true);
     		setVisible(false);
     	}
     	if (e.getSource() == bFr){
     		f5.setVisible(true);
     	}
     	if (e.getSource() == btnnext){
     		Random R = new Random();
			int randomnumber = R.nextInt(4);
			answers = elementarraytwo[randomnumber][0];
			question1 = fruitquestion[randomnumber][0];
			choices = elementChoices[randomnumber][0];
			lblquestion.setText(question1);
			lblchoices.setText(choices);

     	}
     	if (e.getSource() == bVeg){
     		f6.setVisible(true);
     		setVisible(false);
     	}
     	if (e.getSource() == bTop){
     		f7.setVisible(true);
     		setVisible(false);	
     	}
     	if (e.getSource() == btncancel){
     		f1.setVisible(true);
     		f5.setVisible(false);
     	}
     }
    public static void main(String[] args) {
        takeExam TE = new takeExam();
    	TE.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
