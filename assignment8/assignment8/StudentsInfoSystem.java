package assignment8;

import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;

public class StudentsInfoSystem extends JFrame {

    private JTable studentsTable;
    private Font font;
    private JTextField idField, firstNameField, lastNameField, genderField;
    int id = 0;
    String firstName, lastName;
    boolean gender = false;
    private JButton add;
    StudentsTableModel model;

    public StudentsInfoSystem(Students students) {
        model = new StudentsTableModel(students);

        studentsTable = new JTable(model);
        JScrollPane jsp = new JScrollPane(studentsTable);
        createComponents();
        addComponents(jsp);

        OperationListener ol = new OperationListener();
        add.addActionListener(ol);

        setSize(425, 300);
        setVisible(true);
    }

    class OperationListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            id = Integer.parseInt(idField.getText());
            firstName = firstNameField.getText();
            lastName = lastNameField.getText();
            if(genderField.getText().contains("F")) { gender = true; }
            model.addRow(new Student(id, firstName, lastName, gender));
            studentsTable.updateUI();
            idField.setText("");
            firstNameField.setText("");
            lastNameField.setText("");
            genderField.setText("");
        }
    }

    private void createComponents() {
        Dimension dimension = new Dimension(100, 30);
        font = new Font("TimesRoman", Font.PLAIN, 16);

        idField = new JTextField("");
        idField.setFont(font);
        idField.setPreferredSize(dimension);

        firstNameField = new JTextField("");
        firstNameField.setFont(font);
        firstNameField.setPreferredSize(dimension);

        lastNameField = new JTextField("");
        lastNameField.setFont(font);
        lastNameField.setPreferredSize(dimension);

        genderField = new JTextField("");
        genderField.setFont(font);
        genderField.setPreferredSize(dimension);

        add = new JButton("Add Student");
        add.setFont(font);
    }

    private void addComponents(JScrollPane jsp) {
        Container container = getContentPane();
        container.add(BorderLayout.CENTER, jsp);

//        setLayout(new GridLayout(3, 4));

        JPanel panel = new JPanel();
        panel.add(idField);
        panel.add(firstNameField);
        panel.add(lastNameField);
        panel.add(genderField);
        container.add(BorderLayout.NORTH, panel);
        container.add(BorderLayout.SOUTH, add);
    }

    public static void main(String[] args) {
        Students s = new Students();
        s.addStudent(new Student(100, "Divya", "Sharma", true));
        s.addStudent(new Student(101, "Mihir", "Salunke", false));
        new StudentsInfoSystem(s);
    }
}

class Students {
    private Collection<Student> students = new ArrayList<>();

    public Collection<Student> getStudents() { return students; }
    public void addStudent(Student s) {
        students.add(s);
    }
    public int getNumberOfStudents() {
        return getStudents().size();
    }
}

class Student {
    int id;
    String first;
    String last;
    boolean gender;

    public Student(int id, String first, String last, boolean gender) {
        this.id = id;
        this.first = first;
        this.last = last;
        this.gender = gender;
    }
}

class StudentsTableModel implements TableModel {
    private Students students;

    public StudentsTableModel(Students students) {
        this.students = students;
    }

    @Override
    public int getRowCount() {
        return students.getNumberOfStudents();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) { return "ID"; }
        if (columnIndex == 1) { return "First"; }
        if (columnIndex == 2) { return "Last"; }
        if (columnIndex == 3) { return "Gender"; }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 3) { return Boolean.class; }
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) { return false; }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Collection<Student> s = students.getStudents();
        int row = -1;
        for (Student student : s) {
            row++;
            if (row == rowIndex) {
                if (columnIndex == 0) { return student.id + ""; }
                if (columnIndex == 1) { return student.first; }
                if (columnIndex == 2) { return student.last; }
                if (columnIndex == 3) { return student.gender; }
            }
        }
        return null;
    }

    public void addRow(Student student) { students.addStudent(student); }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {}

    @Override
    public void addTableModelListener(TableModelListener l) {}

    @Override
    public void removeTableModelListener(TableModelListener l) {}

}