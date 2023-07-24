import javax.swing.*;
import java.awt.*;

public class rems_checkbox extends JFrame
{
	rems_checkbox()
	{
		setTitle("rems button");
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		ImageIcon remsimagine = new ImageIcon("C:\\Users\\우리집\\eclipse-workspace\\실험용\\3cdc84b1-da51-4010-bf39-21626ce2c25a.jpg");
		ImageIcon ramsImagine = new ImageIcon("C:\\Users\\우리집\\eclipse-workspace\\실험용\\Re_Zero Can Badge Ram ,Re_Zero Can Badge Ram,Collectible listed at CDJapan! Get it delivered safely by SAL, EMS, FedEx and save with CDJapan Rewards!.jpg");
		
		JCheckBox re_button = new JCheckBox("렘람", ramsImagine);
		re_button.setSelectedIcon(remsimagine);
		
		c.add(re_button);
		
		setVisible(true);
		setSize(1000,1000);
		
	}
	
	public static void main(String[] args) 
	{
		new rems_checkbox();
	}

}
