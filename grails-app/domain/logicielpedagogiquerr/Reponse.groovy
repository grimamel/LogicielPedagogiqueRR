package logicielpedagogiquerr

class Reponse {
	
	String texte // c'est le texte de la reponse
	boolean estVisible //définit la visibilité de la réponse
	boolean estCorrecte // ce qui nous permet a la fin de faire des statistiques sur les bonnes et mauvaises réponses
    /*
     * si on supprime une question, on supprime les réponses qui vont avec
     */
	static belongsTo = [question:Question]
	/*
	 * une réponse peut avoir plusieurs commentaires
	 */
	static hasMany = [commentaires:Commentaire]
	
	static constraints = {
		texte nullable: false, blank: false
		estVisible nullable: false
		estCorrecte nullable: false
    }
}
