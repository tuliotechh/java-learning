package Herança;

public class Aluno extends Pessoa {
    private int mat;
    private String curso;

    public void cancelarMat(){
        System.out.println("Matricula sera cancelada");
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
