package Aula02;

public class Aula3CV {
    public static void main(String[] args) {
        Aula02.Caneta3 c1 = new Aula02.Caneta3();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        //c1.status();
        c1.rabiscar();

        Aula02.Caneta3 c2 = new Aula02.Caneta3();
        c2.modelo = "Redragon";
        c2.cor = "Vermelha";
        c2.destampar();
        c2.rabiscar();
    }
}
