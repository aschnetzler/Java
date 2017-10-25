package Lab12_2;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class toolBarPanel extends JPanel {

	 private JToolBar toolbar;
	
	public toolBarPanel(){
		toolbar = new JToolBar();
		
		this.setLayout(new BorderLayout());
		
		toolbar.setAlignmentY(LEFT_ALIGNMENT);
		
		URL imageURL = null;
		Image image =null;
		try{
			imageURL = toolBarPanel.class.getResource("/Images/OpenFile.jpg");
			image = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e){
			e.printStackTrace();
		}
		
		URL imageURL2 = null;
		Image image2 = null;
		try{
			imageURL2 = toolBarPanel.class.getResource("/Images/Add.jpg");
			image2 = Toolkit.getDefaultToolkit().getImage(imageURL2);
		} catch (Exception e){
			e.printStackTrace();
		}
		URL imageURL3 = null;
		Image image3 =null;
		try{
			imageURL3 = toolBarPanel.class.getResource("/Images/Save.jpg");
			image3 = Toolkit.getDefaultToolkit().getImage(imageURL3);
		} catch (Exception e){
			e.printStackTrace();
		}
		URL imageURL4 = null;
		Image image4 =null;
		try{
			imageURL4 = toolBarPanel.class.getResource("/Images/close.jpg");
			image4 = Toolkit.getDefaultToolkit().getImage(imageURL4);
		} catch (Exception e){
			e.printStackTrace();
		}
		URL imageURL5 = null;
		Image image5=null;
		try{
			imageURL5 = toolBarPanel.class.getResource("/Images/view.jpg");
			image5 = Toolkit.getDefaultToolkit().getImage(imageURL5);
		} catch (Exception e){
			e.printStackTrace();
		}
		
		ImageIcon icon = new ImageIcon(image);
		ImageIcon icon2 = new ImageIcon(image2);
		ImageIcon icon3 = new ImageIcon(image3);
		ImageIcon icon4 = new ImageIcon(image4);
		ImageIcon icon5 = new ImageIcon(image5);
		
		JButton OpenFile = new JButton(icon);
		JButton newMem = new JButton(icon2);
		JButton save = new JButton(icon3);
		JButton close = new JButton(icon4);
		JButton view = new JButton(icon5);
		
		
		toolbar.add(OpenFile);
		toolbar.addSeparator();
		toolbar.add(newMem);
		toolbar.addSeparator();
		toolbar.add(save);
		toolbar.addSeparator();
		toolbar.add(close);
		toolbar.addSeparator();
		toolbar.add(view);
		toolbar.setFloatable(false);
		this.add(toolbar);
	}
}
