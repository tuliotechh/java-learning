public class CP extends Conta{

    @Override
    public void imprimirExtratp() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfoComuns();
    }
}
