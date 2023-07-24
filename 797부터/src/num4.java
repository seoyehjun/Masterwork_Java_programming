import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class num4 extends JFrame
{
	Container c;
	char [] numlist = {'0','1','2','3','4','5','6','7','8','9'};
	public num4()
	{
		setTitle("숫자가아니면 경고");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		c = getContentPane();
		
		createToolBar();
		
		setVisible(true);
		setSize(300,300);
	}
	private void createToolBar()
	{
		JToolBar tb = new JToolBar();
		JButton button = new JButton("학번");
		JTextField tf = new JTextField(20);
		
		tb.add(button);
		tb.add(tf);
		tf.addKeyListener(new MyKeyListener());
		
		c.add(tb,BorderLayout.NORTH);
	}
	class MyKeyListener extends KeyAdapter
	{
		public void keyTyped(KeyEvent e)
		{
			int isnum =0;
			for(int i=0;i<10;i++)
			{
				if(e.getKeyChar()!= numlist[i])isnum++;// 만약 숫자를 입력햇다면 isnum은 9까지 증가함
			}
			
			if(isnum==10) 
			{
				JOptionPane.showMessageDialog(null,"숫자가 아닙니다","경고",JOptionPane.ERROR_MESSAGE);
				e.consume();
			}
		}
	}
	public static void main(String[] args) 
	{
		new num4();
	}
}
