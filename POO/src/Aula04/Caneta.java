package Aula04;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    private boolean tampada;

    public Caneta(String modelo, String cor, float ponta) { //Metodo Construtor
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
    }

    public String getModelo() { //Metodo Acessor
        return modelo;
    }

    public void setModelo(String modelo) { //Metodo Modificador
        this.modelo = modelo;
    }

    public String getCor() { //Metodo Acessor
        return cor;
    }

    public void setCor(String cor) { //Metodo Modificador
        this.cor = cor;
    }

    public float getPonta() { //Metodo Acessor
        return ponta;
    }

    public void setPonta(float ponta) { //Metodo Modificador
        this.ponta = ponta;
    }

    public boolean getTampada() { //Metodo Acessor
        return tampada;
    }

    public void setTampada(boolean tampada) { //Metodo Modificador
        this.tampada = tampada;
    }
    public void status(){

    }
}
