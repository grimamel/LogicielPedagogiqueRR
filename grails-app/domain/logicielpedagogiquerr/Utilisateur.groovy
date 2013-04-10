package logicielpedagogiquerr

class Utilisateur {
	String nom
	String prenom
	String email
	String mot_de_passe
	/*
	 * 
	 *un utilisateur interagit(peut répondre) avec plusieurs questions
	 */
	
	static hasMany = [questions:Question]

    static constraints = {
		nom nullable: false, blank: false
		prenom nullable: false, blank: true
		email nullable: false, blank: false, email: true, unique: true
		mot_de_passe nullable: false
    }
}
