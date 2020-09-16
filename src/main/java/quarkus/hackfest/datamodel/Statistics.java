package quarkus.hackfest.datamodel;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.infinispan.protostream.annotations.ProtoFactory;
import org.infinispan.protostream.annotations.ProtoField;

public class Statistics {
    private String gp;
    private List<DriverStats> current = new LinkedList<>();

    public Statistics() {}

    @ProtoFactory
    public Statistics(String gp, List<DriverStats> current) {
        this.gp = gp;
        this.current = current;
    }

    @ProtoField(number = 1)
    public String getGp() {
        return gp;
    }

    public void setGp(String gp) {
        this.gp = gp;
    }

    @ProtoField(number = 2)
    public List<DriverStats> getCurrent() {
        return current;
    }

    public void setCurrent(List<DriverStats> current) {
        this.current = current;
    }

    public void incrementDriver(String driver) {
        Objects.requireNonNull(driver);

        synchronized(this.current) {
            DriverStats driverStats;

            Optional<DriverStats> driverStatsOpt = this.current.stream()
                .filter(ds -> driver.equals(ds.getDriver())).findAny();

            if (driverStatsOpt.isEmpty()) {
                driverStats = new DriverStats(driver, 0);
                getCurrent().add(driverStats);
            } else {
                driverStats = driverStatsOpt.get();
            }

            driverStats.setCount(driverStats.getCount() + 1);
        }
    }

}
