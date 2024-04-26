
public class SimpleTask implements TaskSystem{
    private String titulo;
    private String descricao;
    private double prazo;

    public SimpleTask (String titulo, String descricao, double prazo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
    }

    @Override
    public void print(String structure) {
        System.out.println(structure + "Tarefa Simples: " + titulo + ", Descrição: "
        + descricao + ", Prazo: " +prazo);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrazo() {
        return prazo;
    }
    
}