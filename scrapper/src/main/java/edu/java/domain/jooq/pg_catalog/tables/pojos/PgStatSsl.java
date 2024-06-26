/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.math.BigDecimal;

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
public class PgStatSsl implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer pid;
    private Boolean ssl;
    private String version;
    private String cipher;
    private Integer bits;
    private String clientDn;
    private BigDecimal clientSerial;
    private String issuerDn;

    public PgStatSsl() {}

    public PgStatSsl(PgStatSsl value) {
        this.pid = value.pid;
        this.ssl = value.ssl;
        this.version = value.version;
        this.cipher = value.cipher;
        this.bits = value.bits;
        this.clientDn = value.clientDn;
        this.clientSerial = value.clientSerial;
        this.issuerDn = value.issuerDn;
    }

    @ConstructorProperties({ "pid", "ssl", "version", "cipher", "bits", "clientDn", "clientSerial", "issuerDn" })
    public PgStatSsl(
        @Nullable Integer pid,
        @Nullable Boolean ssl,
        @Nullable String version,
        @Nullable String cipher,
        @Nullable Integer bits,
        @Nullable String clientDn,
        @Nullable BigDecimal clientSerial,
        @Nullable String issuerDn
    ) {
        this.pid = pid;
        this.ssl = ssl;
        this.version = version;
        this.cipher = cipher;
        this.bits = bits;
        this.clientDn = clientDn;
        this.clientSerial = clientSerial;
        this.issuerDn = issuerDn;
    }

    @Nullable
    public Integer getPid() {
        return this.pid;
    }

    public void setPid(@Nullable Integer pid) {
        this.pid = pid;
    }

    @Nullable
    public Boolean getSsl() {
        return this.ssl;
    }

    public void setSsl(@Nullable Boolean ssl) {
        this.ssl = ssl;
    }

    @Nullable
    public String getVersion() {
        return this.version;
    }

    public void setVersion(@Nullable String version) {
        this.version = version;
    }

    @Nullable
    public String getCipher() {
        return this.cipher;
    }

    public void setCipher(@Nullable String cipher) {
        this.cipher = cipher;
    }

    @Nullable
    public Integer getBits() {
        return this.bits;
    }

    public void setBits(@Nullable Integer bits) {
        this.bits = bits;
    }

    @Nullable
    public String getClientDn() {
        return this.clientDn;
    }

    public void setClientDn(@Nullable String clientDn) {
        this.clientDn = clientDn;
    }

    @Nullable
    public BigDecimal getClientSerial() {
        return this.clientSerial;
    }

    public void setClientSerial(@Nullable BigDecimal clientSerial) {
        this.clientSerial = clientSerial;
    }

    @Nullable
    public String getIssuerDn() {
        return this.issuerDn;
    }

    public void setIssuerDn(@Nullable String issuerDn) {
        this.issuerDn = issuerDn;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgStatSsl other = (PgStatSsl) obj;
        if (this.pid == null) {
            if (other.pid != null)
                return false;
        }
        else if (!this.pid.equals(other.pid))
            return false;
        if (this.ssl == null) {
            if (other.ssl != null)
                return false;
        }
        else if (!this.ssl.equals(other.ssl))
            return false;
        if (this.version == null) {
            if (other.version != null)
                return false;
        }
        else if (!this.version.equals(other.version))
            return false;
        if (this.cipher == null) {
            if (other.cipher != null)
                return false;
        }
        else if (!this.cipher.equals(other.cipher))
            return false;
        if (this.bits == null) {
            if (other.bits != null)
                return false;
        }
        else if (!this.bits.equals(other.bits))
            return false;
        if (this.clientDn == null) {
            if (other.clientDn != null)
                return false;
        }
        else if (!this.clientDn.equals(other.clientDn))
            return false;
        if (this.clientSerial == null) {
            if (other.clientSerial != null)
                return false;
        }
        else if (!this.clientSerial.equals(other.clientSerial))
            return false;
        if (this.issuerDn == null) {
            if (other.issuerDn != null)
                return false;
        }
        else if (!this.issuerDn.equals(other.issuerDn))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.pid == null) ? 0 : this.pid.hashCode());
        result = prime * result + ((this.ssl == null) ? 0 : this.ssl.hashCode());
        result = prime * result + ((this.version == null) ? 0 : this.version.hashCode());
        result = prime * result + ((this.cipher == null) ? 0 : this.cipher.hashCode());
        result = prime * result + ((this.bits == null) ? 0 : this.bits.hashCode());
        result = prime * result + ((this.clientDn == null) ? 0 : this.clientDn.hashCode());
        result = prime * result + ((this.clientSerial == null) ? 0 : this.clientSerial.hashCode());
        result = prime * result + ((this.issuerDn == null) ? 0 : this.issuerDn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatSsl (");

        sb.append(pid);
        sb.append(", ").append(ssl);
        sb.append(", ").append(version);
        sb.append(", ").append(cipher);
        sb.append(", ").append(bits);
        sb.append(", ").append(clientDn);
        sb.append(", ").append(clientSerial);
        sb.append(", ").append(issuerDn);

        sb.append(")");
        return sb.toString();
    }
}
