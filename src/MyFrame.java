import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame
{
    public MyFrame(String titolo)
    {
        super(titolo);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(200,100,300,300);
    }
}
