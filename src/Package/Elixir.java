package Package;

public class Elixir {
    private String elixirName;
    private int strengthBoost;  
    private int rejuvenation;  
    private int powerDrain;    
    private int corrosion;   

    public Elixir(String elixirName, int strengthBoost, int rejuvenation, int powerDrain, int corrosion) {
        this.elixirName = elixirName;
        this.strengthBoost = strengthBoost;
        this.rejuvenation = rejuvenation;
        this.powerDrain = powerDrain;
        this.corrosion = corrosion;
    }

    public String getElixirName() {
        return elixirName;
    }

    public int getStrengthBoost(){
        return this.strengthBoost;
    }

    
    public int getRejuvenation() {
        return this.rejuvenation;
    }
    
    public int getPowerDrain(){
        return this.powerDrain;
    }

    public int getCorrosion(){
        return this.corrosion;
    }
}
