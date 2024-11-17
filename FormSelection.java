import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormSelection extends JFrame {
    private JButton doctorButton;
    private JButton patientButton;

    public FormSelection() {
        setTitle("Form Selection");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        doctorButton = new JButton("Doctor Form");
        doctorButton.setBounds(80, 30, 120, 30);
        doctorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DoctorForm().setVisible(true);  // Open Doctor Form
                dispose();  // Close the Form Selection window
            }
        });
        add(doctorButton);

        patientButton = new JButton("Patient Form");
        patientButton.setBounds(80, 80, 120, 30);
        patientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PatientForm().setVisible(true);  // Open Patient Form
                dispose();  // Close the Form Selection window
            }
        });
        add(patientButton);
    }

    public static void main(String[] args) {
        new FormSelection().setVisible(true);
    }
}