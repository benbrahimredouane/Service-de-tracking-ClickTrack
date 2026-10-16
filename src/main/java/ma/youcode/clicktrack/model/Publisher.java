package ma.youcode.clicktrack.model;

public class Publisher {

    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private Category category;

    public Publisher(){}
    public Publisher(Long id, String nom, String prenom, String email, Category categorie) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.category = categorie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
