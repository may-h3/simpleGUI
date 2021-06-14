import java.awt.*;  
import java.awt.event.*;  
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class Main implements ActionListener{

  private static JFrame frame; //the window that pops up 
  private static JPanel panel; //holds all the text + things that are displayed on the window
  private static JLabel label; //displays text 
  private static JTextField userText; //displays text boxes for user to input info 
  private static JLabel pass; //another label that displays text 
  private static JPasswordField passText; //displays text box for user to input info, special textbox; will obscure inputted information 
  private static JButton button; //log in button 
  private static JButton button1; //sign up button
  private static JLabel status; //label that displays status of login 

  private static JLabel info; //gives instructions on sign up page
  private static JLabel name; //label that displays 'name:'
  private static JLabel email; //label that displays 'email:'
  private static JLabel un; //label that displays "username:"
  private static JLabel pw; //label that displays "password:"
  private static JLabel cpw; //label that displays "confirm password:"
  private static JTextField nmtext; //textfield for user name
  private static JTextField emtext; //textfield for user email 
  private static JTextField untext; //textfield for username 
  private static JPasswordField pwtext; //password field for password
  private static JPasswordField cpwtext; //password field for confirmed password
  private static JButton confirm; //sign up confirmation button 

  public static void main(String[] args) {
    frame = new JFrame(); //instantiate new window 
    panel = new JPanel(); //instantiate new panel for the window 

    frame.setSize(300, 300); //size of pop up window 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets window to close when the 'x' is clicked 
    frame.add(panel); //add panel to the frame 

    panel.setLayout(null); 

    label = new JLabel("username"); //creates text 
    label.setBounds(10, 20, 80, 25); //positions text; x, y, length, height
    panel.add(label); //add label to panel so it will show up on the window 

    userText = new JTextField(); //create field for user input 
    userText.setBounds(100, 20, 165, 25); //position field; x, y, length, height 
    panel.add(userText); //add field to panel so it will show up on the window 

    pass = new JLabel("password"); //create more text 
    pass.setBounds(10, 50, 80, 25); //positions text; x, y, length, height 
    panel.add(pass); //adds text to panel so it will show up on the window 

    passText = new JPasswordField(); //creates password field; obscures user input for privacy 
    passText.setBounds(100, 50, 165, 25); //positions field; x, y, length, height 
    panel.add(passText); //adds field to panel so it will show up on the window 

    button = new JButton("login"); //instantiate new button that says 'login'
    button.setBounds(140, 100, 80, 25); //positions button; x, y, width, height
    button.addActionListener(new Main());
    panel.add(button); //adds button to panel so it will show up on window 

    button1 = new JButton("sign up"); //instantiate new button that says 'sign up'
    button1.setBounds(20, 100, 90, 25); //positions and sizes the button; x, y, width, height 
    button1.addActionListener(new Main());
    panel.add(button1); //adds button the panel so it will show up on the window

    status = new JLabel(""); //creates new empty label 
    status.setBounds(10, 110, 245, 50); //positions label; x, y, length, height    
    panel.add(status); //adds label to panel so it will show up on the window 

    frame.setVisible(true); //display the frame/window
  }

  //this method determines what happens when the 'log in' button is clicked
  @Override
  public void actionPerformed (ActionEvent e)
  {
    String username = userText.getText(); //store username input in this string 
    String password = passText.getText(); //store password input in this string 

    if (e.getSource() == button) //when the log in button is clicked 
    {
      if (username.equals("mayhe") && password.equals("12345")) //compared to predetermined values
      {
        status.setText("login successful!"); //previously empty label now displays 'login sucessful' for user to see 
      }
      else 
      {
        status.setText("login unsuccessful, try again"); //previously empty label now displays 'login unsuccessful, try again' for the user to see
      }
    }
    else if (e.getSource() == button1) //when the sign up button is clicked 
    {
      panel.removeAll(); //remove all elements from the JPanel 
      panel.repaint(); //clears the JFrame of all previous elements 

      info = new JLabel("Please complete all boxes below."); //creates new label
      info.setBounds(10, 10, 300, 25); //sets info label's dimensions; x, y, width, height 
      panel.add(info); //adds info label to the JPanel 

      name = new JLabel("Name: "); //creates new label 
      name.setBounds(10, 40, 50, 25); //sets dimensions; x, y, width, height 
      panel.add(name); //adds name label to the JPanel 

      nmtext = new JTextField(); //creates new textfield 
      nmtext.setBounds(130, 40, 165, 25); //sets textfield dimensions; x, y, width, height 
      panel.add(nmtext); //adds textfield to the JPanel 

      email = new JLabel("Email: "); //creates new label
      email.setBounds(10, 70, 60, 25); //sets label dimensions; x, y, width, height
      panel.add(email); //adds label to JPanel

      emtext = new JTextField(); //creates new textfield
      emtext.setBounds(130, 70, 165, 25); //sets textfield dimensions as follows; x, y, width, height
      panel.add(emtext); //adds textfield to the panel so it is displayed on the JFrame

      un = new JLabel("Username: "); //create new label
      un.setBounds(10, 100, 90, 25); //sets label dimensions as follows; x, y, width, height
      panel.add(un); //adds label to panel 

      untext = new JTextField(); //creates new textfield 
      untext.setBounds(130, 100, 165, 25); //sets textfield dimensions as follows; x, y, width, height
      panel.add(untext); //adds textfield to JPanel and thus JFrame

      pw = new JLabel("Password: "); //create new label
      pw.setBounds(10, 130, 80, 25); //sets label dimensions; x, y, width, height
      panel.add(pw); //adds label to the JPanel and JFrame

      pwtext = new JPasswordField(); //creates new password field 
      pwtext.setBounds(130, 130, 165, 25); //sets dimensions of password field; x, y, width, height
      panel.add(pwtext); //adds password field to JPanel 

      cpw = new JLabel(); //create new label
      cpw.setText("<html>Confirm<br>Password: </html>"); //sets text of JLabel and uses html formatting to create two lines of text 
      cpw.setBounds(10, 160, 110, 35); //sets dimensions of JLabel as follows; x, y, width, height 
      panel.add(cpw); //adds JLabel to JPanel 

      cpwtext = new JPasswordField(); //creates new password field 
      cpwtext.setBounds(130, 165, 165, 25); //sets password field dimensions; x, y, width, height
      panel.add(cpwtext); //adds password field to JPanel

      confirm = new JButton("sign me up!"); //creates new JButton that displays indicated text 
      confirm.setBounds(75, 200, 150, 25); //sets JButton dimensions; x, y, width, height
      confirm.addActionListener(new Main()); //creates new action listener even for when this button is clicked 
      panel.add(confirm); //adds the JButton to the JLabel
    }
    else if (e.getSource() == confirm) //when the confirm button is clicked 
    {
      panel.removeAll(); //removes all elements from the panel 
      panel.repaint(); //clears the JFrame so you do not see previous elements 

      status.setText("You have successfully signed up!"); //updates status label
      panel.add(status); //displays new status label on the JFrame 
    }
  }
}