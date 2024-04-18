/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


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
public class GenerateSubscripts implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer generateSubscripts;

    public GenerateSubscripts() {}

    public GenerateSubscripts(GenerateSubscripts value) {
        this.generateSubscripts = value.generateSubscripts;
    }

    @ConstructorProperties({ "generateSubscripts" })
    public GenerateSubscripts(
        @Nullable Integer generateSubscripts
    ) {
        this.generateSubscripts = generateSubscripts;
    }

    @Nullable
    public Integer getGenerateSubscripts() {
        return this.generateSubscripts;
    }

    public void setGenerateSubscripts(@Nullable Integer generateSubscripts) {
        this.generateSubscripts = generateSubscripts;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final GenerateSubscripts other = (GenerateSubscripts) obj;
        if (this.generateSubscripts == null) {
            if (other.generateSubscripts != null)
                return false;
        }
        else if (!this.generateSubscripts.equals(other.generateSubscripts))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.generateSubscripts == null) ? 0 : this.generateSubscripts.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GenerateSubscripts (");

        sb.append(generateSubscripts);

        sb.append(")");
        return sb.toString();
    }
}
