/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.information_schema.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GlobalVariables implements Serializable {

    private static final long serialVersionUID = 98000614;

    private final String variableName;
    private final String variableValue;

    public GlobalVariables(GlobalVariables value) {
        this.variableName = value.variableName;
        this.variableValue = value.variableValue;
    }

    public GlobalVariables(
        String variableName,
        String variableValue
    ) {
        this.variableName = variableName;
        this.variableValue = variableValue;
    }

    public String getVariableName() {
        return this.variableName;
    }

    public String getVariableValue() {
        return this.variableValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GlobalVariables (");

        sb.append(variableName);
        sb.append(", ").append(variableValue);

        sb.append(")");
        return sb.toString();
    }
}
