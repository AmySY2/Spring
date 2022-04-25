package fr.mns18.AdminMNS.model;

import javax.persistence.Column;
import java.io.Serializable;

public class CleNcessitePiece implements Serializable {

    @Column(name = "pieceJustificatif_id")
    private Integer pieceJustificatifId;

    @Column(name = "elementDemandable_id")
    private Integer elementDemandableId;

    @Column(name = "demandeInscription_id")
    private Integer demandeInscriptionId;

    public Integer getPieceJustificatifId() {
        return pieceJustificatifId;
    }

    public void setPieceJustificatifId(Integer pieceJustificatifId) {
        this.pieceJustificatifId = pieceJustificatifId;
    }

    public Integer getElementDemandableId() {
        return elementDemandableId;
    }

    public void setElementDemandableId(Integer elementDemandableId) {
        this.elementDemandableId = elementDemandableId;
    }

    public Integer getDemandeInscriptionId() {
        return demandeInscriptionId;
    }

    public void setDemandeInscriptionId(Integer demandeInscriptionId) {
        this.demandeInscriptionId = demandeInscriptionId;
    }
}
