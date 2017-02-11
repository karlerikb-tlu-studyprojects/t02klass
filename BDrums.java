
public class BDrums {
	
	String drumName;
	int diameter;
	int height;
	double price;
	
	public BDrums(String drumName, int diameter, int height, double price) {
		
		if(drumName == null || drumName.length() == 0) {
			throw new RuntimeException("Nimi puudub");
		}
		
		if(diameter <= 0) {
			throw new RuntimeException("Diameeteri sisestusviga");
		}
		
		if(height <= 0) {
			throw new RuntimeException("Korguse sisestusviga");
		}
		
		if(price <= 0) {
			throw new RuntimeException("Hinna sisestusviga");
		}
		
		this.drumName = drumName;
		this.diameter = diameter;
		this.height = height;
		this.price = price;
		
	}
	
	public double calcVolume() {
		double volumeIN = Math.PI * Math.pow(diameter / 2, 2) * height;
		return Math.round(volumeIN * Math.pow(10, 2)) / Math.pow(10, 2);
	}
	
	public double calcVolumeDM() {
		double volumeDM = calcVolume() * Math.pow(2.54 / 10, 3);
		return Math.round(volumeDM * Math.pow(10, 2)) / Math.pow(10, 2);
	}
	
	public double calcPriceDM() {
		double priceDM = price / calcVolumeDM();
		return Math.round(priceDM * Math.pow(10, 2)) / Math.pow(10, 2);
	}
	
	//@Override
	public String forPrinting() {
		
		return "Basstrummi '" + drumName + "' diameeter on " + diameter + " tolli, korgus " + height + " tolli ja ruumala " + calcVolume() + " kuuptolli. Trummi maksumus on "
		+ price + " eurot.\n"
		+ "Ruumala kuupdetsimeetrites on " + calcVolumeDM() + ". Kuupdetsimeetri hind trummil on " + calcPriceDM() + " eurot.\n" ;
		
	}
	
}

/*

[karlbork@greeny t02klass]$ java MainHW
Basstrummi 'Pearl VB' diameeter on 24 tolli, korgus 18 tolli ja ruumala 8143.01 kuuptolli. Trummi maksumus on 425.0 eurot.
Ruumala kuupdetsimeetrites on 133.44. Kuupdetsimeetri hind trummil on 3.18 eurot.

Basstrummi 'Mapex Saturn V' diameeter on 20 tolli, korgus 16 tolli ja ruumala 5026.55 kuuptolli. Trummi maksumus on 953.0 eurot.
Ruumala kuupdetsimeetrites on 82.37. Kuupdetsimeetri hind trummil on 11.57 eurot.

Basstrummi 'Sonor ProLite' diameeter on 18 tolli, korgus 14 tolli ja ruumala 3562.57 kuuptolli. Trummi maksumus on 1192.0 eurot.
Ruumala kuupdetsimeetrites on 58.38. Kuupdetsimeetri hind trummil on 20.42 eurot.

Basstrummi 'Millenium MX200' diameeter on 20 tolli, korgus 14 tolli ja ruumala 4398.23 kuuptolli. Trummi maksumus on 78.66 eurot.
Ruumala kuupdetsimeetrites on 72.07. Kuupdetsimeetri hind trummil on 1.09 eurot.

Basstrummi 'DW Design BD' diameeter on 22 tolli, korgus 18 tolli ja ruumala 6842.39 kuuptolli. Trummi maksumus on 828.0 eurot.
Ruumala kuupdetsimeetrites on 112.13. Kuupdetsimeetri hind trummil on 7.38 eurot.

*/