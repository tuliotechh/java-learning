package Herança;

public class Funcionario extends Pessoa{
    private String setor;
    private boolean tramp;

    public void mudaTramp(){
        this.tramp =! this.tramp;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTramp() {
        return tramp;
    }

    public void setTramp(boolean tramp) {
        this.tramp = tramp;
    }
}
