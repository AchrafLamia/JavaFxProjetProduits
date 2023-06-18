package ma.enset.jpjdbc.services;

import ma.enset.jpjdbc.dao.entities.Produit;

import java.util.List;

public interface ProduitService {
    List<Produit> getAllProduits();
    void  addProduit(Produit p);
    void deleteProduit(Produit p);
    List<Produit>getProduitsParMc(String mc);
}
