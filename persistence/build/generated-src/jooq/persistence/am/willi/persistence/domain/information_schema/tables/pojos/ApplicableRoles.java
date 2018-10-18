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
public class ApplicableRoles implements Serializable {

    private static final long serialVersionUID = 2008035812;

    private final String grantee;
    private final String roleName;
    private final String isGrantable;
    private final String isDefault;

    public ApplicableRoles(ApplicableRoles value) {
        this.grantee = value.grantee;
        this.roleName = value.roleName;
        this.isGrantable = value.isGrantable;
        this.isDefault = value.isDefault;
    }

    public ApplicableRoles(
        String grantee,
        String roleName,
        String isGrantable,
        String isDefault
    ) {
        this.grantee = grantee;
        this.roleName = roleName;
        this.isGrantable = isGrantable;
        this.isDefault = isDefault;
    }

    public String getGrantee() {
        return this.grantee;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public String getIsGrantable() {
        return this.isGrantable;
    }

    public String getIsDefault() {
        return this.isDefault;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ApplicableRoles (");

        sb.append(grantee);
        sb.append(", ").append(roleName);
        sb.append(", ").append(isGrantable);
        sb.append(", ").append(isDefault);

        sb.append(")");
        return sb.toString();
    }
}