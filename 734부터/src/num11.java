import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class num11 extends JFrame
{
	Word word = new Word("C:\\Users\\�츮��\\Desktop\\�ڵ�\\JAVA����\\��ǰJAVA���α׷���(����4��)_�н��ڿ�[20190220]\\words.txt");
	Vector<String> wordset = new Vector<>();
	JLabel text = null;
	GamePanel gamepanel = new GamePanel();
	InputPanel inputpanel = new InputPanel();
	FallThread th; 
	public num11()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		setTitle("�꼺��");
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		GamePanel gamepanel = new GamePanel();
		c.add(gamepanel,BorderLayout.CENTER);
		InputPanel inputpanel = new InputPanel();
		c.add(inputpanel,BorderLayout.SOUTH);
		
		setVisible(true);
		setSize(300,450);
	}
	class GamePanel extends JPanel
	{th = new FallThread();
		public GamePanel()
		{
			System.out.print("gamepanel height:" +this.getHeight());
			setBackground(Color.GRAY);
			setLayout(null);
			text = new JLabel(word.getRandomWord());
			text.setSize(100,50);
			text.setLocation(40,0);
			add(text);
			
				
			th.start();
		}
		
    class FallThread extends Thread
	{
		Boolean stopfalling = false;
		JPanel panel;
		
		public void run()
		{
			while(true)
			{
				text.setText(word.getRandomWord());
				text.setLocation((int)(Math.random()*300),0);
				
				while(true)
				{System.out.println("gamepanel.getHeight() :"+gamepanel.getHeight()+"  text.getY() :"+text.getY());
					if(stopfalling == true)break;
					text.setLocation(text.getX(),text.getY()+5);
					try 
					{
						Thread.sleep(300);
					}
					catch(InterruptedException e)
					{
						return;
					}
				}
				stopfalling = false;
			}
		}
		public void setCorrect()
		{
			stopfalling = true;
		}
	}
	}
	class InputPanel extends JPanel
	{
		public InputPanel()
		{
			JTextField tf = new JTextField(20);
			setBackground(Color.DARK_GRAY);
			
			add(tf);tf.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					
					System.out.print("tf "+tf.getText()+"text.getText "+text.getText());
					if(tf.getText().equals(text.getText())==true) {th.setCorrect();tf.setText("");}
				}
			});
		}
	}
	
	public static void main(String[] args)
	{
		new num11();
	}
}

class Word
{
	Vector<String> wordVector = new Vector<>();
	public Word(String fileName) 
	{
		try 
		{
			Scanner scanner = new Scanner(new FileReader(fileName));
			while(scanner.hasNext()) 
			{ // ���� ������ ����
				String word = scanner.nextLine(); // �� ������ �а� '\n'�� ���� ������ ���ڿ��� ����
				wordVector.add(word); // ���ڿ��� ���Ϳ� ����
			}
			scanner.close();
		}
		catch(FileNotFoundException e) 
		{
			System.out.println("file not found error");
			System.exit(0);
		}

	}
	
	public String getRandomWord() 
	{
		final int WORDMAX = wordVector.size(); // �� �ܾ��� ����
		int index = (int)(Math.random()*WORDMAX);
		return wordVector.get(index);
	}	
	
	
}
