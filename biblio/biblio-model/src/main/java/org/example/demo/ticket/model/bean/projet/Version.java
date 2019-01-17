package org.example.demo.ticket.model.bean.projet;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * Objet métier représentant une Version de Projet
 *
 * @author lgu
 */
public class Version {

    // ==================== Attributs ====================
    @NotNull
    private Projet projet;

    @NotNull
    @Size(min = 1, max = 30)
    private String numero;


    // ==================== Constructeurs ====================
    /**
     * Constructeur par défaut.
     */
    public Version() {
    }


    // ==================== Getters/Setters ====================
    public Projet getProjet() {
        return projet;
    }
    public void setProjet(Projet pProjet) {
        projet = pProjet;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String pNumero) {
        numero = pNumero;
    }


    // ==================== Méthodes ====================
    @Override
    public String toString() {
        final StringBuilder vStB = new StringBuilder(this.getClass().getSimpleName());
        final String vSEP = ", ";
        vStB.append(" {")
            .append("projet=").append(projet)
            .append(vSEP).append("numero=\"").append(numero).append('"')
            .append("}");
        return vStB.toString();
    }
}
