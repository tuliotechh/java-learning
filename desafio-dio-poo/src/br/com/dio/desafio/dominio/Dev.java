package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudos> conteudosIncritos = new LinkedHashSet<>();
    private Set<Conteudos> conteudosConcluidos = new LinkedHashSet<>();

    public void inscrever(Bootcamp bootcamp){
        this.conteudosIncritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }
    public void progredir(){
        Optional<Conteudos> conteudo = this.conteudosIncritos.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosIncritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteudo!");
        }
    }

    public double calcularTotalXp(){
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(conteudo -> calcularTotalXp())
                .sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(getNome(), dev.getNome()) && Objects.equals(getConteudosIncritos(), dev.getConteudosIncritos()) && Objects.equals(getConteudosCOncluidos(), dev.getConteudosCOncluidos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getConteudosIncritos(), getConteudosCOncluidos());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudos> getConteudosIncritos() {
        return conteudosIncritos;
    }

    public void setConteudosIncritos(Set<Conteudos> conteudosIncritos) {
        this.conteudosIncritos = conteudosIncritos;
    }

    public Set<Conteudos> getConteudosCOncluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosCOncluidos(Set<Conteudos> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }
}
