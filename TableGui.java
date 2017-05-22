
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
public class TableGui extends JFrame implements ActionListener
{
    public JTable table;
    private JPanel p;
    private JButton b1;
    private boolean in;
    
    @Override
    public void actionPerformed(ActionEvent ae){}
    public TableGui()
    {
        in = false;
        JPanel p = new JPanel();
        JTable table = new JTable(9,9);
        this.setTitle("Enter Known Values");
        
        JButton b1 = new JButton("Click Here to Begin!");
        p.add(b1);
        
        p.add(new JScrollPane(table));
        this.add(p);
        
        b1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                in = true;  
            }
        }); 
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        this.pack();
        this.setVisible(true);
        
        while(in == false)
        {
            // just waits for button to be pressed
        }
        //figure out how to close window
        setVisible(false);
    }
    
    public TableGui(Square [][] enter)
    {
        this.setTitle("Solution");
        for(int x=0; x<9;x++)
        {
            for(int y=0; y<9;y++)
            {
                table.setValueAt(enter[x][y].finnum,x,y);
            }
        }
        this.add(new JScrollPane(table));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        this.pack();
        this.setVisible(true);
    }
}