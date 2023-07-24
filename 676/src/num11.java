import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

public class num11 extends JFrame
{
	JTextField atf = new JTextField(5);
	JLabel ala = new JLabel(); int ap = 0;
	JTextField ctf = new JTextField(5);
	JLabel cla = new JLabel(); int cp = 0;
	JTextField stf = new JTextField(5);
	JLabel sla = new JLabel(); int sp = 0;
	JTextField ptf = new JTextField(5);
	JLabel pla = new JLabel(); int pp = 0;
	
	InputPanel panel1 = new InputPanel();
	showPanel panel2 = new showPanel();
	public num11()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		setTitle("PIE");
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		c.add(panel1,BorderLayout.NORTH);
		panel2.setBackground(Color.BLACK);
		c.add(panel2,BorderLayout.CENTER);
	
		setVisible(true);
		setSize(1000,1000);
	}
	
	class InputPanel extends JPanel
	{
		JButton button = new JButton("view");
		public InputPanel()
		{
			add(new JLabel("apple"));      add(atf);
			add(new JLabel("cherry"));     add(ctf);
			add(new JLabel("prune"));      add(ptf);
			add(new JLabel("strawberry")); add(stf);
			
			add(button);
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					ala.setText("apple"+atf.getText()+"%");
					ap = Integer.parseInt(atf.getText());
				}
			});
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					cla.setText("cherry"+ctf.getText()+"%");
					cp = Integer.parseInt(ctf.getText());
				} 
			});
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					sla.setText("strawberry"+stf.getText()+"%");
					sp = Integer.parseInt(stf.getText());
				}
			});
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					pla.setText("prun"+ptf.getText()+"%");
					pp = Integer.parseInt(ptf.getText());
					repaint();
				}
			});
			
			setBackground(Color.GRAY);
			
		}
	}
	class showPanel extends JPanel
	{
		
		public showPanel()
		{
			
			setSize(900,900);
			
			ala.setForeground(Color.RED);
			ala.setOpaque(true);
			ala.setFont(new Font("TimesRoman", Font.ITALIC, 50));
			add(ala);
			
			cla.setForeground(Color.BLUE);
			cla.setOpaque(true);
			cla.setFont(new Font("TimesRoman", Font.ITALIC, 50));
			add(cla);
			
			sla.setForeground(Color.PINK);
			sla.setOpaque(true);
			sla.setFont(new Font("TimesRoman", Font.ITALIC, 50));
			add(sla);
			
			pla.setForeground(Color.ORANGE);
			pla.setOpaque(true);
			pla.setFont(new Font("TimesRoman", Font.ITALIC, 50));
			add(pla);
		}
		public void paintComponent(Graphics g)
		{
			
			super.paintComponent(g);
			int sum = ap + cp + sp + pp;
			if(sum==0)sum=1;
			
			g.setColor(Color.RED);
			g.fillArc(getWidth()/2-150, getHeight()/2-150, 300, 300, 0, (ap*360/sum));
			g.setColor(Color.BLUE);
			g.fillArc(getWidth()/2-150, getHeight()/2-150, 300, 300, (ap*360/sum), (cp*360/sum));
			g.setColor(Color.PINK);
			g.fillArc(getWidth()/2-150, getHeight()/2-150, 300, 300, ((ap+cp)*360/sum), (sp*360/sum));
			g.setColor(Color.ORANGE);
			g.fillArc(getWidth()/2-150, getHeight()/2-150, 300, 300, ((ap+cp+sp)*360/sum), (pp*360/sum));
		}
	}
	public static void main(String[] args) 
	{
		new num11();
	}
}
