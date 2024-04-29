/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.Domains;

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
public class DomainsRecord extends TableRecordImpl<DomainsRecord> {

    private static final long serialVersionUID = 1L;

    public void setDomainCatalog(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getDomainCatalog() {
        return (String) get(0);
    }

    public void setDomainSchema(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getDomainSchema() {
        return (String) get(1);
    }

    public void setDomainName(@Nullable String value) {
        set(2, value);
    }

    @Nullable
    public String getDomainName() {
        return (String) get(2);
    }

    public void setDataType(@Nullable String value) {
        set(3, value);
    }

    @Nullable
    public String getDataType() {
        return (String) get(3);
    }

    public void setCharacterMaximumLength(@Nullable Integer value) {
        set(4, value);
    }

    @Nullable
    public Integer getCharacterMaximumLength() {
        return (Integer) get(4);
    }

    public void setCharacterOctetLength(@Nullable Integer value) {
        set(5, value);
    }

    @Nullable
    public Integer getCharacterOctetLength() {
        return (Integer) get(5);
    }

    public void setCharacterSetCatalog(@Nullable String value) {
        set(6, value);
    }

    @Nullable
    public String getCharacterSetCatalog() {
        return (String) get(6);
    }

    public void setCharacterSetSchema(@Nullable String value) {
        set(7, value);
    }

    @Nullable
    public String getCharacterSetSchema() {
        return (String) get(7);
    }

    public void setCharacterSetName(@Nullable String value) {
        set(8, value);
    }

    @Nullable
    public String getCharacterSetName() {
        return (String) get(8);
    }

    public void setCollationCatalog(@Nullable String value) {
        set(9, value);
    }

    @Nullable
    public String getCollationCatalog() {
        return (String) get(9);
    }

    public void setCollationSchema(@Nullable String value) {
        set(10, value);
    }

    @Nullable
    public String getCollationSchema() {
        return (String) get(10);
    }

    public void setCollationName(@Nullable String value) {
        set(11, value);
    }

    @Nullable
    public String getCollationName() {
        return (String) get(11);
    }

    public void setNumericPrecision(@Nullable Integer value) {
        set(12, value);
    }

    @Nullable
    public Integer getNumericPrecision() {
        return (Integer) get(12);
    }

    public void setNumericPrecisionRadix(@Nullable Integer value) {
        set(13, value);
    }

    @Nullable
    public Integer getNumericPrecisionRadix() {
        return (Integer) get(13);
    }

    public void setNumericScale(@Nullable Integer value) {
        set(14, value);
    }

    @Nullable
    public Integer getNumericScale() {
        return (Integer) get(14);
    }

    public void setDatetimePrecision(@Nullable Integer value) {
        set(15, value);
    }

    @Nullable
    public Integer getDatetimePrecision() {
        return (Integer) get(15);
    }

    public void setIntervalType(@Nullable String value) {
        set(16, value);
    }

    @Nullable
    public String getIntervalType() {
        return (String) get(16);
    }

    public void setIntervalPrecision(@Nullable Integer value) {
        set(17, value);
    }

    @Nullable
    public Integer getIntervalPrecision() {
        return (Integer) get(17);
    }

    public void setDomainDefault(@Nullable String value) {
        set(18, value);
    }

    @Nullable
    public String getDomainDefault() {
        return (String) get(18);
    }

    public void setUdtCatalog(@Nullable String value) {
        set(19, value);
    }

    @Nullable
    public String getUdtCatalog() {
        return (String) get(19);
    }

    public void setUdtSchema(@Nullable String value) {
        set(20, value);
    }

    @Nullable
    public String getUdtSchema() {
        return (String) get(20);
    }

    public void setUdtName(@Nullable String value) {
        set(21, value);
    }

    @Nullable
    public String getUdtName() {
        return (String) get(21);
    }

    public void setScopeCatalog(@Nullable String value) {
        set(22, value);
    }

    @Nullable
    public String getScopeCatalog() {
        return (String) get(22);
    }

    public void setScopeSchema(@Nullable String value) {
        set(23, value);
    }

    @Nullable
    public String getScopeSchema() {
        return (String) get(23);
    }

    public void setScopeName(@Nullable String value) {
        set(24, value);
    }

    @Nullable
    public String getScopeName() {
        return (String) get(24);
    }

    public void setMaximumCardinality(@Nullable Integer value) {
        set(25, value);
    }

    @Nullable
    public Integer getMaximumCardinality() {
        return (Integer) get(25);
    }

    public void setDtdIdentifier(@Nullable String value) {
        set(26, value);
    }

    @Nullable
    public String getDtdIdentifier() {
        return (String) get(26);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public DomainsRecord() {
        super(Domains.DOMAINS);
    }

    @ConstructorProperties({ "domainCatalog", "domainSchema", "domainName", "dataType", "characterMaximumLength", "characterOctetLength", "characterSetCatalog", "characterSetSchema", "characterSetName", "collationCatalog", "collationSchema", "collationName", "numericPrecision", "numericPrecisionRadix", "numericScale", "datetimePrecision", "intervalType", "intervalPrecision", "domainDefault", "udtCatalog", "udtSchema", "udtName", "scopeCatalog", "scopeSchema", "scopeName", "maximumCardinality", "dtdIdentifier" })
    public DomainsRecord(@Nullable String domainCatalog, @Nullable String domainSchema, @Nullable String domainName, @Nullable String dataType, @Nullable Integer characterMaximumLength, @Nullable Integer characterOctetLength, @Nullable String characterSetCatalog, @Nullable String characterSetSchema, @Nullable String characterSetName, @Nullable String collationCatalog, @Nullable String collationSchema, @Nullable String collationName, @Nullable Integer numericPrecision, @Nullable Integer numericPrecisionRadix, @Nullable Integer numericScale, @Nullable Integer datetimePrecision, @Nullable String intervalType, @Nullable Integer intervalPrecision, @Nullable String domainDefault, @Nullable String udtCatalog, @Nullable String udtSchema, @Nullable String udtName, @Nullable String scopeCatalog, @Nullable String scopeSchema, @Nullable String scopeName, @Nullable Integer maximumCardinality, @Nullable String dtdIdentifier) {
        super(Domains.DOMAINS);

        setDomainCatalog(domainCatalog);
        setDomainSchema(domainSchema);
        setDomainName(domainName);
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

    public DomainsRecord(edu.java.domain.jooq.information_schema.tables.pojos.Domains value) {
        super(Domains.DOMAINS);

        if (value != null) {
            setDomainCatalog(value.getDomainCatalog());
            setDomainSchema(value.getDomainSchema());
            setDomainName(value.getDomainName());
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