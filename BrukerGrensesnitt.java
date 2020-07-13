import javax.swing.JOptionPane;
//Meny oppsett
public class BrukerGrensesnitt {
	private final String[] ALTERNATIVER = {"Dikt generator", "Avslutt"};
	private final int DIKT = 0;
	
	public void opprettMeny() {
		boolean fortsett = true;
		while(fortsett) {
			int valg = JOptionPane.showOptionDialog(
					null,
					"Tast �nsket operasjon",
					"Dikt generator",
					JOptionPane.DEFAULT_OPTION,
					JOptionPane.PLAIN_MESSAGE,
					null,
					ALTERNATIVER,
					ALTERNATIVER[0]);
			switch(valg) {
			case DIKT: visDikt();
				break;
			default: fortsett = false;
			}
		}
	}
	public void visDikt() {
		// gi inn ordene til RandomDikt objektet
		String [] ordArray = {"vakker", "er", "var", "virkelig",
				"sommer", "vinter", "du", "i","jorda","bl�","r�d",
				"som", "vi", "oss", "og","sol","m�nen","ost","jeg",
				"v�r", "himmel", "stjerner", "�","skal","skinne","t�r",
				"bakken","gi","ta","ogs�","hvit"
		};
		// opprette RandomDikt objektet
		RandomDikt dikt = new RandomDikt(ordArray);
		
		// RAndomDikt objektet skal velge tilfeldige ord
		String randomDiktord = dikt.getRandomDikt();
		//Dialogvindu
		JOptionPane.showMessageDialog(null, randomDiktord);
	}

}
