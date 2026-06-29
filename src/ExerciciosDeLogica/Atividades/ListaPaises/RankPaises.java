package ExerciciosDeLogica.Atividades.ListaPaises;

public class RankPaises {
    private String nome;
    private int rank;

    public RankPaises(String nome, int rank){
        this.nome = nome;
        this.rank = rank;
    }

    public String toString() {
        return "Coutry: " + nome + " | Rank: " + rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
