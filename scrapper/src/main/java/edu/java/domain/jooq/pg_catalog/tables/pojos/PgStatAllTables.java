/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.time.OffsetDateTime;

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
public class PgStatAllTables implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long relid;
    private String schemaname;
    private String relname;
    private Long seqScan;
    private OffsetDateTime lastSeqScan;
    private Long seqTupRead;
    private Long idxScan;
    private OffsetDateTime lastIdxScan;
    private Long idxTupFetch;
    private Long nTupIns;
    private Long nTupUpd;
    private Long nTupDel;
    private Long nTupHotUpd;
    private Long nTupNewpageUpd;
    private Long nLiveTup;
    private Long nDeadTup;
    private Long nModSinceAnalyze;
    private Long nInsSinceVacuum;
    private OffsetDateTime lastVacuum;
    private OffsetDateTime lastAutovacuum;
    private OffsetDateTime lastAnalyze;
    private OffsetDateTime lastAutoanalyze;
    private Long vacuumCount;
    private Long autovacuumCount;
    private Long analyzeCount;
    private Long autoanalyzeCount;

    public PgStatAllTables() {}

    public PgStatAllTables(PgStatAllTables value) {
        this.relid = value.relid;
        this.schemaname = value.schemaname;
        this.relname = value.relname;
        this.seqScan = value.seqScan;
        this.lastSeqScan = value.lastSeqScan;
        this.seqTupRead = value.seqTupRead;
        this.idxScan = value.idxScan;
        this.lastIdxScan = value.lastIdxScan;
        this.idxTupFetch = value.idxTupFetch;
        this.nTupIns = value.nTupIns;
        this.nTupUpd = value.nTupUpd;
        this.nTupDel = value.nTupDel;
        this.nTupHotUpd = value.nTupHotUpd;
        this.nTupNewpageUpd = value.nTupNewpageUpd;
        this.nLiveTup = value.nLiveTup;
        this.nDeadTup = value.nDeadTup;
        this.nModSinceAnalyze = value.nModSinceAnalyze;
        this.nInsSinceVacuum = value.nInsSinceVacuum;
        this.lastVacuum = value.lastVacuum;
        this.lastAutovacuum = value.lastAutovacuum;
        this.lastAnalyze = value.lastAnalyze;
        this.lastAutoanalyze = value.lastAutoanalyze;
        this.vacuumCount = value.vacuumCount;
        this.autovacuumCount = value.autovacuumCount;
        this.analyzeCount = value.analyzeCount;
        this.autoanalyzeCount = value.autoanalyzeCount;
    }

    @ConstructorProperties({ "relid", "schemaname", "relname", "seqScan", "lastSeqScan", "seqTupRead", "idxScan", "lastIdxScan", "idxTupFetch", "nTupIns", "nTupUpd", "nTupDel", "nTupHotUpd", "nTupNewpageUpd", "nLiveTup", "nDeadTup", "nModSinceAnalyze", "nInsSinceVacuum", "lastVacuum", "lastAutovacuum", "lastAnalyze", "lastAutoanalyze", "vacuumCount", "autovacuumCount", "analyzeCount", "autoanalyzeCount" })
    public PgStatAllTables(
        @Nullable Long relid,
        @Nullable String schemaname,
        @Nullable String relname,
        @Nullable Long seqScan,
        @Nullable OffsetDateTime lastSeqScan,
        @Nullable Long seqTupRead,
        @Nullable Long idxScan,
        @Nullable OffsetDateTime lastIdxScan,
        @Nullable Long idxTupFetch,
        @Nullable Long nTupIns,
        @Nullable Long nTupUpd,
        @Nullable Long nTupDel,
        @Nullable Long nTupHotUpd,
        @Nullable Long nTupNewpageUpd,
        @Nullable Long nLiveTup,
        @Nullable Long nDeadTup,
        @Nullable Long nModSinceAnalyze,
        @Nullable Long nInsSinceVacuum,
        @Nullable OffsetDateTime lastVacuum,
        @Nullable OffsetDateTime lastAutovacuum,
        @Nullable OffsetDateTime lastAnalyze,
        @Nullable OffsetDateTime lastAutoanalyze,
        @Nullable Long vacuumCount,
        @Nullable Long autovacuumCount,
        @Nullable Long analyzeCount,
        @Nullable Long autoanalyzeCount
    ) {
        this.relid = relid;
        this.schemaname = schemaname;
        this.relname = relname;
        this.seqScan = seqScan;
        this.lastSeqScan = lastSeqScan;
        this.seqTupRead = seqTupRead;
        this.idxScan = idxScan;
        this.lastIdxScan = lastIdxScan;
        this.idxTupFetch = idxTupFetch;
        this.nTupIns = nTupIns;
        this.nTupUpd = nTupUpd;
        this.nTupDel = nTupDel;
        this.nTupHotUpd = nTupHotUpd;
        this.nTupNewpageUpd = nTupNewpageUpd;
        this.nLiveTup = nLiveTup;
        this.nDeadTup = nDeadTup;
        this.nModSinceAnalyze = nModSinceAnalyze;
        this.nInsSinceVacuum = nInsSinceVacuum;
        this.lastVacuum = lastVacuum;
        this.lastAutovacuum = lastAutovacuum;
        this.lastAnalyze = lastAnalyze;
        this.lastAutoanalyze = lastAutoanalyze;
        this.vacuumCount = vacuumCount;
        this.autovacuumCount = autovacuumCount;
        this.analyzeCount = analyzeCount;
        this.autoanalyzeCount = autoanalyzeCount;
    }

    @Nullable
    public Long getRelid() {
        return this.relid;
    }

    public void setRelid(@Nullable Long relid) {
        this.relid = relid;
    }

    @Nullable
    public String getSchemaname() {
        return this.schemaname;
    }

    public void setSchemaname(@Nullable String schemaname) {
        this.schemaname = schemaname;
    }

    @Nullable
    public String getRelname() {
        return this.relname;
    }

    public void setRelname(@Nullable String relname) {
        this.relname = relname;
    }

    @Nullable
    public Long getSeqScan() {
        return this.seqScan;
    }

    public void setSeqScan(@Nullable Long seqScan) {
        this.seqScan = seqScan;
    }

    @Nullable
    public OffsetDateTime getLastSeqScan() {
        return this.lastSeqScan;
    }

    public void setLastSeqScan(@Nullable OffsetDateTime lastSeqScan) {
        this.lastSeqScan = lastSeqScan;
    }

    @Nullable
    public Long getSeqTupRead() {
        return this.seqTupRead;
    }

    public void setSeqTupRead(@Nullable Long seqTupRead) {
        this.seqTupRead = seqTupRead;
    }

    @Nullable
    public Long getIdxScan() {
        return this.idxScan;
    }

    public void setIdxScan(@Nullable Long idxScan) {
        this.idxScan = idxScan;
    }

    @Nullable
    public OffsetDateTime getLastIdxScan() {
        return this.lastIdxScan;
    }

    public void setLastIdxScan(@Nullable OffsetDateTime lastIdxScan) {
        this.lastIdxScan = lastIdxScan;
    }

    @Nullable
    public Long getIdxTupFetch() {
        return this.idxTupFetch;
    }

    public void setIdxTupFetch(@Nullable Long idxTupFetch) {
        this.idxTupFetch = idxTupFetch;
    }

    @Nullable
    public Long getNTupIns() {
        return this.nTupIns;
    }

    public void setNTupIns(@Nullable Long nTupIns) {
        this.nTupIns = nTupIns;
    }

    @Nullable
    public Long getNTupUpd() {
        return this.nTupUpd;
    }

    public void setNTupUpd(@Nullable Long nTupUpd) {
        this.nTupUpd = nTupUpd;
    }

    @Nullable
    public Long getNTupDel() {
        return this.nTupDel;
    }

    public void setNTupDel(@Nullable Long nTupDel) {
        this.nTupDel = nTupDel;
    }

    @Nullable
    public Long getNTupHotUpd() {
        return this.nTupHotUpd;
    }

    public void setNTupHotUpd(@Nullable Long nTupHotUpd) {
        this.nTupHotUpd = nTupHotUpd;
    }

    @Nullable
    public Long getNTupNewpageUpd() {
        return this.nTupNewpageUpd;
    }

    public void setNTupNewpageUpd(@Nullable Long nTupNewpageUpd) {
        this.nTupNewpageUpd = nTupNewpageUpd;
    }

    @Nullable
    public Long getNLiveTup() {
        return this.nLiveTup;
    }

    public void setNLiveTup(@Nullable Long nLiveTup) {
        this.nLiveTup = nLiveTup;
    }

    @Nullable
    public Long getNDeadTup() {
        return this.nDeadTup;
    }

    public void setNDeadTup(@Nullable Long nDeadTup) {
        this.nDeadTup = nDeadTup;
    }

    @Nullable
    public Long getNModSinceAnalyze() {
        return this.nModSinceAnalyze;
    }

    public void setNModSinceAnalyze(@Nullable Long nModSinceAnalyze) {
        this.nModSinceAnalyze = nModSinceAnalyze;
    }

    @Nullable
    public Long getNInsSinceVacuum() {
        return this.nInsSinceVacuum;
    }

    public void setNInsSinceVacuum(@Nullable Long nInsSinceVacuum) {
        this.nInsSinceVacuum = nInsSinceVacuum;
    }

    @Nullable
    public OffsetDateTime getLastVacuum() {
        return this.lastVacuum;
    }

    public void setLastVacuum(@Nullable OffsetDateTime lastVacuum) {
        this.lastVacuum = lastVacuum;
    }

    @Nullable
    public OffsetDateTime getLastAutovacuum() {
        return this.lastAutovacuum;
    }

    public void setLastAutovacuum(@Nullable OffsetDateTime lastAutovacuum) {
        this.lastAutovacuum = lastAutovacuum;
    }

    @Nullable
    public OffsetDateTime getLastAnalyze() {
        return this.lastAnalyze;
    }

    public void setLastAnalyze(@Nullable OffsetDateTime lastAnalyze) {
        this.lastAnalyze = lastAnalyze;
    }

    @Nullable
    public OffsetDateTime getLastAutoanalyze() {
        return this.lastAutoanalyze;
    }

    public void setLastAutoanalyze(@Nullable OffsetDateTime lastAutoanalyze) {
        this.lastAutoanalyze = lastAutoanalyze;
    }

    @Nullable
    public Long getVacuumCount() {
        return this.vacuumCount;
    }

    public void setVacuumCount(@Nullable Long vacuumCount) {
        this.vacuumCount = vacuumCount;
    }

    @Nullable
    public Long getAutovacuumCount() {
        return this.autovacuumCount;
    }

    public void setAutovacuumCount(@Nullable Long autovacuumCount) {
        this.autovacuumCount = autovacuumCount;
    }

    @Nullable
    public Long getAnalyzeCount() {
        return this.analyzeCount;
    }

    public void setAnalyzeCount(@Nullable Long analyzeCount) {
        this.analyzeCount = analyzeCount;
    }

    @Nullable
    public Long getAutoanalyzeCount() {
        return this.autoanalyzeCount;
    }

    public void setAutoanalyzeCount(@Nullable Long autoanalyzeCount) {
        this.autoanalyzeCount = autoanalyzeCount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgStatAllTables other = (PgStatAllTables) obj;
        if (this.relid == null) {
            if (other.relid != null)
                return false;
        }
        else if (!this.relid.equals(other.relid))
            return false;
        if (this.schemaname == null) {
            if (other.schemaname != null)
                return false;
        }
        else if (!this.schemaname.equals(other.schemaname))
            return false;
        if (this.relname == null) {
            if (other.relname != null)
                return false;
        }
        else if (!this.relname.equals(other.relname))
            return false;
        if (this.seqScan == null) {
            if (other.seqScan != null)
                return false;
        }
        else if (!this.seqScan.equals(other.seqScan))
            return false;
        if (this.lastSeqScan == null) {
            if (other.lastSeqScan != null)
                return false;
        }
        else if (!this.lastSeqScan.equals(other.lastSeqScan))
            return false;
        if (this.seqTupRead == null) {
            if (other.seqTupRead != null)
                return false;
        }
        else if (!this.seqTupRead.equals(other.seqTupRead))
            return false;
        if (this.idxScan == null) {
            if (other.idxScan != null)
                return false;
        }
        else if (!this.idxScan.equals(other.idxScan))
            return false;
        if (this.lastIdxScan == null) {
            if (other.lastIdxScan != null)
                return false;
        }
        else if (!this.lastIdxScan.equals(other.lastIdxScan))
            return false;
        if (this.idxTupFetch == null) {
            if (other.idxTupFetch != null)
                return false;
        }
        else if (!this.idxTupFetch.equals(other.idxTupFetch))
            return false;
        if (this.nTupIns == null) {
            if (other.nTupIns != null)
                return false;
        }
        else if (!this.nTupIns.equals(other.nTupIns))
            return false;
        if (this.nTupUpd == null) {
            if (other.nTupUpd != null)
                return false;
        }
        else if (!this.nTupUpd.equals(other.nTupUpd))
            return false;
        if (this.nTupDel == null) {
            if (other.nTupDel != null)
                return false;
        }
        else if (!this.nTupDel.equals(other.nTupDel))
            return false;
        if (this.nTupHotUpd == null) {
            if (other.nTupHotUpd != null)
                return false;
        }
        else if (!this.nTupHotUpd.equals(other.nTupHotUpd))
            return false;
        if (this.nTupNewpageUpd == null) {
            if (other.nTupNewpageUpd != null)
                return false;
        }
        else if (!this.nTupNewpageUpd.equals(other.nTupNewpageUpd))
            return false;
        if (this.nLiveTup == null) {
            if (other.nLiveTup != null)
                return false;
        }
        else if (!this.nLiveTup.equals(other.nLiveTup))
            return false;
        if (this.nDeadTup == null) {
            if (other.nDeadTup != null)
                return false;
        }
        else if (!this.nDeadTup.equals(other.nDeadTup))
            return false;
        if (this.nModSinceAnalyze == null) {
            if (other.nModSinceAnalyze != null)
                return false;
        }
        else if (!this.nModSinceAnalyze.equals(other.nModSinceAnalyze))
            return false;
        if (this.nInsSinceVacuum == null) {
            if (other.nInsSinceVacuum != null)
                return false;
        }
        else if (!this.nInsSinceVacuum.equals(other.nInsSinceVacuum))
            return false;
        if (this.lastVacuum == null) {
            if (other.lastVacuum != null)
                return false;
        }
        else if (!this.lastVacuum.equals(other.lastVacuum))
            return false;
        if (this.lastAutovacuum == null) {
            if (other.lastAutovacuum != null)
                return false;
        }
        else if (!this.lastAutovacuum.equals(other.lastAutovacuum))
            return false;
        if (this.lastAnalyze == null) {
            if (other.lastAnalyze != null)
                return false;
        }
        else if (!this.lastAnalyze.equals(other.lastAnalyze))
            return false;
        if (this.lastAutoanalyze == null) {
            if (other.lastAutoanalyze != null)
                return false;
        }
        else if (!this.lastAutoanalyze.equals(other.lastAutoanalyze))
            return false;
        if (this.vacuumCount == null) {
            if (other.vacuumCount != null)
                return false;
        }
        else if (!this.vacuumCount.equals(other.vacuumCount))
            return false;
        if (this.autovacuumCount == null) {
            if (other.autovacuumCount != null)
                return false;
        }
        else if (!this.autovacuumCount.equals(other.autovacuumCount))
            return false;
        if (this.analyzeCount == null) {
            if (other.analyzeCount != null)
                return false;
        }
        else if (!this.analyzeCount.equals(other.analyzeCount))
            return false;
        if (this.autoanalyzeCount == null) {
            if (other.autoanalyzeCount != null)
                return false;
        }
        else if (!this.autoanalyzeCount.equals(other.autoanalyzeCount))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.relid == null) ? 0 : this.relid.hashCode());
        result = prime * result + ((this.schemaname == null) ? 0 : this.schemaname.hashCode());
        result = prime * result + ((this.relname == null) ? 0 : this.relname.hashCode());
        result = prime * result + ((this.seqScan == null) ? 0 : this.seqScan.hashCode());
        result = prime * result + ((this.lastSeqScan == null) ? 0 : this.lastSeqScan.hashCode());
        result = prime * result + ((this.seqTupRead == null) ? 0 : this.seqTupRead.hashCode());
        result = prime * result + ((this.idxScan == null) ? 0 : this.idxScan.hashCode());
        result = prime * result + ((this.lastIdxScan == null) ? 0 : this.lastIdxScan.hashCode());
        result = prime * result + ((this.idxTupFetch == null) ? 0 : this.idxTupFetch.hashCode());
        result = prime * result + ((this.nTupIns == null) ? 0 : this.nTupIns.hashCode());
        result = prime * result + ((this.nTupUpd == null) ? 0 : this.nTupUpd.hashCode());
        result = prime * result + ((this.nTupDel == null) ? 0 : this.nTupDel.hashCode());
        result = prime * result + ((this.nTupHotUpd == null) ? 0 : this.nTupHotUpd.hashCode());
        result = prime * result + ((this.nTupNewpageUpd == null) ? 0 : this.nTupNewpageUpd.hashCode());
        result = prime * result + ((this.nLiveTup == null) ? 0 : this.nLiveTup.hashCode());
        result = prime * result + ((this.nDeadTup == null) ? 0 : this.nDeadTup.hashCode());
        result = prime * result + ((this.nModSinceAnalyze == null) ? 0 : this.nModSinceAnalyze.hashCode());
        result = prime * result + ((this.nInsSinceVacuum == null) ? 0 : this.nInsSinceVacuum.hashCode());
        result = prime * result + ((this.lastVacuum == null) ? 0 : this.lastVacuum.hashCode());
        result = prime * result + ((this.lastAutovacuum == null) ? 0 : this.lastAutovacuum.hashCode());
        result = prime * result + ((this.lastAnalyze == null) ? 0 : this.lastAnalyze.hashCode());
        result = prime * result + ((this.lastAutoanalyze == null) ? 0 : this.lastAutoanalyze.hashCode());
        result = prime * result + ((this.vacuumCount == null) ? 0 : this.vacuumCount.hashCode());
        result = prime * result + ((this.autovacuumCount == null) ? 0 : this.autovacuumCount.hashCode());
        result = prime * result + ((this.analyzeCount == null) ? 0 : this.analyzeCount.hashCode());
        result = prime * result + ((this.autoanalyzeCount == null) ? 0 : this.autoanalyzeCount.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatAllTables (");

        sb.append(relid);
        sb.append(", ").append(schemaname);
        sb.append(", ").append(relname);
        sb.append(", ").append(seqScan);
        sb.append(", ").append(lastSeqScan);
        sb.append(", ").append(seqTupRead);
        sb.append(", ").append(idxScan);
        sb.append(", ").append(lastIdxScan);
        sb.append(", ").append(idxTupFetch);
        sb.append(", ").append(nTupIns);
        sb.append(", ").append(nTupUpd);
        sb.append(", ").append(nTupDel);
        sb.append(", ").append(nTupHotUpd);
        sb.append(", ").append(nTupNewpageUpd);
        sb.append(", ").append(nLiveTup);
        sb.append(", ").append(nDeadTup);
        sb.append(", ").append(nModSinceAnalyze);
        sb.append(", ").append(nInsSinceVacuum);
        sb.append(", ").append(lastVacuum);
        sb.append(", ").append(lastAutovacuum);
        sb.append(", ").append(lastAnalyze);
        sb.append(", ").append(lastAutoanalyze);
        sb.append(", ").append(vacuumCount);
        sb.append(", ").append(autovacuumCount);
        sb.append(", ").append(analyzeCount);
        sb.append(", ").append(autoanalyzeCount);

        sb.append(")");
        return sb.toString();
    }
}
