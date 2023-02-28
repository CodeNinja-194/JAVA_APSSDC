import java.awt.*;
public class Example {
public static void main(String[] args) {
Frame f1=new Frame("Button Example");
Button b=new Button("Click Here");
b.setBounds(50,100,15,200);
f1.add(b);
f1.setSize(400,400);
f1.setLayout(null);
f1.setVisible(true);
Label l1,l2;
l1=new Label("First Label.");
l1.setBounds(50,100, 100,30);
l2=new Label("Second Label.");
l2.setBounds(50,150, 100,30);
f1.add(l1); f1.add(l2);
f1.setSize(400,400);
f1.setLayout(null);
f1.setVisible(true);

}
}