package quarkus.hackfest.datamodel;

public class Guess {

   private String Gp;
   private String driver;

   public Guess() {}

   public Guess(String Gp, String driver) {
       this.Gp = Gp;
       this.driver = driver;
   }

    public String getGp() {
        return Gp;
    }

    public void setGp(String gp) {
        Gp = gp;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
}
