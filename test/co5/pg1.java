//greatest1.Program to find maximum of three numbers using AWT.
import java.awt.*;
import java.awt.event.*;
class greater extends Frame implements ActionListener{
    TextField t1,t2,t3,result;
    Button enter;
    greater(){
        //textfield
        t1=new TextField();
        t2=new TextField();
        t3=new TextField();
        result=new TextField();
        result.setEditable(false);
        //button
        enter=new Button("Enter");
        //Label
        Label l1=new Label("First Number");
        Label l2=new Label("Second Number");
        Label l3=new Label("Thrid Number");
        Label l4=new Label("Result");
        //Layout
        setLayout(new GridLayout(5,2));
        add(l1);add(t1);
        add(l2);add(t2);
        add(l3);add(t3);
        add(l4);add(result);
                add(enter);

        //event handling
        enter.addActionListener(this);

        setSize(300,300);
        setVisible(true);
        
    addWindowListener(new WindowAdapter (){
        public void windowClosing(WindowEvent we){
            dispose();
        }
    });
    }
public void actionPerformed(ActionEvent e){
    try{
    double a=Double.parseDouble(t1.getText());
    double b=Double.parseDouble(t2.getText());
    double c=Double.parseDouble(t3.getText());
    if(a==b && a==c){
     result.setText("error");
    }
    else{
    if(a>=b && a>=c){
        result.setText(String.valueOf(a));
    }
    else if(b>=a && b>=c){
       result.setText(String.valueOf(b));
    }
    else{
        result.setText(String.valueOf(c));
    }
    }
}
catch(Exception ex){
    result.setText("invalid!!");
}
}
public static void main(String [] args){
    new greater();
}
}