package ma.enset.jpjdbc.services;

import ma.enset.jpjdbc.dao.entities.Produit;
import ma.enset.jpjdbc.dao.entities.ProduitDao;

import java.util.List;

public class ProduitServiceImpl implements ProduitService {
    ProduitDao pdao;


    public ProduitServiceImpl(ProduitDao pdao) {
        this.pdao = pdao;

    }
    @Override
    public List<Produit>getAllProduits(){
        return pdao.findAll();

    }

    @Override
    public void addProduit(Produit p) {
        pdao.save(p);
    }

    @Override
    public void deleteProduit(Produit p) {
        pdao.delete(p);
    }
   @Override
    public List<Produit>getProduitsParMc(String mc){
        return pdao.findByMotCle(mc);
   }

}