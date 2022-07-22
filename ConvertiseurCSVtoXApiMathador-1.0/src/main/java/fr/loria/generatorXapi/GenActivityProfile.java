
package fr.loria.generatorXapi;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import fr.loria.mathador.Epreuve;
import gov.adlnet.xapi.model.ActivityProfile;

/**
 * Class permettant de générer un ActivityProfile
 * @author romain
 *
 */
public class GenActivityProfile {
	private String URI = "http://exemple.com/";
	private Epreuve epreuve;
	private Gson gson;
	
	/**
	 * Constructeur, initialise les variables utilisées par toutes les autres fonctions 
	 * (pour le moment il y en a seulement qu'une mais cela est conçu dans des cas futurs)
	 * @param e  //corresponds à l'Epreuve qui va être traitée
	 */
	public GenActivityProfile(Epreuve e)
	{
		this.epreuve = e;
		this.gson = new Gson();	
	}
	
	/**
	 * Créer l'ActivityProfile
	 * @return ActivityProfile
	 */
	public ActivityProfile generation()
	{
		gov.adlnet.xapi.model.ActivityProfile AP = new gov.adlnet.xapi.model.ActivityProfile();
		AP.setActivityId(""+this.epreuve.getIdDrawing());
		
		JsonObject object = new JsonObject();
		JsonElement drawNumber = gson.fromJson("" + this.epreuve.getDrawNumber(), JsonElement.class);
		object.add(URI + "drawNumber", drawNumber);
		JsonElement targetNumber = gson.fromJson("" + this.epreuve.getResult(), JsonElement.class);
		object.add(URI + "targetNumber", targetNumber);
		
		AP.setProfile(object);
		return AP;
	}
}
