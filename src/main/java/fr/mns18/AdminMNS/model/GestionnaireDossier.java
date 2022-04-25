package fr.mns18.AdminMNS.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class GestionnaireDossier extends Utilisateur{



    @OneToMany(mappedBy = "gestionnaireDossier")//on parle de la meme relation
    List<PieceJustificative> pieceJustifives = new ArrayList<>();

    @ManyToMany
    List<ElementDemandable> elementDemandables = new ArrayList<>();

    @ManyToMany
    List<DemandeInscription> demandeInscriptions = new ArrayList<>();

}
