package Herança;

public class Professor extends Pessoa{
    private String espec;
    private float salario;

    public void receberAum(float aum){
        this.salario += aum;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getEspec() {
        return espec;
    }

    public void setEspec(String espec) {
        this.espec = espec;
    }
}
