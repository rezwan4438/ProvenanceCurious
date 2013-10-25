package pythonProvenance.graphs;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.imageio.ImageIO;

import pythonProvenance.inference.ProvenanceTuple;

public class ImageManipulation {

	/**
	 * @param args
	 */
	
	BufferedImage img;
	public Connection conn;
	public Statement stat;
	public ResultSet rs;
	public Vector<Double> values = new Vector<Double>();
	
	public ImageManipulation(){}
	
	public  int[] getPixelData(BufferedImage img, int x, int y) {
		int argb = img.getRGB(x, y);

		int rgb[] = new int[] {
		    (argb >> 16) & 0xff, //red
		    (argb >>  8) & 0xff, //green
		    (argb      ) & 0xff  //blue
		};
		
		System.out.println("rgb: " + rgb[0] + " " + rgb[1] + " " + rgb[2]);
		
		int rgbValue = 65536 * 0 + 256 * 0 + 0;
		img.setRGB(x, y, rgbValue);
		
		return rgb;
	}
	
	public void setPixelData (BufferedImage img, int x, int y, int color){
		img.setRGB(x, y, color);
		
	}
	
	public double getMaxValue(String d, String v, long l) throws SQLException, ClassNotFoundException{
		double maxValue = 0;
		
		Class.forName("org.sqlite.JDBC");
		String connectionString;
		connectionString = "jdbc:sqlite:" + d;
		this.conn = DriverManager.getConnection(connectionString);
		this.stat = conn.createStatement();
		String query = "SELECT max(value) from " + v + " where timestamp = " + l + ";";
		this.rs = stat.executeQuery(query);
		while(this.rs.next()){
			maxValue = rs.getDouble(1);
		}
		return maxValue;
		
	}
	public double getValues(String viewName, long timestamp) throws ClassNotFoundException, SQLException{
		
		double tupleValue = 0;
		
		//Class.forName("org.sqlite.JDBC");
		//String connectionString;
		//connectionString = "jdbc:sqlite:" + "D:\\Research\\Case Study\\Utrecht\\Codes\\database\\utrecht.sqlite";
		//Connection conn = DriverManager.getConnection(connectionString);
		//Statement stat = conn.createStatement();
		
		String query = "SELECT * from " + viewName +" where timestamp = " + timestamp +";";
		
		this.rs = stat.executeQuery(query);
		while(this.rs.next()){
			tupleValue = this.rs.getDouble("value");
			values.add(tupleValue);
		}

		//rs1.close();
		//stat.close();
		return tupleValue;
		
	}
	
	public int getColorCode(double a, double max){
		int cCode = 0;
		
		if(a < 0.0){
			cCode = 255;
		}
		else{
			int normR = ((int) (a*20/max));
			int normG = 20-normR;
			cCode = 65536 * normR * 25 + 256 * normG * 25;
		}
		return cCode;
	}
	public void start(String database, String viewName, long timestamp) throws ClassNotFoundException, SQLException, IOException{
		String fName = "map_" + viewName + "_" + timestamp + ".gif" ;
		File f = new File(fName);
		if(f.exists()==true){
			BufferedImage newImg = ImageIO.read(new File (fName));
	        ImageIO.write(newImg, "GIF", new File("map_edited.gif"));
		}
		
		else{
		
			
		        img = ImageIO.read(new File("map1.jpg"));
	
		        //int[][] pixelData = new int[img.getHeight() * img.getWidth()][3];
		       
		        int convX;
		        int convY;
		        double value;
		        int colorCode;
		        double maxValue = getMaxValue(database, viewName, timestamp);
		        int id;
		        
		        getValues(viewName, timestamp);
		       
		        for(int i = 0; i < img.getWidth(); i++){
		            for(int j = 0; j < img.getHeight(); j++){
		            	
		            	convX = Math.round((i*720)/img.getWidth());
		        		convY = Math.round((j*360)/img.getHeight());
		            	
		        		
		            	id = convY*720 + convX; 
		            	
		            	colorCode = getColorCode(values.get(id), maxValue);
		            	img.setRGB(i, j, colorCode);
		            	System.out.println("i: " + i + ", j: " + j + "-" + colorCode);
		            }
		        }
		        
		        this.rs.close();
		        this.conn.close();
		        
		        ImageIO.write(img, "GIF", f);
		        
		        BufferedImage newImg = ImageIO.read(new File (fName));
		        ImageIO.write(newImg, "GIF", new File("map_edited.gif"));
		        
		        
		        
		    
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImageManipulation man = new ImageManipulation();
		
		try {
			man.start("D:\\Research\\Case Study\\Utrecht\\Codes\\database\\utrecht.sqlite","totDemand",2000011);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	    

	}

}
