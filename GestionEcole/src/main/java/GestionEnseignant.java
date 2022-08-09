/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Fakroun
 */
public interface GestionEnseignant {
public void ajouterEnseignant(Enseignant e);
public boolean rechercherEnseignant (Enseignant e);
public boolean rechercherEnseignant (int id);
public void supprimerEnseignant (Enseignant e);
public void displayEnseignants();
    
}
