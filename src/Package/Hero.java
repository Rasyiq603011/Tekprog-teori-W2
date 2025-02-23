package Package;

public class Hero {
    private String heroName;
    private int vitality;
    private int might;

    public Hero(String heroName, int vitality, int might) {
        this.heroName = heroName;
        this.vitality = vitality;
        this.might = might;
    }

    public void addVitality(int modifierV){
        this.vitality += modifierV;
    }

    public void addMigth(int modifierM){
        this.might += modifierM;
    }

    public void display(){
        System.out.println("========================================================");
        System.out.println("Nama Hero : " + this.heroName);
        System.out.println("Vitality  : " + this.vitality);
        System.out.println("Migth     : " + this.might);
        System.out.println("========================================================");
    }

    public String getName(){
        return this.heroName;
    }

    public void useElixir(Elixir elixir) {
        System.out.println("========================================================");
        System.out.println(getName() + " memakan buah " + elixir.getElixirName()+ "!");
        System.out.println("========================================================");
        addMigth(elixir.getStrengthBoost() - elixir.getPowerDrain());  
        addVitality(elixir.getRejuvenation() - elixir.getCorrosion()); 
    }
}