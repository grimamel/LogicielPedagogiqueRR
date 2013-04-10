package logicielpedagogiquerr

class Commentaire {

	String texte // c'est le commentaire retourné pas le professeur
	/*
	 * comme sa, si on supprime un commentaire, onsupprime les questions qui vont avec
	 */
	static belongsTo=[reponses:Reponse]
	
    static constraints = {
		texte nullable: false, blank: false
    }
}
