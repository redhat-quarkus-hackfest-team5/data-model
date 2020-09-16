package quarkus.hackfest.datamodel;

public class Guess {

   private String gp;
   private String driver;

   public Guess() {}

   public Guess(String gp, String driver) {
       this.gp = gp;
       this.driver = driver;
   }

    public String getGp() {
        return gp;
    }

    public void setGp(String gp) {
        this.gp = gp;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
}
