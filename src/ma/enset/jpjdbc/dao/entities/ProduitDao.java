package ma.enset.jpjdbc.dao.entities;

import java.util.List;
import ma.enset.jpjdbc.dao.entities.Produit;

    public interface ProduitDao extends Dao<Produit>{
        List<Produit> findByMotCle(String mc);
    }