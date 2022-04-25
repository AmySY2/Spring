package fr.mns18.AdminMNS.model;

import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@IdClass(CleNcessitePiece.class)
public class NecessitePiece {

    @Id
    private Integer pieceJustificativeId;

    @Id
    private Integer elementDemandableId;

    @Id
    private Integer demandeInscriptionId;

    @ManyToOne
    @MapsId("pieceJustificative_id")
    private PieceJustificative pieceJustificative;

    @ManyToOne
    @MapsId("elementDemandable_id")
    private ElementDemandable elementDemandable;

    @ManyToOne
    @MapsId("demandeInscription_id")
    private DemandeInscription demandeInscription;



}
