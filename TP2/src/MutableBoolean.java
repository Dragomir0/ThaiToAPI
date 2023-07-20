package TP2.src;

/**
 * Classe représentant une valeur booléenne mutable.
 * Permet de modifier val boolean modifie par valeur et non par référence après sa création
 */
public class MutableBoolean {

    private boolean value;

    /**
     * Constructeur qui initialise la valeur mutable avec une valeur booléenne spécifiée.
     *
     * @param value La valeur initiale du boolean
     */
    public MutableBoolean(boolean value) {
        this.value = value;
    }

    /**
     * Retourne la valeur boolean
     *
     * @return La valeur booléenne
     */
    public boolean estVrai() {
        return value;
    }

    /**
     * Modifie la valeur du boolean
     *
     * @param value Nouvelle valeur à assigner
     */
    public void setValue(boolean value) {
        this.value = value;
    }
}

