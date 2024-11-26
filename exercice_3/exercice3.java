public class StockManager {

    /**
     * description de la fonction gererStock
     * @param typeOperation le type d'operation à effectuer
     * @param produit le nom du produit
     * @param quantité la quantité de produit
     * @param stock la quantité de produit en stock
     */
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {
        switch (typeOperation) {
            case "ajout":
                stock += quantite;
                System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
                break;
            case "retrait":
                if (stock >= quantite) {
                    stock -= quantite;
                    System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
                } else {
                    System.out.println("Stock insuffisant pour le produit : " + produit);
                }
                break;
            default:
                System.out.println("Opération inconnue.");
                break;
        }
    }
}
