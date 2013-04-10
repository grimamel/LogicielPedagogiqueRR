package logicielpedagogiquerr

class Reponse {
	
	String texte // c'est le texte de la reponse
	boolean estVisible //définit la visibilité de la réponse
	boolean estCorrecte // ce qui nous permet a la fin de faire des statistiques sur les bonnes et mauvaises réponses
    
	static constraints = {
		texte nullable: false, blank: false
		estVisible nullable: false
		estCorrecte nullable: false
    }
}
