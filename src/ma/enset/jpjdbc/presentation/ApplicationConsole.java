package ma.enset.jpjdbc.presentation;

import ma.enset.jpjdbc.dao.entities.CategorieDaoImpl;
import ma.enset.jpjdbc.dao.entities.Produit;
import ma.enset.jpjdbc.dao.entities.ProduitDaoImpl;
import ma.enset.jpjdbc.services.CatalogueService;
import ma.enset.jpjdbc.services.CatalogueServiceImpl;

import java.util.List;

public class ApplicationConsole {
    public static void main(String[] args){
        CatalogueService pService=new CatalogueServiceImpl(new ProduitDaoImpl(),new CategorieDaoImpl());
        List<Produit> produits=pService.getProduitsParMc("A");
        for (Produit p:produits){
            System.out.println(p.getId()+" "+p.getNom()+"  "+p.getDescription()+" "+p.getPrix());
        }

    }
}
