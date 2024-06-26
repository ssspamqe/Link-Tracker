/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class InformationSchemaCatalogName implements Serializable {

    private static final long serialVersionUID = 1L;

    private String catalogName;

    public InformationSchemaCatalogName() {}

    public InformationSchemaCatalogName(InformationSchemaCatalogName value) {
        this.catalogName = value.catalogName;
    }

    @ConstructorProperties({ "catalogName" })
    public InformationSchemaCatalogName(
        @Nullable String catalogName
    ) {
        this.catalogName = catalogName;
    }

    @Nullable
    public String getCatalogName() {
        return this.catalogName;
    }

    public void setCatalogName(@Nullable String catalogName) {
        this.catalogName = catalogName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final InformationSchemaCatalogName other = (InformationSchemaCatalogName) obj;
        if (this.catalogName == null) {
            if (other.catalogName != null)
                return false;
        }
        else if (!this.catalogName.equals(other.catalogName))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.catalogName == null) ? 0 : this.catalogName.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InformationSchemaCatalogName (");

        sb.append(catalogName);

        sb.append(")");
        return sb.toString();
    }
}
