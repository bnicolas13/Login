import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

    private JFrame frame;
    private JTextField username;
    private JTextField password;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login window = new Login();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Login() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Username");
        lblNewLabel.setBounds(34, 73, 90, 30);
        frame.getContentPane().add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Password");
        lblNewLabel_1.setBounds(34, 126, 90, 30);
        frame.getContentPane().add(lblNewLabel_1);
        
        username = new JTextField();
        username.setBounds(192, 77, 168, 26);
        frame.getContentPane().add(username);
        username.setColumns(10);
        
        password = new JTextField();
        password.setBounds(192, 130, 168, 22);
        frame.getContentPane().add(password);
        password.setColumns(10);
        
        JButton btnNewButton = new JButton("Login");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            String uname = username.getText();
            String pwd = password.getText();
            
            if(uname.equals("name")&& pwd.equals("password")) {
                JOptionPane.showMessageDialog(frame, "You successfully logged in");
            }
            else {
                JOptionPane.showMessageDialog(frame, "Invalid username or password");
            }
            }
        });
        btnNewButton.setBounds(146, 184, 97, 25);
        frame.getContentPane().add(btnNewButton);
    }
}
