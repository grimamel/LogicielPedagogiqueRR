package logicielpedagogiquerr

enum Type_De_Question{
	choixmultiple, choixsimple
	}
class Question {

	String texte // la question
	Date date_de_Creation// la date d'apparition de la question
	int temps_actif //le temps que la question reste ouverte avant la fermeture par l'enseignant
	int nbreVotes// le nombre de vote éffectués par les étudiants
	Type_De_Question type // nous donne la possibilité d'avoir des choix simple ou des choix multiple pour les réponses
	/*
	 * une question peut avoir plusieurs réponses
	 */
	static hasMany = [reponses:Reponse]
	
    static constraints = {
		texte nullable: false, blank: false
		date_de_Creation nullable: false
		temps_actif nullable: true, min: 5
		nbreVotes nullable: false
		type nullable: false
    }
}
