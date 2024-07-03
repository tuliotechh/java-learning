package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudos{
    private LocalDate data;

    public Mentoria() {

    }

    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria: " +
                ", Titulo:" + getTitulo() +
                ", Descrição: " + getDescricao() +
                ", Data: " + data;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }


}
