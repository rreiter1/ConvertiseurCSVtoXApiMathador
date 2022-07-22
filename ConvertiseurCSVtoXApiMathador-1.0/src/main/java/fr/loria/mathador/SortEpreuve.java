package fr.loria.mathador;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class qui regroupe tous les sorts utilisés par le programme 
 * @author Romain
 *
 */
public class SortEpreuve {
	
	/**
	 * Trie la liste d'épreuves selon le IdProfile par ordre croissant
	 * @param eps //liste d'épreuves non trier
	 * @return //liste d'épreuves trier
	 */
	public static List<Epreuve> sortByProfile(ArrayList<Epreuve> eps)
	{
		return eps.stream().sorted(Comparator.comparing(Epreuve::getIdProfile)).collect(Collectors.toList());		
	}
	
	/**
	 * Trie la liste d'épreuves selon le IDpartyGame par ordre croissant
	 * @param eps //liste d'épreuves non trier
	 * @return //liste d'épreuves trier
	 */
	public static List<Epreuve> sortByIdGame(ArrayList<Epreuve> eps)
	{
		return eps.stream().sorted(Comparator.comparing(Epreuve::getIDpartyGame)).collect(Collectors.toList());
	}
	
	/**
	 * Trie la liste d'épreuves selon les dates de creation par ordre croissant
	 * @param eps //liste d'épreuves non trier
	 * @return //liste d'épreuves trier
	 */
	public static List<Epreuve> sortByCreated(ArrayList<Epreuve> eps)
	{
		return eps.stream().sorted(Comparator.comparing(Epreuve::getCreated)).collect(Collectors.toList());
	}
	
	/**
	 * Trie la liste d'épreuves selon le level par ordre croissant
	 * @param eps //liste d'épreuves non trier
	 * @return //liste d'épreuves trier
	 */
	public static List<Epreuve> sortByLevelPosition(ArrayList<Epreuve> eps)
	{
		return eps.stream().sorted(Comparator.comparing(Epreuve::getPosition)).sorted(Comparator.comparing(Epreuve::getLevel)).collect(Collectors.toList());
	}
	
	/**
	 * Trie la liste d'épreuves selon la difficulté par ordre croissant
	 * @param eps //liste d'épreuves non trier
	 * @return //liste d'épreuves trier
	 */
	public static List<Epreuve> sortBydifficulty(ArrayList<Epreuve> eps)
	{
		return eps.stream().sorted(Comparator.comparing(Epreuve::getDifficulty)).collect(Collectors.toList());
	}

}
