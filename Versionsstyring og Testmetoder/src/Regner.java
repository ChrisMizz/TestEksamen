public class Regner {

    double Grundflade;
    double Højden;

    Regner(double Grundflade, double Højden){
        this.Grundflade = Grundflade;
        this.Højden = Højden;
    }

    public double sum() {
        double sum = (1.0/3.0*Højden*Grundflade);
        return sum;
    }
}
