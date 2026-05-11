//Implement a simple calculator using AWT components.
import java.awt.*;
import java.awt.event.*;
class CalculatorAWT extends Frame implements ActionListener {
    TextField t1, t2, result;
    Button add, sub, mul, div;
    CalculatorAWT() {
        setTitle("Simple Calculator");
        // Labels
        Label l1 = new Label("First Number:");
        Label l2 = new Label("Second Number:");
        Label l3 = new Label("Result:");

        // TextFields
        t1 = new TextField();
        t2 = new TextField();
        result = new TextField();
        result.setEditable(false);

        // Buttons
        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");

        // Layout
        setLayout(new GridLayout(5, 2));

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(result);
        add(add); add(sub);
        add(mul); add(div);

        // Event Handling
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setSize(300, 300);
        setVisible(true);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        double a = Double.parseDouble(t1.getText());
        double b = Double.parseDouble(t2.getText());
        double res = 0;

        if (e.getSource() == add)
            res = a + b;
        else if (e.getSource() == sub)
            res = a - b;
        else if (e.getSource() == mul)
            res = a * b;
        else if (e.getSource() == div)
            res = a / b;
        result.setText(String.valueOf(res));
    }
    public static void main(String[] args) {
        new CalculatorAWT();
    }
}