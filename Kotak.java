
public class Kotak {
	
	// Attributes 
	private double panjang, lebar, Luas, keliling;
	double setpanjang;
	double setlebar;
	
	// Method getter
	public double getpanjang()
	{
		return panjang; 
	}
    public double getlebar()
    {
    	return lebar;
    }
    public double getLuas()
    {
    	return Luas;
    }
    public double getkeliling()
    {
    	return keliling;
    }
    
    // Method setter
    public void setpanjang(double panjang)
    {
    	this.panjang = panjang;
    }
    public void setlebar(double lebar)
    {
    	this.lebar = lebar;
    }
	public void setLuas(double Luas) 
	{
		this.Luas = Luas;
	}
	public void setkeliling(double keliling)
	{
		this.keliling = keliling;
	}
	
	// Method
	void hitungLuas(){
		Luas = panjang * lebar;
	}
	void hitungkeliling(){
		keliling = panjang + lebar + panjang + lebar;
	}
				

}
