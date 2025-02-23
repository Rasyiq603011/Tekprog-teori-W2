package Package;

public class Main {
    
    public static void main(String[] args) {
        Hero naruto = new Hero("Uzumaki Naruto", 1000, 150);
        Hero sasuke = new Hero("Uciha Sasuke", 750, 75);

        naruto.display();
        sasuke.display();

        Elixir racunSasori = new Elixir("Racun Sasori", 0, 0, 10, 200);
        Elixir racunOrochimaru = new Elixir("Tanda Kutukan Orochimaru", 80, 250, 0, 300 );
        Elixir cakraKurama = new Elixir("Cakra Kurama", 80, 250, 0, 300 );
        Elixir buahCakra = new Elixir("Pohon Dewa", 1000, 25000, 0, 0 );
        
        naruto.useElixir(cakraKurama);
        sasuke.useElixir(racunOrochimaru);

        naruto.display();
        sasuke.display();

        naruto.useElixir(racunSasori);
        naruto.useElixir(buahCakra);
        sasuke.useElixir(buahCakra);

        naruto.display();
        sasuke.display();

    }
}