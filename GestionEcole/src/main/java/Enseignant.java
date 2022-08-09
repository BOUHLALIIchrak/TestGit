/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fakroun
 */
public class Enseignant {
int id;
    String nom;
    String prenom;
   
    
    
    
    
    
    
    
    public Enseignant(int id,String nom, String prenom)
    {
    
    
    this.id=id;
    this.nom=nom;
    this.prenom=prenom;
   
    }
    public Enseignant(){}

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public String toString() {
        return "Enseignant{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + '}';
    }
    
@Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (o.getClass() != this.getClass()) {
            return false;
        }
        final Enseignant E = (Enseignant) o;
        if (E.id == this.id  ) {
            return true;
        }
        return false;
    }
@Override
    public int hashCode() {
        return id+prenom.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
 
    public int compareTo(Enseignant o) {
//        
        return this.id-o.id;
    }

    
    
    
    
    
    
    
}
