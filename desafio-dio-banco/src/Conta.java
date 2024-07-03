public abstract class Conta implements IConta{
    protected static final int AGENCIAP = 1;

    protected int agencia;
    protected int num;
    protected double saldo;

    public int getAgencia() {
        return agencia;
    }

    public int getNum() {
        return num;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void tranferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    protected void imprimirInfoComuns(){
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.num));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
