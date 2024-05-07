public class Arrays {
    public static void main(String[] args) {
        // Arrays (sempre inicia em ZERO)

        String alunos [] = {"Marco", "Tulio", "Santiago", "Garcia"};

        for (int i=0; i<alunos.length; i++){ // lenght = tamanho (enquanto i for menor que o tamanho da array aluno...
            System.out.println("O aluno indice i=" + i + "é" + alunos[i]);
        }
        for (String aluno : alunos){
            System.out.println("O nome do aluno é: " + aluno);
        }

    }
}
