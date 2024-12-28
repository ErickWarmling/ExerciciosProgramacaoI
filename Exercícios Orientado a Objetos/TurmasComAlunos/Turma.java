import java.util.ArrayList;

public class Turma
{
    private String nomeDisciplina;
    private String nomeProfessor;
    private ArrayList<Aluno> listaAlunos;
    
    public Turma (String nomeDisciplina, String nomeProfessor){
        this.nomeDisciplina = nomeDisciplina;
        this.nomeProfessor = nomeProfessor;
        this.listaAlunos = new ArrayList<Aluno>();
    }
    
    public void acrescentarAlunos (Aluno aluno){
        if (!this.listaAlunos.contains (aluno)){
            this.listaAlunos.add(aluno);
        }
    }
    
    public int getQuantidadeAlunos (){
        return this.listaAlunos.size();
    }
    
    public void imprimeAlunos (){
        System.out.println ("Disciplina: " + this.nomeDisciplina);
        System.out.println ("Professor(a): " + this.nomeProfessor);
        
        for (int i = 0; i < this.listaAlunos.size(); i++){
            Aluno aluno = listaAlunos.get(i);
            System.out.println ("Aluno(a): " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula());
        }
    }
}
