
public class RandomDikt {
//Ordene som jeg har valgt legges i en array
	private String[] ordene;
//Konstrukt�r som tar i mot ordene	
	public RandomDikt(String[] ordArray) {
		ordene = ordArray;
	}	
//Metode for generere tilfeldig ord	
	public String getRandomDikt() {
		//velger random ord fra ordliste
		int antallOrd = ordene.length;
//Deklarasasjon av tabell		
		final int rader = 4;
		final int kolonner= 4;
		String[][] tabell = new String [rader][kolonner];
//n�stet for-l�kke for � lese rader og kolonner og legge inn tilfeldige ord				
		for (int rad=0; rad<rader; rad++) {
			for(int kol=0; kol<kolonner; kol++) {
				int tilfeldigtall= (int) (Math.random()*antallOrd);
				String ord = ordene[tilfeldigtall];
				tabell[rad][kol] = ord;
			}
		}
//N�stet for-l�kke for � bygge opp en tekst streng p� 4 rader med mellomrom		
		String dikt = "";
		
		for (String[] rad:tabell) {
			for (String ord:rad) {
				dikt += ord;
				dikt += " ";
			}
			dikt += "\n";
		}
//Returnerer diktet
		return dikt;
	}
	
	
}
