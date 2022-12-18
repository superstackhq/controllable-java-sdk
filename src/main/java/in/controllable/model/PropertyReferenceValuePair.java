package in.controllable.model;

import java.io.Serializable;

public class PropertyReferenceValuePair implements Serializable {

    private PropertyReference reference;

    private PropertyValue value;

    public PropertyReferenceValuePair() {

    }

    public PropertyReferenceValuePair(PropertyReference reference, PropertyValue value) {
        this.reference = reference;
        this.value = value;
    }

    public PropertyReference getReference() {
        return reference;
    }

    public void setReference(PropertyReference reference) {
        this.reference = reference;
    }

    public PropertyValue getValue() {
        return value;
    }

    public void setValue(PropertyValue value) {
        this.value = value;
    }
}
