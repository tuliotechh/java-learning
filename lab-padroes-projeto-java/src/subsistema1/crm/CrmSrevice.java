package subsistema1.crm;

public class CrmSrevice {
    private CrmSrevice(){
        super();
    }
    public static void gravarCliente(String nome, String cep, String cidade, String estado){
        System.out.println("Cliente salvo no sistema CRM.");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
