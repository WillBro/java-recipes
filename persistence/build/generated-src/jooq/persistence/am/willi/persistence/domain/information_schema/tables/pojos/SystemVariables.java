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
public class SystemVariables implements Serializable {

    private static final long serialVersionUID = -864002158;

    private final String variableName;
    private final String sessionValue;
    private final String globalValue;
    private final String globalValueOrigin;
    private final String defaultValue;
    private final String variableScope;
    private final String variableType;
    private final String variableComment;
    private final String numericMinValue;
    private final String numericMaxValue;
    private final String numericBlockSize;
    private final String enumValueList;
    private final String readOnly;
    private final String commandLineArgument;

    public SystemVariables(SystemVariables value) {
        this.variableName = value.variableName;
        this.sessionValue = value.sessionValue;
        this.globalValue = value.globalValue;
        this.globalValueOrigin = value.globalValueOrigin;
        this.defaultValue = value.defaultValue;
        this.variableScope = value.variableScope;
        this.variableType = value.variableType;
        this.variableComment = value.variableComment;
        this.numericMinValue = value.numericMinValue;
        this.numericMaxValue = value.numericMaxValue;
        this.numericBlockSize = value.numericBlockSize;
        this.enumValueList = value.enumValueList;
        this.readOnly = value.readOnly;
        this.commandLineArgument = value.commandLineArgument;
    }

    public SystemVariables(
        String variableName,
        String sessionValue,
        String globalValue,
        String globalValueOrigin,
        String defaultValue,
        String variableScope,
        String variableType,
        String variableComment,
        String numericMinValue,
        String numericMaxValue,
        String numericBlockSize,
        String enumValueList,
        String readOnly,
        String commandLineArgument
    ) {
        this.variableName = variableName;
        this.sessionValue = sessionValue;
        this.globalValue = globalValue;
        this.globalValueOrigin = globalValueOrigin;
        this.defaultValue = defaultValue;
        this.variableScope = variableScope;
        this.variableType = variableType;
        this.variableComment = variableComment;
        this.numericMinValue = numericMinValue;
        this.numericMaxValue = numericMaxValue;
        this.numericBlockSize = numericBlockSize;
        this.enumValueList = enumValueList;
        this.readOnly = readOnly;
        this.commandLineArgument = commandLineArgument;
    }

    public String getVariableName() {
        return this.variableName;
    }

    public String getSessionValue() {
        return this.sessionValue;
    }

    public String getGlobalValue() {
        return this.globalValue;
    }

    public String getGlobalValueOrigin() {
        return this.globalValueOrigin;
    }

    public String getDefaultValue() {
        return this.defaultValue;
    }

    public String getVariableScope() {
        return this.variableScope;
    }

    public String getVariableType() {
        return this.variableType;
    }

    public String getVariableComment() {
        return this.variableComment;
    }

    public String getNumericMinValue() {
        return this.numericMinValue;
    }

    public String getNumericMaxValue() {
        return this.numericMaxValue;
    }

    public String getNumericBlockSize() {
        return this.numericBlockSize;
    }

    public String getEnumValueList() {
        return this.enumValueList;
    }

    public String getReadOnly() {
        return this.readOnly;
    }

    public String getCommandLineArgument() {
        return this.commandLineArgument;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SystemVariables (");

        sb.append(variableName);
        sb.append(", ").append(sessionValue);
        sb.append(", ").append(globalValue);
        sb.append(", ").append(globalValueOrigin);
        sb.append(", ").append(defaultValue);
        sb.append(", ").append(variableScope);
        sb.append(", ").append(variableType);
        sb.append(", ").append(variableComment);
        sb.append(", ").append(numericMinValue);
        sb.append(", ").append(numericMaxValue);
        sb.append(", ").append(numericBlockSize);
        sb.append(", ").append(enumValueList);
        sb.append(", ").append(readOnly);
        sb.append(", ").append(commandLineArgument);

        sb.append(")");
        return sb.toString();
    }
}