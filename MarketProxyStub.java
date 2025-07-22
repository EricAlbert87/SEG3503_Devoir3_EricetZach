package Counter;

public class MarketProxyStub extends MarketProxy {

    @Override
    public boolean addItem(String itemId) {
        // Simule l'ajout d'un article
        return !itemId.equals("OUT_OF_STOCK");
    }

    @Override
    public double getTotal() {
        // Retourne un total simulé
        return 12.99;
    }

    @Override
    public boolean removeItem(String itemId) {
        // Simule la suppression d'un article
        return !itemId.isEmpty();
    }

    @Override
    public void clearTransaction() {
        // Simule la réinitialisation de la transaction
        System.out.println("Transaction réinitialisée (stub).");
    }
}
