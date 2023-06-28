package ma.enset.jpjdbc.services;

import ma.enset.jpjdbc.dao.entities.Categorie;
import ma.enset.jpjdbc.dao.entities.CategorieDao;
import ma.enset.jpjdbc.dao.entities.Produit;
import ma.enset.jpjdbc.dao.entities.ProduitDao;

import java.util.List;

public class CatalogueServiceImpl implements CatalogueService {
    ProduitDao produitDao;
    CategorieDao categorieDao;

    public CatalogueServiceImpl(ProduitDao produitDao,CategorieDao categorieDao) {
        this.produitDao = produitDao;
        this.categorieDao=categorieDao;

    }
    @Override
    public List<Produit>getAllProduits(){
        return produitDao.findAll();

    }

    @Override
    public void addProduit(Produit p) {
        produitDao.save(p);
    }

    @Override
    public void deleteProduit(Produit p) {
        produitDao.delete(p);
    }
   @Override
    public List<Produit>getProduitsParMc(String mc){
        return produitDao.findByMotCle(mc);
   }


    @Override
    public List<Categorie> getAllCategorie() {
        return categorieDao.findAll();
    }

    @Override
    public Categorie getCategorieById(int id) {
        return categorieDao.findOne(id);
    }

    @Override
    public void AddCategorie(Categorie c) {
        categorieDao.save(c);
    }

    @Override
    public void deleteCategorie(Categorie c) {
        categorieDao.delete(c);
    }

}