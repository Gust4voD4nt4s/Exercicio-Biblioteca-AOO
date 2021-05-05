public class Professor extends Pessoa {
    public String codigo;

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Professor(String nome) {
        super(nome);
    }
    
    public Professor(String nome,String codigo) {
        super(nome);
        this.codigo = codigo;
    }
    
}
