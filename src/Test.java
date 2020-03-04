import java.awt.*;

public class Test
{
    public static void main(String[] args) {
        CalcolatriceBinaria c1 = new CalcolatriceBinaria("10", "1");
        System.out.println(c1.differenza());

        MyFrame frame = new MyFrame("Calcolatrice binaria");
        MyPanel panel = new MyPanel();
        Container c = frame.getContentPane();
        c.add(panel);
        frame.setVisible(true);
    }
}
