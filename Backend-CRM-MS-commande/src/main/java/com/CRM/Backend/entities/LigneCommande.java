package com.CRM.Backend.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LigneCommande implements Serializable {
    @Id
    private Long id;

    private int Qte;
    private Double PrixTotale;


    @ManyToOne
    @JoinColumn(name = "IdCommande")
    private Commande commande;

    @ManyToOne
    @JoinColumn(name = "IdProduit")
    private Produit produit;








    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}