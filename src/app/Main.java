public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Arthur", 100, 20, "Espada Longa");
        Mago mago = new Mago("Merlin", 80, 10, 100);

        guerreiro.atacar();
        mago.atacar();
    }
}