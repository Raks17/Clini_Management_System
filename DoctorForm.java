import javax.swing.*;

public class DoctorForm extends JFrame {
    private JTextField nameField, ageField, specializationField, availabilityField, feesField;
    private JComboBox<String> genderField;
    private JButton submitButton, viewButton;
    
    private String name, age, gender, specialization, availability, fees;

    public DoctorForm() {
        setTitle("Doctor Form");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        JLabel nameLabel = new JLabel("Doctor Name:");
        nameLabel.setBounds(20, 20, 120, 25);
        add(nameLabel);
        nameField = new JTextField();
        nameField.setBounds(150, 20, 200, 25);
        add(nameField);

        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(20, 60, 120, 25);
        add(ageLabel);
        ageField = new JTextField();
        ageField.setBounds(150, 60, 200, 25);
        add(ageField);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(20, 100, 120, 25);
        add(genderLabel);
        genderField = new JComboBox<>(new String[]{"Male", "Female", "Other"});
        genderField.setBounds(150, 100, 200, 25);
        add(genderField);

        JLabel specializationLabel = new JLabel("Specialization:");
        specializationLabel.setBounds(20, 140, 120, 25);
        add(specializationLabel);
        specializationField = new JTextField();
        specializationField.setBounds(150, 140, 200, 25);
        add(specializationField);

        JLabel availabilityLabel = new JLabel("Availability:");
        availabilityLabel.setBounds(20, 180, 120, 25);
        add(availabilityLabel);
        availabilityField = new JTextField();
        availabilityField.setBounds(150, 180, 200, 25);
        add(availabilityField);

        JLabel feesLabel = new JLabel("Fees:");
        feesLabel.setBounds(20, 220, 120, 25);
        add(feesLabel);
        feesField = new JTextField();
        feesField.setBounds(150, 220, 200, 25);
        add(feesField);

        submitButton = new JButton("Submit");
        submitButton.setBounds(70, 280, 100, 30);
        submitButton.addActionListener(e -> submitDetails());
        add(submitButton);

        viewButton = new JButton("View Details");
        viewButton.setBounds(200, 280, 120, 30);
        viewButton.addActionListener(e -> viewDetails());
        add(viewButton);
    }

    private void submitDetails() {
        name = nameField.getText();
        age = ageField.getText();
        gender = (String) genderField.getSelectedItem();
        specialization = specializationField.getText();
        availability = availabilityField.getText();
        fees = feesField.getText();

        // Hide fields after submission
        nameField.setVisible(false);
        ageField.setVisible(false);
        genderField.setVisible(false);
        specializationField.setVisible(false);
        availabilityField.setVisible(false);
        feesField.setVisible(false);
        submitButton.setVisible(false);

        JOptionPane.showMessageDialog(this, "Doctor details submitted!");
    }

    private void viewDetails() {
        String details = "Doctor Name: " + name +
                         "\nAge: " + age +
                         "\nGender: " + gender +
                         "\nSpecialization: " + specialization +
                         "\nAvailability: " + availability +
                         "\nFees: " + fees;
        JOptionPane.showMessageDialog(this, details);
    }
}

