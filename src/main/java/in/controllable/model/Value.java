package in.controllable.model;

import java.io.Serializable;

public class Value implements Serializable {

    private String id;

    private Object data;

    private Rule rule;

    private Segment segment;

    public Value() {

    }

    public Value(Object data, Rule rule, Segment segment) {
        this.data = data;
        this.rule = rule;
        this.segment = segment;
    }

    public Value(String id, Object data, Rule rule, Segment segment) {
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
