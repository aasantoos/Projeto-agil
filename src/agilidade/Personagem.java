public class Personagem {
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;

    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public void receberDano(int dano) {
        int danoRecebido = Math.max(dano - defesa, 0); // A defesa minimiza o dano, mas não pode torná-lo negativo
        this.vida -= danoRecebido;
        System.out.println(this.nome + " recebeu " + danoRecebido + " de dano e agora tem " + this.vida + " de vida.");
    }

    public void atacar(Personagem outroPersonagem) {
        int dano = this.ataque;
        System.out.println(this.nome + " atacou " + outroPersonagem.getNome() + " causando " + dano + " de dano.");
        outroPersonagem.receberDano(dano);
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome + " - Vida: " + vida + ", Ataque: " + ataque + ", Defesa: " + defesa;
    }
}
