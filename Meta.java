  public class Meta {
    private int id;
    private String descricao;
    private double valorAlvo;

    // Construtor padrão (vazio)
    public Meta() {}

    // Construtor com parâmetros
    public Meta(int id, String descricao, double valorAlvo) {
        this.id = id;
        this.descricao = descricao;
        this.valorAlvo = valorAlvo;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public double getValorAlvo() { return valorAlvo; }
    public void setValorAlvo(double valorAlvo) { this.valorAlvo = valorAlvo; }
}

