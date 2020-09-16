package quarkus.hackfest.datamodel;

import java.util.HashMap;
import java.util.Map;

import org.infinispan.protostream.annotations.ProtoFactory;
import org.infinispan.protostream.annotations.ProtoField;

public class Statistics {
    private String Gp;
    private Map<String, Integer> current = new HashMap<>();

    public Statistics() {}

    @ProtoFactory
    public Statistics(String Gp, Map<String, Integer> current) {
        this.Gp = Gp;
        this.current = current;
    }

    @ProtoField(number = 1)
    public String getGp() {
        return Gp;
    }

    public void setGp(String gp) {
        Gp = gp;
    }

    @ProtoField(number = 2)
    public Map<String, Integer> getCurrent() {
        return current;
    }

    public void setCurrent(Map<String, Integer> current) {
        this.current = current;
    }

}
