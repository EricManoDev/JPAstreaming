/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author Formation
 */
@Entity
public class Personne implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /// acteur episode
    @JoinTable(name = "ACTEURS")
    @ManyToMany
    List<Episode> acteursEpisodes = new ArrayList<>();
    //real episode
    @JoinTable(name = "REALISATEURS")
    @ManyToMany
    List<Episode> realisateursEpisodes = new ArrayList<>();

    ///acteur film
    @JoinTable(name = "ACTEURS")
    @ManyToMany
    List<Film> acteursFilms = new ArrayList<>();
    // real film
    @JoinTable(name = "REALISATEURS")
    @ManyToMany
    List<Film> realisateursFilms = new ArrayList<>();

    // acteur serie
    @JoinTable(name = "ACTEURS")
    @ManyToMany
    List<Serie> acteursSeries = new ArrayList<>();

    // real serie
    @JoinTable(name = "REALISATEURS")
    @ManyToMany
    List<Serie> realisateursSeries = new ArrayList<>();

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personne)) {
            return false;
        }
        Personne other = (Personne) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persistence.entity.Personne[ id=" + id + " ]";
    }

}
