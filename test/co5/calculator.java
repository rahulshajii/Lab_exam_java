import java.awt.*;
import java.awt.event.*;
class calculator extends Frame implements ActionListener{
    TextField t1,t2,result;
    Button add,mul,sub,div;

calculator(){
    setTitle("AWT CALCULATOR");
    //label
    Label l1=new Label("First Number");
    Label l2=new Label("Second Number");
    Label l3=new Label ("Result");
    //text field
    t1=new TextField();
    t2=new TextField();
    result = new TextField();
    result.setEditable(false);
    //button
    add=new Button(" + ");
    mul=new Button(" * ");
    sub=new Button(" - ");
    div=new Button(" / ");
    //layout
    setLayout(new GridLayout(5,2));
    add(l1); add(t1);
    add(l2); add(t2);
    add(l3); add(result);
    add(add); add(mul);
    add(sub); add(div);

    //eventhandling
    add.addActionListener(this);
    mul.addActionListener(this);
    sub.addActionListener(this);
    div.addActionListener(this);

    setSize(300,300);
    setVisible(true);

    addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we){
            dispose();
        }
    });
   
}public void actionPerformed(ActionEvent e){
    try {
        double a = Double.parseDouble(t1.getText());
        double b = Double.parseDouble(t2.getText());
        double c = 0.0;

        if(e.getSource() == add){
            c = a + b;
            result.setText(String.valueOf(c));
        }
        else if(e.getSource() == mul){
            c = a * b;
            result.setText(String.valueOf(c));
        }
        else if(e.getSource() == sub){
            c = a - b;
            result.setText(String.valueOf(c));
        }
        else if(e.getSource() == div){
            if(b == 0){
                result.setText("Can't divide by zero!");
            } else {
                c = a / b;
               result.setText(String.valueOf(c));
            }
        }
        
    }
    catch(Exception ex){
        result.setText("Invalid input!");
    }
}
public static void main(String[] args){
    new calculator();
}


}