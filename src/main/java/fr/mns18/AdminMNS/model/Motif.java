package fr.mns18.AdminMNS.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Motif {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY ) //id est autogénerer
    private Integer id;

    private String libelleMotif;

    private String textMotif;

    @OneToMany(mappedBy = "motif")
    List<EvenementDePresence> evenementDePresences = new ArrayList<>();



}
