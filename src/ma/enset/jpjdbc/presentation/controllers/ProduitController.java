package ma.enset.jpjdbc.presentation.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import ma.enset.jpjdbc.dao.entities.Produit;
import ma.enset.jpjdbc.dao.entities.ProduitDaoImpl;
import ma.enset.jpjdbc.services.ProduitService;
import ma.enset.jpjdbc.services.ProduitServiceImpl;

import java.net.URL;
import java.util.ResourceBundle;

public class ProduitController implements Initializable {
    @FXML
    private TextField textNom;
    @FXML
    private TextField textDescription;
    @FXML
    private TextField textPrix;
    @FXML
    private TextField textQuantite;
    @FXML
    private ListView<Produit> listView;
    private ObservableList<Produit>observableList= FXCollections.observableArrayList();
    private ProduitService produitService;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        produitService=new ProduitServiceImpl(new ProduitDaoImpl());
        listView.setItems(observableList);
        loadProduits();
    }

    @FXML
    public void clearProduit() {
    }

    private void loadProduits(){
     observableList.clear();
     observableList.addAll(produitService.getAllProduits());
    }
    @FXML
    private void addProduit(){
        String nom=textNom.getText();
        String description=textDescription.getText();
        float prix=Float.parseFloat(textPrix.getText());
        int quantite=Integer.parseInt(textQuantite.getText());
        if(nom.isEmpty()){
            Alert alert=new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Veuillez saisir un nom!!!");
            alert.show();

        }
        else {
            Produit p=new Produit();
            p.setNom(nom);
            p.setDescription(description);
            p.setPrix(prix);
            p.setQuantite(quantite);
            produitService.addProduit(p);
            loadProduits();

        }
    }
    @FXML
    private void deleteProduit(){
        MultipleSelectionModel<Produit> np=listView.getSelectionModel();
        if (np!=null){
            produitService.deleteProduit(np.getSelectedItem());
            observableList.remove(np.getSelectedIndex());

        }else {
            Alert alert=new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Veuillez selectionner un element !!");
            alert.show();
        }
    }
}
