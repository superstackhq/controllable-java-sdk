package in.controllable.model;

import java.io.Serializable;

public class PropertyValue implements Serializable {

    private String id;

    private Object data;

    private Rule rule;

    private Segment segment;

    public PropertyValue() {

    }

    public PropertyValue(Object data, Rule rule, Segment segment) {
        this.data = data;
        this.rule = rule;
        this.segment = segment;
    }

    public PropertyValue(String id, Object data, Rule rule, Segment segment) {
        this.id = id;
        this.data = data;
        this.rule = rule;
        this.segment = segment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Rule getRule() {
        return rule;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }

    public Segment getSegment() {
        return segment;
    }

    public void setSegment(Segment segment) {
        this.segment = segment;
    }
}
