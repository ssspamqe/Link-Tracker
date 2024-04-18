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
public class CollationCharacterSetApplicability implements Serializable {

    private static final long serialVersionUID = 1L;

    private String collationCatalog;
    private String collationSchema;
    private String collationName;
    private String characterSetCatalog;
    private String characterSetSchema;
    private String characterSetName;

    public CollationCharacterSetApplicability() {}

    public CollationCharacterSetApplicability(CollationCharacterSetApplicability value) {
        this.collationCatalog = value.collationCatalog;
        this.collationSchema = value.collationSchema;
        this.collationName = value.collationName;
        this.characterSetCatalog = value.characterSetCatalog;
        this.characterSetSchema = value.characterSetSchema;
        this.characterSetName = value.characterSetName;
    }

    @ConstructorProperties({ "collationCatalog", "collationSchema", "collationName", "characterSetCatalog", "characterSetSchema", "characterSetName" })
    public CollationCharacterSetApplicability(
        @Nullable String collationCatalog,
        @Nullable String collationSchema,
        @Nullable String collationName,
        @Nullable String characterSetCatalog,
        @Nullable String characterSetSchema,
        @Nullable String characterSetName
    ) {
        this.collationCatalog = collationCatalog;
        this.collationSchema = collationSchema;
        this.collationName = collationName;
        this.characterSetCatalog = characterSetCatalog;
        this.characterSetSchema = characterSetSchema;
        this.characterSetName = characterSetName;
    }

    @Nullable
    public String getCollationCatalog() {
        return this.collationCatalog;
    }

    public void setCollationCatalog(@Nullable String collationCatalog) {
        this.collationCatalog = collationCatalog;
    }

    @Nullable
    public String getCollationSchema() {
        return this.collationSchema;
    }

    public void setCollationSchema(@Nullable String collationSchema) {
        this.collationSchema = collationSchema;
    }

    @Nullable
    public String getCollationName() {
        return this.collationName;
    }

    public void setCollationName(@Nullable String collationName) {
        this.collationName = collationName;
    }

    @Nullable
    public String getCharacterSetCatalog() {
        return this.characterSetCatalog;
    }

    public void setCharacterSetCatalog(@Nullable String characterSetCatalog) {
        this.characterSetCatalog = characterSetCatalog;
    }

    @Nullable
    public String getCharacterSetSchema() {
        return this.characterSetSchema;
    }

    public void setCharacterSetSchema(@Nullable String characterSetSchema) {
        this.characterSetSchema = characterSetSchema;
    }

    @Nullable
    public String getCharacterSetName() {
        return this.characterSetName;
    }

    public void setCharacterSetName(@Nullable String characterSetName) {
        this.characterSetName = characterSetName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final CollationCharacterSetApplicability other = (CollationCharacterSetApplicability) obj;
        if (this.collationCatalog == null) {
            if (other.collationCatalog != null)
                return false;
        }
        else if (!this.collationCatalog.equals(other.collationCatalog))
            return false;
        if (this.collationSchema == null) {
            if (other.collationSchema != null)
                return false;
        }
        else if (!this.collationSchema.equals(other.collationSchema))
            return false;
        if (this.collationName == null) {
            if (other.collationName != null)
                return false;
        }
        else if (!this.collationName.equals(other.collationName))
            return false;
        if (this.characterSetCatalog == null) {
            if (other.characterSetCatalog != null)
                return false;
        }
        else if (!this.characterSetCatalog.equals(other.characterSetCatalog))
            return false;
        if (this.characterSetSchema == null) {
            if (other.characterSetSchema != null)
                return false;
        }
        else if (!this.characterSetSchema.equals(other.characterSetSchema))
            return false;
        if (this.characterSetName == null) {
            if (other.characterSetName != null)
                return false;
        }
        else if (!this.characterSetName.equals(other.characterSetName))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.collationCatalog == null) ? 0 : this.collationCatalog.hashCode());
        result = prime * result + ((this.collationSchema == null) ? 0 : this.collationSchema.hashCode());
        result = prime * result + ((this.collationName == null) ? 0 : this.collationName.hashCode());
        result = prime * result + ((this.characterSetCatalog == null) ? 0 : this.characterSetCatalog.hashCode());
        result = prime * result + ((this.characterSetSchema == null) ? 0 : this.characterSetSchema.hashCode());
        result = prime * result + ((this.characterSetName == null) ? 0 : this.characterSetName.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CollationCharacterSetApplicability (");

        sb.append(collationCatalog);
        sb.append(", ").append(collationSchema);
        sb.append(", ").append(collationName);
        sb.append(", ").append(characterSetCatalog);
        sb.append(", ").append(characterSetSchema);
        sb.append(", ").append(characterSetName);

        sb.append(")");
        return sb.toString();
    }
}
