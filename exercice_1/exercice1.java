public class FactureManager {

    // Calcul le total d'une facture
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;

        // reduction selon la catégorie
        if (typeProduit.equals("Alimentaire")) {
            total -= reductionCinqPourcent(total); // Réduction de 5%
        } 
        
        if (typeProduit.equals("Electronique")) {
            total -= reductionDixPourcent(total); // Réduction de 10%
        }
        
        if (typeProduit.equals("Luxe")) {
            total -= reductionQuinzePourcent(total); // Réduction de 15%
        }

        // Reduction sur le total
        if (total > 1000) {
            total -= reductionCinqPourcent(total); // Réduction supplémentaire de 5% pour les gros montants
        }

        return total;
    }
    
    /**
     * calcul des reductions au taux de 5%
     * @return valeur de la reduction
     */
    
    public double reductionCinqPourcent(double total) {
    	return total*0.05;
    }
    
    /**
     * calcul des reductions au taux de 10%
     * @return valeur de la reduction 
     */
    public double reductionDixPourcent(double total) {
    	return total*0.1;
    }
    
    /**
     * calcul des reductions au taux de 15%
     * @return valeur de la reduction 
     */
    public double reductionQuinzePourcent(double total) {
    	return total*0.15;
    }
    
}
