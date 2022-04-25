package fr.mns18.AdminMNS.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class DemandeInscription extends Utilisateur{


    @Id //clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY ) //id est autogénerer
    private Integer id;

    private Date dateInscription;

    private String nationnalite;

    private String statusDossier;


    @ManyToOne
    @MapsId("demandeInscription_id")//Clé etranger
    private Candidat candidat;

    @ManyToOne
    @MapsId("demandeInscription_id")
    private Formation formation;

    @ManyToMany
    @JoinTable(name = "GestinnairetDossier_DemandeInscription",
            joinColumns = @JoinColumn(name = "gestinnaireDossier_id"),
            inverseJoinColumns = @JoinColumn(name = "demandeInscription_id")
    )
    List<GestionnaireDossier> gestionnaireDossiers = new ArrayList<>();


}
