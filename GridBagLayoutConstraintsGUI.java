/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GridBagLayoutConstraintsGUI{
    private JFrame frame;
    private JPanel panel;
    private JLabel registerUsernameLabel, registerPasswordLabel;
    private JTextField registerUsernameTxt, registerPasswordTxt;
    private JButton signUpButton;
    
    
    public GridBagLayoutConstraintsGUI(){
        frame = new JFrame("Grid Bag Layout GUI");
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //creating Jpanel with GridBagLayout
        panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(10, 10, 10, 10);
        
        registerUsernameLabel = new JLabel("Username");
        registerUsernameTxt = new JTextField(20);
        
        registerPasswordLabel = new JLabel("Password");
        registerPasswordTxt = new JTextField(15);
        
        signUpButton = new JButton("Sign Up");
        
        //actionlistener
        signUpButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame, "Registration Successfull.");
            }
        });
        
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(registerUsernameLabel, constraints);
        
        constraints.gridx = 1;
        panel.add(registerUsernameTxt, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(registerPasswordLabel, constraints);
        
        constraints.gridx = 1;
        panel.add(registerPasswordTxt, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        panel.add(signUpButton, constraints);
        
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
        
    }
    
    public static void main(String[] args){
        //copnstructor ley construct gareko kura lai build garcha
        new GridBagLayoutConstraintsGUI();
    }
}*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GridBagLayoutConstraintsGUI{
    private JFrame frame;
    private JPanel panel;
    private JLabel num1Label, num2Label,resultLabel;
    private JTextField num1Txt, num2Txt,resultTxt;
    private JButton addButton,subtractButton,clearButton;
    private int num1, num2, result;
    
    
    public GridBagLayoutConstraintsGUI(){
        frame = new JFrame("Grid Bag Layout GUI");
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //creating Jpanel with GridBagLayout
        panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(10, 10, 10, 10);
        
        num1Label = new JLabel("Number 1: ");
        num1Txt = new JTextField(20);
        
        num2Label = new JLabel("Number 2: ");
        num2Txt = new JTextField(15);
        
        resultLabel = new JLabel("Result: ");
        resultTxt = new JTextField(15);
        resultTxt.setEditable(false);
        
        addButton = new JButton("+");
        subtractButton = new JButton("-");
        clearButton = new JButton("C");
        
        //actionlistener
        addButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    if(num1Txt.getText().equals("") || num2Txt.getText().equals("")){
                        JOptionPane.showMessageDialog(addButton,"Empty Fields Found!! Please fill all the portion of form.");
                    } 
                    else{
                        num1 = Integer.parseInt(num1Txt.getText());
                        num2 = Integer.parseInt(num2Txt.getText());
                        result = num1 + num2;
                        
                        resultTxt.setText(String.valueOf(result));
                    }
                    
                }
                catch(NumberFormatException e1){
                    JOptionPane.showMessageDialog(frame,"Number Format Exception");
                }
            }
                
        });
        
        subtractButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    if(num1Txt.getText().equals("") || num2Txt.getText().equals("")){
                        JOptionPane.showMessageDialog(addButton,"Empty Fields Found!! Please fill all the portion of form.");
                    } 
                    else{
                        num1 = Integer.parseInt(num1Txt.getText());
                        num2 = Integer.parseInt(num2Txt.getText());
                        result = num1 - num2;
                        
                        resultTxt.setText(String.valueOf(result));
                    }
                    
                }
                catch(NumberFormatException e1){
                    JOptionPane.showMessageDialog(frame,"Number Format Exception");
                }
            }
                
        });
        
        
        clearButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(clearButton,"Clear all fields?","Clear",JOptionPane.ERROR_MESSAGE);
                num1Txt.setText("");
                num2Txt.setText("");
                resultTxt.setText("");
            }
                
        });
        
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(num1Label, constraints);
        
        constraints.gridx = 1;
        panel.add(num1Txt, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(num2Label, constraints);
        
        constraints.gridx = 1;
        panel.add(num2Txt, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(resultLabel, constraints);
        
        constraints.gridx = 1;
        panel.add(resultTxt, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.CENTER;
        panel.add(addButton, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        panel.add(subtractButton, constraints);
        
        constraints.gridx = 2;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        panel.add(clearButton, constraints);
        
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
        
    }
    
    public static void main(String[] args){
        new GridBagLayoutConstraintsGUI();
    }
}