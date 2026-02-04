import java.awt.*; 
import java.awt.event.*; 
 
public class EmailRegistrationSystem extends Frame implements ActionListener { 
    Label nameLabel, emailLabel, messageLabel; 
    TextField nameField, emailField; 
    Button registerButton, clearButton; 
 
    public EmailRegistrationSystem() { 
        // Set frame layout and tle 
        setTitle("Email Registra on System"); 
        setSize(400, 250); 
        setLayout(null); 
 
        // Labels 
        nameLabel = new Label("Name:"); 
        emailLabel = new Label("Email:"); 
        messageLabel = new Label(); 
 
        // Text fields 
        nameField = new TextField(); 
        emailField = new TextField(); 
 
        
        registerButton = new Button("Register"); 
        clearButton = new Button("Clear"); 
 
        nameLabel.setBounds(50, 50, 60, 20); 
        nameField.setBounds(120, 50, 200, 20); 
        emailLabel.setBounds(50, 90, 60, 20); 
        emailField.setBounds(120, 90, 200, 20); 
        registerButton.setBounds(120, 130, 80, 30); 
        clearButton.setBounds(220, 130, 80, 30); 
        messageLabel.setBounds(50, 180, 300, 20); 
        // Add ac on listeners 
        registerButton.addActionListener(this); 
        clearButton.addActionListener(this); 
 
        // Add components 
        add(nameLabel); 
        add(nameField); 
        add(emailLabel); 
        add(emailField); 
        add(registerButton); 
        add(clearButton); 
        add(messageLabel); 
 
        // Close window properly 
        addWindowListener(new WindowAdapter() { 
            public void windowClosing(WindowEvent e) { 
                dispose(); 
            } 
        }); 
 
        setVisible(true); 
    } 
 
    // Email format valida on (basic) 
    private boolean isValidEmail(String email) { 
        return email.contains("@") && email.contains("."); 
    } 
 
    // Ac on performed method 
    public void actionPerformed(ActionEvent e) { 
        if (e.getSource() == registerButton) { 
            String name = nameField.getText().trim(); 
            String email = emailField.getText().trim(); 
 
            if (name.isEmpty() || email.isEmpty()) { 
                messageLabel.setText("Please fill in all fields."); 
                messageLabel.setForeground(Color.RED); 
            } else if (!isValidEmail(email)) { 
                messageLabel.setText("Invalid email format."); 
                messageLabel.setForeground(Color.RED); 
            } else { 
                messageLabel.setText("Registra on successful!"); 
                messageLabel.setForeground(Color.GREEN); 
            } 
        } else if (e.getSource() == clearButton) { 
            nameField.setText(""); 
            emailField.setText(""); 
            messageLabel.setText(""); 
        } 
    } 
 
    public static void main(String[] args) { 
        new EmailRegistrationSystem(); 
    } 
} 
