/* @author : Joel Oliveira Ribeiro
 * Student of Computer Engineering at the Federal University of Ceara from Brazil
 * Basic Machine Learning for Pattern Recognition/Data Mining 
 * Nearest Neighbor Algorithm for Normalized Dates
 */

package irisPlants_NormalizedNearestCentroidAlgorithm;

public class IrisPlantNormalized {
	private double sl; // Lenght of Sepala
	private double sw; // Weight of Sepala
	private double pl; // Lenght of Petala
	private double pw; // Weight of Petala
	private String name; // Names -> (Setosa, Versicolor, Virginica)
	private int id; // Id for some Iris type
	
	// Initial Instance 
	public IrisPlantNormalized(double sl, double sw, double pl, double pw, String name) {
		this.sl = Normalization(sl,sl,sw,pl,pw);
		this.sw = Normalization(sw,sl,sw,pl,pw);
		this.pl = Normalization(pl,sl,sw,pl,pw);
		this.pw = Normalization(pw,sl,sw,pl,pw);
		this.name=name;
		setId(this.name);
	}
	
   /* Normalization Method : Treating the four attributes (sl, sw, pl, pw) 
	 as a vector, this method normalizes the values by making its norm equal to one.*/
	private double Normalization(double value,double sl, double sw, double pl, double pw){
		double n;
		
		n = (value)/(Math.pow((sl*sl)+(sw*sw)+(pl*pl)+(pw*pw), 0.5));
		
	return n;
	}
	
	
	// Getters and Setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSl() {
		return sl;
	}
	public void setSl(double sl) {
		this.sl = sl;
	}
	public double getSw() {
		return sw;
	}
	public void setSw(double sw) {
		this.sw = sw;
	}
	public double getPl() {
		return pl;
	}
	public void setPl(double pl) {
		this.pl = pl;
	}
	public double getPw() {
		return pw;
	}
	public void setPw(double pw) {
		this.pw = pw;
	}
	public int getId() {
		return id;
	}
	public void setId(String name) {
        
		if(name == "Setosa")
        	this.id=1;
        else if(name == "Versicolor")
        	this.id=2;
        else if(name == "Virginica")
        	this.id=3;
        else{
        	this.id=0;
        }
        
	}

}
