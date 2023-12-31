package ma.enset.jpjdbc.dao.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Categorie implements Serializable {
 private int id;
 private String nom;
   private List<Produit> produits=new ArrayList<>();
    public Categorie() {
    }

    public Categorie( String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }
}
