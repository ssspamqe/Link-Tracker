/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgShdescription implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long objoid;
    private Long classoid;
    private String description;

    public PgShdescription() {}

    public PgShdescription(PgShdescription value) {
        this.objoid = value.objoid;
        this.classoid = value.classoid;
        this.description = value.description;
    }

    @ConstructorProperties({ "objoid", "classoid", "description" })
    public PgShdescription(
        @NotNull Long objoid,
        @NotNull Long classoid,
        @NotNull String description
    ) {
        this.objoid = objoid;
        this.classoid = classoid;
        this.description = description;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getObjoid() {
        return this.objoid;
    }

    public void setObjoid(@NotNull Long objoid) {
        this.objoid = objoid;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getClassoid() {
        return this.classoid;
    }

    public void setClassoid(@NotNull Long classoid) {
        this.classoid = classoid;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getDescription() {
        return this.description;
    }

    public void setDescription(@NotNull String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgShdescription other = (PgShdescription) obj;
        if (this.objoid == null) {
            if (other.objoid != null)
                return false;
        }
        else if (!this.objoid.equals(other.objoid))
            return false;
        if (this.classoid == null) {
            if (other.classoid != null)
                return false;
        }
        else if (!this.classoid.equals(other.classoid))
            return false;
        if (this.description == null) {
            if (other.description != null)
                return false;
        }
        else if (!this.description.equals(other.description))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.objoid == null) ? 0 : this.objoid.hashCode());
        result = prime * result + ((this.classoid == null) ? 0 : this.classoid.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgShdescription (");

        sb.append(objoid);
        sb.append(", ").append(classoid);
        sb.append(", ").append(description);

        sb.append(")");
        return sb.toString();
    }
}
