// Guerreiro.java
public class Guerreiro extends Personagem {
    // Atributo adicional
    private String espada;

    // Construtor
    public Guerreiro(String nome, int vida, int forca, String espada) {
        super(nome, vida, forca); // Chamando o construtor da superclasse Personagem
        this.espada = espada;
    }

    // Getter e setter
    public String getEspada() {
        return espada;
    }

    public void setEspada(String espada) {
        this.espada = espada;
    }

    // Sobrescrevendo o método atacar
    @Override
    public void atacar() {
        System.out.println(getNome() + " atacou com a espada " + espada + " e força " + getForca());
    }
}
