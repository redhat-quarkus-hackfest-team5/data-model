package quarkus.hackfest.datamodel;

import org.infinispan.protostream.annotations.ProtoFactory;
import org.infinispan.protostream.annotations.ProtoField;

public class DriverStats {
    private String driver;
    private Integer count;

    public DriverStats() {
    }

    @ProtoFactory
    public DriverStats(String driver, Integer count) {
        this.driver = driver;
        this.count = count;
    }

    @ProtoField(number = 1)
    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    @ProtoField(number = 2)
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "DriverStats [count=" + count + ", driver=" + driver + "]";
    }
    
}
