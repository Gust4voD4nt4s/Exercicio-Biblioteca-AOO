public class Aluno extends Pessoa {
    public String codigo;

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public Aluno(String nome) {
        super(nome);
    }
    
    public Aluno(String nome,String codigo) {
        super(nome);
        this.codigo = codigo;
    }
}
