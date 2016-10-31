// import the required libraries
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class MyGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField; // global text field
	double num1; // global num1
	double num2; // global num2
	double result; // global result
	public String op; // global operation
	int check_on_func =0;
	//global buttons
	private JButton button_0 = new JButton("0");
	private JButton button_1 = new JButton("1");
	private JButton button_2 = new JButton("2");
	private JButton button_3 = new JButton("3");
	private JButton button_4 = new JButton("4");
	private JButton button_5 = new JButton("5");
	private JButton button_6 = new JButton("6");
	private JButton button_7 = new JButton("7");
	private JButton button_8 = new JButton("8");
	private JButton button_9 = new JButton("9");
	private JButton button_eq = new JButton("=");
	private JButton button_plus = new JButton("+");
	private JButton button_sub = new JButton("-");
	private JButton button_mult = new JButton("*");
	private JButton button_div = new JButton("/");
	private JButton button_ac = new JButton("AC");
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyGUI frame = new MyGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 267, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//text field creation
		textField = new JTextField();
		textField.setBounds(10, 11, 231, 40);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(textField);
		textField.setColumns(10);		
		
		//button_0 creation
		button_0.setBounds(10, 63, 50, 50);
		button_0.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(button_0);		
			
		//button_1 creation
		button_1.setBounds(70, 62, 50, 50);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(button_1);
		
		//button_2 creation
		button_2.setBounds(130, 62, 50, 50);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(button_2);
		
		//button_3 creation
		button_3.setBounds(190, 62, 50, 50);
		button_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(button_3);
		
		//button_4 creation
		button_4.setBounds(10, 124, 50, 50);
		button_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(button_4);
		
		//button_5 creation
		button_5.setBounds(70, 123, 50, 50);
		button_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(button_5);
		
		//button_6 creation
		button_6.setBounds(130, 123, 50, 50);
		button_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(button_6);
		
		//button_7 creation
		button_7.setBounds(190, 124, 50, 50);
		button_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(button_7);
		
		//button_8 creation
		button_8.setBounds(10, 185, 50, 50);		
		button_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(button_8);
		
		//button_9 creation
		button_9.setBounds(70, 184, 50, 50);		
		button_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(button_9);
		
		//button_eq creation
		button_eq.setBounds(130, 184, 110, 50);
		button_eq.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(button_eq);
		
		//button_plus creation
		button_plus.setBounds(10, 259, 50, 50);
		button_plus.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(button_plus);
		
		//button_sub creation
		button_sub.setBounds(70, 259, 50, 50);
		button_sub.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(button_sub);
		
		//button_mult creation
		button_mult.setBounds(130, 259, 50, 50);
		button_mult.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(button_mult);
		
		//button_div creation
		button_div.setBounds(190, 259, 50, 50);
		button_div.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(button_div);
		
		
		button_ac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				check_on_func =0;
			}
		});
		//button_ac creation
		button_ac.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_ac.setBounds(10, 320, 230, 50);
		contentPane.add(button_ac);
		
		// initially setting focus of all buttons to false
		button_0.setFocusable(false);
		button_1.setFocusable(false);
		button_2.setFocusable(false);
		button_3.setFocusable(false);
		button_4.setFocusable(false);
		button_5.setFocusable(false);
		button_6.setFocusable(false);
		button_7.setFocusable(false);
		button_8.setFocusable(false);
		button_9.setFocusable(false);
		button_eq.setFocusable(false);
		button_plus.setFocusable(false);
		button_sub.setFocusable(false);
		button_mult.setFocusable(false);
		button_div.setFocusable(false);
		button_ac.setFocusable(false);
		textField.setFocusable(false);
		
		// two swing timer starting
		new Timer(1500, new TimerListenerNum()).start();
		new Timer(1500, new TimerListenerOp()).start();
	}
	
	private class TimerListenerNum implements ActionListener {		
		// used to manage highlighting from one number or function to next one
		  int row=0;
	      @Override	      
	      public void actionPerformed(ActionEvent e) {    
	    	  // highlighting numbers
	    	  if(row==11){
	    		  row=0;
	    	  }
	               
               if(row==0){
            	   button_eq.setBackground(null);		// change previous highlighted button to null color	            	   
            	   button_0.setBackground(Color.RED);// highlight this button to red color	
            	   
            	   //activate on enter button click
            	   button_0.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("ENTER"), "actionName");
            	   button_0.getActionMap().put("actionName", new AbstractAction("actionName") {            		
					private static final long serialVersionUID = 1L;
						public void actionPerformed(ActionEvent evt) {
							if(textField.getText().equals("0") ){
								textField.setText(null);
							}				
							String EnterNo = textField.getText() + button_0.getText();
							textField.setText(EnterNo);
            		      }
            		    });            	
            	   row++;            	   
               }
               else if(row==1){
            	   button_0.setBackground(null);		            	  
            	   button_1.setBackground(Color.RED);		            	  
            	   
            	  
            	   button_0.getActionMap().put("actionName", new AbstractAction("actionName") {            		
					private static final long serialVersionUID = 1L;
						public void actionPerformed(ActionEvent evt) {
							if(textField.getText().equals("0") ){
								textField.setText(null);
							}				
							String EnterNo = textField.getText() + button_1.getText();
							textField.setText(EnterNo);
            		      }
            		    });            	   
            	   row++;            	   
               }
               else if(row==2){
            	   button_1.setBackground(null);		            	  
            	   button_2.setBackground(Color.RED);		            	  
            	   
            	  
            	   button_0.getActionMap().put("actionName", new AbstractAction("actionName") {            		
					private static final long serialVersionUID = 1L;
						public void actionPerformed(ActionEvent evt) {
							if(textField.getText().equals("0") ){
								textField.setText(null);
							}				
							String EnterNo = textField.getText() + button_2.getText();
							textField.setText(EnterNo);
            		      }
            		    });            	   
            	   row++;            	   
               }  
               else if(row==3){
            	   button_2.setBackground(null);		            	  
            	   button_3.setBackground(Color.RED);		            	  
            	   
            	   
            	   button_0.getActionMap().put("actionName", new AbstractAction("actionName") {            		
					private static final long serialVersionUID = 1L;
						public void actionPerformed(ActionEvent evt) {
							if(textField.getText().equals("0") ){
								textField.setText(null);
							}				
							String EnterNo = textField.getText() + button_3.getText();
							textField.setText(EnterNo);
            		      }
            		    });            	   
            	   row++;            	   
               }  
               else if(row==4){
            	   button_3.setBackground(null);		            	  
            	   button_4.setBackground(Color.RED);		            	  
            	   
            	  
            	   button_0.getActionMap().put("actionName", new AbstractAction("actionName") {            		
					private static final long serialVersionUID = 1L;
						public void actionPerformed(ActionEvent evt) {
							if(textField.getText().equals("0") ){
								textField.setText(null);
							}				
							String EnterNo = textField.getText() + button_4.getText();
							textField.setText(EnterNo);
            		      }
            		    });            	   
            	   row++;            	   
               }  
               else if(row==5){
            	   button_4.setBackground(null);		            	  
            	   button_5.setBackground(Color.RED);		            	  
            	   
            	  
            	   button_0.getActionMap().put("actionName", new AbstractAction("actionName") {            		
					private static final long serialVersionUID = 1L;
						public void actionPerformed(ActionEvent evt) {
							if(textField.getText().equals("0") ){
								textField.setText(null);
							}				
							String EnterNo = textField.getText() + button_5.getText();
							textField.setText(EnterNo);
            		      }
            		    });            	   
            	   row++;            	   
               }  
               else if(row==6){
            	   button_5.setBackground(null);		            	  
            	   button_6.setBackground(Color.RED);		            	  
            	   
            	   
            	   button_0.getActionMap().put("actionName", new AbstractAction("actionName") {            		
					private static final long serialVersionUID = 1L;
						public void actionPerformed(ActionEvent evt) {
							if(textField.getText().equals("0") ){
								textField.setText(null);
							}				
							String EnterNo = textField.getText() + button_6.getText();
							textField.setText(EnterNo);
            		      }
            		    });            	   
            	   row++;            	   
               }  
               else if(row==7){
            	   button_6.setBackground(null);		            	  
            	   button_7.setBackground(Color.RED);		            	  
            	   
            	  
            	   button_0.getActionMap().put("actionName", new AbstractAction("actionName") {            		
					private static final long serialVersionUID = 1L;
						public void actionPerformed(ActionEvent evt) {
							if(textField.getText().equals("0") ){
								textField.setText(null);
							}				
							String EnterNo = textField.getText() + button_7.getText();
							textField.setText(EnterNo);
            		      }
            		    });            	   
            	   row++;            	   
               }
               else if(row==8){
            	   button_7.setBackground(null);		            	  
            	   button_8.setBackground(Color.RED);		            	  
            	   
            	  
            	   button_0.getActionMap().put("actionName", new AbstractAction("actionName") {            		
					private static final long serialVersionUID = 1L;
						public void actionPerformed(ActionEvent evt) {
							if(textField.getText().equals("0") ){
								textField.setText(null);
							}				
							String EnterNo = textField.getText() + button_8.getText();
							textField.setText(EnterNo);
            		      }
            		    });            	   
            	   row++;            	   
               }
               else if(row==9){
            	   button_8.setBackground(null);		            	  
            	   button_9.setBackground(Color.RED);		            	  
            	   
            	  
            	   button_0.getActionMap().put("actionName", new AbstractAction("actionName") {            		
					private static final long serialVersionUID = 1L;
						public void actionPerformed(ActionEvent evt) {
							if(textField.getText().equals("0") ){
								textField.setText(null);
							}				
							String EnterNo = textField.getText() + button_9.getText();
							textField.setText(EnterNo);
            		      }
            		    });            	   
            	   row++;            	   
               } 
               else if(row==10){
            	   button_9.setBackground(null);		            	  
            	   button_eq.setBackground(Color.RED);		            	  
            	   
            	  
            	   button_0.getActionMap().put("actionName", new AbstractAction("actionName") {            		
					private static final long serialVersionUID = 1L;
						public void actionPerformed(ActionEvent evt) {
							if( !(textField.getText().equals(""))){
								check_on_func=0;
								String answer;
								num2=Double.parseDouble(textField.getText());
								if(op=="+"){
									result = num1 + num2;
									answer=String.format("%.2f", result);
									textField.setText(answer);
								}
								else if(op=="-"){
									result = num1 - num2;
									answer=String.format("%.2f", result);
									textField.setText(answer);
								}
								else if(op=="*"){
									result = num1 * num2;
									answer=String.format("%.2f", result);
									textField.setText(answer);
								}
								else if(op=="/"){
									result = num1 / num2;
									answer=String.format("%.2f", result);
									textField.setText(answer);
								}
								else{
									textField.setText(null);
								}
							}
            		      }
            		    });            	   
            	   row++;            	   
               }  
	      }
	   }

	   private class TimerListenerOp implements ActionListener {
		// used to manage highlighting from one number or function to next one
		  int row=0;
	      @Override
	      public void actionPerformed(ActionEvent e) { 
	    	  // highlighting functions
	    	  
	    	  if(row==4){
	    		  row=0;	    		  
	    	  }   
	    	  if(row==0){
           	   button_div.setBackground(null);		            	  
           	   button_plus.setBackground(Color.GREEN);		            	  
           	   System.out.println(row);
           	   button_plus.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("SPACE"), "actionName");
           	   button_plus.getActionMap().put("actionName", new AbstractAction("actionName") {            		
					private static final long serialVersionUID = 1L;
						public void actionPerformed(ActionEvent evt) {
							if( !(textField.getText().equals(""))  && check_on_func ==0){
								check_on_func++;
								num1=Double.parseDouble(textField.getText());
								textField.setText(null);
								op="+";
								System.out.println(op);
							}
           		      }
           		    });            	   
           	   row++;            	   
              }  
	    	  else if(row==1){
	           	   button_plus.setBackground(null);		            	  
	           	   button_sub.setBackground(Color.GREEN);		            	  
	           	System.out.println(row);
	           	  
	           	   button_plus.getActionMap().put("actionName", new AbstractAction("actionName") {            		
						private static final long serialVersionUID = 1L;
							public void actionPerformed(ActionEvent evt) {
								if( !(textField.getText().equals(""))  && check_on_func ==0){
									check_on_func++;
									num1=Double.parseDouble(textField.getText());
									textField.setText(null);
									op="-";
									System.out.println(op);
								}
	           		      }
	           		    });            	   
	           	   row++;            	   
	              }  
	    	  else if(row==2){
	           	   button_sub.setBackground(null);		            	  
	           	   button_mult.setBackground(Color.GREEN);		            	  
	           	System.out.println(row);
	           	  
	           	   button_plus.getActionMap().put("actionName", new AbstractAction("actionName") {            		
						private static final long serialVersionUID = 1L;
							public void actionPerformed(ActionEvent evt) {
								if( !(textField.getText().equals(""))  && check_on_func ==0){
									check_on_func++;
									num1=Double.parseDouble(textField.getText());
									textField.setText(null);
									op="*";
									System.out.println(op);
								}
	           		      }
	           		    });            	   
	           	   row++;            	   
	              } 
	    	  else if(row==3){
	           	   button_mult.setBackground(null);		            	  
	           	   button_div.setBackground(Color.GREEN);		            	  
	           	System.out.println(row);
	           	  
	           	   button_plus.getActionMap().put("actionName", new AbstractAction("actionName") {            		
						private static final long serialVersionUID = 1L;
							public void actionPerformed(ActionEvent evt) {
								if( !(textField.getText().equals(""))  && check_on_func ==0){
									check_on_func++;
									num1=Double.parseDouble(textField.getText());
									textField.setText(null);
									op="/";
									System.out.println(op);
								}
	           		      }
	           		    });            	   
	           	   row++;            	   
	              }  
	      }
	   }
	
	
	
}
