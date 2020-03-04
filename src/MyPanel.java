import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

public class MyPanel extends JPanel implements ActionListener
{
    CalcolatriceBinaria c1;
    JLabel lblInfo;
    JTextField txtNum1, txtNum2, txtRisultato;
    JButton btnSomma, btnDifferenza;

    public MyPanel(){
        c1 = new CalcolatriceBinaria("0", "0");
        lblInfo = new JLabel("Scrivi solo numeri in binario");
        txtNum1 = new JTextField();
        txtNum2 = new JTextField();
        txtRisultato = new JTextField();
        txtRisultato.setEditable(false);
        btnSomma = new JButton("Somma");
        btnSomma.addActionListener(this);
        btnDifferenza = new JButton("Differenza");
        btnSomma.addActionListener(this);
        btnDifferenza.addActionListener(this);
        add(lblInfo);
        add(txtNum1);
        add(txtNum2);
        add(txtRisultato);
        add(btnSomma);
        add(btnDifferenza);
        setLayout(new GridLayout(6,1));
    }

    public void actionPerformed(ActionEvent e)
    {
        Object pulsantePremuto = e.getSource();

        if(pulsantePremuto==btnSomma)
        {
            c1.setNumeroBinario1(txtNum1.getText());
            c1.setNumeroBinario2(txtNum2.getText());
            String somma = c1.somma();
            txtRisultato.setText(somma);
        }

        else if(pulsantePremuto==btnDifferenza)
        {
            c1.setNumeroBinario1(txtNum1.getText());
            c1.setNumeroBinario2(txtNum2.getText());
            String differenza = c1.differenza();
            txtRisultato.setText(differenza);
        }
    }
}
