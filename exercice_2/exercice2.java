public class GestionnaireNotes {

    /**
     * declaration de la fonction afficherNotesEtMoyenne
     * @param nomEtudiant le nom de l'etudiant
     * @param notes le tableau de notes de l'etudiant
     */
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
       
    	// Affichage des notes
    	afficherNotes(nomEtudiant,notes);

        // Calcul de la somme des notes
    	int somme = calculerSomme(notes);

        // Affichage de la moyenne
    	afficherMoyenne(somme,notes);
    }
    
    /**
     * description de la fonction afficherNotes
     * @param nomEtudiant le nom de l'etudiant
     * @param notes le tableau de notes de l'etudiant
     */
    public void afficherNotes(String nomEtudiant,int[] notes) {
    	
    	System.out.println("Notes de " + nomEtudiant + ":");
    	
        for (int note : notes) {
            System.out.println("- " + note);
        }
    }
    
    /**
     * description de la fonction calculerSomme
     * @param notes le tableau de notes de l'etudiant
     * @return somme la somme des notes
     */
    public int calculerSomme(int[] notes) {
    	int somme = 0;
        for (int note : notes) {
            somme += note;
        }
        return somme;
    }
    
    /**
     * description de la fonction afficherMoyenne
     * @param somme la somme des notes
     * @param notes le tableau de notes de l'etudiant
     */
    public void afficherMoyenne( int somme,int[] notes) {
    	
    	double moyenne = (double) somme / notes.length;
        System.out.println("Moyenne : " + moyenne);
    }
}
