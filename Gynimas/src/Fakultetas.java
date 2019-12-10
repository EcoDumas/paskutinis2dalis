// pažymėjimo nr.;
//
//pavardė vardas;
//
//gimimo data;
//
//grupė;
//
//vidurkis.//

public class Fakultetas {
    int pazymejoNr;
    String vardas;
    String pavarde;
    String gimimoData;
    String  grupe;
    double vidurkis;


    public Fakultetas(int pazymejoNr, String vardas, String pavarde, String gimimoData,String  grupe, double vidurkis){
        this.pazymejoNr = pazymejoNr;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.gimimoData = gimimoData;
        this.grupe = grupe;
        this.vidurkis = vidurkis;

    }

    private int getPazymejoNr(){
        return pazymejoNr;
    }

    public void setPazymejoNr(int pazymejoNr) {
        this.pazymejoNr = pazymejoNr;
    }

    public String getVardas(){
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getGimimoData(){
        return gimimoData;
    }

    public void setGimimoData(String gimimoData){
        this.gimimoData = gimimoData;
    }

    public String getGrupe(){
        return grupe;
    }

    public void setGrupe(String grupe) {
        this.grupe = grupe;
    }

    public double getVidurkis(){
        return vidurkis;
    }

    public void setVidurkis(double vidurkis){
        this.vidurkis = vidurkis;
    }
    @Override
    public String toString(){
        return "Pazymejimo nr: " + pazymejoNr +
                ", Vardas: " + vardas +
                ", Pavarde: " + pavarde +
                ", Gimimo metai: " + gimimoData +
                ", Grupe: " + grupe +
                ", Vidurkis: " + vidurkis + "\n";

    }
}

