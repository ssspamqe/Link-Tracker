/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.ElementTypes;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class ElementTypesRecord extends TableRecordImpl<ElementTypesRecord> {

    private static final long serialVersionUID = 1L;

    public void setObjectCatalog(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getObjectCatalog() {
        return (String) get(0);
    }

    public void setObjectSchema(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getObjectSchema() {
        return (String) get(1);
    }

    public void setObjectName(@Nullable String value) {
        set(2, value);
    }

    @Nullable
    public String getObjectName() {
        return (String) get(2);
    }

    public void setObjectType(@Nullable String value) {
        set(3, value);
    }

    @Nullable
    public String getObjectType() {
        return (String) get(3);
    }

    public void setCollectionTypeIdentifier(@Nullable String value) {
        set(4, value);
    }

    @Nullable
    public String getCollectionTypeIdentifier() {
        return (String) get(4);
    }

    public void setDataType(@Nullable String value) {
        set(5, value);
    }

    @Nullable
    public String getDataType() {
        return (String) get(5);
    }

    public void setCharacterMaximumLength(@Nullable Integer value) {
        set(6, value);
    }

    @Nullable
    public Integer getCharacterMaximumLength() {
        return (Integer) get(6);
    }

    public void setCharacterOctetLength(@Nullable Integer value) {
        set(7, value);
    }

    @Nullable
    public Integer getCharacterOctetLength() {
        return (Integer) get(7);
    }

    public void setCharacterSetCatalog(@Nullable String value) {
        set(8, value);
    }

    @Nullable
    public String getCharacterSetCatalog() {
        return (String) get(8);
    }

    public void setCharacterSetSchema(@Nullable String value) {
        set(9, value);
    }

    @Nullable
    public String getCharacterSetSchema() {
        return (String) get(9);
    }

    public void setCharacterSetName(@Nullable String value) {
        set(10, value);
    }

    @Nullable
    public String getCharacterSetName() {
        return (String) get(10);
    }

    public void setCollationCatalog(@Nullable String value) {
        set(11, value);
    }

    @Nullable
    public String getCollationCatalog() {
        return (String) get(11);
    }

    public void setCollationSchema(@Nullable String value) {
        set(12, value);
    }

    @Nullable
    public String getCollationSchema() {
        return (String) get(12);
    }

    public void setCollationName(@Nullable String value) {
        set(13, value);
    }

    @Nullable
    public String getCollationName() {
        return (String) get(13);
    }

    public void setNumericPrecision(@Nullable Integer value) {
        set(14, value);
    }

    @Nullable
    public Integer getNumericPrecision() {
        return (Integer) get(14);
    }

    public void setNumericPrecisionRadix(@Nullable Integer value) {
        set(15, value);
    }

    @Nullable
    public Integer getNumericPrecisionRadix() {
        return (Integer) get(15);
    }

    public void setNumericScale(@Nullable Integer value) {
        set(16, value);
    }

    @Nullable
    public Integer getNumericScale() {
        return (Integer) get(16);
    }

    public void setDatetimePrecision(@Nullable Integer value) {
        set(17, value);
    }

    @Nullable
    public Integer getDatetimePrecision() {
        return (Integer) get(17);
    }

    public void setIntervalType(@Nullable String value) {
        set(18, value);
    }

    @Nullable
    public String getIntervalType() {
        return (String) get(18);
    }

    public void setIntervalPrecision(@Nullable Integer value) {
        set(19, value);
    }

    @Nullable
    public Integer getIntervalPrecision() {
        return (Integer) get(19);
    }

    public void setDomainDefault(@Nullable String value) {
        set(20, value);
    }

    @Nullable
    public String getDomainDefault() {
        return (String) get(20);
    }

    public void setUdtCatalog(@Nullable String value) {
        set(21, value);
    }

    @Nullable
    public String getUdtCatalog() {
        return (String) get(21);
    }

    public void setUdtSchema(@Nullable String value) {
        set(22, value);
    }

    @Nullable
    public String getUdtSchema() {
        return (String) get(22);
    }

    public void setUdtName(@Nullable String value) {
        set(23, value);
    }

    @Nullable
    public String getUdtName() {
        return (String) get(23);
    }

    public void setScopeCatalog(@Nullable String value) {
        set(24, value);
    }

    @Nullable
    public String getScopeCatalog() {
        return (String) get(24);
    }

    public void setScopeSchema(@Nullable String value) {
        set(25, value);
    }

    @Nullable
    public String getScopeSchema() {
        return (String) get(25);
    }

    public void setScopeName(@Nullable String value) {
        set(26, value);
    }

    @Nullable
    public String getScopeName() {
        return (String) get(26);
    }

    public void setMaximumCardinality(@Nullable Integer value) {
        set(27, value);
    }

    @Nullable
    public Integer getMaximumCardinality() {
        return (Integer) get(27);
    }

    public void setDtdIdentifier(@Nullable String value) {
        set(28, value);
    }

    @Nullable
    public String getDtdIdentifier() {
        return (String) get(28);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public ElementTypesRecord() {
        super(ElementTypes.ELEMENT_TYPES);
    }

    @ConstructorProperties({ "objectCatalog", "objectSchema", "objectName", "objectType", "collectionTypeIdentifier", "dataType", "characterMaximumLength", "characterOctetLength", "characterSetCatalog", "characterSetSchema", "characterSetName", "collationCatalog", "collationSchema", "collationName", "numericPrecision", "numericPrecisionRadix", "numericScale", "datetimePrecision", "intervalType", "intervalPrecision", "domainDefault", "udtCatalog", "udtSchema", "udtName", "scopeCatalog", "scopeSchema", "scopeName", "maximumCardinality", "dtdIdentifier" })
    public ElementTypesRecord(@Nullable String objectCatalog, @Nullable String objectSchema, @Nullable String objectName, @Nullable String objectType, @Nullable String collectionTypeIdentifier, @Nullable String dataType, @Nullable Integer characterMaximumLength, @Nullable Integer characterOctetLength, @Nullable String characterSetCatalog, @Nullable String characterSetSchema, @Nullable String characterSetName, @Nullable String collationCatalog, @Nullable String collationSchema, @Nullable String collationName, @Nullable Integer numericPrecision, @Nullable Integer numericPrecisionRadix, @Nullable Integer numericScale, @Nullable Integer datetimePrecision, @Nullable String intervalType, @Nullable Integer intervalPrecision, @Nullable String domainDefault, @Nullable String udtCatalog, @Nullable String udtSchema, @Nullable String udtName, @Nullable String scopeCatalog, @Nullable String scopeSchema, @Nullable String scopeName, @Nullable Integer maximumCardinality, @Nullable String dtdIdentifier) {
        super(ElementTypes.ELEMENT_TYPES);

        setObjectCatalog(objectCatalog);
        setObjectSchema(objectSchema);
        setObjectName(objectName);
        setObjectType(objectType);
        setCollectionTypeIdentifier(collectionTypeIdentifier);
        setDataType(dataType);
        setCharacterMaximumLength(characterMaximumLength);
        setCharacterOctetLength(characterOctetLength);
        setCharacterSetCatalog(characterSetCatalog);
        setCharacterSetSchema(characterSetSchema);
        setCharacterSetName(characterSetName);
        setCollationCatalog(collationCatalog);
        setCollationSchema(collationSchema);
        setCollationName(collationName);
        setNumericPrecision(numericPrecision);
        setNumericPrecisionRadix(numericPrecisionRadix);
        setNumericScale(numericScale);
        setDatetimePrecision(datetimePrecision);
        setIntervalType(intervalType);
        setIntervalPrecision(intervalPrecision);
        setDomainDefault(domainDefault);
        setUdtCatalog(udtCatalog);
        setUdtSchema(udtSchema);
        setUdtName(udtName);
        setScopeCatalog(scopeCatalog);
        setScopeSchema(scopeSchema);
        setScopeName(scopeName);
        setMaximumCardinality(maximumCardinality);
        setDtdIdentifier(dtdIdentifier);
        resetChangedOnNotNull();
    }

    public ElementTypesRecord(edu.java.domain.jooq.information_schema.tables.pojos.ElementTypes value) {
        super(ElementTypes.ELEMENT_TYPES);

        if (value != null) {
            setObjectCatalog(value.getObjectCatalog());
            setObjectSchema(value.getObjectSchema());
            setObjectName(value.getObjectName());
            setObjectType(value.getObjectType());
            setCollectionTypeIdentifier(value.getCollectionTypeIdentifier());
            setDataType(value.getDataType());
            setCharacterMaximumLength(value.getCharacterMaximumLength());
            setCharacterOctetLength(value.getCharacterOctetLength());
            setCharacterSetCatalog(value.getCharacterSetCatalog());
            setCharacterSetSchema(value.getCharacterSetSchema());
            setCharacterSetName(value.getCharacterSetName());
            setCollationCatalog(value.getCollationCatalog());
            setCollationSchema(value.getCollationSchema());
            setCollationName(value.getCollationName());
            setNumericPrecision(value.getNumericPrecision());
            setNumericPrecisionRadix(value.getNumericPrecisionRadix());
            setNumericScale(value.getNumericScale());
            setDatetimePrecision(value.getDatetimePrecision());
            setIntervalType(value.getIntervalType());
            setIntervalPrecision(value.getIntervalPrecision());
            setDomainDefault(value.getDomainDefault());
            setUdtCatalog(value.getUdtCatalog());
            setUdtSchema(value.getUdtSchema());
            setUdtName(value.getUdtName());
            setScopeCatalog(value.getScopeCatalog());
            setScopeSchema(value.getScopeSchema());
            setScopeName(value.getScopeName());
            setMaximumCardinality(value.getMaximumCardinality());
            setDtdIdentifier(value.getDtdIdentifier());
            resetChangedOnNotNull();
        }
    }
}