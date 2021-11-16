package masteril.example.musique.model;

import org.springframework.context.annotation.Bean;

import java.util.Objects;

public class Musique {

    private String name;
    private int id;
    private String chanteur;

    public Musique(int id, String name, String chanteur) {
        this.name = name;
        this.id = id;
        this.chanteur = chanteur;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChanteur() {
        return chanteur;
    }

    public void setChanteur(String chanteur) {
        this.chanteur = chanteur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Musique musique = (Musique) o;
        return id == musique.id && Objects.equals(name, musique.name) && Objects.equals(chanteur, musique.chanteur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, chanteur);
    }
}
