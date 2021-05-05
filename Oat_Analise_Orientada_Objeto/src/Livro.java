public class Livro {
    public String nome;
    public Pessoa emprestadoPor;
    public Autor autor;
    public Livro(String nome, Autor autor) {
        this.nome = nome;
        this.autor = autor;
    }
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Pessoa getemprestadoPor() {
        return this.emprestadoPor;
    }

    public void setemprestadoPor(Pessoa emprestadoPor) {
        this.emprestadoPor = emprestadoPor;
    }
}