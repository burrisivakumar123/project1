
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import java.sql.*;
 
public class Time_RoutingOverhead_Results {
    public static void main(String[] args) {
        
  int count=0;
  int count1=0;
  double c1=0.0;
  double c2=0.0;
  double c3=0.0;
  double c4=0.0;
  double c5=0.0;
  double c6=0.0;
  double c7=0.0;
  double c8=0.0;
  
  String fname=null,fname1=null,fname2=null,fname3=null,fname4=null,fname5=null,fname6=null,fname7=null;
  
    	try
    	{
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proj10","root","root");
    	    
    	    Statement st=con.createStatement();
    		ResultSet rs=st.executeQuery("select * from results");
    		
    		while(rs.next()==true)
    		{
    			count++;
    			if(count==1)
    			{
    				fname=rs.getString("fname");
    				c1=Double.valueOf(rs.getString("ro"));
    				
    			}
    			
    			if(count==2)
    			{
    				fname1=rs.getString("fname");
    				c2=Double.valueOf(rs.getString("ro"));
    			}
    			if(count==3)
    			{
    				
    				fname2=rs.getString("fname");
    				c3=Double.valueOf(rs.getString("ro"));
    			}
    			if(count==4)
    			{
    				fname3=rs.getString("fname");
    				c4=Double.valueOf(rs.getString("ro"));
    			}
    			if(count==5)
    			{
    				fname4=rs.getString("fname");
    				c5=Double.valueOf(rs.getString("ro"));
    			}
    			if(count==6)
    			{
    				fname5=rs.getString("fname");
    				c6=Double.valueOf(rs.getString("ro"));
    			}
    			if(count==7)
    			{
    				fname6=rs.getString("fname");
    				c7=Double.valueOf(rs.getString("ro"));
    			}
    			if(count==8)
    			{	fname7=rs.getString("fname");
    				c8=Double.valueOf(rs.getString("ro"));
    			}	
    		}
    		    DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
    	        dataSet.setValue(c1, "RO1", String.valueOf(fname));
    	        dataSet.setValue(c2, "RO2", String.valueOf(fname1));
    	        dataSet.setValue(c3, "RO3", String.valueOf(fname2));
    	        dataSet.setValue(c4, "RO4", String.valueOf(fname3));
    	        dataSet.setValue(c5, "RO5", String.valueOf(fname4));
    	        dataSet.setValue(c6, "RO6", String.valueOf(fname5));
    	        dataSet.setValue(c7, "RO7", String.valueOf(fname6));
    	        dataSet.setValue(c8, "RO8", String.valueOf(fname7));
    	 
    	        JFreeChart chart = ChartFactory.createBarChart3D("Robust defense scheme against selective drop attack in wireless Ad Hoc Networks", "Routing Overhead(Kbps) ", "Total Routing Overhead(Kbps)",
    	                dataSet, PlotOrientation.VERTICAL, true, true, true);
    	        ChartFrame chartFrame=new ChartFrame("Time Routing Overhead Results Details",chart);
    	        chartFrame.setVisible(true);
    	        chartFrame.setSize(1000,500);
    	}
    	catch(Exception ex)
    	{
    	System.out.println(ex);	
    		
    	}
    
}
}