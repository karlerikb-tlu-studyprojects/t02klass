
public class MainHW {
	
	public static void main(String[] args) {
		
		BDrums[] drums = new BDrums[5];
		drums[0] = new BDrums("Pearl VB", 24, 18, 425);
		drums[1] = new BDrums("Mapex Saturn V", 20, 16, 953);
		drums[2] = new BDrums("Sonor ProLite", 18, 14, 1192);
		drums[3] = new BDrums("Millenium MX200", 20, 14, 78.66);
		drums[4] = new BDrums("DW Design BD", 22, 18, 828);
		
		//System.out.println(drums[0].forPrinting());
		
		for(int i = 0; i < drums.length; i++) {
			System.out.println(drums[i].forPrinting());
		}
		
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