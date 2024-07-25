import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.*;

public class Source extends JFrame implements ActionListener
{

		JPanel p1;
		JTextArea ta;
		JScrollPane pane;
	    String path1;
		JButton b1,b2;
		JLabel l5;
		ImageIcon ic;
		String keyWord = "ef50a0ef2c3e3a5fdf803ae9752c8c66";
		
		Source()
		{
			setTitle("");
			
			
			p1=new JPanel();
			p1.setLayout(null);
			p1.setBackground(Color.WHITE);
			b1=new JButton("Browse");
			b2=new JButton("Send");
			b1.setBounds(80,200,100,30);
			b2.setBounds(80,280,100,30);
			b1.addActionListener(this);
			b2.addActionListener(this);
			
			ImageIcon ic = new ImageIcon(this.getClass().getResource("Source.jpg"));
			l5=new JLabel();
			l5.setIcon(ic);
			l5.setBounds(0, 0, 950,500);
			
			b1.setBackground(Color.WHITE);

			b2.setBackground(Color.WHITE);

			ta=new JTextArea();
			pane=new JScrollPane();
			pane.setViewportView(ta);
			ta.setRows(100);
			ta.setColumns(100);
			pane.setBounds(300,120,350,300);
			p1.add(pane);p1.add(b1);p1.add(b2);p1.add(l5);
			
	
			add(p1);
			
			setSize(750,520);
			setVisible(true);
			
		}
	
	@Override
	public void actionPerformed(ActionEvent a1) 
	{
		String strLine = null;
		String newline = "\n";
		
		
		if(a1.getSource()==b1)
		{
			JFileChooser chooser = new JFileChooser();

			try {

				File f = new File(new File("filename.txt").getCanonicalPath());

				chooser.setSelectedFile(f);
			} catch (IOException e1) {
			}
			
			int retval = chooser.showOpenDialog(b1);
			if (retval == JFileChooser.APPROVE_OPTION) {
				File field = chooser.getSelectedFile();
				 path1=field.getAbsolutePath();
			}

			File curFile = chooser.getSelectedFile();

			try {

				FileInputStream fstream = new FileInputStream(curFile);

				DataInputStream ins = new DataInputStream(fstream);
				BufferedReader br = new BufferedReader(new InputStreamReader(
						ins));

				StringBuffer buffer = new StringBuffer();
				while ((strLine = br.readLine()) != null) {

					System.out.println(strLine);
					buffer.append(strLine + "\n");

				}
				ta.setText(buffer.toString());

			} catch (Exception e1) {
				System.err.println("Error: " + e1.getMessage());
			}
		}
		
		if(a1.getSource()==b2)
		{
			
			String clist[]={"Dest A","Dest B","Dest C"};
			JComboBox cb=new JComboBox(clist);
			String fname=JOptionPane.showInputDialog(null,"Enter the File Name");
			JOptionPane.showMessageDialog(null,cb,"Select Destination",JOptionPane.QUESTION_MESSAGE);
			String ip=JOptionPane.showInputDialog(null,"Enter Router IP Address");
			try
			{
				String data=ta.getText();
				String dest=cb.getSelectedItem().toString();
				
				Socket up=new Socket(ip,8989);
				DataOutputStream dos3=new DataOutputStream(up.getOutputStream());
				dos3.writeUTF(fname);
				dos3.writeUTF(AES.encrypt(data, keyWord));
				dos3.writeUTF(dest);
				
				
				DataInputStream ins=new DataInputStream(up.getInputStream());
				String msg=ins.readUTF();
				
				if(msg.equalsIgnoreCase("success"))
				{
					JOptionPane.showMessageDialog(null,"File Sent Successfully !!!");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Uploading Failed");
				}
			
				
			}catch(Exception es){System.out.println(es);}
		}

	}
	public static void main(String[] args) 
	{
		new Source();
		
		
	}

}
