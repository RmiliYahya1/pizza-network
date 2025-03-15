package com.emsi.pizza.services;

import com.emsi.pizza.bean.Produit;
import com.emsi.pizza.dao.IDao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProduitService implements IDao<Produit> {

    List<Produit> produits;

    public ProduitService(){
        produits=new ArrayList<>();
    }
    @Override
    public boolean create(Produit o) {
        return produits.add(o);
    }

    @Override
    public boolean update(Produit o) {
        for (Produit produit : produits){
            if (produit.getId()==o.getId()){
                produit.setNom(o.getNom());
                produit.setNbrIngredients(o.getNbrIngredients());
                produit.setPhoto(o.getPhoto());
                produit.setDuree(o.getDuree());
                produit.setDetailsIngred(o.getDetailsIngred());
                produit.setDescription(o.getDescription());
                produit.setPreparation(o.getPreparation());
            }
        }
        return true;
    }

    @Override
    public boolean delete(Produit o) {
        return produits.remove(o);
    }

    @Override
    public List<Produit> findAll() {
        return produits;
    }

    @Override
    public Produit findById(int id) {
        for (Produit produit:produits){
            if (produit.getId()==id){
                return produit;
            }
        }
        return null;
    }
}
