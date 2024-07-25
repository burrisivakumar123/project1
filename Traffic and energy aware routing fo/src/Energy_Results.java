
 
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import java.sql.*;
 
public class Energy_Results {
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
  
  
  
  
 
  
    	try
    	{
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proj10","root","root");
    	    Statement st=con.createStatement();
    		ResultSet rs=st.executeQuery("select * from timedelay");
    		
    		while(rs.next()==true)
    		{
    			count++;
    			if(count==1)
    			{
    				c1=Double.valueOf(rs.getString("energy"));
    			}
    			
    			if(count==2)
    			{
    				c2=Double.valueOf(rs.getString("energy"));
    			}
    			if(count==3)
    			{
    				c3=Double.valueOf(rs.getString("energy"));
    			}
    			if(count==4)
    			{
    				c4=Double.valueOf(rs.getString("energy"));
    			}
    			if(count==5)
    			{
    				c5=Double.valueOf(rs.getString("energy"));
    			}
    			if(count==6)
    			{
    				c6=Double.valueOf(rs.getString("energy"));
    			}
    			if(count==7)
    			{
    				c7=Double.valueOf(rs.getString("energy"));
    			}
    			if(count==8)
    			{
    				c8=Double.valueOf(rs.getString("energy"));
    			}	
    		}
    		    DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
    	        dataSet.setValue(c1, "D1", "Energy1");
    	        dataSet.setValue(c2, "D2", "Energy2");
    	        dataSet.setValue(c3, "D3", "Energy3");
    	        dataSet.setValue(c4, "D4", "Energy4");
    	        dataSet.setValue(c5, "D5", "Energy5");
    	        dataSet.setValue(c6, "D6", "Energy6");
    	        dataSet.setValue(c7, "D7", "Energy7");
    	        dataSet.setValue(c8, "D8", "Energy8");
    	 
    	        JFreeChart chart = ChartFactory.createBarChart3D(
    	                "Robust defense scheme against selective drop attack in wireless Ad Hoc Networks", "Energy(Joules) ", "Total Energy (Joules)",
    	                dataSet, PlotOrientation.VERTICAL, true, true, true);
    	        ChartFrame chartFrame=new ChartFrame("Different Transaction Upload Energy Details",chart);
    	        chartFrame.setVisible(true);
    	     
    	        chartFrame.setSize(800,500);
    	        
        
    	}
    	catch(Exception ex)
    	{
    	System.out.println(ex);	
    		
    	}
    
}
}