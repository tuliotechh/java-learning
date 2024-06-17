package List.OperaçoesBasicas.Ordenação;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdPessoa {
    private List<Pessoa> pessoaList;

    public OrdPessoa() {
        this.pessoaList = pessoaList;
    }
    public void addPessoa(String nome, int idade, float altura){
        pessoaList.add(new Pessoa(nome, idade, altura));

    }
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }
}