package in.controllable.model;

import java.io.Serializable;
import java.util.List;

public class PropertyReference implements Serializable {

    private List<String> namespace;

    private String key;

    private String version;

    public PropertyReference() {

    }

    public PropertyReference(List<String> namespace, String key, String version) {
        this.namespace = namespace;
        this.key = key;
        this.version = version;
    }

    public List<String> getNamespace() {
        return namespace;
    }

    public void setNamespace(List<String> namespace) {
        this.namespace = namespace;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
