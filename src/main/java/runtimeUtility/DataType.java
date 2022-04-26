package runtimeUtility;

import java.util.Objects;

public class DataType {

    private final Object object;

    DataType(Object object) {
        this.object = object;
    }

    public Integer dataAsInteger() {
        return (Integer) object;
    }

    public Boolean dataAsBoolean() {
        return (Boolean) object;
    }

    public String dataAsString() {
        return String.valueOf(object);
    }

    public String getDataType() {
        try {
            int i = (Integer) object;
            return "Integer";
        } catch (ClassCastException e) {
            String val = String.valueOf(object);
            if (val.equals("true") || val.equals("false")) {
                return "Boolean";
            }
            return "String";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataType dataType = (DataType) o;
        return Objects.equals(object, dataType.object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(object);
    }

    @Override
    public String toString() {
        return object.toString();
    }
}
