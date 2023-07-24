import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TA extends JFrame 
{
	private JTextField tf = new JTextField(20);
    private JTextArea ta = new JTextArea(7,20);
    
    public TA()
    {
    	setTitle("텍스트영역 만들기 예제");
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
    	Container c = getContentPane();
    	c.setLayout(new FlowLayout());
    	
    	c.add(new JLabel("임력후 <Enter> 키를 입력하세요"));
    	c.add(tf);
    	c.add(new JScrollPane(ta));
    	
    	tf.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e)//엔터 입력시 Action이벤트 발생
    		{
    			JTextField t = (JTextField)e.getSource();
    			ta.append(t.getText()+"\n");
    			
    			t.setText("");// 입력창 비우기
    		}
    	});
    	
    	setSize(300,300);
    	setVisible(true);
    }
	public static void main(String[] args) 
	{
		new TA();
	}
}
