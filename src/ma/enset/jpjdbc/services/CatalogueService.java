package ma.enset.jpjdbc.services;

import ma.enset.jpjdbc.dao.entities.Categorie;
import ma.enset.jpjdbc.dao.entities.Produit;

import java.util.List;

public interface CatalogueService {
    List<Produit> getAllProduits();
    void  addProduit(Produit p);
    void deleteProduit(Produit p);
    List<Produit>getProduitsParMc(String mc);


    List<Categorie> getAllCategorie();
    Categorie getCategorieById(int id);
    void AddCategorie(Categorie c);
    void deleteCategorie(Categorie c);
}
