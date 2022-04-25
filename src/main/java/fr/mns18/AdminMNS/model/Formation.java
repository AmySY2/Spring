package fr.mns18.AdminMNS.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Formation {

    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Integer id;

    private String libele;

    private  String description;

    private String Status;

    @ManyToMany
    @JoinTable(name = "Formation_ElementDemander",
            joinColumns = @JoinColumn(name = "formation_id"),
            inverseJoinColumns = @JoinColumn(name = "elementDemandable_id")
    )
    List<ElementDemandable> elementDemandables = new ArrayList<>();


    @OneToMany(mappedBy = "formation")
    List<DemandeInscription> demande_inscriptions = new ArrayList<>();
}
