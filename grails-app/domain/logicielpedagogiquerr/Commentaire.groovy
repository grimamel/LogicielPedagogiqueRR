package logicielpedagogiquerr

class Commentaire {

	String texte // c'est le commentaire retourné pas le professeur
    static constraints = {
		texte nullable: false, blank: false
    }
}
