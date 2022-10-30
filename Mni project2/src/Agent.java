public class Agent extends Employe {
    private double PrimeResponsabilite;

    public double getPrimeResponsabilite() {
        return PrimeResponsabilite;
    }

    public void setPrimeResponsabilite(double primeResponsabilite) {
        this.PrimeResponsabilite = primeResponsabilite;
    }


    public Agent(double primeResponsabilite) {
        super();
        this.PrimeResponsabilite = primeResponsabilite;
    }

    @Override
    public double SalaireAPayer() {

        return (salaireBase+PrimeResponsabilite)*(1-Abstraite.getIR(salaireBase*12));

    }

}