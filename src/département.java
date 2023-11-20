public class département {
    // Attributs
    private int id;
    private String nomDepartement;
    private int nombreEmployes;

    // Constructeurs
    public département() {
        // Constructeur sans paramètre
    }

    public département(int id, String nomDepartement, int nombreEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nombreEmployes = nombreEmployes;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }

    // Redéfinition de la méthode equals pour tester l'égalité entre deux départements
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o instanceof département e) {

            if (e.getNomDepartement().equals(this.nomDepartement) && e.getId() == this.id) {
                return true;
            }
        }
        return false;
    }

    // Redéfinition de la méthode toString pour obtenir une représentation en chaîne de caractères du département
    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", nombreEmployes=" + nombreEmployes +
                '}';
    }
}
