//  2.Créer un package p1= “ma.education.tp1.introduction”
package ma.education.tp1.introduction;

//  3.Dans le package (p1), créer une classe java Salle
public class Salle {
    //  3.classe java Salle définie par un id de type long et un nom de type String
    long id;
    String nom;

    //  4.Dans la classe Salle créer les trois constructeurs suivants:

    //  4.a.Un constructeur sans paramètres
    Salle(){
    }

    //  4.b.Un constructeur pour le nom de la salle
    Salle(String nom){
        this.nom = nom;
    }

    //  4.c.Un constructeur pour l’id et le nom de la salle
    Salle(long id, String nom){
        this(nom);
        this.id = id;
    }
}
