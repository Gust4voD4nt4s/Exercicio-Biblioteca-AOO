public class Autor extends Pessoa {
    public String nacionalidade;

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Autor(String nome) {
        super(nome);
    }

    public Autor(String nome,String nacionalidade) {
        super(nome);
        this.nacionalidade = nacionalidade;
    }

}
