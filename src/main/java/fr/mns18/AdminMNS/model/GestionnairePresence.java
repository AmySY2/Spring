package fr.mns18.AdminMNS.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class) // générer les tables automatiquement
@Getter
@Setter
public class GestionnairePresence extends Utilisateur{

    /*@Id //clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY ) //id est autogénerer
    private Integer id_Gestionnaire;*/

    @OneToMany(mappedBy = "evement_de_presence")
    List<PieceJustificative> pieceJustificatives = new ArrayList<>();

    @OneToMany(mappedBy = "evementDePresence")
    List<EvenementDePresence> evenementDePresences = new ArrayList<>();


}
