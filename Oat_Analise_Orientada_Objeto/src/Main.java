public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Stephen Hawking","Reino Unido");
        Autor autor2 = new Autor("Stephen Covey","Estados Unidos");
        Aluno aluno = new Aluno("Gustavo","312");
        Professor prof = new Professor("Efraim","7");
        Livro livro1 = new Livro("Uma breve historia do tempo",autor1);
        livro1.emprestadoPor = new Aluno("Gustavo");
        System.out.println("O livro " + livro1.nome + " de " + autor1.nome + " do " + autor1.nacionalidade + " foi emprestado pelo(a) " + livro1.emprestadoPor.nome );
        Livro livro2 = new Livro("Os 7 habitos das pessoa altamente eficazes",autor2);
        livro2.emprestadoPor = new Professor("Efraim");
        System.out.println("O livro " + livro2.nome + " de " + autor2.nome + " do " + autor2.nacionalidade + " foi emprestado pelo(a) " + livro2.emprestadoPor.nome);
    }
}