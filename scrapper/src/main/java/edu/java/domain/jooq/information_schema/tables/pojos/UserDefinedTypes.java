/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.pojos;


import jakarta.validation.constraints.Size;

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
public class UserDefinedTypes implements Serializable {

    private static final long serialVersionUID = 1L;

    private String userDefinedTypeCatalog;
    private String userDefinedTypeSchema;
    private String userDefinedTypeName;
    private String userDefinedTypeCategory;
    private String isInstantiable;
    private String isFinal;
    private String orderingForm;
    private String orderingCategory;
    private String orderingRoutineCatalog;
    private String orderingRoutineSchema;
    private String orderingRoutineName;
    private String referenceType;
    private String dataType;
    private Integer characterMaximumLength;
    private Integer characterOctetLength;
    private String characterSetCatalog;
    private String characterSetSchema;
    private String characterSetName;
    private String collationCatalog;
    private String collationSchema;
    private String collationName;
    private Integer numericPrecision;
    private Integer numericPrecisionRadix;
    private Integer numericScale;
    private Integer datetimePrecision;
    private String intervalType;
    private Integer intervalPrecision;
    private String sourceDtdIdentifier;
    private String refDtdIdentifier;

    public UserDefinedTypes() {}

    public UserDefinedTypes(UserDefinedTypes value) {
        this.userDefinedTypeCatalog = value.userDefinedTypeCatalog;
        this.userDefinedTypeSchema = value.userDefinedTypeSchema;
        this.userDefinedTypeName = value.userDefinedTypeName;
        this.userDefinedTypeCategory = value.userDefinedTypeCategory;
        this.isInstantiable = value.isInstantiable;
        this.isFinal = value.isFinal;
        this.orderingForm = value.orderingForm;
        this.orderingCategory = value.orderingCategory;
        this.orderingRoutineCatalog = value.orderingRoutineCatalog;
        this.orderingRoutineSchema = value.orderingRoutineSchema;
        this.orderingRoutineName = value.orderingRoutineName;
        this.referenceType = value.referenceType;
        this.dataType = value.dataType;
        this.characterMaximumLength = value.characterMaximumLength;
        this.characterOctetLength = value.characterOctetLength;
        this.characterSetCatalog = value.characterSetCatalog;
        this.characterSetSchema = value.characterSetSchema;
        this.characterSetName = value.characterSetName;
        this.collationCatalog = value.collationCatalog;
        this.collationSchema = value.collationSchema;
        this.collationName = value.collationName;
        this.numericPrecision = value.numericPrecision;
        this.numericPrecisionRadix = value.numericPrecisionRadix;
        this.numericScale = value.numericScale;
        this.datetimePrecision = value.datetimePrecision;
        this.intervalType = value.intervalType;
        this.intervalPrecision = value.intervalPrecision;
        this.sourceDtdIdentifier = value.sourceDtdIdentifier;
        this.refDtdIdentifier = value.refDtdIdentifier;
    }

    @ConstructorProperties({ "userDefinedTypeCatalog", "userDefinedTypeSchema", "userDefinedTypeName", "userDefinedTypeCategory", "isInstantiable", "isFinal", "orderingForm", "orderingCategory", "orderingRoutineCatalog", "orderingRoutineSchema", "orderingRoutineName", "referenceType", "dataType", "characterMaximumLength", "characterOctetLength", "characterSetCatalog", "characterSetSchema", "characterSetName", "collationCatalog", "collationSchema", "collationName", "numericPrecision", "numericPrecisionRadix", "numericScale", "datetimePrecision", "intervalType", "intervalPrecision", "sourceDtdIdentifier", "refDtdIdentifier" })
    public UserDefinedTypes(
        @Nullable String userDefinedTypeCatalog,
        @Nullable String userDefinedTypeSchema,
        @Nullable String userDefinedTypeName,
        @Nullable String userDefinedTypeCategory,
        @Nullable String isInstantiable,
        @Nullable String isFinal,
        @Nullable String orderingForm,
        @Nullable String orderingCategory,
        @Nullable String orderingRoutineCatalog,
        @Nullable String orderingRoutineSchema,
        @Nullable String orderingRoutineName,
        @Nullable String referenceType,
        @Nullable String dataType,
        @Nullable Integer characterMaximumLength,
        @Nullable Integer characterOctetLength,
        @Nullable String characterSetCatalog,
        @Nullable String characterSetSchema,
        @Nullable String characterSetName,
        @Nullable String collationCatalog,
        @Nullable String collationSchema,
        @Nullable String collationName,
        @Nullable Integer numericPrecision,
        @Nullable Integer numericPrecisionRadix,
        @Nullable Integer numericScale,
        @Nullable Integer datetimePrecision,
        @Nullable String intervalType,
        @Nullable Integer intervalPrecision,
        @Nullable String sourceDtdIdentifier,
        @Nullable String refDtdIdentifier
    ) {
        this.userDefinedTypeCatalog = userDefinedTypeCatalog;
        this.userDefinedTypeSchema = userDefinedTypeSchema;
        this.userDefinedTypeName = userDefinedTypeName;
        this.userDefinedTypeCategory = userDefinedTypeCategory;
        this.isInstantiable = isInstantiable;
        this.isFinal = isFinal;
        this.orderingForm = orderingForm;
        this.orderingCategory = orderingCategory;
        this.orderingRoutineCatalog = orderingRoutineCatalog;
        this.orderingRoutineSchema = orderingRoutineSchema;
        this.orderingRoutineName = orderingRoutineName;
        this.referenceType = referenceType;
        this.dataType = dataType;
        this.characterMaximumLength = characterMaximumLength;
        this.characterOctetLength = characterOctetLength;
        this.characterSetCatalog = characterSetCatalog;
        this.characterSetSchema = characterSetSchema;
        this.characterSetName = characterSetName;
        this.collationCatalog = collationCatalog;
        this.collationSchema = collationSchema;
        this.collationName = collationName;
        this.numericPrecision = numericPrecision;
        this.numericPrecisionRadix = numericPrecisionRadix;
        this.numericScale = numericScale;
        this.datetimePrecision = datetimePrecision;
        this.intervalType = intervalType;
        this.intervalPrecision = intervalPrecision;
        this.sourceDtdIdentifier = sourceDtdIdentifier;
        this.refDtdIdentifier = refDtdIdentifier;
    }

    @Nullable
    public String getUserDefinedTypeCatalog() {
        return this.userDefinedTypeCatalog;
    }

    public void setUserDefinedTypeCatalog(@Nullable String userDefinedTypeCatalog) {
        this.userDefinedTypeCatalog = userDefinedTypeCatalog;
    }

    @Nullable
    public String getUserDefinedTypeSchema() {
        return this.userDefinedTypeSchema;
    }

    public void setUserDefinedTypeSchema(@Nullable String userDefinedTypeSchema) {
        this.userDefinedTypeSchema = userDefinedTypeSchema;
    }

    @Nullable
    public String getUserDefinedTypeName() {
        return this.userDefinedTypeName;
    }

    public void setUserDefinedTypeName(@Nullable String userDefinedTypeName) {
        this.userDefinedTypeName = userDefinedTypeName;
    }

    @Nullable
    public String getUserDefinedTypeCategory() {
        return this.userDefinedTypeCategory;
    }

    public void setUserDefinedTypeCategory(@Nullable String userDefinedTypeCategory) {
        this.userDefinedTypeCategory = userDefinedTypeCategory;
    }

    @Size(max = 3)
    @Nullable
    public String getIsInstantiable() {
        return this.isInstantiable;
    }

    public void setIsInstantiable(@Nullable String isInstantiable) {
        this.isInstantiable = isInstantiable;
    }

    @Size(max = 3)
    @Nullable
    public String getIsFinal() {
        return this.isFinal;
    }

    public void setIsFinal(@Nullable String isFinal) {
        this.isFinal = isFinal;
    }

    @Nullable
    public String getOrderingForm() {
        return this.orderingForm;
    }

    public void setOrderingForm(@Nullable String orderingForm) {
        this.orderingForm = orderingForm;
    }

    @Nullable
    public String getOrderingCategory() {
        return this.orderingCategory;
    }

    public void setOrderingCategory(@Nullable String orderingCategory) {
        this.orderingCategory = orderingCategory;
    }

    @Nullable
    public String getOrderingRoutineCatalog() {
        return this.orderingRoutineCatalog;
    }

    public void setOrderingRoutineCatalog(@Nullable String orderingRoutineCatalog) {
        this.orderingRoutineCatalog = orderingRoutineCatalog;
    }

    @Nullable
    public String getOrderingRoutineSchema() {
        return this.orderingRoutineSchema;
    }

    public void setOrderingRoutineSchema(@Nullable String orderingRoutineSchema) {
        this.orderingRoutineSchema = orderingRoutineSchema;
    }

    @Nullable
    public String getOrderingRoutineName() {
        return this.orderingRoutineName;
    }

    public void setOrderingRoutineName(@Nullable String orderingRoutineName) {
        this.orderingRoutineName = orderingRoutineName;
    }

    @Nullable
    public String getReferenceType() {
        return this.referenceType;
    }

    public void setReferenceType(@Nullable String referenceType) {
        this.referenceType = referenceType;
    }

    @Nullable
    public String getDataType() {
        return this.dataType;
    }

    public void setDataType(@Nullable String dataType) {
        this.dataType = dataType;
    }

    @Nullable
    public Integer getCharacterMaximumLength() {
        return this.characterMaximumLength;
    }

    public void setCharacterMaximumLength(@Nullable Integer characterMaximumLength) {
        this.characterMaximumLength = characterMaximumLength;
    }

    @Nullable
    public Integer getCharacterOctetLength() {
        return this.characterOctetLength;
    }

    public void setCharacterOctetLength(@Nullable Integer characterOctetLength) {
        this.characterOctetLength = characterOctetLength;
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
    public Integer getNumericPrecision() {
        return this.numericPrecision;
    }

    public void setNumericPrecision(@Nullable Integer numericPrecision) {
        this.numericPrecision = numericPrecision;
    }

    @Nullable
    public Integer getNumericPrecisionRadix() {
        return this.numericPrecisionRadix;
    }

    public void setNumericPrecisionRadix(@Nullable Integer numericPrecisionRadix) {
        this.numericPrecisionRadix = numericPrecisionRadix;
    }

    @Nullable
    public Integer getNumericScale() {
        return this.numericScale;
    }

    public void setNumericScale(@Nullable Integer numericScale) {
        this.numericScale = numericScale;
    }

    @Nullable
    public Integer getDatetimePrecision() {
        return this.datetimePrecision;
    }

    public void setDatetimePrecision(@Nullable Integer datetimePrecision) {
        this.datetimePrecision = datetimePrecision;
    }

    @Nullable
    public String getIntervalType() {
        return this.intervalType;
    }

    public void setIntervalType(@Nullable String intervalType) {
        this.intervalType = intervalType;
    }

    @Nullable
    public Integer getIntervalPrecision() {
        return this.intervalPrecision;
    }

    public void setIntervalPrecision(@Nullable Integer intervalPrecision) {
        this.intervalPrecision = intervalPrecision;
    }

    @Nullable
    public String getSourceDtdIdentifier() {
        return this.sourceDtdIdentifier;
    }

    public void setSourceDtdIdentifier(@Nullable String sourceDtdIdentifier) {
        this.sourceDtdIdentifier = sourceDtdIdentifier;
    }

    @Nullable
    public String getRefDtdIdentifier() {
        return this.refDtdIdentifier;
    }

    public void setRefDtdIdentifier(@Nullable String refDtdIdentifier) {
        this.refDtdIdentifier = refDtdIdentifier;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final UserDefinedTypes other = (UserDefinedTypes) obj;
        if (this.userDefinedTypeCatalog == null) {
            if (other.userDefinedTypeCatalog != null)
                return false;
        }
        else if (!this.userDefinedTypeCatalog.equals(other.userDefinedTypeCatalog))
            return false;
        if (this.userDefinedTypeSchema == null) {
            if (other.userDefinedTypeSchema != null)
                return false;
        }
        else if (!this.userDefinedTypeSchema.equals(other.userDefinedTypeSchema))
            return false;
        if (this.userDefinedTypeName == null) {
            if (other.userDefinedTypeName != null)
                return false;
        }
        else if (!this.userDefinedTypeName.equals(other.userDefinedTypeName))
            return false;
        if (this.userDefinedTypeCategory == null) {
            if (other.userDefinedTypeCategory != null)
                return false;
        }
        else if (!this.userDefinedTypeCategory.equals(other.userDefinedTypeCategory))
            return false;
        if (this.isInstantiable == null) {
            if (other.isInstantiable != null)
                return false;
        }
        else if (!this.isInstantiable.equals(other.isInstantiable))
            return false;
        if (this.isFinal == null) {
            if (other.isFinal != null)
                return false;
        }
        else if (!this.isFinal.equals(other.isFinal))
            return false;
        if (this.orderingForm == null) {
            if (other.orderingForm != null)
                return false;
        }
        else if (!this.orderingForm.equals(other.orderingForm))
            return false;
        if (this.orderingCategory == null) {
            if (other.orderingCategory != null)
                return false;
        }
        else if (!this.orderingCategory.equals(other.orderingCategory))
            return false;
        if (this.orderingRoutineCatalog == null) {
            if (other.orderingRoutineCatalog != null)
                return false;
        }
        else if (!this.orderingRoutineCatalog.equals(other.orderingRoutineCatalog))
            return false;
        if (this.orderingRoutineSchema == null) {
            if (other.orderingRoutineSchema != null)
                return false;
        }
        else if (!this.orderingRoutineSchema.equals(other.orderingRoutineSchema))
            return false;
        if (this.orderingRoutineName == null) {
            if (other.orderingRoutineName != null)
                return false;
        }
        else if (!this.orderingRoutineName.equals(other.orderingRoutineName))
            return false;
        if (this.referenceType == null) {
            if (other.referenceType != null)
                return false;
        }
        else if (!this.referenceType.equals(other.referenceType))
            return false;
        if (this.dataType == null) {
            if (other.dataType != null)
                return false;
        }
        else if (!this.dataType.equals(other.dataType))
            return false;
        if (this.characterMaximumLength == null) {
            if (other.characterMaximumLength != null)
                return false;
        }
        else if (!this.characterMaximumLength.equals(other.characterMaximumLength))
            return false;
        if (this.characterOctetLength == null) {
            if (other.characterOctetLength != null)
                return false;
        }
        else if (!this.characterOctetLength.equals(other.characterOctetLength))
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
        if (this.numericPrecision == null) {
            if (other.numericPrecision != null)
                return false;
        }
        else if (!this.numericPrecision.equals(other.numericPrecision))
            return false;
        if (this.numericPrecisionRadix == null) {
            if (other.numericPrecisionRadix != null)
                return false;
        }
        else if (!this.numericPrecisionRadix.equals(other.numericPrecisionRadix))
            return false;
        if (this.numericScale == null) {
            if (other.numericScale != null)
                return false;
        }
        else if (!this.numericScale.equals(other.numericScale))
            return false;
        if (this.datetimePrecision == null) {
            if (other.datetimePrecision != null)
                return false;
        }
        else if (!this.datetimePrecision.equals(other.datetimePrecision))
            return false;
        if (this.intervalType == null) {
            if (other.intervalType != null)
                return false;
        }
        else if (!this.intervalType.equals(other.intervalType))
            return false;
        if (this.intervalPrecision == null) {
            if (other.intervalPrecision != null)
                return false;
        }
        else if (!this.intervalPrecision.equals(other.intervalPrecision))
            return false;
        if (this.sourceDtdIdentifier == null) {
            if (other.sourceDtdIdentifier != null)
                return false;
        }
        else if (!this.sourceDtdIdentifier.equals(other.sourceDtdIdentifier))
            return false;
        if (this.refDtdIdentifier == null) {
            if (other.refDtdIdentifier != null)
                return false;
        }
        else if (!this.refDtdIdentifier.equals(other.refDtdIdentifier))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.userDefinedTypeCatalog == null) ? 0 : this.userDefinedTypeCatalog.hashCode());
        result = prime * result + ((this.userDefinedTypeSchema == null) ? 0 : this.userDefinedTypeSchema.hashCode());
        result = prime * result + ((this.userDefinedTypeName == null) ? 0 : this.userDefinedTypeName.hashCode());
        result = prime * result + ((this.userDefinedTypeCategory == null) ? 0 : this.userDefinedTypeCategory.hashCode());
        result = prime * result + ((this.isInstantiable == null) ? 0 : this.isInstantiable.hashCode());
        result = prime * result + ((this.isFinal == null) ? 0 : this.isFinal.hashCode());
        result = prime * result + ((this.orderingForm == null) ? 0 : this.orderingForm.hashCode());
        result = prime * result + ((this.orderingCategory == null) ? 0 : this.orderingCategory.hashCode());
        result = prime * result + ((this.orderingRoutineCatalog == null) ? 0 : this.orderingRoutineCatalog.hashCode());
        result = prime * result + ((this.orderingRoutineSchema == null) ? 0 : this.orderingRoutineSchema.hashCode());
        result = prime * result + ((this.orderingRoutineName == null) ? 0 : this.orderingRoutineName.hashCode());
        result = prime * result + ((this.referenceType == null) ? 0 : this.referenceType.hashCode());
        result = prime * result + ((this.dataType == null) ? 0 : this.dataType.hashCode());
        result = prime * result + ((this.characterMaximumLength == null) ? 0 : this.characterMaximumLength.hashCode());
        result = prime * result + ((this.characterOctetLength == null) ? 0 : this.characterOctetLength.hashCode());
        result = prime * result + ((this.characterSetCatalog == null) ? 0 : this.characterSetCatalog.hashCode());
        result = prime * result + ((this.characterSetSchema == null) ? 0 : this.characterSetSchema.hashCode());
        result = prime * result + ((this.characterSetName == null) ? 0 : this.characterSetName.hashCode());
        result = prime * result + ((this.collationCatalog == null) ? 0 : this.collationCatalog.hashCode());
        result = prime * result + ((this.collationSchema == null) ? 0 : this.collationSchema.hashCode());
        result = prime * result + ((this.collationName == null) ? 0 : this.collationName.hashCode());
        result = prime * result + ((this.numericPrecision == null) ? 0 : this.numericPrecision.hashCode());
        result = prime * result + ((this.numericPrecisionRadix == null) ? 0 : this.numericPrecisionRadix.hashCode());
        result = prime * result + ((this.numericScale == null) ? 0 : this.numericScale.hashCode());
        result = prime * result + ((this.datetimePrecision == null) ? 0 : this.datetimePrecision.hashCode());
        result = prime * result + ((this.intervalType == null) ? 0 : this.intervalType.hashCode());
        result = prime * result + ((this.intervalPrecision == null) ? 0 : this.intervalPrecision.hashCode());
        result = prime * result + ((this.sourceDtdIdentifier == null) ? 0 : this.sourceDtdIdentifier.hashCode());
        result = prime * result + ((this.refDtdIdentifier == null) ? 0 : this.refDtdIdentifier.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserDefinedTypes (");

        sb.append(userDefinedTypeCatalog);
        sb.append(", ").append(userDefinedTypeSchema);
        sb.append(", ").append(userDefinedTypeName);
        sb.append(", ").append(userDefinedTypeCategory);
        sb.append(", ").append(isInstantiable);
        sb.append(", ").append(isFinal);
        sb.append(", ").append(orderingForm);
        sb.append(", ").append(orderingCategory);
        sb.append(", ").append(orderingRoutineCatalog);
        sb.append(", ").append(orderingRoutineSchema);
        sb.append(", ").append(orderingRoutineName);
        sb.append(", ").append(referenceType);
        sb.append(", ").append(dataType);
        sb.append(", ").append(characterMaximumLength);
        sb.append(", ").append(characterOctetLength);
        sb.append(", ").append(characterSetCatalog);
        sb.append(", ").append(characterSetSchema);
        sb.append(", ").append(characterSetName);
        sb.append(", ").append(collationCatalog);
        sb.append(", ").append(collationSchema);
        sb.append(", ").append(collationName);
        sb.append(", ").append(numericPrecision);
        sb.append(", ").append(numericPrecisionRadix);
        sb.append(", ").append(numericScale);
        sb.append(", ").append(datetimePrecision);
        sb.append(", ").append(intervalType);
        sb.append(", ").append(intervalPrecision);
        sb.append(", ").append(sourceDtdIdentifier);
        sb.append(", ").append(refDtdIdentifier);

        sb.append(")");
        return sb.toString();
    }
}
