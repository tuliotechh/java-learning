package br.com.dio.desafio.dominio;

public class Curso extends Conteudos{
    private int cargaHoraria;

    public Curso() {
    }

    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso: " +
                ", Titulo:" + getTitulo() +
                ", Descrição: " + getDescricao() +
                ", Carga Horaria: " + cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


}
