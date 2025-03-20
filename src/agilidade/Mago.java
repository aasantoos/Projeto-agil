// Subclasse Mago que herda de Personagem
class Mago extends Personagem {
    int mana;

    // Construtor para a classe Mago
    public Mago(String nome, int vida, int ataque, int mana) {
        // Chama o construtor da classe base (Personagem)
        super(nome, vida, ataque);
        this.mana = mana;
    }

    // Método para usar magia
    public void usarMagia(Personagem outroPersonagem) {
        if (this.mana >= 10) {
            this.mana -= 10;  // Usa 10 de mana
            int danoMagico = this.ataque * 2;  // O dano mágico é o dobro do ataque normal
            outroPersonagem.vida -= danoMagico;
            System.out.println(this.nome + " usou uma magia em " + outroPersonagem.nome + ", causando " + danoMagico + " de dano!");
        } else {
            System.out.println(this.nome + " não tem mana suficiente para usar magia!");
        }
    }

    // Método para regenerar mana
    public void regenerarMana(int quantidade) {
        this.mana += quantidade;
        System.out.println(this.nome + " regenerou " + quantidade + " de mana. Mana atual: " + this.mana);
    }
}
