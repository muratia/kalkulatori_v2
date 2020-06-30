
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.MatteBorder;

public class Kalkulatori_v20 extends JFrame
    implements ActionListener
{


    double r1;
    double r2;
    String op;
    private JTextField Display;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JButton pulla0;
    private JButton pulla1;
    private JButton pulla2;
    private JButton pulla3;
    private JButton pulla4;
    private JButton pulla5;
    private JButton pulla6;
    private JButton pulla7;
    private JButton pulla8;
    private JButton pulla9;
    private JButton pullaBaras;
    private JButton pullaC;
    private JButton pullaHere;
    private JButton pullaInfo;
    private JButton pullaMinus;
    private JButton pullaOff;
    private JButton pullaPike;
    private JButton pullaPjestim;
    private JButton pullaPlus;
    private static boolean mbishkruajeEkranin = false;

    public Kalkulatori_v20()
    {

        r1 = 0.0D;
        r2 = 0.0D;
        op = "";
        initComponents();
    }


    public double eval(String expr)
    {
        if(expr.length() > 0)
        {
            mbishkruajeEkranin = true;
            int d = findOpLoc(expr);
            String r1Str = expr.substring(0, d);
            String r2Str = expr.substring(d + 1, expr.length());
            op = "" + expr.charAt(d);
            r1 = Double.parseDouble(r1Str);
            r2 = Double.parseDouble(r2Str);
            return compute(r1, "" + op, r2);
        } else
        {
            return 0.0D;
        }
    }

    public double compute(double x, String opi, double y)
    {
        double res = 0.0D;
        if(opi.charAt(0) == '+')
            res = x + y;
        if(opi.charAt(0) == '-')
            res = x - y;
        if(opi.charAt(0) == '*')
            res = x * y;
        if(opi.charAt(0) == '/')
            res = x / y;
        return res;
    }

    public int findOpLoc(String x)
    {
        int res = -1;
        if(x.indexOf("+") != -1)
            res = x.indexOf("+");
        if(x.indexOf("-") != -1)
            res = x.indexOf("-");
        if(x.indexOf("*") != -1)
            res = x.indexOf("*");
        if(x.indexOf("/") != -1)
            res = x.indexOf("/");
        if(x.indexOf("sin") != -1)
            res = x.indexOf("sin");
        return res;
    }

    private void initComponents()
    {
        jPanel1 = new JPanel();
        Display = new JTextField();
        jPanel2 = new JPanel();
        jPanel3 = new JPanel();
        pullaC = new JButton();
        pullaOff = new JButton();
        jPanel4 = new JPanel();
        pulla1 = new JButton();
        pulla2 = new JButton();
        pulla3 = new JButton();
        pulla4 = new JButton();
        pulla5 = new JButton();
        pulla6 = new JButton();
        pulla7 = new JButton();
        pulla8 = new JButton();
        pulla9 = new JButton();
        pullaPike = new JButton();
        pulla0 = new JButton();
        pullaPlus = new JButton();
        pullaMinus = new JButton();
        pullaHere = new JButton();
        pullaPjestim = new JButton();
        pullaInfo = new JButton();
        pullaBaras = new JButton();
        setDefaultCloseOperation(2);
        setTitle("Kalkulatori v2.0");
        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent evt)
            {
                exitForm(evt);
            }

        });
        jPanel1.setBorder(new MatteBorder(null));
        Display.setEditable(false);
        Display.setFont(new Font("Dialog", 1, 12));
        Display.setHorizontalAlignment(4);
        Display.setName("Display");
        Display.setPreferredSize(new Dimension(200, 20));
        
        jPanel1.add(Display);
        getContentPane().add(jPanel1, "North");
        jPanel2.setLayout(new BorderLayout());
        jPanel3.setLayout(new BorderLayout());
        pullaC.setText("C");
        pullaC.setToolTipText("Kjo pull\353 fshin\353 regjistrat si dhe tekstin e display");
        pullaC.addActionListener(this);
        
        jPanel3.add(pullaC, "Center");
        pullaOff.setText("Off");
        pullaOff.setToolTipText("Kjo pull\353 e mbyll aplikacionin");
        pullaOff.addActionListener(this);
        
        jPanel3.add(pullaOff, "West");
        jPanel2.add(jPanel3, "North");
        jPanel4.setLayout(new GridLayout(6, 3, 5, 5));
        
        pulla1.setText("1");
        pulla1.setToolTipText("Shtyp numrin 1");
        pulla1.addActionListener(this);
        jPanel4.add(pulla1);
        
        pulla2.setText("2");
        pulla2.setToolTipText("Shtyp numrin 2");
        pulla2.addActionListener(this);
        jPanel4.add(pulla2);
        
        pulla3.setText("3");
        pulla3.setToolTipText("Shtyp numrin 3");
        pulla3.addActionListener(this);
        jPanel4.add(pulla3);
        
        pulla4.setText("4");
        pulla4.setToolTipText("Shtyp numrin 4");
        pulla4.addActionListener(this);
        jPanel4.add(pulla4);
        
        pulla5.setText("5");
        pulla5.setToolTipText("Shtyp numrin 5");
        pulla5.addActionListener(this);
        jPanel4.add(pulla5);
        
        pulla6.setText("6");
        pulla6.setToolTipText("Shtyp numrin 6");
        pulla6.addActionListener(this);
        jPanel4.add(pulla6);
        
        pulla7.setText("7");
        pulla7.setToolTipText("Shtyp numrin 7");
        pulla7.addActionListener(this);
        jPanel4.add(pulla7);
        
        pulla8.setText("8");
        pulla8.setToolTipText("Shtyp numrin 8");
        pulla8.addActionListener(this);
        jPanel4.add(pulla8);
        
        pulla9.setText("9");
        pulla9.setToolTipText("Shtyp numrin 9");
        pulla9.addActionListener(this);
        jPanel4.add(pulla9);
        
        pullaPike.setText(".");
        pullaPike.setToolTipText("Shtyp simbolin . ");
        pullaPike.addActionListener(this);
        jPanel4.add(pullaPike);
        
        pulla0.setText("0");
        pulla0.setToolTipText("Shtyp numrin 0");
        pulla0.addActionListener(this);
        jPanel4.add(pulla0);
        
        pullaPlus.setText("+");
        pullaPlus.setToolTipText("Shtyp operatorin +");
        pullaPlus.addActionListener(this);
        jPanel4.add(pullaPlus);
        
        pullaMinus.setText("-");
        pullaMinus.setToolTipText("Shtyp operatorin -");
        pullaMinus.addActionListener(this);
        jPanel4.add(pullaMinus);
        
        pullaHere.setText("*");
        pullaHere.setToolTipText("Shtyp operatorin *");
        pullaHere.setRolloverEnabled(true);
        pullaHere.addActionListener(this);
        jPanel4.add(pullaHere);
        
        pullaPjestim.setText("/");
        pullaPjestim.setToolTipText("Shtyp operatorin /");
        pullaPjestim.addActionListener(this);
        jPanel4.add(pullaPjestim);
        
        pullaInfo.setText("Info");
        pullaInfo.setToolTipText("Paraqet informata t\353 ndryshme");
        pullaInfo.addActionListener(this);
        jPanel4.add(pullaInfo);
        
        pullaBaras.setForeground(new Color(0, 153, 255));
        pullaBaras.setText("EXE");
        pullaBaras.setToolTipText("Ekzekuton nj\353 shprehjen e dh\353n\353");
        pullaBaras.addActionListener(this);
        jPanel4.add(pullaBaras);
        
        jPanel2.add(jPanel4, "Center");
        getContentPane().add(jPanel2, "Center");
        pack();
    }

    private void pullaCActionPerformed(ActionEvent evt)
    {
        aksioni(evt.getActionCommand());
    }

    private void pullaBarasActionPerformed(ActionEvent evt)
    {
        aksioni(evt.getActionCommand());
    }

    private void pullaPjestimActionPerformed(ActionEvent evt)
    {
        aksioni(evt.getActionCommand());
    }

    private void pullaHereActionPerformed(ActionEvent evt)
    {
        aksioni(evt.getActionCommand());
    }

    private void pullaMinusActionPerformed(ActionEvent evt)
    {
        aksioni(evt.getActionCommand());
    }

    private void pullaPlusActionPerformed(ActionEvent evt)
    {
        aksioni(evt.getActionCommand());
    }

    private void pulla0ActionPerformed(ActionEvent evt)
    {
        aksioni(evt.getActionCommand());
    }

    private void pullaPikeActionPerformed(ActionEvent evt)
    {
        aksioni(evt.getActionCommand());
    }

    private void pulla9ActionPerformed(ActionEvent evt)
    {
        aksioni(evt.getActionCommand());
    }

    private void pulla8ActionPerformed(ActionEvent evt)
    {
        aksioni(evt.getActionCommand());
    }

    private void pulla7ActionPerformed(ActionEvent evt)
    {
        aksioni(evt.getActionCommand());
    }

    private void pulla6ActionPerformed(ActionEvent evt)
    {
        aksioni(evt.getActionCommand());
    }

    private void pulla5ActionPerformed(ActionEvent evt)
    {
        aksioni(evt.getActionCommand());
    }

    private void pulla4ActionPerformed(ActionEvent evt)
    {
        aksioni(evt.getActionCommand());
    }

    private void pulla2ActionPerformed(ActionEvent evt)
    {
        aksioni(evt.getActionCommand());
    }

    private void ActionPerformed(ActionEvent evt)
    {
        aksioni(evt.getActionCommand());
    }

    private void pulla3ActionPerformed(ActionEvent evt)
    {
        aksioni(evt.getActionCommand());
    }

    private void pulla1ActionPerformed(ActionEvent evt)
    {
        aksioni(evt.getActionCommand());
    }

    private void DisplayActionPerformed(ActionEvent actionevent)
    {
    }

    
    private void exitForm(WindowEvent evt)
    {
        System.exit(0);
    }

    private void aksioni(String ac)
    {
        if(ac.equalsIgnoreCase("off"))
            System.exit(0);
        JOptionPane JO = new JOptionPane();
        if(ac.equalsIgnoreCase("info"))
            JOptionPane.showMessageDialog(null, "               Punuar nga\n"+
            "            Ahmet N Murati\n"+
            "               Agron Daka\n\n"+
            "          Detyra 6 Kapitulli X", "Info", 1);
        if(ac.equalsIgnoreCase("C"))
        {
            Display.setText("");
            return;
        }
        if(ac.equals("."))
        {
            if(mbishkruajeEkranin)
            {
                Display.setText(ac);
                mbishkruajeEkranin = false;
                return;
            }
            String s = Display.getText();
            if(s.indexOf('.') != -1)
            {
                return;
            } else
            {
                s = s + '.';
                Display.setText(s);
                return;
            }
        }
        if(ac.equals("0") || ac.equals("1") || ac.equals("2") || 
           ac.equals("3") || ac.equals("4") || ac.equals("5") ||
           ac.equals("6") || ac.equals("7") || ac.equals("8") || 
           ac.equals("9"))
        {
            if(mbishkruajeEkranin)
                Display.setText(ac);
            else
                Display.setText(Display.getText() + ac);
            mbishkruajeEkranin = false;
        }
        if(ac.equals("+") || ac.equals("-") || ac.equals("*") || ac.equals("/"))
        {
            if(mbishkruajeEkranin)
                Display.setText(ac);
            else
                Display.setText(Display.getText() + ac);
            mbishkruajeEkranin = false;
        }
        if(ac.equalsIgnoreCase("exe"))
           if(Display.getText().length()>0)
            Display.setText("" + eval(Display.getText()));
    }

    private void shkruaj(String x)
    {
        Display.setText(x);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getActionCommand().length() != 0)
            aksioni(ae.getActionCommand());
    }

    public static void main(String args[])
    {
        Kalkulatori_v20 kl = new Kalkulatori_v20();
        kl.show();
    }
}