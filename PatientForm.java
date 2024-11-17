import javax.swing.*;

public class PatientForm extends JFrame {
    private JTextField nameField, ageField, diseaseField, heightField, weightField, bloodGroupField, bloodPressureField;
    private JComboBox<String> genderField;
    private JButton submitButton, viewButton;

    private String name, age, gender, disease, height, weight, bloodGroup, bloodPressure;

    public PatientForm() {
        setTitle("Patient Form");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
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

        JLabel diseaseLabel = new JLabel("Disease:");
        diseaseLabel.setBounds(20, 140, 120, 25);
        add(diseaseLabel);
        diseaseField = new JTextField();
        diseaseField.setBounds(150, 140, 200, 25);
        add(diseaseField);

        JLabel heightLabel = new JLabel("Height:");
        heightLabel.setBounds(20, 180, 120, 25);
        add(heightLabel);
        heightField = new JTextField();
        heightField.setBounds(150, 180, 200, 25);
        add(heightField);

        JLabel weightLabel = new JLabel("Weight:");
        weightLabel.setBounds(20, 220, 120, 25);
        add(weightLabel);
        weightField = new JTextField();
        weightField.setBounds(150, 220, 200, 25);
        add(weightField);

        JLabel bloodGroupLabel = new JLabel("Blood Group:");
        bloodGroupLabel.setBounds(20, 260, 120, 25);
        add(bloodGroupLabel);
        bloodGroupField = new JTextField();
        bloodGroupField.setBounds(150, 260, 200, 25);
        add(bloodGroupField);

        JLabel bloodPressureLabel = new JLabel("Blood Pressure:");
        bloodPressureLabel.setBounds(20, 300, 120, 25);
        add(bloodPressureLabel);
        bloodPressureField = new JTextField();
        bloodPressureField.setBounds(150, 300, 200, 25);
        add(bloodPressureField);

        submitButton = new JButton("Submit");
        submitButton.setBounds(70, 350, 100, 30);
        submitButton.addActionListener(e -> submitDetails());
        add(submitButton);

        viewButton = new JButton("View Details");
        viewButton.setBounds(200, 350, 120, 30);
        viewButton.addActionListener(e -> viewDetails());
        add(viewButton);
    }

    private void submitDetails() {
        name = nameField.getText();
        age = ageField.getText();
        gender = (String) genderField.getSelectedItem();
        disease = diseaseField.getText();
        height = heightField.getText();
        weight = weightField.getText();
        bloodGroup = bloodGroupField.getText();
        bloodPressure = bloodPressureField.getText();

        // Hide fields after submission
        nameField.setVisible(false);
        ageField.setVisible(false);
        genderField.setVisible(false);
        diseaseField.setVisible(false);
        heightField.setVisible(false);
        weightField.setVisible(false);
        bloodGroupField.setVisible(false);
        bloodPressureField.setVisible(false);
        submitButton.setVisible(false);

        JOptionPane.showMessageDialog(this, "Patient details submitted!");
    }

    private void viewDetails() {
        String details = "Name: " + name +
                         "\nAge: " + age +
                         "\nGender: " + gender +
                         "\nDisease: " + disease +
                         "\nHeight: " + height +
                         "\nWeight: " + weight +
                         "\nBlood Group: " + bloodGroup +
                         "\nBlood Pressure: " + bloodPressure;
        JOptionPane.showMessageDialog(this, details);
    }
}