abstract public class Apprendre {
    
    protected String nom;
    protected String math;

public void desc(){
    System.out.println(nom + " apprend le cour de  : " + math);
}

abstract public void lire(String lire);

abstract public void ecrire(String ecrire);

}