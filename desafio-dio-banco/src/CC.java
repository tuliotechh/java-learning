public class CC extends Conta {

    private static int SEQUENCIAL = 1;

    public CC() {
        super.agencia = Conta.AGENCIAP;
        super.num = SEQUENCIAL++;
    }

    @Override
    public void imprimirExtratp() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfoComuns();
    }
}
