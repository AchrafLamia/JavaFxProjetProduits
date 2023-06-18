package ma.enset.jpjdbc.presentation.view;

import ma.enset.jpjdbc.dao.entities.Produit;
import ma.enset.jpjdbc.dao.entities.ProduitDaoImpl;
import ma.enset.jpjdbc.services.ProduitService;
import ma.enset.jpjdbc.services.ProduitServiceImpl;

import java.util.List;

public class ApplicationConsole {
    public static void main(String[] args){
        ProduitService pService=new ProduitServiceImpl(new ProduitDaoImpl());
        List<Produit> produits=pService.getProduitsParMc("A");
        for (Produit p:produits){
            System.out.println(p.getId()+" "+p.getNom()+"  "+p.getDescription()+" "+p.getPrix());
        }

    }
}
