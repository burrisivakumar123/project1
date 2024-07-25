import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class WANET_Router  extends JFrame implements ActionListener
{
	JPanel p1;
	ThreadMXBean threadBean;
	long start;
	ImageIcon ic,ic1,a1,a2,a3,a4,a5,a6,a7,a1g,a2g,a3g,a4g,a5g,a6g,a7g,a1r,a2r,a3r,a4r,a5r,a6r,a7r;
	ImageIcon b1,b2,b3,b4,b5,b6,b7,b1g,b2g,b3g,b4g,b5g,b6g,b7g,b8g,b1r,b2r,b3r,b4r,b5r,b6r,b7r;
	ImageIcon c1,c2,c3,c4,c5,c6,c7,c1g,c2g,c3g,c4g,c5g,c6g,c7g,c8g,c1r,c2r,c3r,c4r,c5r,c6r,c7r;
	ImageIcon d1,d2,d3,d4,d5,d6,d7,d1g,d2g,d3g,d4g,d5g,d6g,d7g,d8g,d1r,d2r,d3r,d4r,d5r,d6r,d7r;
	
	JLabel l5,l6,a11,a22,a33,a44,a55,a66,a77;
	JLabel b11,b22,b33,b44,b55,b66,b77;
	JLabel c11,c22,c33,c44,c55,c66,c77;
	JLabel d11,d22,d33,d44,d55,d66,d77;
	
	JLabel src,Down1;
	ImageIcon src1,Down;
	
	String dis1="",dis2="",dis3="",dis4="",dis5="",dis6="",dis7="";
	String dis8="",dis9="",dis10="",dis11="",dis12="",dis13="",dis14="";
	String dis15="",dis16="",dis17="",dis18="",dis19="",dis20="",dis21="";
	String dis22="",dis23="",dis24="",dis25="",dis26="",dis27="",dis28="";
	
	String e1="",e2="",e3="",e4="",e5="",e6="",e7="";
	String e8="",e9="",e10="",e11="",e12="",e13="",e14="";
	String e15="",e16="",e17="",e18="",e19="",e20="",e21="";
	String e22="",e23="",e24="",e25="",e26="",e27="",e28="";
	
	String n1="Node1",n2="Node2",n3="Node3",n4="Node4",n5="Node5",n6="Node6",n7="Node7";
	String n8="Node8",n9="Node9",n10="Node10",n11="Node11",n12="Node12",n13="Node13",n14="Node14";
	String n15="Node15",n16="Node16",n17="Node17",n18="Node18",n19="Node19",n20="Node20",n21="Node21";
	String n22="Node22",n23="Node23",n24="Node24",n25="Node25",n26="Node26",n27="Node27",n28="Node28";
	
	String no1="";String no2="";String no3="";String no4="";String no5="";String no6="";String no7="";String no8="";
	String no9="";String no10="";String no11="";String no12="";String no13="";String no14="";String no15="";String no16="";
	String no17="";String no18="";String no19="";String no20="";String no21="";String no22="";String no23="";String no24="";
	String no25="";String no26="";String no27="";String no28="";String no29="";String no30="";String no31="";String no32="";
	
	
	MenuBar mbr;
	MenuItem i1,i2,i3,i4,i5,i55,i555;
	Menu m1;

	String Degree;
	String keyWord = "ef50a0ef2c3e3a5fdf803ae9752c8c66";
	
	ImageIcon nod,border,down,ids;
	JLabel nodl,borderl,downl,idsl,text;
	
	WANET_Router()
	{
		p1=new JPanel();
		p1.setLayout(null);
		
		
		
		src1=new ImageIcon(this.getClass().getResource("SourceImg.png"));
		src = new JLabel();
		src.setIcon(src1);
		src.setBounds(0, 0, 200, 65);
		p1.add(src);
		
		Down=new ImageIcon(this.getClass().getResource("Down1.png"));
		Down1 = new JLabel();
		Down1.setIcon(Down);
		Down1.setBounds(120, 60, 106, 122);
		p1.add(Down1);
		
	
		nod=new ImageIcon(this.getClass().getResource("node.jpg"));
		nodl = new JLabel();
		nodl.setIcon(nod);
		nodl.setBounds(640, 280, 300, 300);
		p1.add(nodl);
		
		down=new ImageIcon(this.getClass().getResource("down.png"));
		downl = new JLabel();
		downl.setIcon(down);
		downl.setBounds(650, 330, 300, 300);
		p1.add(downl);
		
		ids=new ImageIcon(this.getClass().getResource("ids.jpg"));
		idsl = new JLabel();
		idsl.setIcon(ids);
		idsl.setBounds(640, 370, 300, 300);
		p1.add(idsl);
//		p1.add(borderl);
		
		text= new JLabel("LOAD BALANCING");
		text.setBounds(690, 320, 300, 300);
		text.setForeground(Color.green);
		text.setVisible(false);
		p1.add(text);
		
		setTitle("WANET Router :: Robust defense scheme against selective drop attack in wireless Ad Hoc Networks");
		p1.setBackground(Color.white);
		
		mbr=new MenuBar();
		setMenuBar(mbr);
		
		m1=new Menu("File");
		i1=new MenuItem("Update Energy");
		i2=new MenuItem("Update Distance");
		i3=new MenuItem("View Routing Path & Time Delay");
		i4=new MenuItem("View Attackers");
		i5=new MenuItem("View Network Node Details");
		i555=new MenuItem("View Routing Details");
		i55=new MenuItem("Exit");
		
		m1.add(i1);
		m1.add(i2);
		m1.add(i3);
		m1.add(i4);
		m1.add(i5);
		m1.add(i555);
		m1.add(i55);
		mbr.add(m1);
		
		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
		i4.addActionListener(this);
		i5.addActionListener(this);
		i55.addActionListener(this);
		i555.addActionListener(this);
		
		a1=new ImageIcon(this.getClass().getResource("black.jpg"));
		a11=new JLabel("Node1");
		a11.setIcon(a1);
		a11.setBounds(70, 100, 500,200);
		p1.add(a11);
		
		a2=new ImageIcon(this.getClass().getResource("black.jpg"));
		a22=new JLabel("Node2");
		a22.setIcon(a2);
		a22.setBounds(160, 100, 500,200);
		p1.add(a22);
		
		a3=new ImageIcon(this.getClass().getResource("black.jpg"));
		a33=new JLabel("Node3");
		a33.setIcon(a3);
		a33.setBounds(20, 180, 500,200);
		p1.add(a33);
		
		a4=new ImageIcon(this.getClass().getResource("black.jpg"));
		a44=new JLabel("Node4");
		a44.setIcon(a4);
		a44.setBounds(120, 180, 500,200);
		p1.add(a44);
		
		a5=new ImageIcon(this.getClass().getResource("black.jpg"));
		a55=new JLabel("Node5");
		a55.setIcon(a5);
		a55.setBounds(220, 180, 500,200);
		p1.add(a55);
		
		a6=new ImageIcon(this.getClass().getResource("black.jpg"));
		a66=new JLabel("Node6");
		a66.setIcon(a6);
		a66.setBounds(70, 260, 500,200);
		p1.add(a66);
		
		a7=new ImageIcon(this.getClass().getResource("black.jpg"));
		a77=new JLabel("Node7");
		a77.setIcon(a7);
		a77.setBounds(160, 260, 500,200);
		p1.add(a77);
		
		b1=new ImageIcon(this.getClass().getResource("black.jpg"));
		b11=new JLabel("Node8");
		b11.setIcon(b1);
		b11.setBounds(320, -30, 500,200);
		p1.add(b11);
		
		b2=new ImageIcon(this.getClass().getResource("black.jpg"));
		b22=new JLabel("Node9");
		b22.setIcon(b2);
		b22.setBounds(410,-30, 500,200);
		p1.add(b22);
		
		b3=new ImageIcon(this.getClass().getResource("black.jpg"));
		b33=new JLabel("Node10");
		b33.setIcon(b3);
		b33.setBounds(270, 50, 500,200);
		p1.add(b33);
		
		b4=new ImageIcon(this.getClass().getResource("black.jpg"));
		b44=new JLabel("Node11");
		b44.setIcon(b4);
		b44.setBounds(370, 50, 500,200);
		p1.add(b44);
		
		b5=new ImageIcon(this.getClass().getResource("black.jpg"));
		b55=new JLabel("Node12");
		b55.setIcon(b5);
		b55.setBounds(460, 50, 500,200);
		p1.add(b55);
		
		b6=new ImageIcon(this.getClass().getResource("black.jpg"));
		b66=new JLabel("Node13");
		b66.setIcon(b6);
		b66.setBounds(320, 130, 500,200);
		p1.add(b66);
		
		b7=new ImageIcon(this.getClass().getResource("black.jpg"));
		b77=new JLabel("Node14");
		b77.setIcon(b7);
		b77.setBounds(420, 130, 500,200);
		p1.add(b77);
		
		c1=new ImageIcon(this.getClass().getResource("black.jpg"));
		c11=new JLabel("Node15");
		c11.setIcon(c1);
		c11.setBounds(550, 100, 500,200);
		p1.add(c11);
		
		c2=new ImageIcon(this.getClass().getResource("black.jpg"));
		c22=new JLabel("Node16");
		c22.setIcon(c2);
		c22.setBounds(660, 100, 500,200);
		p1.add(c22);
		
		c3=new ImageIcon(this.getClass().getResource("black.jpg"));
		c33=new JLabel("Node17");
		c33.setIcon(c3);
		c33.setBounds(510, 180, 500,200);
		p1.add(c33);
		
		c4=new ImageIcon(this.getClass().getResource("black.jpg"));
		c44=new JLabel("Node18");
		c44.setIcon(c4);
		c44.setBounds(610, 180, 500,200);
		p1.add(c44);
		
		c5=new ImageIcon(this.getClass().getResource("black.jpg"));
		c55=new JLabel("Node19");
		c55.setIcon(c5);
		c55.setBounds(710, 180, 500,200);
		p1.add(c55);
		
		c6=new ImageIcon(this.getClass().getResource("black.jpg"));
		c66=new JLabel("Node20");
		c66.setIcon(c6);
		c66.setBounds(550, 260, 500,200);
		p1.add(c66);
		
		c7=new ImageIcon(this.getClass().getResource("black.jpg"));
		c77=new JLabel("Node21");
		c77.setIcon(c7);
		c77.setBounds(650, 260, 500,200);
		p1.add(c77);
		
		d1=new ImageIcon(this.getClass().getResource("black.jpg"));
		d11=new JLabel("Node22");
		d11.setIcon(b1);
		d11.setBounds(320, 240, 500,200);
		p1.add(d11);
		
		d2=new ImageIcon(this.getClass().getResource("black.jpg"));
		d22=new JLabel("Node23");
		d22.setIcon(b2);
		d22.setBounds(430,240, 500,200);
		p1.add(d22);
		
		d3=new ImageIcon(this.getClass().getResource("black.jpg"));
		d33=new JLabel("Node24");
		d33.setIcon(b3);
		d33.setBounds(270, 320, 500,200);
		p1.add(d33);
		
		d4=new ImageIcon(this.getClass().getResource("black.jpg"));
		d44=new JLabel("Node25");
		d44.setIcon(b4);
		d44.setBounds(370, 320, 500,200);
		p1.add(d44);
		
		d5=new ImageIcon(this.getClass().getResource("black.jpg"));
		d55=new JLabel("Node26");
		d55.setIcon(b5);
		d55.setBounds(460, 320, 500,200);
		p1.add(d55);
		
		d6=new ImageIcon(this.getClass().getResource("black.jpg"));
		d66=new JLabel("Node27");
		d66.setIcon(b6);
		d66.setBounds(320, 400, 500,200);
		p1.add(d66);
		
		d7=new ImageIcon(this.getClass().getResource("black.jpg"));
		d77=new JLabel("Node28");
		d77.setIcon(b7);
		d77.setBounds(420, 400, 500,200);
		p1.add(d77);
		
		
		
		setSize(830,610);
		setVisible(true);
		add(p1);
		setResizable(false);
		
		int[] ports = new int[]
			              		{8989,4444,4445};

			              		for (int i = 0; i < 3; i++)
			              		{
			              			Thread t = new Thread(new PortListener(ports[i]));
			              			t.setName("Listener-" + ports[i]);
			              			t.start();

			              		}
	}
	
	public void actionPerformed(ActionEvent ae) 
	{
		Dbcon db=new Dbcon();
		Connection con=db.getConnection();
		
		if(ae.getSource()==i55)
		{
		System.exit(0);
		}
		if(ae.getSource()==i555)
		{
		new View_Routing_Results();
		}
		
		if(ae.getSource()==i1)
		{
			String cn[]={"Network1","Network2","Network3","Network4"};
			JComboBox cb1=new JComboBox(cn);
			JOptionPane.showMessageDialog(null,cb1,"Select Cluster",JOptionPane.QUESTION_MESSAGE);
			String nname="";
			try
			{
				String cname=cb1.getSelectedItem().toString();
				
				if(cname.equalsIgnoreCase("Network1"))
				{
					
					String cn1[]={"Node1","Node2","Node3","Node4","Node5","Node6","Node7"};
					JComboBox clust1=new JComboBox(cn1);
					JOptionPane.showMessageDialog(null,clust1,"Select Node",JOptionPane.QUESTION_MESSAGE);
					
					nname=clust1.getSelectedItem().toString();
				}
				if(cname.equalsIgnoreCase("Network2"))
				{
					
					String cn2[]={"Node8","Node9","Node10","Node11","Node12","Node13","Node14"};
					JComboBox clust2=new JComboBox(cn2);
					JOptionPane.showMessageDialog(null,clust2,"Select Node",JOptionPane.QUESTION_MESSAGE);
					
					nname=clust2.getSelectedItem().toString();
				}
				if(cname.equalsIgnoreCase("Network3"))
				{
					
					String cn3[]={"Node15","Node16","Node17","Node18","Node19","Node20","Node21"};
					JComboBox clust3=new JComboBox(cn3);
					JOptionPane.showMessageDialog(null,clust3,"Select Node",JOptionPane.QUESTION_MESSAGE);
					
					nname=clust3.getSelectedItem().toString();
				}
				if(cname.equalsIgnoreCase("Network4"))
				{
					
					String cn4[]={"Node22","Node23","Node24","Node25","Node26","Node27","Node28"};
					JComboBox clust4=new JComboBox(cn4);
					JOptionPane.showMessageDialog(null,clust4,"Select Node",JOptionPane.QUESTION_MESSAGE);
					
					nname=clust4.getSelectedItem().toString();
				}
				
				
				String Ener=JOptionPane.showInputDialog(null,"Enter Energy");
				
				int dis=Integer.parseInt(Ener);
				Statement st=con.createStatement();
				String n1="update "+cname+" set energy="+dis+" where name='"+nname+"' ";
				st.executeUpdate(n1);
				
				JOptionPane.showMessageDialog(null,"Energy Assigned Successfully");
				
			}catch(Exception es){System.out.println(es);}
			
		}
		if(ae.getSource()==i2)
		{

			String cn[]={"Network1","Network2","Network3","Network4"};
			JComboBox cb1=new JComboBox(cn);
			JOptionPane.showMessageDialog(null,cb1,"Select Cluster",JOptionPane.QUESTION_MESSAGE);
			String nname="";
			try
			{
				String cname=cb1.getSelectedItem().toString();
				
				if(cname.equalsIgnoreCase("Network1"))
				{
					
					String cn1[]={"Node1","Node2","Node3","Node4","Node5","Node6","Node7"};
					JComboBox clust1=new JComboBox(cn1);
					JOptionPane.showMessageDialog(null,clust1,"Select Node",JOptionPane.QUESTION_MESSAGE);
					
					nname=clust1.getSelectedItem().toString();
				}
				if(cname.equalsIgnoreCase("Network2"))
				{
					
					String cn2[]={"Node8","Node9","Node10","Node11","Node12","Node13","Node14"};
					JComboBox clust2=new JComboBox(cn2);
					JOptionPane.showMessageDialog(null,clust2,"Select Node",JOptionPane.QUESTION_MESSAGE);
					
					nname=clust2.getSelectedItem().toString();
				}
				if(cname.equalsIgnoreCase("Network3"))
				{
					
					String cn3[]={"Node15","Node16","Node17","Node18","Node19","Node20","Node21"};
					JComboBox clust3=new JComboBox(cn3);
					JOptionPane.showMessageDialog(null,clust3,"Select Node",JOptionPane.QUESTION_MESSAGE);
					
					nname=clust3.getSelectedItem().toString();
				}
				if(cname.equalsIgnoreCase("Network4"))
				{
					
					String cn4[]={"Node22","Node23","Node24","Node25","Node26","Node27","Node28"};
					JComboBox clust4=new JComboBox(cn4);
					JOptionPane.showMessageDialog(null,clust4,"Select Node",JOptionPane.QUESTION_MESSAGE);
					
					nname=clust4.getSelectedItem().toString();
				}
				
				
				String Ener=JOptionPane.showInputDialog(null,"Enter Distance");
				
				int dis=Integer.parseInt(Ener);
				Statement st=con.createStatement();
				String n1="update "+cname+" set dist="+dis+" where name='"+nname+"' ";
				st.executeUpdate(n1);
				
				JOptionPane.showMessageDialog(null,"Distance Assigned Successfully");
				
			}catch(Exception es){System.out.println(es);}
			
		
		}
		if(ae.getSource()==i4)
		{
			ViewAttackers v = new ViewAttackers();
			v.setSize(750, 400);
			v.setVisible(true);
			
		}
		if(ae.getSource()==i3)
		{
			ViewTimeDelay v = new ViewTimeDelay();
			v.setSize(750, 400);
			v.setVisible(true);
		}
		if(ae.getSource()==i5)
		{

			String cn[]={"Network1","Network2","Network3","Network4"};
			JComboBox cb1=new JComboBox(cn);
			JOptionPane.showMessageDialog(null,cb1,"Select Cluster",JOptionPane.QUESTION_MESSAGE);
			try
			{
				String cname=cb1.getSelectedItem().toString();
				
				if(cname.equalsIgnoreCase("Network1"))
				{
					ViewNetwork1 v1 = new ViewNetwork1();
					v1.setSize(700, 400);
					v1.setVisible(true);
					
				}
				if(cname.equalsIgnoreCase("Network2"))
				{
					
					ViewNetwork2 v2 = new ViewNetwork2();
					v2.setSize(700, 400);
					v2.setVisible(true);
				}
				if(cname.equalsIgnoreCase("Network3"))
				{
					ViewNetwork3 v3 = new ViewNetwork3();
					v3.setSize(700, 400);
					v3.setVisible(true);
				}
				if(cname.equalsIgnoreCase("Network4"))
				{
					
					ViewNetwork4 v4 = new ViewNetwork4();
					v4.setSize(700, 400);
					v4.setVisible(true);
				}
	}catch (Exception e) {
		// TODO: handle exception
	}


		}
		}
		
	
	
	public static void main(String[] args) 
	{
		new WANET_Router();
	}


	class PortListener implements Runnable
	{


		int port;

		public PortListener(int port)
		{
			this.port = port;
		}

		public void run()
		{
			if(this.port==8989)
			{
				try
				{
					ServerSocket sst = new ServerSocket(8989);
					Socket cn;
					while (true) 
					{
						
					cn = sst.accept();
					
					DataInputStream in3=new DataInputStream(cn.getInputStream());
					String fname=in3.readUTF();
					String ct=in3.readUTF();
					String dest=in3.readUTF();
					
					int length=ct.length();
					
					Dbcon db = new Dbcon();
					Connection connect = db.getConnection();
					
					initialize();
					getvalues();
					
					double start=System.currentTimeMillis();
					
					
					Thread.sleep(1000);
					src.setVisible(true);
					Thread.sleep(1000);
					src.setVisible(false);
					Thread.sleep(1000);
					src.setVisible(true);
					Thread.sleep(1000);
					src.setVisible(false);
					Thread.sleep(1000);
					src.setVisible(true);
					
					
					Thread.sleep(1000);
					Down1.setVisible(true);
					Thread.sleep(1000);
					Down1.setVisible(false);
					Thread.sleep(1000);
					Down1.setVisible(true);
					Thread.sleep(1000);
					Down1.setVisible(false);
					Thread.sleep(1000);
					Down1.setVisible(true);
					
					long stime=System.currentTimeMillis();	
					
					
					
					
					
					
					
					Thread.sleep(2000);
					a1g=new ImageIcon(this.getClass().getResource("green.png"));
					a11.setIcon(a1g);
					no1="Node1->";
					
					if(Integer.parseInt(dis2)<=Integer.parseInt(dis3))
					{
						if(Integer.parseInt(e2)>length)
						{
							Thread.sleep(2000);
							a2g=new ImageIcon(this.getClass().getResource("green.png"));
							a22.setIcon(a2g);
							no2="Node2->";
							
							if(Integer.parseInt(dis3)<=Integer.parseInt(dis4))
							{
								if(Integer.parseInt(e3)>length)
								{
									Thread.sleep(2000);
									a3g=new ImageIcon(this.getClass().getResource("green.png"));
									a33.setIcon(a3g);
									no3="Node3->";
									
									if(Integer.parseInt(dis4)<=Integer.parseInt(dis5))
									{
										if(Integer.parseInt(e4)>length)
										{
											Thread.sleep(2000);
											a4g=new ImageIcon(this.getClass().getResource("green.png"));
											a44.setIcon(a4g);
											no4="Node4->";
											
											if(Integer.parseInt(dis5)<=Integer.parseInt(dis6))
											{
												if(Integer.parseInt(e5)>length)
												{
													Thread.sleep(2000);
													a5g=new ImageIcon(this.getClass().getResource("green.png"));
													a55.setIcon(a5g);
													no5="Node5->";
													
													if(Integer.parseInt(dis6)<=Integer.parseInt(dis7))
													{
														if(Integer.parseInt(e6)>length)
														{
															Thread.sleep(2000);
															a6g=new ImageIcon(this.getClass().getResource("green.png"));
															a66.setIcon(a6g);
															no6="Node6->";
														}
														else
														{
															Thread.sleep(2000);
															a6r=new ImageIcon(this.getClass().getResource("red.png"));
															a66.setIcon(a6r);
															no6="Node6->";
															cong(no6, e6);
															Thread.sleep(2000);
															a7g=new ImageIcon(this.getClass().getResource("green.png"));
															a77.setIcon(a7g);
															no7="Node7->";
														}
													}
													else
													{
														Thread.sleep(2000);
														a7g=new ImageIcon(this.getClass().getResource("green.png"));
														a77.setIcon(a7g);
														no7="Node7->";
													}
												}
												else
												{
													Thread.sleep(2000);
													a5r=new ImageIcon(this.getClass().getResource("red.png"));
													a55.setIcon(a5r);
													no5="Node5->";
													cong(no5, e5);
													if(Integer.parseInt(e6)>length)
													{
														Thread.sleep(2000);
														a6g=new ImageIcon(this.getClass().getResource("green.png"));
														a66.setIcon(a6g);
														no6="Node6->";
													}
													else
													{
														Thread.sleep(2000);
														a6r=new ImageIcon(this.getClass().getResource("red.png"));
														a66.setIcon(a6r);
														no6="Node6->";
														cong(no6, e6);
														Thread.sleep(2000);
														a7g=new ImageIcon(this.getClass().getResource("green.png"));
														a77.setIcon(a7g);
														no7="Node7->";
													}
													
												}
											}
											else
											{
												if(Integer.parseInt(e6)>length)
												{
													Thread.sleep(2000);
													a6g=new ImageIcon(this.getClass().getResource("green.png"));
													a66.setIcon(a6g);
													no6="Node6->";
												}
												else
												{
													Thread.sleep(2000);
													a6r=new ImageIcon(this.getClass().getResource("red.png"));
													a66.setIcon(a6r);
													no6="Node6->";
													cong(no6, e6);
													Thread.sleep(2000);
													a7g=new ImageIcon(this.getClass().getResource("green.png"));
													a77.setIcon(a7g);
													no7="Node7->";
												}
											}
										}
										else
										{
											Thread.sleep(2000);
											a4r=new ImageIcon(this.getClass().getResource("red.png"));
											a44.setIcon(a4r);
											no4="Node4->";
											cong(no4, e4);
											if(Integer.parseInt(e5)>length)
											{
												Thread.sleep(2000);
												a5g=new ImageIcon(this.getClass().getResource("green.png"));
												a55.setIcon(a5g);
												no5="Node5->";
												
												if(Integer.parseInt(dis6)<=Integer.parseInt(dis7))
												{
													if(Integer.parseInt(e6)>length)
													{
														Thread.sleep(2000);
														a6g=new ImageIcon(this.getClass().getResource("green.png"));
														a66.setIcon(a6g);
														no6="Node6->";
													}
													else
													{
														Thread.sleep(2000);
														a6r=new ImageIcon(this.getClass().getResource("red.png"));
														a66.setIcon(a6r);
														no6="Node6->";
														cong(no6, e6);
														Thread.sleep(2000);
														a7g=new ImageIcon(this.getClass().getResource("green.png"));
														a77.setIcon(a7g);
														no7="Node7->";
													}
												}
												else
												{
													Thread.sleep(2000);
													a7g=new ImageIcon(this.getClass().getResource("green.png"));
													a77.setIcon(a7g);
													no7="Node7->";
												}
											}
											else
											{
												Thread.sleep(2000);
												a5r=new ImageIcon(this.getClass().getResource("red.png"));
												a55.setIcon(a5r);
												no5="Node5->";
												cong(no5, e5);
												if(Integer.parseInt(e6)>length)
												{
													Thread.sleep(2000);
													a6g=new ImageIcon(this.getClass().getResource("green.png"));
													a66.setIcon(a6g);
													no6="Node6->";
												}
												else
												{
													Thread.sleep(2000);
													a6r=new ImageIcon(this.getClass().getResource("red.png"));
													a66.setIcon(a6r);
													no6="Node6->";
													cong(no6, e6);
													Thread.sleep(2000);
													a7g=new ImageIcon(this.getClass().getResource("green.png"));
													a77.setIcon(a7g);
													no7="Node7->";
												}
												
											}
											
										}
									}
									else
									{
										if(Integer.parseInt(e5)>length)
										{
											Thread.sleep(2000);
											a5g=new ImageIcon(this.getClass().getResource("green.png"));
											a55.setIcon(a5g);
											no5="Node5->";
											
											if(Integer.parseInt(dis6)<=Integer.parseInt(dis7))
											{
												if(Integer.parseInt(e6)>length)
												{
													Thread.sleep(2000);
													a6g=new ImageIcon(this.getClass().getResource("green.png"));
													a66.setIcon(a6g);
													no6="Node6->";
												}
												else
												{
													Thread.sleep(2000);
													a6r=new ImageIcon(this.getClass().getResource("red.png"));
													a66.setIcon(a6r);
													no6="Node6->";
													cong(no6, e6);
													Thread.sleep(2000);
													a7g=new ImageIcon(this.getClass().getResource("green.png"));
													a77.setIcon(a7g);
													no7="Node7->";
												}
											}
											else
											{
												Thread.sleep(2000);
												a7g=new ImageIcon(this.getClass().getResource("green.png"));
												a77.setIcon(a7g);
												no7="Node7->";
											}
										}
										else
										{
											Thread.sleep(2000);
											a5r=new ImageIcon(this.getClass().getResource("red.png"));
											a55.setIcon(a5r);
											no5="Node5->";
											cong(no5, e5);
											if(Integer.parseInt(e6)>length)
											{
												Thread.sleep(2000);
												a6g=new ImageIcon(this.getClass().getResource("green.png"));
												a66.setIcon(a6g);
												no6="Node6->";
											}
											else
											{
												Thread.sleep(2000);
												a6r=new ImageIcon(this.getClass().getResource("red.png"));
												a66.setIcon(a6r);
												no6="Node6->";
												cong(no6, e6);
												Thread.sleep(2000);
												a7g=new ImageIcon(this.getClass().getResource("green.png"));
												a77.setIcon(a7g);
												no7="Node7->";
											}
											
										}
									}
								}
								else
								{
									Thread.sleep(2000);
									a3r=new ImageIcon(this.getClass().getResource("red.png"));
									a33.setIcon(a3r);
									no3="Node3->";
									cong(no3, e3);
									if(Integer.parseInt(e4)>length)
									{
										Thread.sleep(2000);
										a4g=new ImageIcon(this.getClass().getResource("green.png"));
										a44.setIcon(a4g);
										no4="Node4->";
										
										if(Integer.parseInt(dis5)<=Integer.parseInt(dis6))
										{
											if(Integer.parseInt(e5)>length)
											{
												Thread.sleep(2000);
												a5g=new ImageIcon(this.getClass().getResource("green.png"));
												a55.setIcon(a5g);
												no5="Node5->";
												
												if(Integer.parseInt(dis6)<=Integer.parseInt(dis7))
												{
													if(Integer.parseInt(e6)>length)
													{
														Thread.sleep(2000);
														a6g=new ImageIcon(this.getClass().getResource("green.png"));
														a66.setIcon(a6g);
														no6="Node6->";
													}
													else
													{
														Thread.sleep(2000);
														a6r=new ImageIcon(this.getClass().getResource("red.png"));
														a66.setIcon(a6r);
														no6="Node6->";
														cong(no6, e6);
														Thread.sleep(2000);
														a7g=new ImageIcon(this.getClass().getResource("green.png"));
														a77.setIcon(a7g);
														no7="Node7->";
													}
												}
												else
												{
													Thread.sleep(2000);
													a7g=new ImageIcon(this.getClass().getResource("green.png"));
													a77.setIcon(a7g);
													no7="Node7->";
												}
											}
											else
											{
												Thread.sleep(2000);
												a5r=new ImageIcon(this.getClass().getResource("red.png"));
												a55.setIcon(a5r);
												no5="Node5->";
												cong(no5, e5);
												if(Integer.parseInt(e6)>length)
												{
													Thread.sleep(2000);
													a6g=new ImageIcon(this.getClass().getResource("green.png"));
													a66.setIcon(a6g);
													no6="Node6->";
												}
												else
												{
													Thread.sleep(2000);
													a6r=new ImageIcon(this.getClass().getResource("red.png"));
													a66.setIcon(a6r);
													no6="Node6->";
													cong(no6, e6);
													Thread.sleep(2000);
													a7g=new ImageIcon(this.getClass().getResource("green.png"));
													a77.setIcon(a7g);
													no7="Node7->";
												}
												
											}
										}
										else
										{
											if(Integer.parseInt(e6)>length)
											{
												Thread.sleep(2000);
												a6g=new ImageIcon(this.getClass().getResource("green.png"));
												a66.setIcon(a6g);
												no6="Node6->";
											}
											else
											{
												Thread.sleep(2000);
												a6r=new ImageIcon(this.getClass().getResource("red.png"));
												a66.setIcon(a6r);
												no6="Node6->";
												cong(no6, e6);
												Thread.sleep(2000);
												a7g=new ImageIcon(this.getClass().getResource("green.png"));
												a77.setIcon(a7g);
												no7="Node7->";
											}
										}
									}
									else
									{
										Thread.sleep(2000);
										a4r=new ImageIcon(this.getClass().getResource("red.png"));
										a44.setIcon(a4r);
										no4="Node4->";
										cong(no4, e4);
										if(Integer.parseInt(e5)>length)
										{
											Thread.sleep(2000);
											a5g=new ImageIcon(this.getClass().getResource("green.png"));
											a55.setIcon(a5g);
											no5="Node5->";
											
											if(Integer.parseInt(dis6)<=Integer.parseInt(dis7))
											{
												if(Integer.parseInt(e6)>length)
												{
													Thread.sleep(2000);
													a6g=new ImageIcon(this.getClass().getResource("green.png"));
													a66.setIcon(a6g);
													no6="Node6->";
												}
												else
												{
													Thread.sleep(2000);
													a6r=new ImageIcon(this.getClass().getResource("red.png"));
													a66.setIcon(a6r);
													no6="Node6->";
													cong(no6, e6);
													Thread.sleep(2000);
													a7g=new ImageIcon(this.getClass().getResource("green.png"));
													a77.setIcon(a7g);
													no7="Node7->";
												}
											}
											else
											{
												Thread.sleep(2000);
												a7g=new ImageIcon(this.getClass().getResource("green.png"));
												a77.setIcon(a7g);
												no7="Node7->";
											}
										}
										else
										{
											Thread.sleep(2000);
											a5r=new ImageIcon(this.getClass().getResource("red.png"));
											a55.setIcon(a5r);
											no5="Node5->";
											cong(no5, e5);
											if(Integer.parseInt(e6)>length)
											{
												Thread.sleep(2000);
												a6g=new ImageIcon(this.getClass().getResource("green.png"));
												a66.setIcon(a6g);
												no6="Node6->";
											}
											else
											{
												Thread.sleep(2000);
												a6r=new ImageIcon(this.getClass().getResource("red.png"));
												a66.setIcon(a6r);
												no6="Node6->";
												cong(no6, e6);
												Thread.sleep(2000);
												a7g=new ImageIcon(this.getClass().getResource("green.png"));
												a77.setIcon(a7g);
												no7="Node7->";
											}
											
										}
										
									}
								}
							}
							else
							{
								if(Integer.parseInt(e4)>length)
								{
									Thread.sleep(2000);
									a4g=new ImageIcon(this.getClass().getResource("green.png"));
									a44.setIcon(a4g);
									no4="Node4->";
									
									if(Integer.parseInt(dis5)<=Integer.parseInt(dis6))
									{
										if(Integer.parseInt(e5)>length)
										{
											Thread.sleep(2000);
											a5g=new ImageIcon(this.getClass().getResource("green.png"));
											a55.setIcon(a5g);
											no5="Node5->";
											
											if(Integer.parseInt(dis6)<=Integer.parseInt(dis7))
											{
												if(Integer.parseInt(e6)>length)
												{
													Thread.sleep(2000);
													a6g=new ImageIcon(this.getClass().getResource("green.png"));
													a66.setIcon(a6g);
													no6="Node6->";
												}
												else
												{
													Thread.sleep(2000);
													a6r=new ImageIcon(this.getClass().getResource("red.png"));
													a66.setIcon(a6r);
													no6="Node6->";
													cong(no6, e6);
													Thread.sleep(2000);
													a7g=new ImageIcon(this.getClass().getResource("green.png"));
													a77.setIcon(a7g);
													no7="Node7->";
												}
											}
											else
											{
												Thread.sleep(2000);
												a7g=new ImageIcon(this.getClass().getResource("green.png"));
												a77.setIcon(a7g);
												no7="Node7->";
											}
										}
										else
										{
											Thread.sleep(2000);
											a5r=new ImageIcon(this.getClass().getResource("red.png"));
											a55.setIcon(a5r);
											no5="Node5->";
											cong(no5, e5);
											if(Integer.parseInt(e6)>length)
											{
												Thread.sleep(2000);
												a6g=new ImageIcon(this.getClass().getResource("green.png"));
												a66.setIcon(a6g);
												no6="Node6->";
											}
											else
											{
												Thread.sleep(2000);
												a6r=new ImageIcon(this.getClass().getResource("red.png"));
												a66.setIcon(a6r);
												no6="Node6->";
												cong(no6, e6);
												Thread.sleep(2000);
												a7g=new ImageIcon(this.getClass().getResource("green.png"));
												a77.setIcon(a7g);
												no7="Node7->";
											}
											
										}
									}
									else
									{
										if(Integer.parseInt(e6)>length)
										{
											Thread.sleep(2000);
											a6g=new ImageIcon(this.getClass().getResource("green.png"));
											a66.setIcon(a6g);
											no6="Node6->";
										}
										else
										{
											Thread.sleep(2000);
											a6r=new ImageIcon(this.getClass().getResource("red.png"));
											a66.setIcon(a6r);
											no6="Node6->";
											cong(no6, e6);
											Thread.sleep(2000);
											a7g=new ImageIcon(this.getClass().getResource("green.png"));
											a77.setIcon(a7g);
											no7="Node7->";
										}
									}
								}
								else
								{
									Thread.sleep(2000);
									a4r=new ImageIcon(this.getClass().getResource("red.png"));
									a44.setIcon(a4r);
									no4="Node4->";
									cong(no4, e4);
									if(Integer.parseInt(e5)>length)
									{
										Thread.sleep(2000);
										a5g=new ImageIcon(this.getClass().getResource("green.png"));
										a55.setIcon(a5g);
										no5="Node5->";
										
										if(Integer.parseInt(dis6)<=Integer.parseInt(dis7))
										{
											if(Integer.parseInt(e6)>length)
											{
												Thread.sleep(2000);
												a6g=new ImageIcon(this.getClass().getResource("green.png"));
												a66.setIcon(a6g);
												no6="Node6->";
											}
											else
											{
												Thread.sleep(2000);
												a6r=new ImageIcon(this.getClass().getResource("red.png"));
												a66.setIcon(a6r);
												no6="Node6->";
												cong(no6, e6);
												Thread.sleep(2000);
												a7g=new ImageIcon(this.getClass().getResource("green.png"));
												a77.setIcon(a7g);
												no7="Node7->";
											}
										}
										else
										{
											Thread.sleep(2000);
											a7g=new ImageIcon(this.getClass().getResource("green.png"));
											a77.setIcon(a7g);
											no7="Node7->";
										}
									}
									else
									{
										Thread.sleep(2000);
										a5r=new ImageIcon(this.getClass().getResource("red.png"));
										a55.setIcon(a5r);
										no5="Node5->";
										cong(no5, e5);
										if(Integer.parseInt(e6)>length)
										{
											Thread.sleep(2000);
											a6g=new ImageIcon(this.getClass().getResource("green.png"));
											a66.setIcon(a6g);
											no6="Node6->";
										}
										else
										{
											Thread.sleep(2000);
											a6r=new ImageIcon(this.getClass().getResource("red.png"));
											a66.setIcon(a6r);
											no6="Node6->";
											cong(no6, e6);
											Thread.sleep(2000);
											a7g=new ImageIcon(this.getClass().getResource("green.png"));
											a77.setIcon(a7g);
											no7="Node7->";
										}
										
									}
									
								}
							}
						}
						else
						{
							Thread.sleep(2000);
							a2r=new ImageIcon(this.getClass().getResource("red.png"));
							a22.setIcon(a2r);
							no2="Node2->";
							cong(no2, e2);
							if(Integer.parseInt(e3)>length)
							{
								Thread.sleep(2000);
								a3g=new ImageIcon(this.getClass().getResource("green.png"));
								a33.setIcon(a3g);
								no3="Node3->";
								
								if(Integer.parseInt(dis4)<=Integer.parseInt(dis5))
								{
									if(Integer.parseInt(e4)>length)
									{
										Thread.sleep(2000);
										a4g=new ImageIcon(this.getClass().getResource("green.png"));
										a44.setIcon(a4g);
										no4="Node4->";
										
										if(Integer.parseInt(dis5)<=Integer.parseInt(dis6))
										{
											if(Integer.parseInt(e5)>length)
											{
												Thread.sleep(2000);
												a5g=new ImageIcon(this.getClass().getResource("green.png"));
												a55.setIcon(a5g);
												no5="Node5->";
												
												if(Integer.parseInt(dis6)<=Integer.parseInt(dis7))
												{
													if(Integer.parseInt(e6)>length)
													{
														Thread.sleep(2000);
														a6g=new ImageIcon(this.getClass().getResource("green.png"));
														a66.setIcon(a6g);
														no6="Node6->";
													}
													else
													{
														Thread.sleep(2000);
														a6r=new ImageIcon(this.getClass().getResource("red.png"));
														a66.setIcon(a6r);
														no6="Node6->";
														cong(no6, e6);
														Thread.sleep(2000);
														a7g=new ImageIcon(this.getClass().getResource("green.png"));
														a77.setIcon(a7g);
														no7="Node7->";
													}
												}
												else
												{
													Thread.sleep(2000);
													a7g=new ImageIcon(this.getClass().getResource("green.png"));
													a77.setIcon(a7g);
													no7="Node7->";
												}
											}
											else
											{
												Thread.sleep(2000);
												a5r=new ImageIcon(this.getClass().getResource("red.png"));
												a55.setIcon(a5r);
												no5="Node5->";
												cong(no5, e5);
												if(Integer.parseInt(e6)>length)
												{
													Thread.sleep(2000);
													a6g=new ImageIcon(this.getClass().getResource("green.png"));
													a66.setIcon(a6g);
													no6="Node6->";
												}
												else
												{
													Thread.sleep(2000);
													a6r=new ImageIcon(this.getClass().getResource("red.png"));
													a66.setIcon(a6r);
													no6="Node6->";
													cong(no6, e6);
													Thread.sleep(2000);
													a7g=new ImageIcon(this.getClass().getResource("green.png"));
													a77.setIcon(a7g);
													no7="Node7->";
												}
												
											}
										}
										else
										{
											if(Integer.parseInt(e6)>length)
											{
												Thread.sleep(2000);
												a6g=new ImageIcon(this.getClass().getResource("green.png"));
												a66.setIcon(a6g);
												no6="Node6->";
											}
											else
											{
												
												Thread.sleep(2000);
												a6r=new ImageIcon(this.getClass().getResource("red.png"));
												a66.setIcon(a6r);
												no6="Node6->";
												cong(no6, e6);
												Thread.sleep(2000);
												a7g=new ImageIcon(this.getClass().getResource("green.png"));
												a77.setIcon(a7g);
												no7="Node7->";
											}
										}
									}
									else
									{
										Thread.sleep(2000);
										a4r=new ImageIcon(this.getClass().getResource("red.png"));
										a44.setIcon(a4r);
										no4="Node4->";
										cong(no4, e4);
										if(Integer.parseInt(e5)>length)
										{
											Thread.sleep(2000);
											a5g=new ImageIcon(this.getClass().getResource("green.png"));
											a55.setIcon(a5g);
											no5="Node5->";
											
											if(Integer.parseInt(dis6)<=Integer.parseInt(dis7))
											{
												if(Integer.parseInt(e6)>length)
												{
													Thread.sleep(2000);
													a6g=new ImageIcon(this.getClass().getResource("green.png"));
													a66.setIcon(a6g);
													no6="Node6->";
												}
												else
												{
													Thread.sleep(2000);
													a6r=new ImageIcon(this.getClass().getResource("red.png"));
													a66.setIcon(a6r);
													no6="Node6->";
													cong(no6, e6);
													Thread.sleep(2000);
													a7g=new ImageIcon(this.getClass().getResource("green.png"));
													a77.setIcon(a7g);
													no7="Node7->";
												}
											}
											else
											{
												Thread.sleep(2000);
												a7g=new ImageIcon(this.getClass().getResource("green.png"));
												a77.setIcon(a7g);
												no7="Node7->";
											}
										}
										else
										{
											Thread.sleep(2000);
											a5r=new ImageIcon(this.getClass().getResource("red.png"));
											a55.setIcon(a5r);
											no5="Node5->";
											cong(no5, e5);
											if(Integer.parseInt(e6)>length)
											{
												Thread.sleep(2000);
												a6g=new ImageIcon(this.getClass().getResource("green.png"));
												a66.setIcon(a6g);
												no6="Node6->";
											}
											else
											{
												Thread.sleep(2000);
												a6r=new ImageIcon(this.getClass().getResource("red.png"));
												a66.setIcon(a6r);
												no6="Node6->";
												cong(no6, e6);
												Thread.sleep(2000);
												a7g=new ImageIcon(this.getClass().getResource("green.png"));
												a77.setIcon(a7g);
												no7="Node7->";
											}
											
										}
										
									}
								}
								else
								{
									if(Integer.parseInt(e5)>length)
									{
										Thread.sleep(2000);
										a5g=new ImageIcon(this.getClass().getResource("green.png"));
										a55.setIcon(a5g);
										no5="Node5->";
										
										if(Integer.parseInt(dis6)<=Integer.parseInt(dis7))
										{
											if(Integer.parseInt(e6)>length)
											{
												Thread.sleep(2000);
												a6g=new ImageIcon(this.getClass().getResource("green.png"));
												a66.setIcon(a6g);
												no6="Node6->";
											}
											else
											{
												Thread.sleep(2000);
												a6r=new ImageIcon(this.getClass().getResource("red.png"));
												a66.setIcon(a6r);
												no6="Node6->";
												cong(no6, e6);
												Thread.sleep(2000);
												a7g=new ImageIcon(this.getClass().getResource("green.png"));
												a77.setIcon(a7g);
												no7="Node7->";
											}
										}
										else
										{
											Thread.sleep(2000);
											a7g=new ImageIcon(this.getClass().getResource("green.png"));
											a77.setIcon(a7g);
											no7="Node7->";
										}
									}
									else
									{
										Thread.sleep(2000);
										a5r=new ImageIcon(this.getClass().getResource("red.png"));
										a55.setIcon(a5r);
										no5="Node5->";
										cong(no5, e5);
										if(Integer.parseInt(e6)>length)
										{
											Thread.sleep(2000);
											a6g=new ImageIcon(this.getClass().getResource("green.png"));
											a66.setIcon(a6g);
											no6="Node6->";
										}
										else
										{
											Thread.sleep(2000);
											a6r=new ImageIcon(this.getClass().getResource("red.png"));
											a66.setIcon(a6r);
											no6="Node6->";
											cong(no6, e6);
											Thread.sleep(2000);
											a7g=new ImageIcon(this.getClass().getResource("green.png"));
											a77.setIcon(a7g);
											no7="Node7->";
										}
										
									}
								}
							}
							else
							{
								Thread.sleep(2000);
								a3r=new ImageIcon(this.getClass().getResource("red.png"));
								a33.setIcon(a3r);
								no3="Node3->";
								cong(no3, e3);
								if(Integer.parseInt(e4)>length)
								{
									Thread.sleep(2000);
									a4g=new ImageIcon(this.getClass().getResource("green.png"));
									a44.setIcon(a4g);
									no4="Node4->";
									
									if(Integer.parseInt(dis5)<=Integer.parseInt(dis6))
									{
										if(Integer.parseInt(e5)>length)
										{
											Thread.sleep(2000);
											a5g=new ImageIcon(this.getClass().getResource("green.png"));
											a55.setIcon(a5g);
											no5="Node5->";
											
											if(Integer.parseInt(dis6)<=Integer.parseInt(dis7))
											{
												if(Integer.parseInt(e6)>length)
												{
													Thread.sleep(2000);
													a6g=new ImageIcon(this.getClass().getResource("green.png"));
													a66.setIcon(a6g);
													no6="Node6->";
												}
												else
												{
													Thread.sleep(2000);
													a6r=new ImageIcon(this.getClass().getResource("red.png"));
													a66.setIcon(a6r);
													no6="Node6->";
													cong(no6, e6);
													Thread.sleep(2000);
													a7g=new ImageIcon(this.getClass().getResource("green.png"));
													a77.setIcon(a7g);
													no7="Node7->";
												}
											}
											else
											{
												Thread.sleep(2000);
												a7g=new ImageIcon(this.getClass().getResource("green.png"));
												a77.setIcon(a7g);
												no7="Node7->";
											}
										}
										else
										{
											Thread.sleep(2000);
											a5r=new ImageIcon(this.getClass().getResource("red.png"));
											a55.setIcon(a5r);
											no5="Node5->";
											cong(no5, e5);
											if(Integer.parseInt(e6)>length)
											{
												Thread.sleep(2000);
												a6g=new ImageIcon(this.getClass().getResource("green.png"));
												a66.setIcon(a6g);
												no6="Node6->";
											}
											else
											{
												Thread.sleep(2000);
												a6r=new ImageIcon(this.getClass().getResource("red.png"));
												a66.setIcon(a6r);
												no6="Node6->";
												cong(no6, e6);
												Thread.sleep(2000);
												a7g=new ImageIcon(this.getClass().getResource("green.png"));
												a77.setIcon(a7g);
												no7="Node7->";
											}
											
										}
									}
									else
									{
										if(Integer.parseInt(e6)>length)
										{
											Thread.sleep(2000);
											a6g=new ImageIcon(this.getClass().getResource("green.png"));
											a66.setIcon(a6g);
											no6="Node6->";
										}
										else
										{
											Thread.sleep(2000);
											a6r=new ImageIcon(this.getClass().getResource("red.png"));
											a66.setIcon(a6r);
											no6="Node6->";
											cong(no6, e6);
											Thread.sleep(2000);
											a7g=new ImageIcon(this.getClass().getResource("green.png"));
											a77.setIcon(a7g);
											no7="Node7->";
										}
									}
								}
								else
								{
									Thread.sleep(2000);
									a4r=new ImageIcon(this.getClass().getResource("red.png"));
									a44.setIcon(a4r);
									no4="Node4->";
									cong(no4, e4);
									if(Integer.parseInt(e5)>length)
									{
										Thread.sleep(2000);
										a5g=new ImageIcon(this.getClass().getResource("green.png"));
										a55.setIcon(a5g);
										no5="Node5->";
										
										if(Integer.parseInt(dis6)<=Integer.parseInt(dis7))
										{
											if(Integer.parseInt(e6)>length)
											{
												Thread.sleep(2000);
												a6g=new ImageIcon(this.getClass().getResource("green.png"));
												a66.setIcon(a6g);
												no6="Node6->";
											}
											else
											{
												Thread.sleep(2000);
												a6r=new ImageIcon(this.getClass().getResource("red.png"));
												a66.setIcon(a6r);
												no6="Node6->";
												cong(no6, e6);
												Thread.sleep(2000);
												a7g=new ImageIcon(this.getClass().getResource("green.png"));
												a77.setIcon(a7g);
												no7="Node7->";
											}
										}
										else
										{
											Thread.sleep(2000);
											a7g=new ImageIcon(this.getClass().getResource("green.png"));
											a77.setIcon(a7g);
											no7="Node7->";
										}
									}
									else
									{
										Thread.sleep(2000);
										a5r=new ImageIcon(this.getClass().getResource("red.png"));
										a55.setIcon(a5r);
										no5="Node5->";
										cong(no5, e5);
										if(Integer.parseInt(e6)>length)
										{
											Thread.sleep(2000);
											a6g=new ImageIcon(this.getClass().getResource("green.png"));
											a66.setIcon(a6g);
											no6="Node6->";
										}
										else
										{
											Thread.sleep(2000);
											a6r=new ImageIcon(this.getClass().getResource("red.png"));
											a66.setIcon(a6r);
											no6="Node6->";
											cong(no6, e6);
											Thread.sleep(2000);
											a7g=new ImageIcon(this.getClass().getResource("green.png"));
											a77.setIcon(a7g);
											no7="Node7->";
										}
										
									}
									
								}
							}
						}
					}
					else
					{
						if(Integer.parseInt(e3)>length)
						{
							Thread.sleep(2000);
							a3g=new ImageIcon(this.getClass().getResource("green.png"));
							a33.setIcon(a3g);
							no3="Node3->";
							
							if(Integer.parseInt(dis4)<=Integer.parseInt(dis5))
							{
								if(Integer.parseInt(e4)>length)
								{
									Thread.sleep(2000);
									a4g=new ImageIcon(this.getClass().getResource("green.png"));
									a44.setIcon(a4g);
									no4="Node4->";
									
									if(Integer.parseInt(dis5)<=Integer.parseInt(dis6))
									{
										if(Integer.parseInt(e5)>length)
										{
											Thread.sleep(2000);
											a5g=new ImageIcon(this.getClass().getResource("green.png"));
											a55.setIcon(a5g);
											no5="Node5->";
											
											if(Integer.parseInt(dis6)<=Integer.parseInt(dis7))
											{
												if(Integer.parseInt(e6)>length)
												{
													Thread.sleep(2000);
													a6g=new ImageIcon(this.getClass().getResource("green.png"));
													a66.setIcon(a6g);
													no6="Node6->";
												}
												else
												{
													Thread.sleep(2000);
													a6r=new ImageIcon(this.getClass().getResource("red.png"));
													a66.setIcon(a6r);
													no6="Node6->";
													cong(no6, e6);
													Thread.sleep(2000);
													a7g=new ImageIcon(this.getClass().getResource("green.png"));
													a77.setIcon(a7g);
													no7="Node7->";
												}
											}
											else
											{
												Thread.sleep(2000);
												a7g=new ImageIcon(this.getClass().getResource("green.png"));
												a77.setIcon(a7g);
												no7="Node7->";
											}
										}
										else
										{
											Thread.sleep(2000);
											a5r=new ImageIcon(this.getClass().getResource("red.png"));
											a55.setIcon(a5r);
											no5="Node5->";
											cong(no5, e5);
											if(Integer.parseInt(e6)>length)
											{
												Thread.sleep(2000);
												a6g=new ImageIcon(this.getClass().getResource("green.png"));
												a66.setIcon(a6g);
												no6="Node6->";
											}
											else
											{
												Thread.sleep(2000);
												a6r=new ImageIcon(this.getClass().getResource("red.png"));
												a66.setIcon(a6r);
												no6="Node6->";
												cong(no6, e6);
												Thread.sleep(2000);
												a7g=new ImageIcon(this.getClass().getResource("green.png"));
												a77.setIcon(a7g);
												no7="Node7->";
											}
											
										}
									}
									else
									{
										if(Integer.parseInt(e6)>length)
										{
											Thread.sleep(2000);
											a6g=new ImageIcon(this.getClass().getResource("green.png"));
											a66.setIcon(a6g);
											no6="Node6->";
										}
										else
										{
											Thread.sleep(2000);
											a6r=new ImageIcon(this.getClass().getResource("red.png"));
											a66.setIcon(a6r);
											no6="Node6->";
											cong(no6, e6);
											Thread.sleep(2000);
											a7g=new ImageIcon(this.getClass().getResource("green.png"));
											a77.setIcon(a7g);
											no7="Node7->";
										}
									}
								}
								else
								{
									Thread.sleep(2000);
									a4r=new ImageIcon(this.getClass().getResource("red.png"));
									a44.setIcon(a4r);
									no4="Node4->";
									cong(no4, e4);
									if(Integer.parseInt(e5)>length)
									{
										Thread.sleep(2000);
										a5g=new ImageIcon(this.getClass().getResource("green.png"));
										a55.setIcon(a5g);
										no5="Node5->";
										
										if(Integer.parseInt(dis6)<=Integer.parseInt(dis7))
										{
											if(Integer.parseInt(e6)>length)
											{
												Thread.sleep(2000);
												a6g=new ImageIcon(this.getClass().getResource("green.png"));
												a66.setIcon(a6g);
												no6="Node6->";
											}
											else
											{
												Thread.sleep(2000);
												a6r=new ImageIcon(this.getClass().getResource("red.png"));
												a66.setIcon(a6r);
												no6="Node6->";
												cong(no6, e6);
												Thread.sleep(2000);
												a7g=new ImageIcon(this.getClass().getResource("green.png"));
												a77.setIcon(a7g);
												no7="Node7->";
											}
										}
										else
										{
											Thread.sleep(2000);
											a7g=new ImageIcon(this.getClass().getResource("green.png"));
											a77.setIcon(a7g);
											no7="Node7->";
										}
									}
									else
									{
										Thread.sleep(2000);
										a5r=new ImageIcon(this.getClass().getResource("red.png"));
										a55.setIcon(a5r);
										no5="Node5->";
										cong(no5, e5);
										if(Integer.parseInt(e6)>length)
										{
											Thread.sleep(2000);
											a6g=new ImageIcon(this.getClass().getResource("green.png"));
											a66.setIcon(a6g);
											no6="Node6->";
										}
										else
										{
											Thread.sleep(2000);
											a6r=new ImageIcon(this.getClass().getResource("red.png"));
											a66.setIcon(a6r);
											no6="Node6->";
											cong(no6, e6);
											Thread.sleep(2000);
											a7g=new ImageIcon(this.getClass().getResource("green.png"));
											a77.setIcon(a7g);
											no7="Node7->";
										}
										
									}
									
								}
							}
							else
							{
								if(Integer.parseInt(e5)>length)
								{
									Thread.sleep(2000);
									a5g=new ImageIcon(this.getClass().getResource("green.png"));
									a55.setIcon(a5g);
									no5="Node5->";
									
									if(Integer.parseInt(dis6)<=Integer.parseInt(dis7))
									{
										if(Integer.parseInt(e6)>length)
										{
											Thread.sleep(2000);
											a6g=new ImageIcon(this.getClass().getResource("green.png"));
											a66.setIcon(a6g);
											no6="Node6->";
										}
										else
										{
											Thread.sleep(2000);
											a6r=new ImageIcon(this.getClass().getResource("red.png"));
											a66.setIcon(a6r);
											no6="Node6->";
											cong(no6, e6);
											Thread.sleep(2000);
											a7g=new ImageIcon(this.getClass().getResource("green.png"));
											a77.setIcon(a7g);
											no7="Node7->";
										}
									}
									else
									{
										Thread.sleep(2000);
										a7g=new ImageIcon(this.getClass().getResource("green.png"));
										a77.setIcon(a7g);
										no7="Node7->";
									}
								}
								else
								{
									Thread.sleep(2000);
									a5r=new ImageIcon(this.getClass().getResource("red.png"));
									a55.setIcon(a5r);
									no5="Node5->";
									cong(no5, e5);
									if(Integer.parseInt(e6)>length)
									{
										Thread.sleep(2000);
										a6g=new ImageIcon(this.getClass().getResource("green.png"));
										a66.setIcon(a6g);
										no6="Node6->";
									}
									else
									{
										Thread.sleep(2000);
										a6r=new ImageIcon(this.getClass().getResource("red.png"));
										a66.setIcon(a6r);
										no6="Node6->";
										cong(no6, e6);
										Thread.sleep(2000);
										a7g=new ImageIcon(this.getClass().getResource("green.png"));
										a77.setIcon(a7g);
										no7="Node7->";
									}
									
								}
							}
						}
						else
						{
							Thread.sleep(2000);
							a3r=new ImageIcon(this.getClass().getResource("red.png"));
							a33.setIcon(a3r);
							no3="Node3->";
							cong(no3, e3);
							if(Integer.parseInt(e4)>length)
							{
								Thread.sleep(2000);
								a4g=new ImageIcon(this.getClass().getResource("green.png"));
								a44.setIcon(a4g);
								no4="Node4->";
								
								if(Integer.parseInt(dis5)<=Integer.parseInt(dis6))
								{
									if(Integer.parseInt(e5)>length)
									{
										Thread.sleep(2000);
										a5g=new ImageIcon(this.getClass().getResource("green.png"));
										a55.setIcon(a5g);
										no5="Node5->";
										
										if(Integer.parseInt(dis6)<=Integer.parseInt(dis7))
										{
											if(Integer.parseInt(e6)>length)
											{
												Thread.sleep(2000);
												a6g=new ImageIcon(this.getClass().getResource("green.png"));
												a66.setIcon(a6g);
												no6="Node6->";
											}
											else
											{
												Thread.sleep(2000);
												a6r=new ImageIcon(this.getClass().getResource("red.png"));
												a66.setIcon(a6r);
												no6="Node6->";
												cong(no6, e6);
												Thread.sleep(2000);
												a7g=new ImageIcon(this.getClass().getResource("green.png"));
												a77.setIcon(a7g);
												no7="Node7->";
											}
										}
										else
										{
											Thread.sleep(2000);
											a7g=new ImageIcon(this.getClass().getResource("green.png"));
											a77.setIcon(a7g);
											no7="Node7->";
										}
									}
									else
									{
										Thread.sleep(2000);
										a5r=new ImageIcon(this.getClass().getResource("red.png"));
										a55.setIcon(a5r);
										no5="Node5->";
										cong(no5, e5);
										if(Integer.parseInt(e6)>length)
										{
											Thread.sleep(2000);
											a6g=new ImageIcon(this.getClass().getResource("green.png"));
											a66.setIcon(a6g);
											no6="Node6->";
										}
										else
										{
											Thread.sleep(2000);
											a6r=new ImageIcon(this.getClass().getResource("red.png"));
											a66.setIcon(a6r);
											no6="Node6->";
											cong(no6, e6);
											Thread.sleep(2000);
											a7g=new ImageIcon(this.getClass().getResource("green.png"));
											a77.setIcon(a7g);
											no7="Node7->";
										}
										
									}
								}
								else
								{
									if(Integer.parseInt(e6)>length)
									{
										Thread.sleep(2000);
										a6g=new ImageIcon(this.getClass().getResource("green.png"));
										a66.setIcon(a6g);
										no6="Node6->";
									}
									else
									{
										Thread.sleep(2000);
										a6r=new ImageIcon(this.getClass().getResource("red.png"));
										a66.setIcon(a6r);
										no6="Node6->";
										cong(no6, e6);
										Thread.sleep(2000);
										a7g=new ImageIcon(this.getClass().getResource("green.png"));
										a77.setIcon(a7g);
										no7="Node7->";
									}
								}
							}
							else
							{
								Thread.sleep(2000);
								a4r=new ImageIcon(this.getClass().getResource("red.png"));
								a44.setIcon(a4r);
								no4="Node4->";
								cong(no4, e4);
								if(Integer.parseInt(e5)>length)
								{
									Thread.sleep(2000);
									a5g=new ImageIcon(this.getClass().getResource("green.png"));
									a55.setIcon(a5g);
									no5="Node5->";
									
									if(Integer.parseInt(dis6)<=Integer.parseInt(dis7))
									{
										if(Integer.parseInt(e6)>length)
										{
											Thread.sleep(2000);
											a6g=new ImageIcon(this.getClass().getResource("green.png"));
											a66.setIcon(a6g);
											no6="Node6->";
										}
										else
										{
											Thread.sleep(2000);
											a6r=new ImageIcon(this.getClass().getResource("red.png"));
											a66.setIcon(a6r);
											no6="Node6->";
											
											cong(no6, e6);
											
											Thread.sleep(2000);
											a7g=new ImageIcon(this.getClass().getResource("green.png"));
											a77.setIcon(a7g);
											no7="Node7->";
										}
									}
									else
									{
										Thread.sleep(2000);
										a7g=new ImageIcon(this.getClass().getResource("green.png"));
										a77.setIcon(a7g);
										no7="Node7->";
									}
								}
								else
								{
									Thread.sleep(2000);
									a5r=new ImageIcon(this.getClass().getResource("red.png"));
									a55.setIcon(a5r);
									no5="Node5->";
									
									cong(no5, e5);
									
									if(Integer.parseInt(e6)>length)
									{
										Thread.sleep(2000);
										a6g=new ImageIcon(this.getClass().getResource("green.png"));
										a66.setIcon(a6g);
										no6="Node6->";
									}
									else
									{
										
										Thread.sleep(2000);
										a6r=new ImageIcon(this.getClass().getResource("red.png"));
										a66.setIcon(a6r);
										no6="Node6->";
										
										cong(no6, e6);
										
										Thread.sleep(2000);
										a7g=new ImageIcon(this.getClass().getResource("green.png"));
										a77.setIcon(a7g);
										no7="Node7->";
									}
									
								}
								
							}
						}
					}
					
					
					
					

					Thread.sleep(2000);
					b1g=new ImageIcon(this.getClass().getResource("green.png"));
					b11.setIcon(b1g);
					no8="Node8->";
					
					if(Integer.parseInt(dis9)<=Integer.parseInt(dis10))
					{
						if(Integer.parseInt(e9)>length)
						{
							Thread.sleep(2000);
							b2g=new ImageIcon(this.getClass().getResource("green.png"));
							b22.setIcon(b2g);
							no9="Node9->";
							
							if(Integer.parseInt(dis10)<=Integer.parseInt(dis11))
							{
								if(Integer.parseInt(e10)>length)
								{
									Thread.sleep(2000);
									b3g=new ImageIcon(this.getClass().getResource("green.png"));
									b33.setIcon(b3g);
									no10="Node10->";
									
									if(Integer.parseInt(dis11)<=Integer.parseInt(dis12))
									{
										if(Integer.parseInt(e11)>length)
										{
											Thread.sleep(2000);
											b4g=new ImageIcon(this.getClass().getResource("green.png"));
											b44.setIcon(b4g);
											no11="Node11->";
											
											if(Integer.parseInt(dis12)<=Integer.parseInt(dis13))
											{
												if(Integer.parseInt(e12)>length)
												{
													Thread.sleep(2000);
													b5g=new ImageIcon(this.getClass().getResource("green.png"));
													a55.setIcon(b5g);
													no12="Node12->";
													
													if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
													{
														if(Integer.parseInt(e13)>length)
														{
															Thread.sleep(2000);
															b6g=new ImageIcon(this.getClass().getResource("green.png"));
															b66.setIcon(b6g);
															no13="Node13->";
														}
														else
														{
															Thread.sleep(2000);
															b6r=new ImageIcon(this.getClass().getResource("red.png"));
															b66.setIcon(b6r);
															no13="Node13->";
															cong(no13, e13);
															Thread.sleep(2000);
															b7g=new ImageIcon(this.getClass().getResource("green.png"));
															b77.setIcon(b7g);
															no14="Node14->";
														}
													}
													else
													{
														Thread.sleep(2000);
														b7g=new ImageIcon(this.getClass().getResource("green.png"));
														b77.setIcon(b7g);
														no14="Node14->";
													}
												}
												else
												{
													Thread.sleep(2000);
													b5r=new ImageIcon(this.getClass().getResource("red.png"));
													a55.setIcon(b5r);
													no12="Node12->";
													cong(no12, e12);
													if(Integer.parseInt(e13)>length)
													{
														Thread.sleep(2000);
														b6g=new ImageIcon(this.getClass().getResource("green.png"));
														b66.setIcon(b6g);
														no13="Node13->";
													}
													else
													{
														Thread.sleep(2000);
														b6r=new ImageIcon(this.getClass().getResource("red.png"));
														b66.setIcon(b6r);
														no13="Node13->";
														cong(no13, e13);
														Thread.sleep(2000);
														b7g=new ImageIcon(this.getClass().getResource("green.png"));
														b77.setIcon(b7g);
														no14="Node14->";
													}
													
												}
											}
											else
											{
												if(Integer.parseInt(e13)>length)
												{
													Thread.sleep(2000);
													b6g=new ImageIcon(this.getClass().getResource("green.png"));
													b66.setIcon(b6g);
													no13="Node13->";
												}
												else
												{
													Thread.sleep(2000);
													b6r=new ImageIcon(this.getClass().getResource("red.png"));
													b66.setIcon(b6r);
													no13="Node13->";
													cong(no13, e13);
													Thread.sleep(2000);
													b7g=new ImageIcon(this.getClass().getResource("green.png"));
													b77.setIcon(b7g);
													no14="Node14->";
												}
											}
										}
										else
										{
											Thread.sleep(2000);
											b4r=new ImageIcon(this.getClass().getResource("red.png"));
											b44.setIcon(b4r);
											no11="Node11->";
											cong(no11, e11);
											if(Integer.parseInt(e12)>length)
											{
												Thread.sleep(2000);
												b5g=new ImageIcon(this.getClass().getResource("green.png"));
												a55.setIcon(b5g);
												no12="Node12->";
												
												if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
												{
													if(Integer.parseInt(e13)>length)
													{
														Thread.sleep(2000);
														b6g=new ImageIcon(this.getClass().getResource("green.png"));
														b66.setIcon(b6g);
														no13="Node13->";
													}
													else
													{
														Thread.sleep(2000);
														b6r=new ImageIcon(this.getClass().getResource("red.png"));
														b66.setIcon(b6r);
														no13="Node13->";
														cong(no13, e13);
														Thread.sleep(2000);
														b7g=new ImageIcon(this.getClass().getResource("green.png"));
														b77.setIcon(b7g);
														no14="Node14->";
													}
												}
												else
												{
													Thread.sleep(2000);
													b7g=new ImageIcon(this.getClass().getResource("green.png"));
													b77.setIcon(b7g);
													no14="Node14->";
												}
											}
											else
											{
												Thread.sleep(2000);
												b5r=new ImageIcon(this.getClass().getResource("red.png"));
												a55.setIcon(b5r);
												no12="Node12->";
												cong(no12, e12);
												if(Integer.parseInt(e13)>length)
												{
													Thread.sleep(2000);
													b6g=new ImageIcon(this.getClass().getResource("green.png"));
													b66.setIcon(b6g);
													no13="Node13->";
												}
												else
												{
													Thread.sleep(2000);
													b6r=new ImageIcon(this.getClass().getResource("red.png"));
													b66.setIcon(b6r);
													no13="Node13->";
													cong(no13, e13);
													Thread.sleep(2000);
													b7g=new ImageIcon(this.getClass().getResource("green.png"));
													b77.setIcon(b7g);
													no14="Node14->";
												}
												
											}
											
										}
									}
									else
									{
										if(Integer.parseInt(e12)>length)
										{
											Thread.sleep(2000);
											b5g=new ImageIcon(this.getClass().getResource("green.png"));
											a55.setIcon(b5g);
											no12="Node12->";
											
											if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
											{
												if(Integer.parseInt(e13)>length)
												{
													Thread.sleep(2000);
													b6g=new ImageIcon(this.getClass().getResource("green.png"));
													b66.setIcon(b6g);
													no13="Node13->";
												}
												else
												{
													Thread.sleep(2000);
													b6r=new ImageIcon(this.getClass().getResource("red.png"));
													b66.setIcon(b6r);
													no13="Node13->";
													cong(no13, e13);
													Thread.sleep(2000);
													b7g=new ImageIcon(this.getClass().getResource("green.png"));
													b77.setIcon(b7g);
													no14="Node14->";
												}
											}
											else
											{
												Thread.sleep(2000);
												b7g=new ImageIcon(this.getClass().getResource("green.png"));
												b77.setIcon(b7g);
												no14="Node14->";
											}
										}
										else
										{
											Thread.sleep(2000);
											b5r=new ImageIcon(this.getClass().getResource("red.png"));
											a55.setIcon(b5r);
											no12="Node12->";
											cong(no12, e12);
											if(Integer.parseInt(e13)>length)
											{
												Thread.sleep(2000);
												b6g=new ImageIcon(this.getClass().getResource("green.png"));
												b66.setIcon(b6g);
												no13="Node13->";
											}
											else
											{
												Thread.sleep(2000);
												b6r=new ImageIcon(this.getClass().getResource("red.png"));
												b66.setIcon(b6r);
												no13="Node13->";
												cong(no13, e13);
												Thread.sleep(2000);
												b7g=new ImageIcon(this.getClass().getResource("green.png"));
												b77.setIcon(b7g);
												no14="Node14->";
											}
											
										}
									}
								}
								else
								{
									Thread.sleep(2000);
									b3r=new ImageIcon(this.getClass().getResource("red.png"));
									b33.setIcon(b3r);
									no10="Node10->";
									cong(no10, e10);
									if(Integer.parseInt(e11)>length)
									{
										Thread.sleep(2000);
										b4g=new ImageIcon(this.getClass().getResource("green.png"));
										b44.setIcon(b4g);
										no11="Node11->";
										
										if(Integer.parseInt(dis12)<=Integer.parseInt(dis13))
										{
											if(Integer.parseInt(e12)>length)
											{
												Thread.sleep(2000);
												b5g=new ImageIcon(this.getClass().getResource("green.png"));
												a55.setIcon(b5g);
												no12="Node12->";
												
												if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
												{
													if(Integer.parseInt(e13)>length)
													{
														Thread.sleep(2000);
														b6g=new ImageIcon(this.getClass().getResource("green.png"));
														b66.setIcon(b6g);
														no13="Node13->";
													}
													else
													{
														Thread.sleep(2000);
														b6r=new ImageIcon(this.getClass().getResource("red.png"));
														b66.setIcon(b6r);
														no13="Node13->";
														cong(no13, e13);
														Thread.sleep(2000);
														b7g=new ImageIcon(this.getClass().getResource("green.png"));
														b77.setIcon(b7g);
														no14="Node14->";
													}
												}
												else
												{
													Thread.sleep(2000);
													b7g=new ImageIcon(this.getClass().getResource("green.png"));
													b77.setIcon(b7g);
													no14="Node14->";
												}
											}
											else
											{
												Thread.sleep(2000);
												b5r=new ImageIcon(this.getClass().getResource("red.png"));
												a55.setIcon(b5r);
												no12="Node12->";
												cong(no12, e12);
												if(Integer.parseInt(e13)>length)
												{
													Thread.sleep(2000);
													b6g=new ImageIcon(this.getClass().getResource("green.png"));
													b66.setIcon(b6g);
													no13="Node13->";
												}
												else
												{
													Thread.sleep(2000);
													b6r=new ImageIcon(this.getClass().getResource("red.png"));
													b66.setIcon(b6r);
													no13="Node13->";
													cong(no13, e13);
													Thread.sleep(2000);
													b7g=new ImageIcon(this.getClass().getResource("green.png"));
													b77.setIcon(b7g);
													no14="Node14->";
												}
												
											}
										}
										else
										{
											if(Integer.parseInt(e13)>length)
											{
												Thread.sleep(2000);
												b6g=new ImageIcon(this.getClass().getResource("green.png"));
												b66.setIcon(b6g);
												no13="Node13->";
											}
											else
											{
												Thread.sleep(2000);
												b6r=new ImageIcon(this.getClass().getResource("red.png"));
												b66.setIcon(b6r);
												no13="Node13->";
												cong(no13, e13);
												Thread.sleep(2000);
												b7g=new ImageIcon(this.getClass().getResource("green.png"));
												b77.setIcon(b7g);
												no14="Node14->";
											}
										}
									}
									else
									{
										Thread.sleep(2000);
										b4r=new ImageIcon(this.getClass().getResource("red.png"));
										b44.setIcon(b4r);
										no11="Node11->";
										cong(no11, e11);
										if(Integer.parseInt(e12)>length)
										{
											Thread.sleep(2000);
											b5g=new ImageIcon(this.getClass().getResource("green.png"));
											a55.setIcon(b5g);
											no12="Node12->";
											
											if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
											{
												if(Integer.parseInt(e13)>length)
												{
													Thread.sleep(2000);
													b6g=new ImageIcon(this.getClass().getResource("green.png"));
													b66.setIcon(b6g);
													no13="Node13->";
												}
												else
												{
													Thread.sleep(2000);
													b6r=new ImageIcon(this.getClass().getResource("red.png"));
													b66.setIcon(b6r);
													no13="Node13->";
													cong(no13, e13);
													Thread.sleep(2000);
													b7g=new ImageIcon(this.getClass().getResource("green.png"));
													b77.setIcon(b7g);
													no14="Node14->";
												}
											}
											else
											{
												Thread.sleep(2000);
												b7g=new ImageIcon(this.getClass().getResource("green.png"));
												b77.setIcon(b7g);
												no14="Node14->";
											}
										}
										else
										{
											Thread.sleep(2000);
											b5r=new ImageIcon(this.getClass().getResource("red.png"));
											a55.setIcon(b5r);
											no12="Node12->";
											cong(no12, e12);
											if(Integer.parseInt(e13)>length)
											{
												Thread.sleep(2000);
												b6g=new ImageIcon(this.getClass().getResource("green.png"));
												b66.setIcon(b6g);
												no13="Node13->";
											}
											else
											{
												Thread.sleep(2000);
												b6r=new ImageIcon(this.getClass().getResource("red.png"));
												b66.setIcon(b6r);
												no13="Node13->";
												cong(no13, e13);
												Thread.sleep(2000);
												b7g=new ImageIcon(this.getClass().getResource("green.png"));
												b77.setIcon(b7g);
												no14="Node14->";
											}
											
										}
										
									}
								}
							}
							else
							{
								if(Integer.parseInt(e11)>length)
								{
									Thread.sleep(2000);
									b4g=new ImageIcon(this.getClass().getResource("green.png"));
									b44.setIcon(b4g);
									no11="Node11->";
									
									if(Integer.parseInt(dis12)<=Integer.parseInt(dis13))
									{
										if(Integer.parseInt(e12)>length)
										{
											Thread.sleep(2000);
											b5g=new ImageIcon(this.getClass().getResource("green.png"));
											a55.setIcon(b5g);
											no12="Node12->";
											
											if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
											{
												if(Integer.parseInt(e13)>length)
												{
													Thread.sleep(2000);
													b6g=new ImageIcon(this.getClass().getResource("green.png"));
													b66.setIcon(b6g);
													no13="Node13->";
												}
												else
												{
													Thread.sleep(2000);
													b6r=new ImageIcon(this.getClass().getResource("red.png"));
													b66.setIcon(b6r);
													no13="Node13->";
													cong(no13, e13);
													Thread.sleep(2000);
													b7g=new ImageIcon(this.getClass().getResource("green.png"));
													b77.setIcon(b7g);
													no14="Node14->";
												}
											}
											else
											{
												Thread.sleep(2000);
												b7g=new ImageIcon(this.getClass().getResource("green.png"));
												b77.setIcon(b7g);
												no14="Node14->";
											}
										}
										else
										{
											Thread.sleep(2000);
											b5r=new ImageIcon(this.getClass().getResource("red.png"));
											a55.setIcon(b5r);
											no12="Node12->";
											cong(no12, e12);
											if(Integer.parseInt(e13)>length)
											{
												Thread.sleep(2000);
												b6g=new ImageIcon(this.getClass().getResource("green.png"));
												b66.setIcon(b6g);
												no13="Node13->";
											}
											else
											{
												Thread.sleep(2000);
												b6r=new ImageIcon(this.getClass().getResource("red.png"));
												b66.setIcon(b6r);
												no13="Node13->";
												cong(no13, e13);
												Thread.sleep(2000);
												b7g=new ImageIcon(this.getClass().getResource("green.png"));
												b77.setIcon(b7g);
												no14="Node14->";
											}
											
										}
									}
									else
									{
										if(Integer.parseInt(e13)>length)
										{
											Thread.sleep(2000);
											b6g=new ImageIcon(this.getClass().getResource("green.png"));
											b66.setIcon(b6g);
											no13="Node13->";
										}
										else
										{
											Thread.sleep(2000);
											b6r=new ImageIcon(this.getClass().getResource("red.png"));
											b66.setIcon(b6r);
											no13="Node13->";
											cong(no13, e13);
											Thread.sleep(2000);
											b7g=new ImageIcon(this.getClass().getResource("green.png"));
											b77.setIcon(b7g);
											no14="Node14->";
										}
									}
								}
								else
								{
									Thread.sleep(2000);
									b4r=new ImageIcon(this.getClass().getResource("red.png"));
									b44.setIcon(b4r);
									no11="Node11->";
									cong(no11, e11);
									if(Integer.parseInt(e12)>length)
									{
										Thread.sleep(2000);
										b5g=new ImageIcon(this.getClass().getResource("green.png"));
										a55.setIcon(b5g);
										no12="Node12->";
										
										if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
										{
											if(Integer.parseInt(e13)>length)
											{
												Thread.sleep(2000);
												b6g=new ImageIcon(this.getClass().getResource("green.png"));
												b66.setIcon(b6g);
												no13="Node13->";
											}
											else
											{
												Thread.sleep(2000);
												b6r=new ImageIcon(this.getClass().getResource("red.png"));
												b66.setIcon(b6r);
												no13="Node13->";
												cong(no13, e13);
												Thread.sleep(2000);
												b7g=new ImageIcon(this.getClass().getResource("green.png"));
												b77.setIcon(b7g);
												no14="Node14->";
											}
										}
										else
										{
											Thread.sleep(2000);
											b7g=new ImageIcon(this.getClass().getResource("green.png"));
											b77.setIcon(b7g);
											no14="Node14->";
										}
									}
									else
									{
										Thread.sleep(2000);
										b5r=new ImageIcon(this.getClass().getResource("red.png"));
										a55.setIcon(b5r);
										no12="Node12->";
										cong(no12, e12);
										if(Integer.parseInt(e13)>length)
										{
											Thread.sleep(2000);
											b6g=new ImageIcon(this.getClass().getResource("green.png"));
											b66.setIcon(b6g);
											no13="Node13->";
										}
										else
										{
											Thread.sleep(2000);
											b6r=new ImageIcon(this.getClass().getResource("red.png"));
											b66.setIcon(b6r);
											no13="Node13->";
											cong(no13, e13);
											Thread.sleep(2000);
											b7g=new ImageIcon(this.getClass().getResource("green.png"));
											b77.setIcon(b7g);
											no14="Node14->";
										}
										
									}
									
								}
							}
						}
						else
						{
							Thread.sleep(2000);
							b2r=new ImageIcon(this.getClass().getResource("red.png"));
							b22.setIcon(b2r);
							no9="Node9->";
							cong(no9, e9);
							if(Integer.parseInt(e10)>length)
							{
								Thread.sleep(2000);
								b3g=new ImageIcon(this.getClass().getResource("green.png"));
								b33.setIcon(b3g);
								no10="Node10->";
								
								if(Integer.parseInt(dis11)<=Integer.parseInt(dis12))
								{
									if(Integer.parseInt(e11)>length)
									{
										Thread.sleep(2000);
										b4g=new ImageIcon(this.getClass().getResource("green.png"));
										b44.setIcon(b4g);
										no11="Node11->";
										
										if(Integer.parseInt(dis12)<=Integer.parseInt(dis13))
										{
											if(Integer.parseInt(e12)>length)
											{
												Thread.sleep(2000);
												b5g=new ImageIcon(this.getClass().getResource("green.png"));
												a55.setIcon(b5g);
												no12="Node12->";
												
												if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
												{
													if(Integer.parseInt(e13)>length)
													{
														Thread.sleep(2000);
														b6g=new ImageIcon(this.getClass().getResource("green.png"));
														b66.setIcon(b6g);
														no13="Node13->";
													}
													else
													{
														Thread.sleep(2000);
														b6r=new ImageIcon(this.getClass().getResource("red.png"));
														b66.setIcon(b6r);
														no13="Node13->";
														cong(no13, e13);
														Thread.sleep(2000);
														b7g=new ImageIcon(this.getClass().getResource("green.png"));
														b77.setIcon(b7g);
														no14="Node14->";
													}
												}
												else
												{
													Thread.sleep(2000);
													b7g=new ImageIcon(this.getClass().getResource("green.png"));
													b77.setIcon(b7g);
													no14="Node14->";
												}
											}
											else
											{
												Thread.sleep(2000);
												b5r=new ImageIcon(this.getClass().getResource("red.png"));
												a55.setIcon(b5r);
												no12="Node12->";
												cong(no12, e12);
												if(Integer.parseInt(e13)>length)
												{
													Thread.sleep(2000);
													b6g=new ImageIcon(this.getClass().getResource("green.png"));
													b66.setIcon(b6g);
													no13="Node13->";
												}
												else
												{
													Thread.sleep(2000);
													b6r=new ImageIcon(this.getClass().getResource("red.png"));
													b66.setIcon(b6r);
													no13="Node13->";
													cong(no13, e13);
													Thread.sleep(2000);
													b7g=new ImageIcon(this.getClass().getResource("green.png"));
													b77.setIcon(b7g);
													no14="Node14->";
												}
												
											}
										}
										else
										{
											if(Integer.parseInt(e13)>length)
											{
												Thread.sleep(2000);
												b6g=new ImageIcon(this.getClass().getResource("green.png"));
												b66.setIcon(b6g);
												no13="Node13->";
											}
											else
											{
												
												Thread.sleep(2000);
												b6r=new ImageIcon(this.getClass().getResource("red.png"));
												b66.setIcon(b6r);
												no13="Node13->";
												cong(no13, e13);
												Thread.sleep(2000);
												b7g=new ImageIcon(this.getClass().getResource("green.png"));
												b77.setIcon(b7g);
												no14="Node14->";
											}
										}
									}
									else
									{
										Thread.sleep(2000);
										b4r=new ImageIcon(this.getClass().getResource("red.png"));
										b44.setIcon(b4r);
										no11="Node11->";
										cong(no11, e11);
										if(Integer.parseInt(e12)>length)
										{
											Thread.sleep(2000);
											b5g=new ImageIcon(this.getClass().getResource("green.png"));
											a55.setIcon(b5g);
											no12="Node12->";
											
											if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
											{
												if(Integer.parseInt(e13)>length)
												{
													Thread.sleep(2000);
													b6g=new ImageIcon(this.getClass().getResource("green.png"));
													b66.setIcon(b6g);
													no13="Node13->";
												}
												else
												{
													Thread.sleep(2000);
													b6r=new ImageIcon(this.getClass().getResource("red.png"));
													b66.setIcon(b6r);
													no13="Node13->";
													cong(no13, e13);
													Thread.sleep(2000);
													b7g=new ImageIcon(this.getClass().getResource("green.png"));
													b77.setIcon(b7g);
													no14="Node14->";
												}
											}
											else
											{
												Thread.sleep(2000);
												b7g=new ImageIcon(this.getClass().getResource("green.png"));
												b77.setIcon(b7g);
												no14="Node14->";
											}
										}
										else
										{
											Thread.sleep(2000);
											b5r=new ImageIcon(this.getClass().getResource("red.png"));
											a55.setIcon(b5r);
											no12="Node12->";
											cong(no12, e12);
											if(Integer.parseInt(e13)>length)
											{
												Thread.sleep(2000);
												b6g=new ImageIcon(this.getClass().getResource("green.png"));
												b66.setIcon(b6g);
												no13="Node13->";
											}
											else
											{
												Thread.sleep(2000);
												b6r=new ImageIcon(this.getClass().getResource("red.png"));
												b66.setIcon(b6r);
												no13="Node13->";
												cong(no13, e13);
												Thread.sleep(2000);
												b7g=new ImageIcon(this.getClass().getResource("green.png"));
												b77.setIcon(b7g);
												no14="Node14->";
											}
											
										}
										
									}
								}
								else
								{
									if(Integer.parseInt(e12)>length)
									{
										Thread.sleep(2000);
										b5g=new ImageIcon(this.getClass().getResource("green.png"));
										a55.setIcon(b5g);
										no12="Node12->";
										
										if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
										{
											if(Integer.parseInt(e13)>length)
											{
												Thread.sleep(2000);
												b6g=new ImageIcon(this.getClass().getResource("green.png"));
												b66.setIcon(b6g);
												no13="Node13->";
											}
											else
											{
												Thread.sleep(2000);
												b6r=new ImageIcon(this.getClass().getResource("red.png"));
												b66.setIcon(b6r);
												no13="Node13->";
												cong(no13, e13);
												Thread.sleep(2000);
												b7g=new ImageIcon(this.getClass().getResource("green.png"));
												b77.setIcon(b7g);
												no14="Node14->";
											}
										}
										else
										{
											Thread.sleep(2000);
											b7g=new ImageIcon(this.getClass().getResource("green.png"));
											b77.setIcon(b7g);
											no14="Node14->";
										}
									}
									else
									{
										Thread.sleep(2000);
										b5r=new ImageIcon(this.getClass().getResource("red.png"));
										a55.setIcon(b5r);
										no12="Node12->";
										cong(no12, e12);
										if(Integer.parseInt(e13)>length)
										{
											Thread.sleep(2000);
											b6g=new ImageIcon(this.getClass().getResource("green.png"));
											b66.setIcon(b6g);
											no13="Node13->";
										}
										else
										{
											Thread.sleep(2000);
											b6r=new ImageIcon(this.getClass().getResource("red.png"));
											b66.setIcon(b6r);
											no13="Node13->";
											cong(no13, e13);
											Thread.sleep(2000);
											b7g=new ImageIcon(this.getClass().getResource("green.png"));
											b77.setIcon(b7g);
											no14="Node14->";
										}
										
									}
								}
							}
							else
							{
								Thread.sleep(2000);
								b3r=new ImageIcon(this.getClass().getResource("red.png"));
								b33.setIcon(b3r);
								no10="Node10->";
								cong(no10, e10);
								if(Integer.parseInt(e11)>length)
								{
									Thread.sleep(2000);
									b4g=new ImageIcon(this.getClass().getResource("green.png"));
									b44.setIcon(b4g);
									no11="Node11->";
									
									if(Integer.parseInt(dis12)<=Integer.parseInt(dis13))
									{
										if(Integer.parseInt(e12)>length)
										{
											Thread.sleep(2000);
											b5g=new ImageIcon(this.getClass().getResource("green.png"));
											a55.setIcon(b5g);
											no12="Node12->";
											
											if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
											{
												if(Integer.parseInt(e13)>length)
												{
													Thread.sleep(2000);
													b6g=new ImageIcon(this.getClass().getResource("green.png"));
													b66.setIcon(b6g);
													no13="Node13->";
												}
												else
												{
													Thread.sleep(2000);
													b6r=new ImageIcon(this.getClass().getResource("red.png"));
													b66.setIcon(b6r);
													no13="Node13->";
													cong(no13, e13);
													Thread.sleep(2000);
													b7g=new ImageIcon(this.getClass().getResource("green.png"));
													b77.setIcon(b7g);
													no14="Node14->";
												}
											}
											else
											{
												Thread.sleep(2000);
												b7g=new ImageIcon(this.getClass().getResource("green.png"));
												b77.setIcon(b7g);
												no14="Node14->";
											}
										}
										else
										{
											Thread.sleep(2000);
											b5r=new ImageIcon(this.getClass().getResource("red.png"));
											a55.setIcon(b5r);
											no12="Node12->";
											cong(no12, e12);
											if(Integer.parseInt(e13)>length)
											{
												Thread.sleep(2000);
												b6g=new ImageIcon(this.getClass().getResource("green.png"));
												b66.setIcon(b6g);
												no13="Node13->";
											}
											else
											{
												Thread.sleep(2000);
												b6r=new ImageIcon(this.getClass().getResource("red.png"));
												b66.setIcon(b6r);
												no13="Node13->";
												cong(no13, e13);
												Thread.sleep(2000);
												b7g=new ImageIcon(this.getClass().getResource("green.png"));
												b77.setIcon(b7g);
												no14="Node14->";
											}
											
										}
									}
									else
									{
										if(Integer.parseInt(e13)>length)
										{
											Thread.sleep(2000);
											b6g=new ImageIcon(this.getClass().getResource("green.png"));
											b66.setIcon(b6g);
											no13="Node13->";
										}
										else
										{
											Thread.sleep(2000);
											b6r=new ImageIcon(this.getClass().getResource("red.png"));
											b66.setIcon(b6r);
											no13="Node13->";
											cong(no13, e13);
											Thread.sleep(2000);
											b7g=new ImageIcon(this.getClass().getResource("green.png"));
											b77.setIcon(b7g);
											no14="Node14->";
										}
									}
								}
								else
								{
									Thread.sleep(2000);
									b4r=new ImageIcon(this.getClass().getResource("red.png"));
									b44.setIcon(b4r);
									no11="Node11->";
									cong(no11, e11);
									if(Integer.parseInt(e12)>length)
									{
										Thread.sleep(2000);
										b5g=new ImageIcon(this.getClass().getResource("green.png"));
										a55.setIcon(b5g);
										no12="Node12->";
										
										if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
										{
											if(Integer.parseInt(e13)>length)
											{
												Thread.sleep(2000);
												b6g=new ImageIcon(this.getClass().getResource("green.png"));
												b66.setIcon(b6g);
												no13="Node13->";
											}
											else
											{
												Thread.sleep(2000);
												b6r=new ImageIcon(this.getClass().getResource("red.png"));
												b66.setIcon(b6r);
												no13="Node13->";
												cong(no13, e13);
												Thread.sleep(2000);
												b7g=new ImageIcon(this.getClass().getResource("green.png"));
												b77.setIcon(b7g);
												no14="Node14->";
											}
										}
										else
										{
											Thread.sleep(2000);
											b7g=new ImageIcon(this.getClass().getResource("green.png"));
											b77.setIcon(b7g);
											no14="Node14->";
										}
									}
									else
									{
										Thread.sleep(2000);
										b5r=new ImageIcon(this.getClass().getResource("red.png"));
										a55.setIcon(b5r);
										no12="Node12->";
										cong(no12, e12);
										if(Integer.parseInt(e13)>length)
										{
											Thread.sleep(2000);
											b6g=new ImageIcon(this.getClass().getResource("green.png"));
											b66.setIcon(b6g);
											no13="Node13->";
										}
										else
										{
											Thread.sleep(2000);
											b6r=new ImageIcon(this.getClass().getResource("red.png"));
											b66.setIcon(b6r);
											no13="Node13->";
											cong(no13, e13);
											Thread.sleep(2000);
											b7g=new ImageIcon(this.getClass().getResource("green.png"));
											b77.setIcon(b7g);
											no14="Node14->";
										}
										
									}
									
								}
							}
						}
					}
					else
					{
						if(Integer.parseInt(e10)>length)
						{
							Thread.sleep(2000);
							b3g=new ImageIcon(this.getClass().getResource("green.png"));
							b33.setIcon(b3g);
							no10="Node10->";
							
							if(Integer.parseInt(dis11)<=Integer.parseInt(dis12))
							{
								if(Integer.parseInt(e11)>length)
								{
									Thread.sleep(2000);
									b4g=new ImageIcon(this.getClass().getResource("green.png"));
									b44.setIcon(b4g);
									no11="Node11->";
									
									if(Integer.parseInt(dis12)<=Integer.parseInt(dis13))
									{
										if(Integer.parseInt(e12)>length)
										{
											Thread.sleep(2000);
											b5g=new ImageIcon(this.getClass().getResource("green.png"));
											a55.setIcon(b5g);
											no12="Node12->";
											
											if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
											{
												if(Integer.parseInt(e13)>length)
												{
													Thread.sleep(2000);
													b6g=new ImageIcon(this.getClass().getResource("green.png"));
													b66.setIcon(b6g);
													no13="Node13->";
												}
												else
												{
													Thread.sleep(2000);
													b6r=new ImageIcon(this.getClass().getResource("red.png"));
													b66.setIcon(b6r);
													no13="Node13->";
													cong(no13, e13);
													Thread.sleep(2000);
													b7g=new ImageIcon(this.getClass().getResource("green.png"));
													b77.setIcon(b7g);
													no14="Node14->";
												}
											}
											else
											{
												Thread.sleep(2000);
												b7g=new ImageIcon(this.getClass().getResource("green.png"));
												b77.setIcon(b7g);
												no14="Node14->";
											}
										}
										else
										{
											Thread.sleep(2000);
											b5r=new ImageIcon(this.getClass().getResource("red.png"));
											a55.setIcon(b5r);
											no12="Node12->";
											cong(no12, e12);
											if(Integer.parseInt(e13)>length)
											{
												Thread.sleep(2000);
												b6g=new ImageIcon(this.getClass().getResource("green.png"));
												b66.setIcon(b6g);
												no13="Node13->";
											}
											else
											{
												Thread.sleep(2000);
												b6r=new ImageIcon(this.getClass().getResource("red.png"));
												b66.setIcon(b6r);
												no13="Node13->";
												cong(no13, e13);
												Thread.sleep(2000);
												b7g=new ImageIcon(this.getClass().getResource("green.png"));
												b77.setIcon(b7g);
												no14="Node14->";
											}
											
										}
									}
									else
									{
										if(Integer.parseInt(e13)>length)
										{
											Thread.sleep(2000);
											b6g=new ImageIcon(this.getClass().getResource("green.png"));
											b66.setIcon(b6g);
											no13="Node13->";
										}
										else
										{
											Thread.sleep(2000);
											b6r=new ImageIcon(this.getClass().getResource("red.png"));
											b66.setIcon(b6r);
											no13="Node13->";
											cong(no13, e13);
											Thread.sleep(2000);
											b7g=new ImageIcon(this.getClass().getResource("green.png"));
											b77.setIcon(b7g);
											no14="Node14->";
										}
									}
								}
								else
								{
									Thread.sleep(2000);
									b4r=new ImageIcon(this.getClass().getResource("red.png"));
									b44.setIcon(b4r);
									no11="Node11->";
									cong(no11, e11);
									if(Integer.parseInt(e12)>length)
									{
										Thread.sleep(2000);
										b5g=new ImageIcon(this.getClass().getResource("green.png"));
										a55.setIcon(b5g);
										no12="Node12->";
										
										if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
										{
											if(Integer.parseInt(e13)>length)
											{
												Thread.sleep(2000);
												b6g=new ImageIcon(this.getClass().getResource("green.png"));
												b66.setIcon(b6g);
												no13="Node13->";
											}
											else
											{
												Thread.sleep(2000);
												b6r=new ImageIcon(this.getClass().getResource("red.png"));
												b66.setIcon(b6r);
												no13="Node13->";
												cong(no13, e13);
												Thread.sleep(2000);
												b7g=new ImageIcon(this.getClass().getResource("green.png"));
												b77.setIcon(b7g);
												no14="Node14->";
											}
										}
										else
										{
											Thread.sleep(2000);
											b7g=new ImageIcon(this.getClass().getResource("green.png"));
											b77.setIcon(b7g);
											no14="Node14->";
										}
									}
									else
									{
										Thread.sleep(2000);
										b5r=new ImageIcon(this.getClass().getResource("red.png"));
										a55.setIcon(b5r);
										no12="Node12->";
										cong(no12, e12);
										if(Integer.parseInt(e13)>length)
										{
											Thread.sleep(2000);
											b6g=new ImageIcon(this.getClass().getResource("green.png"));
											b66.setIcon(b6g);
											no13="Node13->";
										}
										else
										{
											Thread.sleep(2000);
											b6r=new ImageIcon(this.getClass().getResource("red.png"));
											b66.setIcon(b6r);
											no13="Node13->";
											cong(no13, e13);
											Thread.sleep(2000);
											b7g=new ImageIcon(this.getClass().getResource("green.png"));
											b77.setIcon(b7g);
											no14="Node14->";
										}
										
									}
									
								}
							}
							else
							{
								if(Integer.parseInt(e12)>length)
								{
									Thread.sleep(2000);
									b5g=new ImageIcon(this.getClass().getResource("green.png"));
									a55.setIcon(b5g);
									no12="Node12->";
									
									if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
									{
										if(Integer.parseInt(e13)>length)
										{
											Thread.sleep(2000);
											b6g=new ImageIcon(this.getClass().getResource("green.png"));
											b66.setIcon(b6g);
											no13="Node13->";
										}
										else
										{
											Thread.sleep(2000);
											b6r=new ImageIcon(this.getClass().getResource("red.png"));
											b66.setIcon(b6r);
											no13="Node13->";
											cong(no13, e13);
											Thread.sleep(2000);
											b7g=new ImageIcon(this.getClass().getResource("green.png"));
											b77.setIcon(b7g);
											no14="Node14->";
										}
									}
									else
									{
										Thread.sleep(2000);
										b7g=new ImageIcon(this.getClass().getResource("green.png"));
										b77.setIcon(b7g);
										no14="Node14->";
									}
								}
								else
								{
									Thread.sleep(2000);
									b5r=new ImageIcon(this.getClass().getResource("red.png"));
									a55.setIcon(b5r);
									no12="Node12->";
									cong(no12, e12);
									if(Integer.parseInt(e13)>length)
									{
										Thread.sleep(2000);
										b6g=new ImageIcon(this.getClass().getResource("green.png"));
										b66.setIcon(b6g);
										no13="Node13->";
									}
									else
									{
										Thread.sleep(2000);
										b6r=new ImageIcon(this.getClass().getResource("red.png"));
										b66.setIcon(b6r);
										no13="Node13->";
										cong(no13, e13);
										Thread.sleep(2000);
										b7g=new ImageIcon(this.getClass().getResource("green.png"));
										b77.setIcon(b7g);
										no14="Node14->";
									}
									
								}
							}
						}
						else
						{
							Thread.sleep(2000);
							b3r=new ImageIcon(this.getClass().getResource("red.png"));
							b33.setIcon(b3r);
							no10="Node10->";
							cong(no10, e10);
							if(Integer.parseInt(e11)>length)
							{
								Thread.sleep(2000);
								b4g=new ImageIcon(this.getClass().getResource("green.png"));
								b44.setIcon(b4g);
								no11="Node11->";
								
								if(Integer.parseInt(dis12)<=Integer.parseInt(dis13))
								{
									if(Integer.parseInt(e12)>length)
									{
										Thread.sleep(2000);
										b5g=new ImageIcon(this.getClass().getResource("green.png"));
										a55.setIcon(b5g);
										no12="Node12->";
										
										if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
										{
											if(Integer.parseInt(e13)>length)
											{
												Thread.sleep(2000);
												b6g=new ImageIcon(this.getClass().getResource("green.png"));
												b66.setIcon(b6g);
												no13="Node13->";
											}
											else
											{
												Thread.sleep(2000);
												b6r=new ImageIcon(this.getClass().getResource("red.png"));
												b66.setIcon(b6r);
												no13="Node13->";
												cong(no13, e13);
												Thread.sleep(2000);
												b7g=new ImageIcon(this.getClass().getResource("green.png"));
												b77.setIcon(b7g);
												no14="Node14->";
											}
										}
										else
										{
											Thread.sleep(2000);
											b7g=new ImageIcon(this.getClass().getResource("green.png"));
											b77.setIcon(b7g);
											no14="Node14->";
										}
									}
									else
									{
										Thread.sleep(2000);
										b5r=new ImageIcon(this.getClass().getResource("red.png"));
										a55.setIcon(b5r);
										no12="Node12->";
										cong(no12, e12);
										if(Integer.parseInt(e13)>length)
										{
											Thread.sleep(2000);
											b6g=new ImageIcon(this.getClass().getResource("green.png"));
											b66.setIcon(b6g);
											no13="Node13->";
										}
										else
										{
											Thread.sleep(2000);
											b6r=new ImageIcon(this.getClass().getResource("red.png"));
											b66.setIcon(b6r);
											no13="Node13->";
											cong(no13, e13);
											Thread.sleep(2000);
											b7g=new ImageIcon(this.getClass().getResource("green.png"));
											b77.setIcon(b7g);
											no14="Node14->";
										}
										
									}
								}
								else
								{
									if(Integer.parseInt(e13)>length)
									{
										Thread.sleep(2000);
										b6g=new ImageIcon(this.getClass().getResource("green.png"));
										b66.setIcon(b6g);
										no13="Node13->";
									}
									else
									{
										Thread.sleep(2000);
										b6r=new ImageIcon(this.getClass().getResource("red.png"));
										b66.setIcon(b6r);
										no13="Node13->";
										cong(no13, e13);
										Thread.sleep(2000);
										b7g=new ImageIcon(this.getClass().getResource("green.png"));
										b77.setIcon(b7g);
										no14="Node14->";
									}
								}
							}
							else
							{
								Thread.sleep(2000);
								b4r=new ImageIcon(this.getClass().getResource("red.png"));
								b44.setIcon(b4r);
								no11="Node11->";
								cong(no11, e11);
								if(Integer.parseInt(e12)>length)
								{
									Thread.sleep(2000);
									b5g=new ImageIcon(this.getClass().getResource("green.png"));
									b55.setIcon(b5g);
									no12="Node12->";
									
									if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
									{
										if(Integer.parseInt(e13)>length)
										{
											Thread.sleep(2000);
											b6g=new ImageIcon(this.getClass().getResource("green.png"));
											b66.setIcon(b6g);
											no13="Node13->";
										}
										else
										{
											Thread.sleep(2000);
											b6r=new ImageIcon(this.getClass().getResource("red.png"));
											b66.setIcon(b6r);
											no13="Node13->";
											
											cong(no13, e13);
											
											Thread.sleep(2000);
											b7g=new ImageIcon(this.getClass().getResource("green.png"));
											b77.setIcon(b7g);
											no14="Node14->";
										}
									}
									else
									{
										Thread.sleep(2000);
										b7g=new ImageIcon(this.getClass().getResource("green.png"));
										b77.setIcon(b7g);
										no14="Node14->";
									}
								}
								else
								{
									Thread.sleep(2000);
									b5r=new ImageIcon(this.getClass().getResource("red.png"));
									b55.setIcon(b5r);
									no12="Node12->";
									
									cong(no12, e12);
									
									if(Integer.parseInt(e13)>length)
									{
										Thread.sleep(2000);
										b6g=new ImageIcon(this.getClass().getResource("green.png"));
										b66.setIcon(b6g);
										no13="Node13->";
									}
									else
									{
										
										Thread.sleep(2000);
										b6r=new ImageIcon(this.getClass().getResource("red.png"));
										b66.setIcon(b6r);
										no13="Node13->";
										
										cong(no13, e13);
										
										Thread.sleep(2000);
										b7g=new ImageIcon(this.getClass().getResource("green.png"));
										b77.setIcon(b7g);
										no14="Node14->";
									}
									
								}
								
							}
						}
					}
					
					
					

					Thread.sleep(2000);
					c1g=new ImageIcon(this.getClass().getResource("green.png"));
					c11.setIcon(c1g);
					no15="Node15->";
					
					if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
					{
						if(Integer.parseInt(e16)>length)
						{
							Thread.sleep(2000);
							c2g=new ImageIcon(this.getClass().getResource("green.png"));
							c22.setIcon(c2g);
							no16="Node16->";
							
							if(Integer.parseInt(dis17)<=Integer.parseInt(dis4))
							{
								if(Integer.parseInt(e17)>length)
								{
									Thread.sleep(2000);
									c3g=new ImageIcon(this.getClass().getResource("green.png"));
									c33.setIcon(c3g);
									no17="Node17->";
									
									if(Integer.parseInt(dis4)<=Integer.parseInt(dis19))
									{
										if(Integer.parseInt(e18)>length)
										{
											Thread.sleep(2000);
											c4g=new ImageIcon(this.getClass().getResource("green.png"));
											c44.setIcon(c4g);
											no18="Node18->";
											
											if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
											{
												if(Integer.parseInt(e19)>length)
												{
													Thread.sleep(2000);
													c5g=new ImageIcon(this.getClass().getResource("green.png"));
													c55.setIcon(c5g);
													no19="Node19->";
													
													if(Integer.parseInt(dis20)<=Integer.parseInt(dis21))
													{
														if(Integer.parseInt(e20)>length)
														{
															Thread.sleep(2000);
															c6g=new ImageIcon(this.getClass().getResource("green.png"));
															c66.setIcon(c6g);
															no20="Node20->";
														}
														else
														{
															Thread.sleep(2000);
															c6r=new ImageIcon(this.getClass().getResource("red.png"));
															c66.setIcon(c6r);
															no20="Node20->";
															cong(no20, e20);
															Thread.sleep(2000);
															c7g=new ImageIcon(this.getClass().getResource("green.png"));
															c77.setIcon(c7g);
															no21="Node21->";
														}
													}
													else
													{
														Thread.sleep(2000);
														c7g=new ImageIcon(this.getClass().getResource("green.png"));
														c77.setIcon(c7g);
														no21="Node21->";
													}
												}
												else
												{
													Thread.sleep(2000);
													c5r=new ImageIcon(this.getClass().getResource("red.png"));
													c55.setIcon(c5r);
													no19="Node19->";
													cong(no19, e19);
													if(Integer.parseInt(e20)>length)
													{
														Thread.sleep(2000);
														c6g=new ImageIcon(this.getClass().getResource("green.png"));
														c66.setIcon(c6g);
														no20="Node20->";
													}
													else
													{
														Thread.sleep(2000);
														c6r=new ImageIcon(this.getClass().getResource("red.png"));
														c66.setIcon(c6r);
														no20="Node20->";
														cong(no20, e20);
														Thread.sleep(2000);
														c7g=new ImageIcon(this.getClass().getResource("green.png"));
														c77.setIcon(c7g);
														no21="Node21->";
													}
													
												}
											}
											else
											{
												if(Integer.parseInt(e20)>length)
												{
													Thread.sleep(2000);
													c6g=new ImageIcon(this.getClass().getResource("green.png"));
													c66.setIcon(c6g);
													no20="Node20->";
												}
												else
												{
													Thread.sleep(2000);
													c6r=new ImageIcon(this.getClass().getResource("red.png"));
													c66.setIcon(c6r);
													no20="Node20->";
													cong(no20, e20);
													Thread.sleep(2000);
													c7g=new ImageIcon(this.getClass().getResource("green.png"));
													c77.setIcon(c7g);
													no21="Node21->";
												}
											}
										}
										else
										{
											Thread.sleep(2000);
											c4r=new ImageIcon(this.getClass().getResource("red.png"));
											c44.setIcon(c4r);
											no18="Node18->";
											cong(no18, e18);
											if(Integer.parseInt(e19)>length)
											{
												Thread.sleep(2000);
												c5g=new ImageIcon(this.getClass().getResource("green.png"));
												c55.setIcon(c5g);
												no19="Node19->";
												
												if(Integer.parseInt(dis20)<=Integer.parseInt(dis21))
												{
													if(Integer.parseInt(e20)>length)
													{
														Thread.sleep(2000);
														c6g=new ImageIcon(this.getClass().getResource("green.png"));
														c66.setIcon(c6g);
														no20="Node20->";
													}
													else
													{
														Thread.sleep(2000);
														c6r=new ImageIcon(this.getClass().getResource("red.png"));
														c66.setIcon(c6r);
														no20="Node20->";
														cong(no20, e20);
														Thread.sleep(2000);
														c7g=new ImageIcon(this.getClass().getResource("green.png"));
														c77.setIcon(c7g);
														no21="Node21->";
													}
												}
												else
												{
													Thread.sleep(2000);
													c7g=new ImageIcon(this.getClass().getResource("green.png"));
													c77.setIcon(c7g);
													no21="Node21->";
												}
											}
											else
											{
												Thread.sleep(2000);
												c5r=new ImageIcon(this.getClass().getResource("red.png"));
												c55.setIcon(c5r);
												no19="Node19->";
												cong(no19, e19);
												if(Integer.parseInt(e20)>length)
												{
													Thread.sleep(2000);
													c6g=new ImageIcon(this.getClass().getResource("green.png"));
													c66.setIcon(c6g);
													no20="Node20->";
												}
												else
												{
													Thread.sleep(2000);
													c6r=new ImageIcon(this.getClass().getResource("red.png"));
													c66.setIcon(c6r);
													no20="Node20->";
													cong(no20, e20);
													Thread.sleep(2000);
													c7g=new ImageIcon(this.getClass().getResource("green.png"));
													c77.setIcon(c7g);
													no21="Node21->";
												}
												
											}
											
										}
									}
									else
									{
										if(Integer.parseInt(e19)>length)
										{
											Thread.sleep(2000);
											c5g=new ImageIcon(this.getClass().getResource("green.png"));
											c55.setIcon(c5g);
											no19="Node19->";
											
											if(Integer.parseInt(dis20)<=Integer.parseInt(dis21))
											{
												if(Integer.parseInt(e20)>length)
												{
													Thread.sleep(2000);
													c6g=new ImageIcon(this.getClass().getResource("green.png"));
													c66.setIcon(c6g);
													no20="Node20->";
												}
												else
												{
													Thread.sleep(2000);
													c6r=new ImageIcon(this.getClass().getResource("red.png"));
													c66.setIcon(c6r);
													no20="Node20->";
													cong(no20, e20);
													Thread.sleep(2000);
													c7g=new ImageIcon(this.getClass().getResource("green.png"));
													c77.setIcon(c7g);
													no21="Node21->";
												}
											}
											else
											{
												Thread.sleep(2000);
												c7g=new ImageIcon(this.getClass().getResource("green.png"));
												c77.setIcon(c7g);
												no21="Node21->";
											}
										}
										else
										{
											Thread.sleep(2000);
											c5r=new ImageIcon(this.getClass().getResource("red.png"));
											c55.setIcon(c5r);
											no19="Node19->";
											cong(no19, e19);
											if(Integer.parseInt(e20)>length)
											{
												Thread.sleep(2000);
												c6g=new ImageIcon(this.getClass().getResource("green.png"));
												c66.setIcon(c6g);
												no20="Node20->";
											}
											else
											{
												Thread.sleep(2000);
												c6r=new ImageIcon(this.getClass().getResource("red.png"));
												c66.setIcon(c6r);
												no20="Node20->";
												cong(no20, e20);
												Thread.sleep(2000);
												c7g=new ImageIcon(this.getClass().getResource("green.png"));
												c77.setIcon(c7g);
												no21="Node21->";
											}
											
										}
									}
								}
								else
								{
									Thread.sleep(2000);
									c3r=new ImageIcon(this.getClass().getResource("red.png"));
									c33.setIcon(c3r);
									no17="Node17->";
									cong(no17, e17);
									if(Integer.parseInt(e18)>length)
									{
										Thread.sleep(2000);
										c4g=new ImageIcon(this.getClass().getResource("green.png"));
										c44.setIcon(c4g);
										no18="Node18->";
										
										if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
										{
											if(Integer.parseInt(e19)>length)
											{
												Thread.sleep(2000);
												c5g=new ImageIcon(this.getClass().getResource("green.png"));
												c55.setIcon(c5g);
												no19="Node19->";
												
												if(Integer.parseInt(dis20)<=Integer.parseInt(dis21))
												{
													if(Integer.parseInt(e20)>length)
													{
														Thread.sleep(2000);
														c6g=new ImageIcon(this.getClass().getResource("green.png"));
														c66.setIcon(c6g);
														no20="Node20->";
													}
													else
													{
														Thread.sleep(2000);
														c6r=new ImageIcon(this.getClass().getResource("red.png"));
														c66.setIcon(c6r);
														no20="Node20->";
														cong(no20, e20);
														Thread.sleep(2000);
														c7g=new ImageIcon(this.getClass().getResource("green.png"));
														c77.setIcon(c7g);
														no21="Node21->";
													}
												}
												else
												{
													Thread.sleep(2000);
													c7g=new ImageIcon(this.getClass().getResource("green.png"));
													c77.setIcon(c7g);
													no21="Node21->";
												}
											}
											else
											{
												Thread.sleep(2000);
												c5r=new ImageIcon(this.getClass().getResource("red.png"));
												c55.setIcon(c5r);
												no19="Node19->";
												cong(no19, e19);
												if(Integer.parseInt(e20)>length)
												{
													Thread.sleep(2000);
													c6g=new ImageIcon(this.getClass().getResource("green.png"));
													c66.setIcon(c6g);
													no20="Node20->";
												}
												else
												{
													Thread.sleep(2000);
													c6r=new ImageIcon(this.getClass().getResource("red.png"));
													c66.setIcon(c6r);
													no20="Node20->";
													cong(no20, e20);
													Thread.sleep(2000);
													c7g=new ImageIcon(this.getClass().getResource("green.png"));
													c77.setIcon(c7g);
													no21="Node21->";
												}
												
											}
										}
										else
										{
											if(Integer.parseInt(e20)>length)
											{
												Thread.sleep(2000);
												c6g=new ImageIcon(this.getClass().getResource("green.png"));
												c66.setIcon(c6g);
												no20="Node20->";
											}
											else
											{
												Thread.sleep(2000);
												c6r=new ImageIcon(this.getClass().getResource("red.png"));
												c66.setIcon(c6r);
												no20="Node20->";
												cong(no20, e20);
												Thread.sleep(2000);
												c7g=new ImageIcon(this.getClass().getResource("green.png"));
												c77.setIcon(c7g);
												no21="Node21->";
											}
										}
									}
									else
									{
										Thread.sleep(2000);
										c4r=new ImageIcon(this.getClass().getResource("red.png"));
										c44.setIcon(c4r);
										no18="Node18->";
										cong(no18, e18);
										if(Integer.parseInt(e19)>length)
										{
											Thread.sleep(2000);
											c5g=new ImageIcon(this.getClass().getResource("green.png"));
											c55.setIcon(c5g);
											no19="Node19->";
											
											if(Integer.parseInt(dis20)<=Integer.parseInt(dis21))
											{
												if(Integer.parseInt(e20)>length)
												{
													Thread.sleep(2000);
													c6g=new ImageIcon(this.getClass().getResource("green.png"));
													c66.setIcon(c6g);
													no20="Node20->";
												}
												else
												{
													Thread.sleep(2000);
													c6r=new ImageIcon(this.getClass().getResource("red.png"));
													c66.setIcon(c6r);
													no20="Node20->";
													cong(no20, e20);
													Thread.sleep(2000);
													c7g=new ImageIcon(this.getClass().getResource("green.png"));
													c77.setIcon(c7g);
													no21="Node21->";
												}
											}
											else
											{
												Thread.sleep(2000);
												c7g=new ImageIcon(this.getClass().getResource("green.png"));
												c77.setIcon(c7g);
												no21="Node21->";
											}
										}
										else
										{
											Thread.sleep(2000);
											c5r=new ImageIcon(this.getClass().getResource("red.png"));
											c55.setIcon(c5r);
											no19="Node19->";
											cong(no19, e19);
											if(Integer.parseInt(e20)>length)
											{
												Thread.sleep(2000);
												c6g=new ImageIcon(this.getClass().getResource("green.png"));
												c66.setIcon(c6g);
												no20="Node20->";
											}
											else
											{
												Thread.sleep(2000);
												c6r=new ImageIcon(this.getClass().getResource("red.png"));
												c66.setIcon(c6r);
												no20="Node20->";
												cong(no20, e20);
												Thread.sleep(2000);
												c7g=new ImageIcon(this.getClass().getResource("green.png"));
												c77.setIcon(c7g);
												no21="Node21->";
											}
											
										}
										
									}
								}
							}
							else
							{
								if(Integer.parseInt(e18)>length)
								{
									Thread.sleep(2000);
									c4g=new ImageIcon(this.getClass().getResource("green.png"));
									c44.setIcon(c4g);
									no18="Node18->";
									
									if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
									{
										if(Integer.parseInt(e19)>length)
										{
											Thread.sleep(2000);
											c5g=new ImageIcon(this.getClass().getResource("green.png"));
											c55.setIcon(c5g);
											no19="Node19->";
											
											if(Integer.parseInt(dis20)<=Integer.parseInt(dis21))
											{
												if(Integer.parseInt(e20)>length)
												{
													Thread.sleep(2000);
													c6g=new ImageIcon(this.getClass().getResource("green.png"));
													c66.setIcon(c6g);
													no20="Node20->";
												}
												else
												{
													Thread.sleep(2000);
													c6r=new ImageIcon(this.getClass().getResource("red.png"));
													c66.setIcon(c6r);
													no20="Node20->";
													cong(no20, e20);
													Thread.sleep(2000);
													c7g=new ImageIcon(this.getClass().getResource("green.png"));
													c77.setIcon(c7g);
													no21="Node21->";
												}
											}
											else
											{
												Thread.sleep(2000);
												c7g=new ImageIcon(this.getClass().getResource("green.png"));
												c77.setIcon(c7g);
												no21="Node21->";
											}
										}
										else
										{
											Thread.sleep(2000);
											c5r=new ImageIcon(this.getClass().getResource("red.png"));
											c55.setIcon(c5r);
											no19="Node19->";
											cong(no19, e19);
											if(Integer.parseInt(e20)>length)
											{
												Thread.sleep(2000);
												c6g=new ImageIcon(this.getClass().getResource("green.png"));
												c66.setIcon(c6g);
												no20="Node20->";
											}
											else
											{
												Thread.sleep(2000);
												c6r=new ImageIcon(this.getClass().getResource("red.png"));
												c66.setIcon(c6r);
												no20="Node20->";
												cong(no20, e20);
												Thread.sleep(2000);
												c7g=new ImageIcon(this.getClass().getResource("green.png"));
												c77.setIcon(c7g);
												no21="Node21->";
											}
											
										}
									}
									else
									{
										if(Integer.parseInt(e20)>length)
										{
											Thread.sleep(2000);
											c6g=new ImageIcon(this.getClass().getResource("green.png"));
											c66.setIcon(c6g);
											no20="Node20->";
										}
										else
										{
											Thread.sleep(2000);
											c6r=new ImageIcon(this.getClass().getResource("red.png"));
											c66.setIcon(c6r);
											no20="Node20->";
											cong(no20, e20);
											Thread.sleep(2000);
											c7g=new ImageIcon(this.getClass().getResource("green.png"));
											c77.setIcon(c7g);
											no21="Node21->";
										}
									}
								}
								else
								{
									Thread.sleep(2000);
									c4r=new ImageIcon(this.getClass().getResource("red.png"));
									c44.setIcon(c4r);
									no18="Node18->";
									cong(no18, e18);
									if(Integer.parseInt(e19)>length)
									{
										Thread.sleep(2000);
										c5g=new ImageIcon(this.getClass().getResource("green.png"));
										c55.setIcon(c5g);
										no19="Node19->";
										
										if(Integer.parseInt(dis20)<=Integer.parseInt(dis21))
										{
											if(Integer.parseInt(e20)>length)
											{
												Thread.sleep(2000);
												c6g=new ImageIcon(this.getClass().getResource("green.png"));
												c66.setIcon(c6g);
												no20="Node20->";
											}
											else
											{
												Thread.sleep(2000);
												c6r=new ImageIcon(this.getClass().getResource("red.png"));
												c66.setIcon(c6r);
												no20="Node20->";
												cong(no20, e20);
												Thread.sleep(2000);
												c7g=new ImageIcon(this.getClass().getResource("green.png"));
												c77.setIcon(c7g);
												no21="Node21->";
											}
										}
										else
										{
											Thread.sleep(2000);
											c7g=new ImageIcon(this.getClass().getResource("green.png"));
											c77.setIcon(c7g);
											no21="Node21->";
										}
									}
									else
									{
										Thread.sleep(2000);
										c5r=new ImageIcon(this.getClass().getResource("red.png"));
										c55.setIcon(c5r);
										no19="Node19->";
										cong(no19, e19);
										if(Integer.parseInt(e20)>length)
										{
											Thread.sleep(2000);
											c6g=new ImageIcon(this.getClass().getResource("green.png"));
											c66.setIcon(c6g);
											no20="Node20->";
										}
										else
										{
											Thread.sleep(2000);
											c6r=new ImageIcon(this.getClass().getResource("red.png"));
											c66.setIcon(c6r);
											no20="Node20->";
											cong(no20, e20);
											Thread.sleep(2000);
											c7g=new ImageIcon(this.getClass().getResource("green.png"));
											c77.setIcon(c7g);
											no21="Node21->";
										}
										
									}
									
								}
							}
						}
						else
						{
							Thread.sleep(2000);
							c2r=new ImageIcon(this.getClass().getResource("red.png"));
							c22.setIcon(c2r);
							no16="Node16->";
							cong(no16, e16);
							if(Integer.parseInt(e17)>length)
							{
								Thread.sleep(2000);
								c3g=new ImageIcon(this.getClass().getResource("green.png"));
								c33.setIcon(c3g);
								no17="Node17->";
								
								if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
								{
									if(Integer.parseInt(e18)>length)
									{
										Thread.sleep(2000);
										c4g=new ImageIcon(this.getClass().getResource("green.png"));
										c44.setIcon(c4g);
										no18="Node18->";
										
										if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
										{
											if(Integer.parseInt(e19)>length)
											{
												Thread.sleep(2000);
												c5g=new ImageIcon(this.getClass().getResource("green.png"));
												c55.setIcon(c5g);
												no19="Node19->";
												
												if(Integer.parseInt(dis20)<=Integer.parseInt(dis21))
												{
													if(Integer.parseInt(e20)>length)
													{
														Thread.sleep(2000);
														c6g=new ImageIcon(this.getClass().getResource("green.png"));
														c66.setIcon(c6g);
														no20="Node20->";
													}
													else
													{
														Thread.sleep(2000);
														c6r=new ImageIcon(this.getClass().getResource("red.png"));
														c66.setIcon(c6r);
														no20="Node20->";
														cong(no20, e20);
														Thread.sleep(2000);
														c7g=new ImageIcon(this.getClass().getResource("green.png"));
														c77.setIcon(c7g);
														no21="Node21->";
													}
												}
												else
												{
													Thread.sleep(2000);
													c7g=new ImageIcon(this.getClass().getResource("green.png"));
													c77.setIcon(c7g);
													no21="Node21->";
												}
											}
											else
											{
												Thread.sleep(2000);
												c5r=new ImageIcon(this.getClass().getResource("red.png"));
												c55.setIcon(c5r);
												no19="Node19->";
												cong(no19, e19);
												if(Integer.parseInt(e20)>length)
												{
													Thread.sleep(2000);
													c6g=new ImageIcon(this.getClass().getResource("green.png"));
													c66.setIcon(c6g);
													no20="Node20->";
												}
												else
												{
													Thread.sleep(2000);
													c6r=new ImageIcon(this.getClass().getResource("red.png"));
													c66.setIcon(c6r);
													no20="Node20->";
													cong(no20, e20);
													Thread.sleep(2000);
													c7g=new ImageIcon(this.getClass().getResource("green.png"));
													c77.setIcon(c7g);
													no21="Node21->";
												}
												
											}
										}
										else
										{
											if(Integer.parseInt(e20)>length)
											{
												Thread.sleep(2000);
												c6g=new ImageIcon(this.getClass().getResource("green.png"));
												c66.setIcon(c6g);
												no20="Node20->";
											}
											else
											{
												
												Thread.sleep(2000);
												c6r=new ImageIcon(this.getClass().getResource("red.png"));
												c66.setIcon(c6r);
												no20="Node20->";
												cong(no20, e20);
												Thread.sleep(2000);
												c7g=new ImageIcon(this.getClass().getResource("green.png"));
												c77.setIcon(c7g);
												no21="Node21->";
											}
										}
									}
									else
									{
										Thread.sleep(2000);
										c4r=new ImageIcon(this.getClass().getResource("red.png"));
										c44.setIcon(c4r);
										no18="Node18->";
										cong(no18, e18);
										if(Integer.parseInt(e19)>length)
										{
											Thread.sleep(2000);
											c5g=new ImageIcon(this.getClass().getResource("green.png"));
											c55.setIcon(c5g);
											no19="Node19->";
											
											if(Integer.parseInt(dis20)<=Integer.parseInt(dis21))
											{
												if(Integer.parseInt(e20)>length)
												{
													Thread.sleep(2000);
													c6g=new ImageIcon(this.getClass().getResource("green.png"));
													c66.setIcon(c6g);
													no20="Node20->";
												}
												else
												{
													Thread.sleep(2000);
													c6r=new ImageIcon(this.getClass().getResource("red.png"));
													c66.setIcon(c6r);
													no20="Node20->";
													cong(no20, e20);
													Thread.sleep(2000);
													c7g=new ImageIcon(this.getClass().getResource("green.png"));
													c77.setIcon(c7g);
													no21="Node21->";
												}
											}
											else
											{
												Thread.sleep(2000);
												c7g=new ImageIcon(this.getClass().getResource("green.png"));
												c77.setIcon(c7g);
												no21="Node21->";
											}
										}
										else
										{
											Thread.sleep(2000);
											c5r=new ImageIcon(this.getClass().getResource("red.png"));
											c55.setIcon(c5r);
											no19="Node19->";
											cong(no19, e19);
											if(Integer.parseInt(e20)>length)
											{
												Thread.sleep(2000);
												c6g=new ImageIcon(this.getClass().getResource("green.png"));
												c66.setIcon(c6g);
												no20="Node20->";
											}
											else
											{
												Thread.sleep(2000);
												c6r=new ImageIcon(this.getClass().getResource("red.png"));
												c66.setIcon(c6r);
												no20="Node20->";
												cong(no20, e20);
												Thread.sleep(2000);
												c7g=new ImageIcon(this.getClass().getResource("green.png"));
												c77.setIcon(c7g);
												no21="Node21->";
											}
											
										}
										
									}
								}
								else
								{
									if(Integer.parseInt(e19)>length)
									{
										Thread.sleep(2000);
										c5g=new ImageIcon(this.getClass().getResource("green.png"));
										c55.setIcon(c5g);
										no19="Node19->";
										
										if(Integer.parseInt(dis20)<=Integer.parseInt(dis21))
										{
											if(Integer.parseInt(e20)>length)
											{
												Thread.sleep(2000);
												c6g=new ImageIcon(this.getClass().getResource("green.png"));
												c66.setIcon(c6g);
												no20="Node20->";
											}
											else
											{
												Thread.sleep(2000);
												c6r=new ImageIcon(this.getClass().getResource("red.png"));
												c66.setIcon(c6r);
												no20="Node20->";
												cong(no20, e20);
												Thread.sleep(2000);
												c7g=new ImageIcon(this.getClass().getResource("green.png"));
												c77.setIcon(c7g);
												no21="Node21->";
											}
										}
										else
										{
											Thread.sleep(2000);
											c7g=new ImageIcon(this.getClass().getResource("green.png"));
											c77.setIcon(c7g);
											no21="Node21->";
										}
									}
									else
									{
										Thread.sleep(2000);
										c5r=new ImageIcon(this.getClass().getResource("red.png"));
										c55.setIcon(c5r);
										no19="Node19->";
										cong(no19, e19);
										if(Integer.parseInt(e20)>length)
										{
											Thread.sleep(2000);
											c6g=new ImageIcon(this.getClass().getResource("green.png"));
											c66.setIcon(c6g);
											no20="Node20->";
										}
										else
										{
											Thread.sleep(2000);
											c6r=new ImageIcon(this.getClass().getResource("red.png"));
											c66.setIcon(c6r);
											no20="Node20->";
											cong(no20, e20);
											Thread.sleep(2000);
											c7g=new ImageIcon(this.getClass().getResource("green.png"));
											c77.setIcon(c7g);
											no21="Node21->";
										}
										
									}
								}
							}
							else
							{
								Thread.sleep(2000);
								c3r=new ImageIcon(this.getClass().getResource("red.png"));
								c33.setIcon(c3r);
								no17="Node17->";
								cong(no17, e17);
								if(Integer.parseInt(e18)>length)
								{
									Thread.sleep(2000);
									c4g=new ImageIcon(this.getClass().getResource("green.png"));
									c44.setIcon(c4g);
									no18="Node18->";
									
									if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
									{
										if(Integer.parseInt(e19)>length)
										{
											Thread.sleep(2000);
											c5g=new ImageIcon(this.getClass().getResource("green.png"));
											c55.setIcon(c5g);
											no19="Node19->";
											
											if(Integer.parseInt(dis20)<=Integer.parseInt(dis21))
											{
												if(Integer.parseInt(e20)>length)
												{
													Thread.sleep(2000);
													c6g=new ImageIcon(this.getClass().getResource("green.png"));
													c66.setIcon(c6g);
													no20="Node20->";
												}
												else
												{
													Thread.sleep(2000);
													c6r=new ImageIcon(this.getClass().getResource("red.png"));
													c66.setIcon(c6r);
													no20="Node20->";
													cong(no20, e20);
													Thread.sleep(2000);
													c7g=new ImageIcon(this.getClass().getResource("green.png"));
													c77.setIcon(c7g);
													no21="Node21->";
												}
											}
											else
											{
												Thread.sleep(2000);
												c7g=new ImageIcon(this.getClass().getResource("green.png"));
												c77.setIcon(c7g);
												no21="Node21->";
											}
										}
										else
										{
											Thread.sleep(2000);
											c5r=new ImageIcon(this.getClass().getResource("red.png"));
											c55.setIcon(c5r);
											no19="Node19->";
											cong(no19, e19);
											if(Integer.parseInt(e20)>length)
											{
												Thread.sleep(2000);
												c6g=new ImageIcon(this.getClass().getResource("green.png"));
												c66.setIcon(c6g);
												no20="Node20->";
											}
											else
											{
												Thread.sleep(2000);
												c6r=new ImageIcon(this.getClass().getResource("red.png"));
												c66.setIcon(c6r);
												no20="Node20->";
												cong(no20, e20);
												Thread.sleep(2000);
												c7g=new ImageIcon(this.getClass().getResource("green.png"));
												c77.setIcon(c7g);
												no21="Node21->";
											}
											
										}
									}
									else
									{
										if(Integer.parseInt(e20)>length)
										{
											Thread.sleep(2000);
											c6g=new ImageIcon(this.getClass().getResource("green.png"));
											c66.setIcon(c6g);
											no20="Node20->";
										}
										else
										{
											Thread.sleep(2000);
											c6r=new ImageIcon(this.getClass().getResource("red.png"));
											c66.setIcon(c6r);
											no20="Node20->";
											cong(no20, e20);
											Thread.sleep(2000);
											c7g=new ImageIcon(this.getClass().getResource("green.png"));
											c77.setIcon(c7g);
											no21="Node21->";
										}
									}
								}
								else
								{
									Thread.sleep(2000);
									c4r=new ImageIcon(this.getClass().getResource("red.png"));
									c44.setIcon(c4r);
									no18="Node18->";
									cong(no18, e18);
									if(Integer.parseInt(e19)>length)
									{
										Thread.sleep(2000);
										c5g=new ImageIcon(this.getClass().getResource("green.png"));
										c55.setIcon(c5g);
										no19="Node19->";
										
										if(Integer.parseInt(dis20)<=Integer.parseInt(dis21))
										{
											if(Integer.parseInt(e20)>length)
											{
												Thread.sleep(2000);
												c6g=new ImageIcon(this.getClass().getResource("green.png"));
												c66.setIcon(c6g);
												no20="Node20->";
											}
											else
											{
												Thread.sleep(2000);
												c6r=new ImageIcon(this.getClass().getResource("red.png"));
												c66.setIcon(c6r);
												no20="Node20->";
												cong(no20, e20);
												Thread.sleep(2000);
												c7g=new ImageIcon(this.getClass().getResource("green.png"));
												c77.setIcon(c7g);
												no21="Node21->";
											}
										}
										else
										{
											Thread.sleep(2000);
											c7g=new ImageIcon(this.getClass().getResource("green.png"));
											c77.setIcon(c7g);
											no21="Node21->";
										}
									}
									else
									{
										Thread.sleep(2000);
										c5r=new ImageIcon(this.getClass().getResource("red.png"));
										c55.setIcon(c5r);
										no19="Node19->";
										cong(no19, e19);
										if(Integer.parseInt(e20)>length)
										{
											Thread.sleep(2000);
											c6g=new ImageIcon(this.getClass().getResource("green.png"));
											c66.setIcon(c6g);
											no20="Node20->";
										}
										else
										{
											Thread.sleep(2000);
											c6r=new ImageIcon(this.getClass().getResource("red.png"));
											c66.setIcon(c6r);
											no20="Node20->";
											cong(no20, e20);
											Thread.sleep(2000);
											c7g=new ImageIcon(this.getClass().getResource("green.png"));
											c77.setIcon(c7g);
											no21="Node21->";
										}
										
									}
									
								}
							}
						}
					}
					else
					{
						if(Integer.parseInt(e17)>length)
						{
							Thread.sleep(2000);
							c3g=new ImageIcon(this.getClass().getResource("green.png"));
							c33.setIcon(c3g);
							no17="Node17->";
							
							if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
							{
								if(Integer.parseInt(e18)>length)
								{
									Thread.sleep(2000);
									c4g=new ImageIcon(this.getClass().getResource("green.png"));
									c44.setIcon(c4g);
									no18="Node18->";
									
									if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
									{
										if(Integer.parseInt(e19)>length)
										{
											Thread.sleep(2000);
											c5g=new ImageIcon(this.getClass().getResource("green.png"));
											c55.setIcon(c5g);
											no19="Node19->";
											
											if(Integer.parseInt(dis20)<=Integer.parseInt(dis21))
											{
												if(Integer.parseInt(e20)>length)
												{
													Thread.sleep(2000);
													c6g=new ImageIcon(this.getClass().getResource("green.png"));
													c66.setIcon(c6g);
													no20="Node20->";
												}
												else
												{
													Thread.sleep(2000);
													c6r=new ImageIcon(this.getClass().getResource("red.png"));
													c66.setIcon(c6r);
													no20="Node20->";
													cong(no20, e20);
													Thread.sleep(2000);
													c7g=new ImageIcon(this.getClass().getResource("green.png"));
													c77.setIcon(c7g);
													no21="Node21->";
												}
											}
											else
											{
												Thread.sleep(2000);
												c7g=new ImageIcon(this.getClass().getResource("green.png"));
												c77.setIcon(c7g);
												no21="Node21->";
											}
										}
										else
										{
											Thread.sleep(2000);
											c5r=new ImageIcon(this.getClass().getResource("red.png"));
											c55.setIcon(c5r);
											no19="Node19->";
											cong(no19, e19);
											if(Integer.parseInt(e20)>length)
											{
												Thread.sleep(2000);
												c6g=new ImageIcon(this.getClass().getResource("green.png"));
												c66.setIcon(c6g);
												no20="Node20->";
											}
											else
											{
												Thread.sleep(2000);
												c6r=new ImageIcon(this.getClass().getResource("red.png"));
												c66.setIcon(c6r);
												no20="Node20->";
												cong(no20, e20);
												Thread.sleep(2000);
												c7g=new ImageIcon(this.getClass().getResource("green.png"));
												c77.setIcon(c7g);
												no21="Node21->";
											}
											
										}
									}
									else
									{
										if(Integer.parseInt(e20)>length)
										{
											Thread.sleep(2000);
											c6g=new ImageIcon(this.getClass().getResource("green.png"));
											c66.setIcon(c6g);
											no20="Node20->";
										}
										else
										{
											Thread.sleep(2000);
											c6r=new ImageIcon(this.getClass().getResource("red.png"));
											c66.setIcon(c6r);
											no20="Node20->";
											cong(no20, e20);
											Thread.sleep(2000);
											c7g=new ImageIcon(this.getClass().getResource("green.png"));
											c77.setIcon(c7g);
											no21="Node21->";
										}
									}
								}
								else
								{
									Thread.sleep(2000);
									c4r=new ImageIcon(this.getClass().getResource("red.png"));
									c44.setIcon(c4r);
									no18="Node18->";
									cong(no18, e18);
									if(Integer.parseInt(e19)>length)
									{
										Thread.sleep(2000);
										c5g=new ImageIcon(this.getClass().getResource("green.png"));
										c55.setIcon(c5g);
										no19="Node19->";
										
										if(Integer.parseInt(dis20)<=Integer.parseInt(dis21))
										{
											if(Integer.parseInt(e20)>length)
											{
												Thread.sleep(2000);
												c6g=new ImageIcon(this.getClass().getResource("green.png"));
												c66.setIcon(c6g);
												no20="Node20->";
											}
											else
											{
												Thread.sleep(2000);
												c6r=new ImageIcon(this.getClass().getResource("red.png"));
												c66.setIcon(c6r);
												no20="Node20->";
												cong(no20, e20);
												Thread.sleep(2000);
												c7g=new ImageIcon(this.getClass().getResource("green.png"));
												c77.setIcon(c7g);
												no21="Node21->";
											}
										}
										else
										{
											Thread.sleep(2000);
											c7g=new ImageIcon(this.getClass().getResource("green.png"));
											c77.setIcon(c7g);
											no21="Node21->";
										}
									}
									else
									{
										Thread.sleep(2000);
										c5r=new ImageIcon(this.getClass().getResource("red.png"));
										c55.setIcon(c5r);
										no19="Node19->";
										cong(no19, e19);
										if(Integer.parseInt(e20)>length)
										{
											Thread.sleep(2000);
											c6g=new ImageIcon(this.getClass().getResource("green.png"));
											c66.setIcon(c6g);
											no20="Node20->";
										}
										else
										{
											Thread.sleep(2000);
											c6r=new ImageIcon(this.getClass().getResource("red.png"));
											c66.setIcon(c6r);
											no20="Node20->";
											cong(no20, e20);
											Thread.sleep(2000);
											c7g=new ImageIcon(this.getClass().getResource("green.png"));
											c77.setIcon(c7g);
											no21="Node21->";
										}
										
									}
									
								}
							}
							else
							{
								if(Integer.parseInt(e19)>length)
								{
									Thread.sleep(2000);
									c5g=new ImageIcon(this.getClass().getResource("green.png"));
									c55.setIcon(c5g);
									no19="Node19->";
									
									if(Integer.parseInt(dis20)<=Integer.parseInt(dis21))
									{
										if(Integer.parseInt(e20)>length)
										{
											Thread.sleep(2000);
											c6g=new ImageIcon(this.getClass().getResource("green.png"));
											c66.setIcon(c6g);
											no20="Node20->";
										}
										else
										{
											Thread.sleep(2000);
											c6r=new ImageIcon(this.getClass().getResource("red.png"));
											c66.setIcon(c6r);
											no20="Node20->";
											cong(no20, e20);
											Thread.sleep(2000);
											c7g=new ImageIcon(this.getClass().getResource("green.png"));
											c77.setIcon(c7g);
											no21="Node21->";
										}
									}
									else
									{
										Thread.sleep(2000);
										c7g=new ImageIcon(this.getClass().getResource("green.png"));
										c77.setIcon(c7g);
										no21="Node21->";
									}
								}
								else
								{
									Thread.sleep(2000);
									c5r=new ImageIcon(this.getClass().getResource("red.png"));
									c55.setIcon(c5r);
									no19="Node19->";
									cong(no19, e19);
									if(Integer.parseInt(e20)>length)
									{
										Thread.sleep(2000);
										c6g=new ImageIcon(this.getClass().getResource("green.png"));
										c66.setIcon(c6g);
										no20="Node20->";
									}
									else
									{
										Thread.sleep(2000);
										c6r=new ImageIcon(this.getClass().getResource("red.png"));
										c66.setIcon(c6r);
										no20="Node20->";
										cong(no20, e20);
										Thread.sleep(2000);
										c7g=new ImageIcon(this.getClass().getResource("green.png"));
										c77.setIcon(c7g);
										no21="Node21->";
									}
									
								}
							}
						}
						else
						{
							Thread.sleep(2000);
							c3r=new ImageIcon(this.getClass().getResource("red.png"));
							c33.setIcon(c3r);
							no17="Node17->";
							cong(no17, e17);
							if(Integer.parseInt(e18)>length)
							{
								Thread.sleep(2000);
								c4g=new ImageIcon(this.getClass().getResource("green.png"));
								c44.setIcon(c4g);
								no18="Node18->";
								
								if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
								{
									if(Integer.parseInt(e19)>length)
									{
										Thread.sleep(2000);
										c5g=new ImageIcon(this.getClass().getResource("green.png"));
										c55.setIcon(c5g);
										no19="Node19->";
										
										if(Integer.parseInt(dis20)<=Integer.parseInt(dis21))
										{
											if(Integer.parseInt(e20)>length)
											{
												Thread.sleep(2000);
												c6g=new ImageIcon(this.getClass().getResource("green.png"));
												c66.setIcon(c6g);
												no20="Node20->";
											}
											else
											{
												Thread.sleep(2000);
												c6r=new ImageIcon(this.getClass().getResource("red.png"));
												c66.setIcon(c6r);
												no20="Node20->";
												cong(no20, e20);
												Thread.sleep(2000);
												c7g=new ImageIcon(this.getClass().getResource("green.png"));
												c77.setIcon(c7g);
												no21="Node21->";
											}
										}
										else
										{
											Thread.sleep(2000);
											c7g=new ImageIcon(this.getClass().getResource("green.png"));
											c77.setIcon(c7g);
											no21="Node21->";
										}
									}
									else
									{
										Thread.sleep(2000);
										c5r=new ImageIcon(this.getClass().getResource("red.png"));
										c55.setIcon(c5r);
										no19="Node19->";
										cong(no19, e19);
										if(Integer.parseInt(e20)>length)
										{
											Thread.sleep(2000);
											c6g=new ImageIcon(this.getClass().getResource("green.png"));
											c66.setIcon(c6g);
											no20="Node20->";
										}
										else
										{
											Thread.sleep(2000);
											c6r=new ImageIcon(this.getClass().getResource("red.png"));
											c66.setIcon(c6r);
											no20="Node20->";
											cong(no20, e20);
											Thread.sleep(2000);
											c7g=new ImageIcon(this.getClass().getResource("green.png"));
											c77.setIcon(c7g);
											no21="Node21->";
										}
										
									}
								}
								else
								{
									if(Integer.parseInt(e20)>length)
									{
										Thread.sleep(2000);
										c6g=new ImageIcon(this.getClass().getResource("green.png"));
										c66.setIcon(c6g);
										no20="Node20->";
									}
									else
									{
										Thread.sleep(2000);
										c6r=new ImageIcon(this.getClass().getResource("red.png"));
										c66.setIcon(c6r);
										no20="Node20->";
										cong(no20, e20);
										Thread.sleep(2000);
										c7g=new ImageIcon(this.getClass().getResource("green.png"));
										c77.setIcon(c7g);
										no21="Node21->";
									}
								}
							}
							else
							{
								Thread.sleep(2000);
								c4r=new ImageIcon(this.getClass().getResource("red.png"));
								c44.setIcon(c4r);
								no18="Node18->";
								cong(no18, e18);
								if(Integer.parseInt(e19)>length)
								{
									Thread.sleep(2000);
									c5g=new ImageIcon(this.getClass().getResource("green.png"));
									c55.setIcon(c5g);
									no19="Node19->";
									
									if(Integer.parseInt(dis20)<=Integer.parseInt(dis21))
									{
										if(Integer.parseInt(e20)>length)
										{
											Thread.sleep(2000);
											c6g=new ImageIcon(this.getClass().getResource("green.png"));
											c66.setIcon(c6g);
											no20="Node20->";
										}
										else
										{
											Thread.sleep(2000);
											c6r=new ImageIcon(this.getClass().getResource("red.png"));
											c66.setIcon(c6r);
											no20="Node20->";
											
											cong(no20, e20);
											
											Thread.sleep(2000);
											c7g=new ImageIcon(this.getClass().getResource("green.png"));
											c77.setIcon(c7g);
											no21="Node21->";
										}
									}
									else
									{
										Thread.sleep(2000);
										c7g=new ImageIcon(this.getClass().getResource("green.png"));
										c77.setIcon(c7g);
										no21="Node21->";
									}
								}
								else
								{
									Thread.sleep(2000);
									c5r=new ImageIcon(this.getClass().getResource("red.png"));
									c55.setIcon(c5r);
									no19="Node19->";
									
									cong(no19, e19);
									
									if(Integer.parseInt(e20)>length)
									{
										Thread.sleep(2000);
										c6g=new ImageIcon(this.getClass().getResource("green.png"));
										c66.setIcon(c6g);
										no20="Node20->";
									}
									else
									{
										
										Thread.sleep(2000);
										c6r=new ImageIcon(this.getClass().getResource("red.png"));
										c66.setIcon(c6r);
										no20="Node20->";
										
										cong(no20, e20);
										
										Thread.sleep(2000);
										c7g=new ImageIcon(this.getClass().getResource("green.png"));
										c77.setIcon(c7g);
										no21="Node21->";
									}
									
								}
								
							}
						}
					}
					
					
					
					

					Thread.sleep(2000);
					d1g=new ImageIcon(this.getClass().getResource("green.png"));
					d11.setIcon(d1g);
					no22="Node22->";
					
					if(Integer.parseInt(dis23)<=Integer.parseInt(dis24))
					{
						if(Integer.parseInt(e23)>length)
						{
							Thread.sleep(2000);
							d2g=new ImageIcon(this.getClass().getResource("green.png"));
							d22.setIcon(d2g);
							no23="Node23->";
							
							if(Integer.parseInt(dis24)<=Integer.parseInt(dis25))
							{
								if(Integer.parseInt(e24)>length)
								{
									Thread.sleep(2000);
									d3g=new ImageIcon(this.getClass().getResource("green.png"));
									d33.setIcon(d3g);
									no24="Node24->";
									
									if(Integer.parseInt(dis25)<=Integer.parseInt(dis26))
									{
										if(Integer.parseInt(e25)>length)
										{
											Thread.sleep(2000);
											d4g=new ImageIcon(this.getClass().getResource("green.png"));
											d44.setIcon(d4g);
											no25="Node25->";
											
											if(Integer.parseInt(dis26)<=Integer.parseInt(dis27))
											{
												if(Integer.parseInt(e26)>length)
												{
													Thread.sleep(2000);
													d5g=new ImageIcon(this.getClass().getResource("green.png"));
													d55.setIcon(d5g);
													no26="Node26->";
													
													if(Integer.parseInt(dis27)<=Integer.parseInt(dis28))
													{
														if(Integer.parseInt(e27)>length)
														{
															Thread.sleep(2000);
															d6g=new ImageIcon(this.getClass().getResource("green.png"));
															d66.setIcon(d6g);
															no27="Node27->";
														}
														else
														{
															Thread.sleep(2000);
															d6r=new ImageIcon(this.getClass().getResource("red.png"));
															d66.setIcon(d6r);
															no27="Node27->";
															cong(no27, e27);
															Thread.sleep(2000);
															d7g=new ImageIcon(this.getClass().getResource("green.png"));
															d77.setIcon(d7g);
															no28="Node28->";
														}
													}
													else
													{
														Thread.sleep(2000);
														d7g=new ImageIcon(this.getClass().getResource("green.png"));
														d77.setIcon(d7g);
														no28="Node28->";
													}
												}
												else
												{
													Thread.sleep(2000);
													d5r=new ImageIcon(this.getClass().getResource("red.png"));
													d55.setIcon(d5r);
													no26="Node26->";
													cong(no26, e26);
													if(Integer.parseInt(e27)>length)
													{
														Thread.sleep(2000);
														d6g=new ImageIcon(this.getClass().getResource("green.png"));
														d66.setIcon(d6g);
														no27="Node27->";
													}
													else
													{
														Thread.sleep(2000);
														d6r=new ImageIcon(this.getClass().getResource("red.png"));
														d66.setIcon(d6r);
														no27="Node27->";
														cong(no27, e27);
														Thread.sleep(2000);
														d7g=new ImageIcon(this.getClass().getResource("green.png"));
														d77.setIcon(d7g);
														no28="Node28->";
													}
													
												}
											}
											else
											{
												if(Integer.parseInt(e27)>length)
												{
													Thread.sleep(2000);
													d6g=new ImageIcon(this.getClass().getResource("green.png"));
													d66.setIcon(d6g);
													no27="Node27->";
												}
												else
												{
													Thread.sleep(2000);
													d6r=new ImageIcon(this.getClass().getResource("red.png"));
													d66.setIcon(d6r);
													no27="Node27->";
													cong(no27, e27);
													Thread.sleep(2000);
													d7g=new ImageIcon(this.getClass().getResource("green.png"));
													d77.setIcon(d7g);
													no28="Node28->";
												}
											}
										}
										else
										{
											Thread.sleep(2000);
											d4r=new ImageIcon(this.getClass().getResource("red.png"));
											d44.setIcon(d4r);
											no25="Node25->";
											cong(no25, e25);
											if(Integer.parseInt(e26)>length)
											{
												Thread.sleep(2000);
												d5g=new ImageIcon(this.getClass().getResource("green.png"));
												d55.setIcon(d5g);
												no26="Node26->";
												
												if(Integer.parseInt(dis27)<=Integer.parseInt(dis28))
												{
													if(Integer.parseInt(e27)>length)
													{
														Thread.sleep(2000);
														d6g=new ImageIcon(this.getClass().getResource("green.png"));
														d66.setIcon(d6g);
														no27="Node27->";
													}
													else
													{
														Thread.sleep(2000);
														d6r=new ImageIcon(this.getClass().getResource("red.png"));
														d66.setIcon(d6r);
														no27="Node27->";
														cong(no27, e27);
														Thread.sleep(2000);
														d7g=new ImageIcon(this.getClass().getResource("green.png"));
														d77.setIcon(d7g);
														no28="Node28->";
													}
												}
												else
												{
													Thread.sleep(2000);
													d7g=new ImageIcon(this.getClass().getResource("green.png"));
													d77.setIcon(d7g);
													no28="Node28->";
												}
											}
											else
											{
												Thread.sleep(2000);
												d5r=new ImageIcon(this.getClass().getResource("red.png"));
												d55.setIcon(d5r);
												no26="Node26->";
												cong(no26, e26);
												if(Integer.parseInt(e27)>length)
												{
													Thread.sleep(2000);
													d6g=new ImageIcon(this.getClass().getResource("green.png"));
													d66.setIcon(d6g);
													no27="Node27->";
												}
												else
												{
													Thread.sleep(2000);
													d6r=new ImageIcon(this.getClass().getResource("red.png"));
													d66.setIcon(d6r);
													no27="Node27->";
													cong(no27, e27);
													Thread.sleep(2000);
													d7g=new ImageIcon(this.getClass().getResource("green.png"));
													d77.setIcon(d7g);
													no28="Node28->";
												}
												
											}
											
										}
									}
									else
									{
										if(Integer.parseInt(e26)>length)
										{
											Thread.sleep(2000);
											d5g=new ImageIcon(this.getClass().getResource("green.png"));
											d55.setIcon(d5g);
											no26="Node26->";
											
											if(Integer.parseInt(dis27)<=Integer.parseInt(dis28))
											{
												if(Integer.parseInt(e27)>length)
												{
													Thread.sleep(2000);
													d6g=new ImageIcon(this.getClass().getResource("green.png"));
													d66.setIcon(d6g);
													no27="Node27->";
												}
												else
												{
													Thread.sleep(2000);
													d6r=new ImageIcon(this.getClass().getResource("red.png"));
													d66.setIcon(d6r);
													no27="Node27->";
													cong(no27, e27);
													Thread.sleep(2000);
													d7g=new ImageIcon(this.getClass().getResource("green.png"));
													d77.setIcon(d7g);
													no28="Node28->";
												}
											}
											else
											{
												Thread.sleep(2000);
												d7g=new ImageIcon(this.getClass().getResource("green.png"));
												d77.setIcon(d7g);
												no28="Node28->";
											}
										}
										else
										{
											Thread.sleep(2000);
											d5r=new ImageIcon(this.getClass().getResource("red.png"));
											d55.setIcon(d5r);
											no26="Node26->";
											cong(no26, e26);
											if(Integer.parseInt(e27)>length)
											{
												Thread.sleep(2000);
												d6g=new ImageIcon(this.getClass().getResource("green.png"));
												d66.setIcon(d6g);
												no27="Node27->";
											}
											else
											{
												Thread.sleep(2000);
												d6r=new ImageIcon(this.getClass().getResource("red.png"));
												d66.setIcon(d6r);
												no27="Node27->";
												cong(no27, e27);
												Thread.sleep(2000);
												d7g=new ImageIcon(this.getClass().getResource("green.png"));
												d77.setIcon(d7g);
												no28="Node28->";
											}
											
										}
									}
								}
								else
								{
									Thread.sleep(2000);
									d3r=new ImageIcon(this.getClass().getResource("red.png"));
									d33.setIcon(d3r);
									no24="Node24->";
									cong(no24, e24);
									if(Integer.parseInt(e25)>length)
									{
										Thread.sleep(2000);
										d4g=new ImageIcon(this.getClass().getResource("green.png"));
										d44.setIcon(d4g);
										no25="Node25->";
										
										if(Integer.parseInt(dis26)<=Integer.parseInt(dis27))
										{
											if(Integer.parseInt(e26)>length)
											{
												Thread.sleep(2000);
												d5g=new ImageIcon(this.getClass().getResource("green.png"));
												d55.setIcon(d5g);
												no26="Node26->";
												
												if(Integer.parseInt(dis27)<=Integer.parseInt(dis28))
												{
													if(Integer.parseInt(e27)>length)
													{
														Thread.sleep(2000);
														d6g=new ImageIcon(this.getClass().getResource("green.png"));
														d66.setIcon(d6g);
														no27="Node27->";
													}
													else
													{
														Thread.sleep(2000);
														d6r=new ImageIcon(this.getClass().getResource("red.png"));
														d66.setIcon(d6r);
														no27="Node27->";
														cong(no27, e27);
														Thread.sleep(2000);
														d7g=new ImageIcon(this.getClass().getResource("green.png"));
														d77.setIcon(d7g);
														no28="Node28->";
													}
												}
												else
												{
													Thread.sleep(2000);
													d7g=new ImageIcon(this.getClass().getResource("green.png"));
													d77.setIcon(d7g);
													no28="Node28->";
												}
											}
											else
											{
												Thread.sleep(2000);
												d5r=new ImageIcon(this.getClass().getResource("red.png"));
												d55.setIcon(d5r);
												no26="Node26->";
												cong(no26, e26);
												if(Integer.parseInt(e27)>length)
												{
													Thread.sleep(2000);
													d6g=new ImageIcon(this.getClass().getResource("green.png"));
													d66.setIcon(d6g);
													no27="Node27->";
												}
												else
												{
													Thread.sleep(2000);
													d6r=new ImageIcon(this.getClass().getResource("red.png"));
													d66.setIcon(d6r);
													no27="Node27->";
													cong(no27, e27);
													Thread.sleep(2000);
													d7g=new ImageIcon(this.getClass().getResource("green.png"));
													d77.setIcon(d7g);
													no28="Node28->";
												}
												
											}
										}
										else
										{
											if(Integer.parseInt(e27)>length)
											{
												Thread.sleep(2000);
												d6g=new ImageIcon(this.getClass().getResource("green.png"));
												d66.setIcon(d6g);
												no27="Node27->";
											}
											else
											{
												Thread.sleep(2000);
												d6r=new ImageIcon(this.getClass().getResource("red.png"));
												d66.setIcon(d6r);
												no27="Node27->";
												cong(no27, e27);
												Thread.sleep(2000);
												d7g=new ImageIcon(this.getClass().getResource("green.png"));
												d77.setIcon(d7g);
												no28="Node28->";
											}
										}
									}
									else
									{
										Thread.sleep(2000);
										d4r=new ImageIcon(this.getClass().getResource("red.png"));
										d44.setIcon(d4r);
										no25="Node25->";
										cong(no25, e25);
										if(Integer.parseInt(e26)>length)
										{
											Thread.sleep(2000);
											d5g=new ImageIcon(this.getClass().getResource("green.png"));
											d55.setIcon(d5g);
											no26="Node26->";
											
											if(Integer.parseInt(dis27)<=Integer.parseInt(dis28))
											{
												if(Integer.parseInt(e27)>length)
												{
													Thread.sleep(2000);
													d6g=new ImageIcon(this.getClass().getResource("green.png"));
													d66.setIcon(d6g);
													no27="Node27->";
												}
												else
												{
													Thread.sleep(2000);
													d6r=new ImageIcon(this.getClass().getResource("red.png"));
													d66.setIcon(d6r);
													no27="Node27->";
													cong(no27, e27);
													Thread.sleep(2000);
													d7g=new ImageIcon(this.getClass().getResource("green.png"));
													d77.setIcon(d7g);
													no28="Node28->";
												}
											}
											else
											{
												Thread.sleep(2000);
												d7g=new ImageIcon(this.getClass().getResource("green.png"));
												d77.setIcon(d7g);
												no28="Node28->";
											}
										}
										else
										{
											Thread.sleep(2000);
											d5r=new ImageIcon(this.getClass().getResource("red.png"));
											d55.setIcon(d5r);
											no26="Node26->";
											cong(no26, e26);
											if(Integer.parseInt(e27)>length)
											{
												Thread.sleep(2000);
												d6g=new ImageIcon(this.getClass().getResource("green.png"));
												d66.setIcon(d6g);
												no27="Node27->";
											}
											else
											{
												Thread.sleep(2000);
												d6r=new ImageIcon(this.getClass().getResource("red.png"));
												d66.setIcon(d6r);
												no27="Node27->";
												cong(no27, e27);
												Thread.sleep(2000);
												d7g=new ImageIcon(this.getClass().getResource("green.png"));
												d77.setIcon(d7g);
												no28="Node28->";
											}
											
										}
										
									}
								}
							}
							else
							{
								if(Integer.parseInt(e25)>length)
								{
									Thread.sleep(2000);
									d4g=new ImageIcon(this.getClass().getResource("green.png"));
									d44.setIcon(d4g);
									no25="Node25->";
									
									if(Integer.parseInt(dis26)<=Integer.parseInt(dis27))
									{
										if(Integer.parseInt(e26)>length)
										{
											Thread.sleep(2000);
											d5g=new ImageIcon(this.getClass().getResource("green.png"));
											d55.setIcon(d5g);
											no26="Node26->";
											
											if(Integer.parseInt(dis27)<=Integer.parseInt(dis28))
											{
												if(Integer.parseInt(e27)>length)
												{
													Thread.sleep(2000);
													d6g=new ImageIcon(this.getClass().getResource("green.png"));
													d66.setIcon(d6g);
													no27="Node27->";
												}
												else
												{
													Thread.sleep(2000);
													d6r=new ImageIcon(this.getClass().getResource("red.png"));
													d66.setIcon(d6r);
													no27="Node27->";
													cong(no27, e27);
													Thread.sleep(2000);
													d7g=new ImageIcon(this.getClass().getResource("green.png"));
													d77.setIcon(d7g);
													no28="Node28->";
												}
											}
											else
											{
												Thread.sleep(2000);
												d7g=new ImageIcon(this.getClass().getResource("green.png"));
												d77.setIcon(d7g);
												no28="Node28->";
											}
										}
										else
										{
											Thread.sleep(2000);
											d5r=new ImageIcon(this.getClass().getResource("red.png"));
											d55.setIcon(d5r);
											no26="Node26->";
											cong(no26, e26);
											if(Integer.parseInt(e27)>length)
											{
												Thread.sleep(2000);
												d6g=new ImageIcon(this.getClass().getResource("green.png"));
												d66.setIcon(d6g);
												no27="Node27->";
											}
											else
											{
												Thread.sleep(2000);
												d6r=new ImageIcon(this.getClass().getResource("red.png"));
												d66.setIcon(d6r);
												no27="Node27->";
												cong(no27, e27);
												Thread.sleep(2000);
												d7g=new ImageIcon(this.getClass().getResource("green.png"));
												d77.setIcon(d7g);
												no28="Node28->";
											}
											
										}
									}
									else
									{
										if(Integer.parseInt(e27)>length)
										{
											Thread.sleep(2000);
											d6g=new ImageIcon(this.getClass().getResource("green.png"));
											d66.setIcon(d6g);
											no27="Node27->";
										}
										else
										{
											Thread.sleep(2000);
											d6r=new ImageIcon(this.getClass().getResource("red.png"));
											d66.setIcon(d6r);
											no27="Node27->";
											cong(no27, e27);
											Thread.sleep(2000);
											d7g=new ImageIcon(this.getClass().getResource("green.png"));
											d77.setIcon(d7g);
											no28="Node28->";
										}
									}
								}
								else
								{
									Thread.sleep(2000);
									d4r=new ImageIcon(this.getClass().getResource("red.png"));
									d44.setIcon(d4r);
									no25="Node25->";
									cong(no25, e25);
									if(Integer.parseInt(e26)>length)
									{
										Thread.sleep(2000);
										d5g=new ImageIcon(this.getClass().getResource("green.png"));
										d55.setIcon(d5g);
										no26="Node26->";
										
										if(Integer.parseInt(dis27)<=Integer.parseInt(dis28))
										{
											if(Integer.parseInt(e27)>length)
											{
												Thread.sleep(2000);
												d6g=new ImageIcon(this.getClass().getResource("green.png"));
												d66.setIcon(d6g);
												no27="Node27->";
											}
											else
											{
												Thread.sleep(2000);
												d6r=new ImageIcon(this.getClass().getResource("red.png"));
												d66.setIcon(d6r);
												no27="Node27->";
												cong(no27, e27);
												Thread.sleep(2000);
												d7g=new ImageIcon(this.getClass().getResource("green.png"));
												d77.setIcon(d7g);
												no28="Node28->";
											}
										}
										else
										{
											Thread.sleep(2000);
											d7g=new ImageIcon(this.getClass().getResource("green.png"));
											d77.setIcon(d7g);
											no28="Node28->";
										}
									}
									else
									{
										Thread.sleep(2000);
										d5r=new ImageIcon(this.getClass().getResource("red.png"));
										d55.setIcon(d5r);
										no26="Node26->";
										cong(no26, e26);
										if(Integer.parseInt(e27)>length)
										{
											Thread.sleep(2000);
											d6g=new ImageIcon(this.getClass().getResource("green.png"));
											d66.setIcon(d6g);
											no27="Node27->";
										}
										else
										{
											Thread.sleep(2000);
											d6r=new ImageIcon(this.getClass().getResource("red.png"));
											d66.setIcon(d6r);
											no27="Node27->";
											cong(no27, e27);
											Thread.sleep(2000);
											d7g=new ImageIcon(this.getClass().getResource("green.png"));
											d77.setIcon(d7g);
											no28="Node28->";
										}
										
									}
									
								}
							}
						}
						else
						{
							Thread.sleep(2000);
							d2r=new ImageIcon(this.getClass().getResource("red.png"));
							d22.setIcon(d2r);
							no23="Node23->";
							cong(no23, e23);
							if(Integer.parseInt(e24)>length)
							{
								Thread.sleep(2000);
								d3g=new ImageIcon(this.getClass().getResource("green.png"));
								d33.setIcon(d3g);
								no24="Node24->";
								
								if(Integer.parseInt(dis25)<=Integer.parseInt(dis26))
								{
									if(Integer.parseInt(e25)>length)
									{
										Thread.sleep(2000);
										d4g=new ImageIcon(this.getClass().getResource("green.png"));
										d44.setIcon(d4g);
										no25="Node25->";
										
										if(Integer.parseInt(dis26)<=Integer.parseInt(dis27))
										{
											if(Integer.parseInt(e26)>length)
											{
												Thread.sleep(2000);
												d5g=new ImageIcon(this.getClass().getResource("green.png"));
												d55.setIcon(d5g);
												no26="Node26->";
												
												if(Integer.parseInt(dis27)<=Integer.parseInt(dis28))
												{
													if(Integer.parseInt(e27)>length)
													{
														Thread.sleep(2000);
														d6g=new ImageIcon(this.getClass().getResource("green.png"));
														d66.setIcon(d6g);
														no27="Node27->";
													}
													else
													{
														Thread.sleep(2000);
														d6r=new ImageIcon(this.getClass().getResource("red.png"));
														d66.setIcon(d6r);
														no27="Node27->";
														cong(no27, e27);
														Thread.sleep(2000);
														d7g=new ImageIcon(this.getClass().getResource("green.png"));
														d77.setIcon(d7g);
														no28="Node28->";
													}
												}
												else
												{
													Thread.sleep(2000);
													d7g=new ImageIcon(this.getClass().getResource("green.png"));
													d77.setIcon(d7g);
													no28="Node28->";
												}
											}
											else
											{
												Thread.sleep(2000);
												d5r=new ImageIcon(this.getClass().getResource("red.png"));
												d55.setIcon(d5r);
												no26="Node26->";
												cong(no26, e26);
												if(Integer.parseInt(e27)>length)
												{
													Thread.sleep(2000);
													d6g=new ImageIcon(this.getClass().getResource("green.png"));
													d66.setIcon(d6g);
													no27="Node27->";
												}
												else
												{
													Thread.sleep(2000);
													d6r=new ImageIcon(this.getClass().getResource("red.png"));
													d66.setIcon(d6r);
													no27="Node27->";
													cong(no27, e27);
													Thread.sleep(2000);
													d7g=new ImageIcon(this.getClass().getResource("green.png"));
													d77.setIcon(d7g);
													no28="Node28->";
												}
												
											}
										}
										else
										{
											if(Integer.parseInt(e27)>length)
											{
												Thread.sleep(2000);
												d6g=new ImageIcon(this.getClass().getResource("green.png"));
												d66.setIcon(d6g);
												no27="Node27->";
											}
											else
											{
												
												Thread.sleep(2000);
												d6r=new ImageIcon(this.getClass().getResource("red.png"));
												d66.setIcon(d6r);
												no27="Node27->";
												cong(no27, e27);
												Thread.sleep(2000);
												d7g=new ImageIcon(this.getClass().getResource("green.png"));
												d77.setIcon(d7g);
												no28="Node28->";
											}
										}
									}
									else
									{
										Thread.sleep(2000);
										d4r=new ImageIcon(this.getClass().getResource("red.png"));
										d44.setIcon(d4r);
										no25="Node25->";
										cong(no25, e25);
										if(Integer.parseInt(e26)>length)
										{
											Thread.sleep(2000);
											d5g=new ImageIcon(this.getClass().getResource("green.png"));
											d55.setIcon(d5g);
											no26="Node26->";
											
											if(Integer.parseInt(dis27)<=Integer.parseInt(dis28))
											{
												if(Integer.parseInt(e27)>length)
												{
													Thread.sleep(2000);
													d6g=new ImageIcon(this.getClass().getResource("green.png"));
													d66.setIcon(d6g);
													no27="Node27->";
												}
												else
												{
													Thread.sleep(2000);
													d6r=new ImageIcon(this.getClass().getResource("red.png"));
													d66.setIcon(d6r);
													no27="Node27->";
													cong(no27, e27);
													Thread.sleep(2000);
													d7g=new ImageIcon(this.getClass().getResource("green.png"));
													d77.setIcon(d7g);
													no28="Node28->";
												}
											}
											else
											{
												Thread.sleep(2000);
												d7g=new ImageIcon(this.getClass().getResource("green.png"));
												d77.setIcon(d7g);
												no28="Node28->";
											}
										}
										else
										{
											Thread.sleep(2000);
											d5r=new ImageIcon(this.getClass().getResource("red.png"));
											d55.setIcon(d5r);
											no26="Node26->";
											cong(no26, e26);
											if(Integer.parseInt(e27)>length)
											{
												Thread.sleep(2000);
												d6g=new ImageIcon(this.getClass().getResource("green.png"));
												d66.setIcon(d6g);
												no27="Node27->";
											}
											else
											{
												Thread.sleep(2000);
												d6r=new ImageIcon(this.getClass().getResource("red.png"));
												d66.setIcon(d6r);
												no27="Node27->";
												cong(no27, e27);
												Thread.sleep(2000);
												d7g=new ImageIcon(this.getClass().getResource("green.png"));
												d77.setIcon(d7g);
												no28="Node28->";
											}
											
										}
										
									}
								}
								else
								{
									if(Integer.parseInt(e26)>length)
									{
										Thread.sleep(2000);
										d5g=new ImageIcon(this.getClass().getResource("green.png"));
										d55.setIcon(d5g);
										no26="Node26->";
										
										if(Integer.parseInt(dis27)<=Integer.parseInt(dis28))
										{
											if(Integer.parseInt(e27)>length)
											{
												Thread.sleep(2000);
												d6g=new ImageIcon(this.getClass().getResource("green.png"));
												d66.setIcon(d6g);
												no27="Node27->";
											}
											else
											{
												Thread.sleep(2000);
												d6r=new ImageIcon(this.getClass().getResource("red.png"));
												d66.setIcon(d6r);
												no27="Node27->";
												cong(no27, e27);
												Thread.sleep(2000);
												d7g=new ImageIcon(this.getClass().getResource("green.png"));
												d77.setIcon(d7g);
												no28="Node28->";
											}
										}
										else
										{
											Thread.sleep(2000);
											d7g=new ImageIcon(this.getClass().getResource("green.png"));
											d77.setIcon(d7g);
											no28="Node28->";
										}
									}
									else
									{
										Thread.sleep(2000);
										d5r=new ImageIcon(this.getClass().getResource("red.png"));
										d55.setIcon(d5r);
										no26="Node26->";
										cong(no26, e26);
										if(Integer.parseInt(e27)>length)
										{
											Thread.sleep(2000);
											d6g=new ImageIcon(this.getClass().getResource("green.png"));
											d66.setIcon(d6g);
											no27="Node27->";
										}
										else
										{
											Thread.sleep(2000);
											d6r=new ImageIcon(this.getClass().getResource("red.png"));
											d66.setIcon(d6r);
											no27="Node27->";
											cong(no27, e27);
											Thread.sleep(2000);
											d7g=new ImageIcon(this.getClass().getResource("green.png"));
											d77.setIcon(d7g);
											no28="Node28->";
										}
										
									}
								}
							}
							else
							{
								Thread.sleep(2000);
								d3r=new ImageIcon(this.getClass().getResource("red.png"));
								d33.setIcon(d3r);
								no24="Node24->";
								cong(no24, e24);
								if(Integer.parseInt(e25)>length)
								{
									Thread.sleep(2000);
									d4g=new ImageIcon(this.getClass().getResource("green.png"));
									d44.setIcon(d4g);
									no25="Node25->";
									
									if(Integer.parseInt(dis26)<=Integer.parseInt(dis27))
									{
										if(Integer.parseInt(e26)>length)
										{
											Thread.sleep(2000);
											d5g=new ImageIcon(this.getClass().getResource("green.png"));
											d55.setIcon(d5g);
											no26="Node26->";
											
											if(Integer.parseInt(dis27)<=Integer.parseInt(dis28))
											{
												if(Integer.parseInt(e27)>length)
												{
													Thread.sleep(2000);
													d6g=new ImageIcon(this.getClass().getResource("green.png"));
													d66.setIcon(d6g);
													no27="Node27->";
												}
												else
												{
													Thread.sleep(2000);
													d6r=new ImageIcon(this.getClass().getResource("red.png"));
													d66.setIcon(d6r);
													no27="Node27->";
													cong(no27, e27);
													Thread.sleep(2000);
													d7g=new ImageIcon(this.getClass().getResource("green.png"));
													d77.setIcon(d7g);
													no28="Node28->";
												}
											}
											else
											{
												Thread.sleep(2000);
												d7g=new ImageIcon(this.getClass().getResource("green.png"));
												d77.setIcon(d7g);
												no28="Node28->";
											}
										}
										else
										{
											Thread.sleep(2000);
											d5r=new ImageIcon(this.getClass().getResource("red.png"));
											d55.setIcon(d5r);
											no26="Node26->";
											cong(no26, e26);
											if(Integer.parseInt(e27)>length)
											{
												Thread.sleep(2000);
												d6g=new ImageIcon(this.getClass().getResource("green.png"));
												d66.setIcon(d6g);
												no27="Node27->";
											}
											else
											{
												Thread.sleep(2000);
												d6r=new ImageIcon(this.getClass().getResource("red.png"));
												d66.setIcon(d6r);
												no27="Node27->";
												cong(no27, e27);
												Thread.sleep(2000);
												d7g=new ImageIcon(this.getClass().getResource("green.png"));
												d77.setIcon(d7g);
												no28="Node28->";
											}
											
										}
									}
									else
									{
										if(Integer.parseInt(e27)>length)
										{
											Thread.sleep(2000);
											d6g=new ImageIcon(this.getClass().getResource("green.png"));
											d66.setIcon(d6g);
											no27="Node27->";
										}
										else
										{
											Thread.sleep(2000);
											d6r=new ImageIcon(this.getClass().getResource("red.png"));
											d66.setIcon(d6r);
											no27="Node27->";
											cong(no27, e27);
											Thread.sleep(2000);
											d7g=new ImageIcon(this.getClass().getResource("green.png"));
											d77.setIcon(d7g);
											no28="Node28->";
										}
									}
								}
								else
								{
									Thread.sleep(2000);
									d4r=new ImageIcon(this.getClass().getResource("red.png"));
									d44.setIcon(d4r);
									no25="Node25->";
									cong(no25, e25);
									if(Integer.parseInt(e26)>length)
									{
										Thread.sleep(2000);
										d5g=new ImageIcon(this.getClass().getResource("green.png"));
										d55.setIcon(d5g);
										no26="Node26->";
										
										if(Integer.parseInt(dis27)<=Integer.parseInt(dis28))
										{
											if(Integer.parseInt(e27)>length)
											{
												Thread.sleep(2000);
												d6g=new ImageIcon(this.getClass().getResource("green.png"));
												d66.setIcon(d6g);
												no27="Node27->";
											}
											else
											{
												Thread.sleep(2000);
												d6r=new ImageIcon(this.getClass().getResource("red.png"));
												d66.setIcon(d6r);
												no27="Node27->";
												cong(no27, e27);
												Thread.sleep(2000);
												d7g=new ImageIcon(this.getClass().getResource("green.png"));
												d77.setIcon(d7g);
												no28="Node28->";
											}
										}
										else
										{
											Thread.sleep(2000);
											d7g=new ImageIcon(this.getClass().getResource("green.png"));
											d77.setIcon(d7g);
											no28="Node28->";
										}
									}
									else
									{
										Thread.sleep(2000);
										d5r=new ImageIcon(this.getClass().getResource("red.png"));
										d55.setIcon(d5r);
										no26="Node26->";
										cong(no26, e26);
										if(Integer.parseInt(e27)>length)
										{
											Thread.sleep(2000);
											d6g=new ImageIcon(this.getClass().getResource("green.png"));
											d66.setIcon(d6g);
											no27="Node27->";
										}
										else
										{
											Thread.sleep(2000);
											d6r=new ImageIcon(this.getClass().getResource("red.png"));
											d66.setIcon(d6r);
											no27="Node27->";
											cong(no27, e27);
											Thread.sleep(2000);
											d7g=new ImageIcon(this.getClass().getResource("green.png"));
											d77.setIcon(d7g);
											no28="Node28->";
										}
										
									}
									
								}
							}
						}
					}
					else
					{
						if(Integer.parseInt(e24)>length)
						{
							Thread.sleep(2000);
							d3g=new ImageIcon(this.getClass().getResource("green.png"));
							d33.setIcon(d3g);
							no24="Node24->";
							
							if(Integer.parseInt(dis25)<=Integer.parseInt(dis26))
							{
								if(Integer.parseInt(e25)>length)
								{
									Thread.sleep(2000);
									d4g=new ImageIcon(this.getClass().getResource("green.png"));
									d44.setIcon(d4g);
									no25="Node25->";
									
									if(Integer.parseInt(dis26)<=Integer.parseInt(dis27))
									{
										if(Integer.parseInt(e26)>length)
										{
											Thread.sleep(2000);
											d5g=new ImageIcon(this.getClass().getResource("green.png"));
											d55.setIcon(d5g);
											no26="Node26->";
											
											if(Integer.parseInt(dis27)<=Integer.parseInt(dis28))
											{
												if(Integer.parseInt(e27)>length)
												{
													Thread.sleep(2000);
													d6g=new ImageIcon(this.getClass().getResource("green.png"));
													d66.setIcon(d6g);
													no27="Node27->";
												}
												else
												{
													Thread.sleep(2000);
													d6r=new ImageIcon(this.getClass().getResource("red.png"));
													d66.setIcon(d6r);
													no27="Node27->";
													cong(no27, e27);
													Thread.sleep(2000);
													d7g=new ImageIcon(this.getClass().getResource("green.png"));
													d77.setIcon(d7g);
													no28="Node28->";
												}
											}
											else
											{
												Thread.sleep(2000);
												d7g=new ImageIcon(this.getClass().getResource("green.png"));
												d77.setIcon(d7g);
												no28="Node28->";
											}
										}
										else
										{
											Thread.sleep(2000);
											d5r=new ImageIcon(this.getClass().getResource("red.png"));
											d55.setIcon(d5r);
											no26="Node26->";
											cong(no26, e26);
											if(Integer.parseInt(e27)>length)
											{
												Thread.sleep(2000);
												d6g=new ImageIcon(this.getClass().getResource("green.png"));
												d66.setIcon(d6g);
												no27="Node27->";
											}
											else
											{
												Thread.sleep(2000);
												d6r=new ImageIcon(this.getClass().getResource("red.png"));
												d66.setIcon(d6r);
												no27="Node27->";
												cong(no27, e27);
												Thread.sleep(2000);
												d7g=new ImageIcon(this.getClass().getResource("green.png"));
												d77.setIcon(d7g);
												no28="Node28->";
											}
											
										}
									}
									else
									{
										if(Integer.parseInt(e27)>length)
										{
											Thread.sleep(2000);
											d6g=new ImageIcon(this.getClass().getResource("green.png"));
											d66.setIcon(d6g);
											no27="Node27->";
										}
										else
										{
											Thread.sleep(2000);
											d6r=new ImageIcon(this.getClass().getResource("red.png"));
											d66.setIcon(d6r);
											no27="Node27->";
											cong(no27, e27);
											Thread.sleep(2000);
											d7g=new ImageIcon(this.getClass().getResource("green.png"));
											d77.setIcon(d7g);
											no28="Node28->";
										}
									}
								}
								else
								{
									Thread.sleep(2000);
									d4r=new ImageIcon(this.getClass().getResource("red.png"));
									d44.setIcon(d4r);
									no25="Node25->";
									cong(no25, e25);
									if(Integer.parseInt(e26)>length)
									{
										Thread.sleep(2000);
										d5g=new ImageIcon(this.getClass().getResource("green.png"));
										d55.setIcon(d5g);
										no26="Node26->";
										
										if(Integer.parseInt(dis27)<=Integer.parseInt(dis28))
										{
											if(Integer.parseInt(e27)>length)
											{
												Thread.sleep(2000);
												d6g=new ImageIcon(this.getClass().getResource("green.png"));
												d66.setIcon(d6g);
												no27="Node27->";
											}
											else
											{
												Thread.sleep(2000);
												d6r=new ImageIcon(this.getClass().getResource("red.png"));
												d66.setIcon(d6r);
												no27="Node27->";
												cong(no27, e27);
												Thread.sleep(2000);
												d7g=new ImageIcon(this.getClass().getResource("green.png"));
												d77.setIcon(d7g);
												no28="Node28->";
											}
										}
										else
										{
											Thread.sleep(2000);
											d7g=new ImageIcon(this.getClass().getResource("green.png"));
											d77.setIcon(d7g);
											no28="Node28->";
										}
									}
									else
									{
										Thread.sleep(2000);
										d5r=new ImageIcon(this.getClass().getResource("red.png"));
										d55.setIcon(d5r);
										no26="Node26->";
										cong(no26, e26);
										if(Integer.parseInt(e27)>length)
										{
											Thread.sleep(2000);
											d6g=new ImageIcon(this.getClass().getResource("green.png"));
											d66.setIcon(d6g);
											no27="Node27->";
										}
										else
										{
											Thread.sleep(2000);
											d6r=new ImageIcon(this.getClass().getResource("red.png"));
											d66.setIcon(d6r);
											no27="Node27->";
											cong(no27, e27);
											Thread.sleep(2000);
											d7g=new ImageIcon(this.getClass().getResource("green.png"));
											d77.setIcon(d7g);
											no28="Node28->";
										}
										
									}
									
								}
							}
							else
							{
								if(Integer.parseInt(e26)>length)
								{
									Thread.sleep(2000);
									d5g=new ImageIcon(this.getClass().getResource("green.png"));
									d55.setIcon(d5g);
									no26="Node26->";
									
									if(Integer.parseInt(dis27)<=Integer.parseInt(dis28))
									{
										if(Integer.parseInt(e27)>length)
										{
											Thread.sleep(2000);
											d6g=new ImageIcon(this.getClass().getResource("green.png"));
											d66.setIcon(d6g);
											no27="Node27->";
										}
										else
										{
											Thread.sleep(2000);
											d6r=new ImageIcon(this.getClass().getResource("red.png"));
											d66.setIcon(d6r);
											no27="Node27->";
											cong(no27, e27);
											Thread.sleep(2000);
											d7g=new ImageIcon(this.getClass().getResource("green.png"));
											d77.setIcon(d7g);
											no28="Node28->";
										}
									}
									else
									{
										Thread.sleep(2000);
										d7g=new ImageIcon(this.getClass().getResource("green.png"));
										d77.setIcon(d7g);
										no28="Node28->";
									}
								}
								else
								{
									Thread.sleep(2000);
									d5r=new ImageIcon(this.getClass().getResource("red.png"));
									d55.setIcon(d5r);
									no26="Node26->";
									cong(no26, e26);
									if(Integer.parseInt(e27)>length)
									{
										Thread.sleep(2000);
										d6g=new ImageIcon(this.getClass().getResource("green.png"));
										d66.setIcon(d6g);
										no27="Node27->";
									}
									else
									{
										Thread.sleep(2000);
										d6r=new ImageIcon(this.getClass().getResource("red.png"));
										d66.setIcon(d6r);
										no27="Node27->";
										cong(no27, e27);
										Thread.sleep(2000);
										d7g=new ImageIcon(this.getClass().getResource("green.png"));
										d77.setIcon(d7g);
										no28="Node28->";
									}
									
								}
							}
						}
						else
						{
							Thread.sleep(2000);
							d3r=new ImageIcon(this.getClass().getResource("red.png"));
							d33.setIcon(d3r);
							no24="Node24->";
							cong(no24, e24);
							if(Integer.parseInt(e25)>length)
							{
								Thread.sleep(2000);
								d4g=new ImageIcon(this.getClass().getResource("green.png"));
								d44.setIcon(d4g);
								no25="Node25->";
								
								if(Integer.parseInt(dis26)<=Integer.parseInt(dis27))
								{
									if(Integer.parseInt(e26)>length)
									{
										Thread.sleep(2000);
										d5g=new ImageIcon(this.getClass().getResource("green.png"));
										d55.setIcon(d5g);
										no26="Node26->";
										
										if(Integer.parseInt(dis27)<=Integer.parseInt(dis28))
										{
											if(Integer.parseInt(e27)>length)
											{
												Thread.sleep(2000);
												d6g=new ImageIcon(this.getClass().getResource("green.png"));
												d66.setIcon(d6g);
												no27="Node27->";
											}
											else
											{
												Thread.sleep(2000);
												d6r=new ImageIcon(this.getClass().getResource("red.png"));
												d66.setIcon(d6r);
												no27="Node27->";
												cong(no27, e27);
												Thread.sleep(2000);
												d7g=new ImageIcon(this.getClass().getResource("green.png"));
												d77.setIcon(d7g);
												no28="Node28->";
											}
										}
										else
										{
											Thread.sleep(2000);
											d7g=new ImageIcon(this.getClass().getResource("green.png"));
											d77.setIcon(d7g);
											no28="Node28->";
										}
									}
									else
									{
										Thread.sleep(2000);
										d5r=new ImageIcon(this.getClass().getResource("red.png"));
										d55.setIcon(d5r);
										no26="Node26->";
										cong(no26, e26);
										if(Integer.parseInt(e27)>length)
										{
											Thread.sleep(2000);
											d6g=new ImageIcon(this.getClass().getResource("green.png"));
											d66.setIcon(d6g);
											no27="Node27->";
										}
										else
										{
											Thread.sleep(2000);
											d6r=new ImageIcon(this.getClass().getResource("red.png"));
											d66.setIcon(d6r);
											no27="Node27->";
											cong(no27, e27);
											Thread.sleep(2000);
											d7g=new ImageIcon(this.getClass().getResource("green.png"));
											d77.setIcon(d7g);
											no28="Node28->";
										}
										
									}
								}
								else
								{
									if(Integer.parseInt(e27)>length)
									{
										Thread.sleep(2000);
										d6g=new ImageIcon(this.getClass().getResource("green.png"));
										d66.setIcon(d6g);
										no27="Node27->";
									}
									else
									{
										Thread.sleep(2000);
										d6r=new ImageIcon(this.getClass().getResource("red.png"));
										d66.setIcon(d6r);
										no27="Node27->";
										cong(no27, e27);
										Thread.sleep(2000);
										d7g=new ImageIcon(this.getClass().getResource("green.png"));
										d77.setIcon(d7g);
										no28="Node28->";
									}
								}
							}
							else
							{
								Thread.sleep(2000);
								d4r=new ImageIcon(this.getClass().getResource("red.png"));
								d44.setIcon(d4r);
								no25="Node25->";
								cong(no25, e25);
								if(Integer.parseInt(e26)>length)
								{
									Thread.sleep(2000);
									d5g=new ImageIcon(this.getClass().getResource("green.png"));
									d55.setIcon(d5g);
									no26="Node26->";
									
									if(Integer.parseInt(dis27)<=Integer.parseInt(dis28))
									{
										if(Integer.parseInt(e27)>length)
										{
											Thread.sleep(2000);
											d6g=new ImageIcon(this.getClass().getResource("green.png"));
											d66.setIcon(d6g);
											no27="Node27->";
										}
										else
										{
											Thread.sleep(2000);
											d6r=new ImageIcon(this.getClass().getResource("red.png"));
											d66.setIcon(d6r);
											no27="Node27->";
											
											cong(no27, e27);
											
											Thread.sleep(2000);
											d7g=new ImageIcon(this.getClass().getResource("green.png"));
											d77.setIcon(d7g);
											no28="Node28->";
										}
									}
									else
									{
										Thread.sleep(2000);
										d7g=new ImageIcon(this.getClass().getResource("green.png"));
										d77.setIcon(d7g);
										no28="Node28->";
									}
								}
								else
								{
									Thread.sleep(2000);
									d5r=new ImageIcon(this.getClass().getResource("red.png"));
									d55.setIcon(d5r);
									no26="Node26->";
									
									cong(no26, e26);
									
									if(Integer.parseInt(e27)>length)
									{
										Thread.sleep(2000);
										d6g=new ImageIcon(this.getClass().getResource("green.png"));
										d66.setIcon(d6g);
										no27="Node27->";
									}
									else
									{
										
										Thread.sleep(2000);
										d6r=new ImageIcon(this.getClass().getResource("red.png"));
										d66.setIcon(d6r);
										no27="Node27->";
										
										cong(no27, e27);
										
										Thread.sleep(2000);
										d7g=new ImageIcon(this.getClass().getResource("green.png"));
										d77.setIcon(d7g);
										no28="Node28->";
									}
									
								}
								
							}
						}
					}
					clear();
					 
					String path=no1+no2+no3+no4+no5+no6+no7+no8+no9+no10+no11+no12+no13+no14+no15+no16+no17+no18+no19+no20+no21+no22+no23+no24+no25+no26+no27+no28+no29+no30+no31+no32;
					
					JOptionPane.showMessageDialog(null,"Neighbour Path="+path);
					
					
					double end =System.currentTimeMillis();
					System.out.println("The Ending Time "+end);


					double timeDelay = end-start;
					
					double energy=((timeDelay/ct.length())*1024);

					System.out.println("Total Time Delay "+timeDelay);
					SimpleDateFormat dateFormat = new SimpleDateFormat();
				       //get current date time with Date()
				    Date date = new Date();
				       
				    String dt=dateFormat.format(date);
					Statement fin2=connect.createStatement();
					String sin2="insert into TimeDelay values('"+fname+"','"+dest+"','"+String.valueOf(timeDelay)+"','"+path+"','"+dt+"','"+String.valueOf(energy)+"')";
					fin2.executeUpdate(sin2);
					
					
					long etime=System.currentTimeMillis();      
		            long ttime=etime-stime;
		            String t1=Long.toString(ttime);
		            
		            
		                
			            
					
			            
			            long tpt=(ttime/ct.length())*1000;
			            
			            long roverhead=(ct.length()/16)*100;
			            
			 
			            String sql11 = "insert into results values('"+fname+"','"+ttime+"','"+tpt+"','"+roverhead+"') ";
						Statement stmt1 = connect.createStatement();
						stmt1.executeUpdate(sql11);
					
				
					 
					if(dest.equalsIgnoreCase("Dest A"))
					{
						Socket dest1=new Socket("localhost",9991);
						DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
						dos91.writeUTF(fname);
						dos91.writeUTF(AES.decrypt(ct, keyWord));
						
						DataInputStream ins=new DataInputStream(dest1.getInputStream());
						String msg=ins.readUTF();
						
						DataOutputStream dou = new DataOutputStream(cn.getOutputStream());
						dou.writeUTF(msg);
					}
					if(dest.equalsIgnoreCase("Dest B"))
					{
						Socket dest1=new Socket("localhost",9992);
						DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
						dos91.writeUTF(fname);
						dos91.writeUTF(AES.decrypt(ct, keyWord));
						
						DataInputStream ins=new DataInputStream(dest1.getInputStream());
						String msg=ins.readUTF();
						
						DataOutputStream dou = new DataOutputStream(cn.getOutputStream());
						dou.writeUTF(msg);
					}
					if(dest.equalsIgnoreCase("Dest C"))
					{
						Socket dest1=new Socket("localhost",9993);
						DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
						dos91.writeUTF(fname);
						dos91.writeUTF(AES.decrypt(ct, keyWord));
						
						DataInputStream ins=new DataInputStream(dest1.getInputStream());
						String msg=ins.readUTF();
						
						DataOutputStream dou = new DataOutputStream(cn.getOutputStream());
						dou.writeUTF(msg);
						
					}
					}
					
				}
					catch(Exception es){System.out.println(es);
										
					}
					
				}
			
			if(this.port==4444)
			{
				try
				{
					ServerSocket sst = new ServerSocket(4444);
					Socket cn;
					while (true) 
					{
						
					cn = sst.accept();
					
					DataInputStream in3=new DataInputStream(cn.getInputStream());
					String cluster=in3.readUTF();
					String node=in3.readUTF();
					
					Dbcon db = new Dbcon();
					Connection connect =db.getConnection();
					String ene ="";
					if(cluster.equalsIgnoreCase("Network1"))
					{
						ResultSet r1=connect.createStatement().executeQuery("select * from Network1 where name='"+node+"'");
						
						if(r1.next()==true)
						{
							
							 ene = r1.getString(2);
							
							DataOutputStream d = new DataOutputStream(cn.getOutputStream());
							d.writeUTF("attack");
							d.writeUTF(ene);
						}
					}
					
					if(cluster.equalsIgnoreCase("Network2"))
					{
						ResultSet r1=connect.createStatement().executeQuery("select * from Network2 where name='"+node+"'");
						
						if(r1.next()==true)
						{
							
							 ene = r1.getString(2);
							
							DataOutputStream d = new DataOutputStream(cn.getOutputStream());
							d.writeUTF("attack");
							d.writeUTF(ene);
						}
					}
					if(cluster.equalsIgnoreCase("Network3"))
					{
						ResultSet r1=connect.createStatement().executeQuery("select * from Network3 where name='"+node+"'");
						
						if(r1.next()==true)
						{
							
							 ene = r1.getString(2);
							
							DataOutputStream d = new DataOutputStream(cn.getOutputStream());
							d.writeUTF("attack");
							d.writeUTF(ene);
						}
					}
					if(cluster.equalsIgnoreCase("Network4"))
					{
						ResultSet r1=connect.createStatement().executeQuery("select * from Network4 where name='"+node+"'");
						
						if(r1.next()==true)
						{
							
							ene= r1.getString(2);
							
							DataOutputStream d = new DataOutputStream(cn.getOutputStream());
							d.writeUTF("attack");
							d.writeUTF(ene);
						}
					}
					
					}
				}catch (Exception e) {
					// TODO: handle exception
				}
			}
			
			if(this.port==4445)
			{
				try
				{
					ServerSocket sst = new ServerSocket(4445);
					Socket cn;
					while (true) 
					{
						
					cn = sst.accept();
					
					DataInputStream in3=new DataInputStream(cn.getInputStream());
					String cluster=in3.readUTF();
					String node=in3.readUTF();
					String mem = in3.readUTF();
					String ip = in3.readUTF();
					
					Dbcon db = new Dbcon();
					Connection connect =db.getConnection();
					 SimpleDateFormat dateFormat = new SimpleDateFormat();
				       //get current date time with Date()
				    Date date = new Date();
				       
				    String dt=dateFormat.format(date);
				    
					
						String yes="Yes";
					    String nam="Attacker";
						if(cluster.equalsIgnoreCase("Network1"))
						{

							connect.createStatement().executeUpdate("Update Network1 set energy='"+mem+"' where name='"+node+"'");
							
							connect.createStatement().executeUpdate("Update Network1 set attack='"+yes+"' where name='"+node+"'");
							
							connect.createStatement().executeUpdate("insert into Attacker values('"+nam+"','"+node+"','"+mem+"','"+ip+"','"+dt+"')");	
							DataOutputStream d = new DataOutputStream(cn.getOutputStream());
							d.writeUTF("attack");
							
						}
						
						
						if(cluster.equalsIgnoreCase("Network2"))
						{

							connect.createStatement().executeUpdate("Update Network2 set energy='"+mem+"' where name='"+node+"'");
							connect.createStatement().executeUpdate("Update Network1 set attack='"+yes+"' where name='"+node+"'");
							
							connect.createStatement().executeUpdate("insert into Attacker values('"+nam+"','"+node+"','"+mem+"','"+ip+"','"+dt+"')");	
								
							DataOutputStream d = new DataOutputStream(cn.getOutputStream());
							d.writeUTF("attack");
							
						}
						
						if(cluster.equalsIgnoreCase("Network3"))
						{

							connect.createStatement().executeUpdate("Update Network3 set energy='"+mem+"' where name='"+node+"'");
							connect.createStatement().executeUpdate("Update Network1 set attack='"+yes+"' where name='"+node+"'");
							
							connect.createStatement().executeUpdate("insert into Attacker values('"+nam+"','"+node+"','"+mem+"','"+ip+"','"+dt+"')");	
								
							DataOutputStream d = new DataOutputStream(cn.getOutputStream());
							d.writeUTF("attack");
							
						}
						
						if(cluster.equalsIgnoreCase("Network4"))
						{

							connect.createStatement().executeUpdate("Update Network4 set energy='"+mem+"' where name='"+node+"'");
							connect.createStatement().executeUpdate("Update Network1 set attack='"+yes+"' where name='"+node+"'");
							
							connect.createStatement().executeUpdate("insert into Attacker values('"+nam+"','"+node+"','"+mem+"','"+ip+"','"+dt+"')");	
								
							DataOutputStream d = new DataOutputStream(cn.getOutputStream());
							d.writeUTF("attack");
							
						}
					}
				    
					
				}catch (Exception e) {
					// TODO: handle exception
				}
			}
			
			}

		   void initialize() {
			   try
			   {
			   Dbcon db = new Dbcon();
				Connection connect =db.getConnection();
				
				String attack="No";

					connect.createStatement().executeUpdate("update Network1 set attack='"+attack+"' where name='"+n1+"'");
					connect.createStatement().executeUpdate("update Network1 set attack='"+attack+"' where name='"+n2+"'");
					connect.createStatement().executeUpdate("update Network1 set attack='"+attack+"' where name='"+n3+"'");
					connect.createStatement().executeUpdate("update Network1 set attack='"+attack+"' where name='"+n4+"'");
					connect.createStatement().executeUpdate("update Network1 set attack='"+attack+"' where name='"+n5+"'");
					connect.createStatement().executeUpdate("update Network1 set attack='"+attack+"' where name='"+n6+"'");
					connect.createStatement().executeUpdate("update Network1 set attack='"+attack+"' where name='"+n7+"'");
					connect.createStatement().executeUpdate("update Network2 set attack='"+attack+"' where name='"+n8+"'");
					connect.createStatement().executeUpdate("update Network2 set attack='"+attack+"' where name='"+n9+"'");
					connect.createStatement().executeUpdate("update Network2 set attack='"+attack+"' where name='"+n10+"'");
					connect.createStatement().executeUpdate("update Network2 set attack='"+attack+"' where name='"+n11+"'");
					connect.createStatement().executeUpdate("update Network2 set attack='"+attack+"' where name='"+n12+"'");
					connect.createStatement().executeUpdate("update Network2 set attack='"+attack+"' where name='"+n13+"'");
					connect.createStatement().executeUpdate("update Network2 set attack='"+attack+"' where name='"+n14+"'");
					connect.createStatement().executeUpdate("update Network3 set attack='"+attack+"' where name='"+n1+"'");
					connect.createStatement().executeUpdate("update Network3 set attack='"+attack+"' where name='"+n1+"'");
					connect.createStatement().executeUpdate("update Network3 set attack='"+attack+"' where name='"+n1+"'");
					connect.createStatement().executeUpdate("update Network3 set attack='"+attack+"' where name='"+n1+"'");
					connect.createStatement().executeUpdate("update Network3 set attack='"+attack+"' where name='"+n1+"'");
					connect.createStatement().executeUpdate("update Network3 set attack='"+attack+"' where name='"+n1+"'");
					connect.createStatement().executeUpdate("update Network3 set attack='"+attack+"' where name='"+n1+"'");
					

			   }catch (Exception e) {
				// TODO: handle exception
			}
			
		}

		void getvalues() {

			  try
			  {
				  Dbcon db = new Dbcon();
					Connection connect =db.getConnection();
					
				  ResultSet r1=connect.createStatement().executeQuery("select * from Network1 where name='"+n1+"'");
					if(r1.next()==true){dis1=r1.getString("dist"); e1=r1.getString("energy"); }
					
					ResultSet r2=connect.createStatement().executeQuery("select * from Network1 where name='"+n2+"'");
					if(r2.next()==true){dis2=r2.getString("dist"); e2=r2.getString("energy"); }
					
					ResultSet r3=connect.createStatement().executeQuery("select * from Network1 where name='"+n3+"'");
					if(r3.next()==true){dis3=r3.getString("dist"); e3=r3.getString("energy"); }
					
					ResultSet r4=connect.createStatement().executeQuery("select * from Network1 where name='"+n4+"'");
					if(r4.next()==true){dis4=r4.getString("dist"); e4=r4.getString("energy"); }
					
					ResultSet r5=connect.createStatement().executeQuery("select * from Network1 where name='"+n5+"'");
					if(r5.next()==true){dis5=r5.getString("dist"); e5=r5.getString("energy"); }
					
					ResultSet r6=connect.createStatement().executeQuery("select * from Network1 where name='"+n6+"'");
					if(r6.next()==true){dis6=r6.getString("dist"); e6=r6.getString("energy"); }
					
					ResultSet r7=connect.createStatement().executeQuery("select * from Network1 where name='"+n7+"'");
					if(r7.next()==true){dis7=r7.getString("dist"); e7=r7.getString("energy"); }
					
					ResultSet r8=connect.createStatement().executeQuery("select * from Network2 where name='"+n8+"'");
					if(r8.next()==true){dis8=r8.getString("dist"); e8=r8.getString("energy"); }
					
					ResultSet r9=connect.createStatement().executeQuery("select * from Network2 where name='"+n9+"'");
					if(r9.next()==true){dis9=r9.getString("dist"); e9=r9.getString("energy"); }
					
					ResultSet r10=connect.createStatement().executeQuery("select * from Network2 where name='"+n10+"'");
					if(r10.next()==true){dis10=r10.getString("dist"); e10=r10.getString("energy"); }
					
					ResultSet r11=connect.createStatement().executeQuery("select * from Network2 where name='"+n11+"'");
					if(r11.next()==true){dis11=r11.getString("dist"); e11=r11.getString("energy"); }
					
					ResultSet r12=connect.createStatement().executeQuery("select * from Network2 where name='"+n12+"'");
					if(r12.next()==true){dis12=r12.getString("dist"); e12=r12.getString("energy"); }
					
					ResultSet r13=connect.createStatement().executeQuery("select * from Network2 where name='"+n13+"'");
					if(r13.next()==true){dis13=r13.getString("dist"); e13=r13.getString("energy"); }
					
					ResultSet r14=connect.createStatement().executeQuery("select * from Network2 where name='"+n14+"'");
					if(r14.next()==true){dis14=r14.getString("dist"); e14=r14.getString("energy"); }
					
					ResultSet r15=connect.createStatement().executeQuery("select * from Network3 where name='"+n15+"'");
					if(r15.next()==true){dis15=r15.getString("dist"); e15=r15.getString("energy"); }
					
					ResultSet r16=connect.createStatement().executeQuery("select * from Network3 where name='"+n16+"'");
					if(r16.next()==true){dis16=r16.getString("dist"); e16=r16.getString("energy"); }
					
					ResultSet r17=connect.createStatement().executeQuery("select * from Network3 where name='"+n17+"'");
					if(r17.next()==true){dis17=r17.getString("dist"); e17=r17.getString("energy"); }
					
					ResultSet r18=connect.createStatement().executeQuery("select * from Network3 where name='"+n18+"'");
					if(r18.next()==true){dis18=r18.getString("dist"); e18=r18.getString("energy"); }
					
					ResultSet r19=connect.createStatement().executeQuery("select * from Network3 where name='"+n19+"'");
					if(r19.next()==true){dis19=r19.getString("dist"); e19=r19.getString("energy"); }
					
					ResultSet r20=connect.createStatement().executeQuery("select * from Network3 where name='"+n20+"'");
					if(r20.next()==true){dis20=r20.getString("dist"); e20=r20.getString("energy"); }
					
					ResultSet r21=connect.createStatement().executeQuery("select * from Network3 where name='"+n21+"'");
					if(r21.next()==true){dis21=r21.getString("dist"); e21=r21.getString("energy"); }
					
					ResultSet r22=connect.createStatement().executeQuery("select * from Network4 where name='"+n22+"'");
					if(r22.next()==true){dis22=r22.getString("dist"); e22=r22.getString("energy"); }
					
					ResultSet r23=connect.createStatement().executeQuery("select * from Network4 where name='"+n23+"'");
					if(r23.next()==true){dis23=r23.getString("dist"); e23=r23.getString("energy"); }
					
					ResultSet r24=connect.createStatement().executeQuery("select * from Network4 where name='"+n24+"'");
					if(r24.next()==true){dis24=r24.getString("dist"); e24=r24.getString("energy"); }
					
					ResultSet r25=connect.createStatement().executeQuery("select * from Network4 where name='"+n25+"'");
					if(r25.next()==true){dis25=r25.getString("dist"); e25=r25.getString("energy"); }
					
					ResultSet r26=connect.createStatement().executeQuery("select * from Network4 where name='"+n26+"'");
					if(r26.next()==true){dis26=r26.getString("dist"); e26=r26.getString("energy"); }
					
					ResultSet r27=connect.createStatement().executeQuery("select * from Network4 where name='"+n27+"'");
					if(r27.next()==true){dis27=r27.getString("dist"); e27=r27.getString("energy"); }
					
					ResultSet r28=connect.createStatement().executeQuery("select * from Network4 where name='"+n28+"'");
					if(r28.next()==true){dis28=r28.getString("dist"); e28=r28.getString("energy"); }
			  }catch (Exception e) {
				// TODO: handle exception
			}
			
		}

		void clear() throws InterruptedException {
			
			Thread.sleep(3000);
			a1=new ImageIcon(this.getClass().getResource("black.jpg"));
			a11.setIcon(a1);
				
			a2=new ImageIcon(this.getClass().getResource("black.jpg"));
			a22.setIcon(a2);
				
			a3=new ImageIcon(this.getClass().getResource("black.jpg"));
			a33.setIcon(a3);
				
			a4=new ImageIcon(this.getClass().getResource("black.jpg"));
			a44.setIcon(a4);
				
			a5=new ImageIcon(this.getClass().getResource("black.jpg"));
			a55.setIcon(a5);
				
			a6=new ImageIcon(this.getClass().getResource("black.jpg"));
			a66.setIcon(a6);
				
			a7=new ImageIcon(this.getClass().getResource("black.jpg"));
			a77.setIcon(a7);
			
			b1=new ImageIcon(this.getClass().getResource("black.jpg"));
			b11.setIcon(b1);
				
			b2=new ImageIcon(this.getClass().getResource("black.jpg"));
			b22.setIcon(b2);
				
			b3=new ImageIcon(this.getClass().getResource("black.jpg"));
			b33.setIcon(b3);
				
			b4=new ImageIcon(this.getClass().getResource("black.jpg"));
			b44.setIcon(b4);
				
			b5=new ImageIcon(this.getClass().getResource("black.jpg"));
			b55.setIcon(b5);
				
			b6=new ImageIcon(this.getClass().getResource("black.jpg"));
			b66.setIcon(b6);
				
			b7=new ImageIcon(this.getClass().getResource("black.jpg"));
			b77.setIcon(b7);
			
			c1=new ImageIcon(this.getClass().getResource("black.jpg"));
			c11.setIcon(c1);
				
			c2=new ImageIcon(this.getClass().getResource("black.jpg"));
			c22.setIcon(c2);
				
			c3=new ImageIcon(this.getClass().getResource("black.jpg"));
			c33.setIcon(c3);
				
			c4=new ImageIcon(this.getClass().getResource("black.jpg"));
			c44.setIcon(c4);
				
			c5=new ImageIcon(this.getClass().getResource("black.jpg"));
			c55.setIcon(c5);
				
			c6=new ImageIcon(this.getClass().getResource("black.jpg"));
			c66.setIcon(c6);
				
			c7=new ImageIcon(this.getClass().getResource("black.jpg"));
			c77.setIcon(c7);
			
			d1=new ImageIcon(this.getClass().getResource("black.jpg"));
			d11.setIcon(d1);
				
			d2=new ImageIcon(this.getClass().getResource("black.jpg"));
			d22.setIcon(d2);
				
			d3=new ImageIcon(this.getClass().getResource("black.jpg"));
			d33.setIcon(d3);
				
			d4=new ImageIcon(this.getClass().getResource("black.jpg"));
			d44.setIcon(d4);
				
			d5=new ImageIcon(this.getClass().getResource("black.jpg"));
			d55.setIcon(d5);
				
			d6=new ImageIcon(this.getClass().getResource("black.jpg"));
			d66.setIcon(d6);
				
			d7=new ImageIcon(this.getClass().getResource("black.jpg"));
			d77.setIcon(d7);
			
		}
		 
		 void cong(String nod, String ene) throws InterruptedException, UnknownHostException, IOException, SQLException {
				
				
				String node = nod.substring(0, nod.indexOf("-"));
				
					JOptionPane.showMessageDialog(null,"Congestion Occured At " +node);
				
					Socket sc = new Socket("localhost",309);
					
					DataOutputStream dd = new DataOutputStream(sc.getOutputStream());
					dd.writeUTF(node);
					dd.writeUTF(ene);
					
					DataInputStream din = new DataInputStream(sc.getInputStream());
					
					String mes = din.readUTF();
					System.out.println(mes);
					
					
					
								Thread.sleep(2000);
								nodl.setVisible(false);
								Thread.sleep(1000);
								nodl.setVisible(true);
								Thread.sleep(1000);
								nodl.setVisible(false);
								Thread.sleep(1000);
								nodl.setVisible(true);
								Thread.sleep(1000);
								
								down = new ImageIcon(this.getClass().getResource("downg.png"));
								downl.setIcon(down);
								
								Thread.sleep(1000);
								text.setVisible(true);
								Thread.sleep(200);
								text.setVisible(false);
								Thread.sleep(200);
								text.setVisible(true);
								Thread.sleep(200);
								text.setVisible(false);
								Thread.sleep(200);
								text.setVisible(true);
								Thread.sleep(200);
								text.setVisible(false);
								
								Thread.sleep(1000);
								
								Thread.sleep(2000);
								idsl.setVisible(false);
								Thread.sleep(1000);
								idsl.setVisible(true);
								Thread.sleep(1000);
								idsl.setVisible(false);
								Thread.sleep(1000);
								idsl.setVisible(true);
								Thread.sleep(1000);
								
								Thread.sleep(2000);
								
								
								down = new ImageIcon(this.getClass().getResource("down.png"));
								downl.setIcon(down);
								
							}
		
		   }
}
			

			
			

			
