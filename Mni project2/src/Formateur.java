public class Formateur extends Employe{

    private int HeureSup;
    private static double RemunerationHSup=70;

    public Formateur() {
        super();
        this.HeureSup=0;
    }

    @Override
    public double SalaireAPayer() {
        int NbreHS = HeureSup;
        if (NbreHS >= 30)
            NbreHS = 30;
        return (salaireBase + NbreHS*RemunerationHSup) * (1 - Abstraite.getIR(salaireBase*12));

    }

    @Override
    public String toString() {
        return super.toString()+"Formateur : " +'\n'+

                            "      - heureSup=" + HeureSup +'\n';
    }



}
