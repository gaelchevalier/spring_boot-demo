package fr.example.demo.music;

public class MusicApp {

	public static void main(String[] args) {
		// Instanciation d'un orchestre
		Orchestre orchestre = new Orchestre();
		
		// Ajout 1
		Instrument instru1 = new Instrument("Violon");
		Musicien musicien1 = new Musicien("Antoine", instru1);
		orchestre.musiciens.add(musicien1);
		
		// Ajout2
		Musicien musicien2 = new Musicien("Gaël", new Instrument("Batterie"));
		orchestre.musiciens.add(musicien2);
		
		// Ajout 3
		orchestre.musiciens.add(new Musicien("Cédric", new Instrument("Guitare")));
		
		// Ajout 4
		orchestre.musiciens.add(new Musicien("Axelle", new Guitar()));
		
		// Ajout 5
		Musicien<Guitar> nath = new Musicien<Guitar>("Nath", new Guitar());
		orchestre.musiciens.add(nath);
		
		Guitar guitar = nath.getInstrument();
		System.out.println(String.format("Nb de cordes : %d", guitar.cordes));
		
		// Faire jouer l'orchestre
		orchestre.play();

	}

}
