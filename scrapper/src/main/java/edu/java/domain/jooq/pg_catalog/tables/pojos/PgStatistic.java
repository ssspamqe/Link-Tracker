/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.util.Arrays;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatistic implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long starelid;
    private Short staattnum;
    private Boolean stainherit;
    private Float stanullfrac;
    private Integer stawidth;
    private Float stadistinct;
    private Short stakind1;
    private Short stakind2;
    private Short stakind3;
    private Short stakind4;
    private Short stakind5;
    private Long staop1;
    private Long staop2;
    private Long staop3;
    private Long staop4;
    private Long staop5;
    private Long stacoll1;
    private Long stacoll2;
    private Long stacoll3;
    private Long stacoll4;
    private Long stacoll5;
    private Float[] stanumbers1;
    private Float[] stanumbers2;
    private Float[] stanumbers3;
    private Float[] stanumbers4;
    private Float[] stanumbers5;
    private Object[] stavalues1;
    private Object[] stavalues2;
    private Object[] stavalues3;
    private Object[] stavalues4;
    private Object[] stavalues5;

    public PgStatistic() {}

    public PgStatistic(PgStatistic value) {
        this.starelid = value.starelid;
        this.staattnum = value.staattnum;
        this.stainherit = value.stainherit;
        this.stanullfrac = value.stanullfrac;
        this.stawidth = value.stawidth;
        this.stadistinct = value.stadistinct;
        this.stakind1 = value.stakind1;
        this.stakind2 = value.stakind2;
        this.stakind3 = value.stakind3;
        this.stakind4 = value.stakind4;
        this.stakind5 = value.stakind5;
        this.staop1 = value.staop1;
        this.staop2 = value.staop2;
        this.staop3 = value.staop3;
        this.staop4 = value.staop4;
        this.staop5 = value.staop5;
        this.stacoll1 = value.stacoll1;
        this.stacoll2 = value.stacoll2;
        this.stacoll3 = value.stacoll3;
        this.stacoll4 = value.stacoll4;
        this.stacoll5 = value.stacoll5;
        this.stanumbers1 = value.stanumbers1;
        this.stanumbers2 = value.stanumbers2;
        this.stanumbers3 = value.stanumbers3;
        this.stanumbers4 = value.stanumbers4;
        this.stanumbers5 = value.stanumbers5;
        this.stavalues1 = value.stavalues1;
        this.stavalues2 = value.stavalues2;
        this.stavalues3 = value.stavalues3;
        this.stavalues4 = value.stavalues4;
        this.stavalues5 = value.stavalues5;
    }

    @ConstructorProperties({ "starelid", "staattnum", "stainherit", "stanullfrac", "stawidth", "stadistinct", "stakind1", "stakind2", "stakind3", "stakind4", "stakind5", "staop1", "staop2", "staop3", "staop4", "staop5", "stacoll1", "stacoll2", "stacoll3", "stacoll4", "stacoll5", "stanumbers1", "stanumbers2", "stanumbers3", "stanumbers4", "stanumbers5", "stavalues1", "stavalues2", "stavalues3", "stavalues4", "stavalues5" })
    public PgStatistic(
        @NotNull Long starelid,
        @NotNull Short staattnum,
        @NotNull Boolean stainherit,
        @NotNull Float stanullfrac,
        @NotNull Integer stawidth,
        @NotNull Float stadistinct,
        @NotNull Short stakind1,
        @NotNull Short stakind2,
        @NotNull Short stakind3,
        @NotNull Short stakind4,
        @NotNull Short stakind5,
        @NotNull Long staop1,
        @NotNull Long staop2,
        @NotNull Long staop3,
        @NotNull Long staop4,
        @NotNull Long staop5,
        @NotNull Long stacoll1,
        @NotNull Long stacoll2,
        @NotNull Long stacoll3,
        @NotNull Long stacoll4,
        @NotNull Long stacoll5,
        @Nullable Float[] stanumbers1,
        @Nullable Float[] stanumbers2,
        @Nullable Float[] stanumbers3,
        @Nullable Float[] stanumbers4,
        @Nullable Float[] stanumbers5,
        @Nullable Object[] stavalues1,
        @Nullable Object[] stavalues2,
        @Nullable Object[] stavalues3,
        @Nullable Object[] stavalues4,
        @Nullable Object[] stavalues5
    ) {
        this.starelid = starelid;
        this.staattnum = staattnum;
        this.stainherit = stainherit;
        this.stanullfrac = stanullfrac;
        this.stawidth = stawidth;
        this.stadistinct = stadistinct;
        this.stakind1 = stakind1;
        this.stakind2 = stakind2;
        this.stakind3 = stakind3;
        this.stakind4 = stakind4;
        this.stakind5 = stakind5;
        this.staop1 = staop1;
        this.staop2 = staop2;
        this.staop3 = staop3;
        this.staop4 = staop4;
        this.staop5 = staop5;
        this.stacoll1 = stacoll1;
        this.stacoll2 = stacoll2;
        this.stacoll3 = stacoll3;
        this.stacoll4 = stacoll4;
        this.stacoll5 = stacoll5;
        this.stanumbers1 = stanumbers1;
        this.stanumbers2 = stanumbers2;
        this.stanumbers3 = stanumbers3;
        this.stanumbers4 = stanumbers4;
        this.stanumbers5 = stanumbers5;
        this.stavalues1 = stavalues1;
        this.stavalues2 = stavalues2;
        this.stavalues3 = stavalues3;
        this.stavalues4 = stavalues4;
        this.stavalues5 = stavalues5;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getStarelid() {
        return this.starelid;
    }

    public void setStarelid(@NotNull Long starelid) {
        this.starelid = starelid;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Short getStaattnum() {
        return this.staattnum;
    }

    public void setStaattnum(@NotNull Short staattnum) {
        this.staattnum = staattnum;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getStainherit() {
        return this.stainherit;
    }

    public void setStainherit(@NotNull Boolean stainherit) {
        this.stainherit = stainherit;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Float getStanullfrac() {
        return this.stanullfrac;
    }

    public void setStanullfrac(@NotNull Float stanullfrac) {
        this.stanullfrac = stanullfrac;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Integer getStawidth() {
        return this.stawidth;
    }

    public void setStawidth(@NotNull Integer stawidth) {
        this.stawidth = stawidth;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Float getStadistinct() {
        return this.stadistinct;
    }

    public void setStadistinct(@NotNull Float stadistinct) {
        this.stadistinct = stadistinct;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Short getStakind1() {
        return this.stakind1;
    }

    public void setStakind1(@NotNull Short stakind1) {
        this.stakind1 = stakind1;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Short getStakind2() {
        return this.stakind2;
    }

    public void setStakind2(@NotNull Short stakind2) {
        this.stakind2 = stakind2;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Short getStakind3() {
        return this.stakind3;
    }

    public void setStakind3(@NotNull Short stakind3) {
        this.stakind3 = stakind3;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Short getStakind4() {
        return this.stakind4;
    }

    public void setStakind4(@NotNull Short stakind4) {
        this.stakind4 = stakind4;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Short getStakind5() {
        return this.stakind5;
    }

    public void setStakind5(@NotNull Short stakind5) {
        this.stakind5 = stakind5;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getStaop1() {
        return this.staop1;
    }

    public void setStaop1(@NotNull Long staop1) {
        this.staop1 = staop1;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getStaop2() {
        return this.staop2;
    }

    public void setStaop2(@NotNull Long staop2) {
        this.staop2 = staop2;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getStaop3() {
        return this.staop3;
    }

    public void setStaop3(@NotNull Long staop3) {
        this.staop3 = staop3;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getStaop4() {
        return this.staop4;
    }

    public void setStaop4(@NotNull Long staop4) {
        this.staop4 = staop4;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getStaop5() {
        return this.staop5;
    }

    public void setStaop5(@NotNull Long staop5) {
        this.staop5 = staop5;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getStacoll1() {
        return this.stacoll1;
    }

    public void setStacoll1(@NotNull Long stacoll1) {
        this.stacoll1 = stacoll1;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getStacoll2() {
        return this.stacoll2;
    }

    public void setStacoll2(@NotNull Long stacoll2) {
        this.stacoll2 = stacoll2;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getStacoll3() {
        return this.stacoll3;
    }

    public void setStacoll3(@NotNull Long stacoll3) {
        this.stacoll3 = stacoll3;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getStacoll4() {
        return this.stacoll4;
    }

    public void setStacoll4(@NotNull Long stacoll4) {
        this.stacoll4 = stacoll4;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getStacoll5() {
        return this.stacoll5;
    }

    public void setStacoll5(@NotNull Long stacoll5) {
        this.stacoll5 = stacoll5;
    }

    @Nullable
    public Float[] getStanumbers1() {
        return this.stanumbers1;
    }

    public void setStanumbers1(@Nullable Float[] stanumbers1) {
        this.stanumbers1 = stanumbers1;
    }

    @Nullable
    public Float[] getStanumbers2() {
        return this.stanumbers2;
    }

    public void setStanumbers2(@Nullable Float[] stanumbers2) {
        this.stanumbers2 = stanumbers2;
    }

    @Nullable
    public Float[] getStanumbers3() {
        return this.stanumbers3;
    }

    public void setStanumbers3(@Nullable Float[] stanumbers3) {
        this.stanumbers3 = stanumbers3;
    }

    @Nullable
    public Float[] getStanumbers4() {
        return this.stanumbers4;
    }

    public void setStanumbers4(@Nullable Float[] stanumbers4) {
        this.stanumbers4 = stanumbers4;
    }

    @Nullable
    public Float[] getStanumbers5() {
        return this.stanumbers5;
    }

    public void setStanumbers5(@Nullable Float[] stanumbers5) {
        this.stanumbers5 = stanumbers5;
    }

    @Nullable
    public Object[] getStavalues1() {
        return this.stavalues1;
    }

    public void setStavalues1(@Nullable Object[] stavalues1) {
        this.stavalues1 = stavalues1;
    }

    @Nullable
    public Object[] getStavalues2() {
        return this.stavalues2;
    }

    public void setStavalues2(@Nullable Object[] stavalues2) {
        this.stavalues2 = stavalues2;
    }

    @Nullable
    public Object[] getStavalues3() {
        return this.stavalues3;
    }

    public void setStavalues3(@Nullable Object[] stavalues3) {
        this.stavalues3 = stavalues3;
    }

    @Nullable
    public Object[] getStavalues4() {
        return this.stavalues4;
    }

    public void setStavalues4(@Nullable Object[] stavalues4) {
        this.stavalues4 = stavalues4;
    }

    @Nullable
    public Object[] getStavalues5() {
        return this.stavalues5;
    }

    public void setStavalues5(@Nullable Object[] stavalues5) {
        this.stavalues5 = stavalues5;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgStatistic other = (PgStatistic) obj;
        if (this.starelid == null) {
            if (other.starelid != null)
                return false;
        }
        else if (!this.starelid.equals(other.starelid))
            return false;
        if (this.staattnum == null) {
            if (other.staattnum != null)
                return false;
        }
        else if (!this.staattnum.equals(other.staattnum))
            return false;
        if (this.stainherit == null) {
            if (other.stainherit != null)
                return false;
        }
        else if (!this.stainherit.equals(other.stainherit))
            return false;
        if (this.stanullfrac == null) {
            if (other.stanullfrac != null)
                return false;
        }
        else if (!this.stanullfrac.equals(other.stanullfrac))
            return false;
        if (this.stawidth == null) {
            if (other.stawidth != null)
                return false;
        }
        else if (!this.stawidth.equals(other.stawidth))
            return false;
        if (this.stadistinct == null) {
            if (other.stadistinct != null)
                return false;
        }
        else if (!this.stadistinct.equals(other.stadistinct))
            return false;
        if (this.stakind1 == null) {
            if (other.stakind1 != null)
                return false;
        }
        else if (!this.stakind1.equals(other.stakind1))
            return false;
        if (this.stakind2 == null) {
            if (other.stakind2 != null)
                return false;
        }
        else if (!this.stakind2.equals(other.stakind2))
            return false;
        if (this.stakind3 == null) {
            if (other.stakind3 != null)
                return false;
        }
        else if (!this.stakind3.equals(other.stakind3))
            return false;
        if (this.stakind4 == null) {
            if (other.stakind4 != null)
                return false;
        }
        else if (!this.stakind4.equals(other.stakind4))
            return false;
        if (this.stakind5 == null) {
            if (other.stakind5 != null)
                return false;
        }
        else if (!this.stakind5.equals(other.stakind5))
            return false;
        if (this.staop1 == null) {
            if (other.staop1 != null)
                return false;
        }
        else if (!this.staop1.equals(other.staop1))
            return false;
        if (this.staop2 == null) {
            if (other.staop2 != null)
                return false;
        }
        else if (!this.staop2.equals(other.staop2))
            return false;
        if (this.staop3 == null) {
            if (other.staop3 != null)
                return false;
        }
        else if (!this.staop3.equals(other.staop3))
            return false;
        if (this.staop4 == null) {
            if (other.staop4 != null)
                return false;
        }
        else if (!this.staop4.equals(other.staop4))
            return false;
        if (this.staop5 == null) {
            if (other.staop5 != null)
                return false;
        }
        else if (!this.staop5.equals(other.staop5))
            return false;
        if (this.stacoll1 == null) {
            if (other.stacoll1 != null)
                return false;
        }
        else if (!this.stacoll1.equals(other.stacoll1))
            return false;
        if (this.stacoll2 == null) {
            if (other.stacoll2 != null)
                return false;
        }
        else if (!this.stacoll2.equals(other.stacoll2))
            return false;
        if (this.stacoll3 == null) {
            if (other.stacoll3 != null)
                return false;
        }
        else if (!this.stacoll3.equals(other.stacoll3))
            return false;
        if (this.stacoll4 == null) {
            if (other.stacoll4 != null)
                return false;
        }
        else if (!this.stacoll4.equals(other.stacoll4))
            return false;
        if (this.stacoll5 == null) {
            if (other.stacoll5 != null)
                return false;
        }
        else if (!this.stacoll5.equals(other.stacoll5))
            return false;
        if (this.stanumbers1 == null) {
            if (other.stanumbers1 != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.stanumbers1, other.stanumbers1))
            return false;
        if (this.stanumbers2 == null) {
            if (other.stanumbers2 != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.stanumbers2, other.stanumbers2))
            return false;
        if (this.stanumbers3 == null) {
            if (other.stanumbers3 != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.stanumbers3, other.stanumbers3))
            return false;
        if (this.stanumbers4 == null) {
            if (other.stanumbers4 != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.stanumbers4, other.stanumbers4))
            return false;
        if (this.stanumbers5 == null) {
            if (other.stanumbers5 != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.stanumbers5, other.stanumbers5))
            return false;
        if (this.stavalues1 == null) {
            if (other.stavalues1 != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.stavalues1, other.stavalues1))
            return false;
        if (this.stavalues2 == null) {
            if (other.stavalues2 != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.stavalues2, other.stavalues2))
            return false;
        if (this.stavalues3 == null) {
            if (other.stavalues3 != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.stavalues3, other.stavalues3))
            return false;
        if (this.stavalues4 == null) {
            if (other.stavalues4 != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.stavalues4, other.stavalues4))
            return false;
        if (this.stavalues5 == null) {
            if (other.stavalues5 != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.stavalues5, other.stavalues5))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.starelid == null) ? 0 : this.starelid.hashCode());
        result = prime * result + ((this.staattnum == null) ? 0 : this.staattnum.hashCode());
        result = prime * result + ((this.stainherit == null) ? 0 : this.stainherit.hashCode());
        result = prime * result + ((this.stanullfrac == null) ? 0 : this.stanullfrac.hashCode());
        result = prime * result + ((this.stawidth == null) ? 0 : this.stawidth.hashCode());
        result = prime * result + ((this.stadistinct == null) ? 0 : this.stadistinct.hashCode());
        result = prime * result + ((this.stakind1 == null) ? 0 : this.stakind1.hashCode());
        result = prime * result + ((this.stakind2 == null) ? 0 : this.stakind2.hashCode());
        result = prime * result + ((this.stakind3 == null) ? 0 : this.stakind3.hashCode());
        result = prime * result + ((this.stakind4 == null) ? 0 : this.stakind4.hashCode());
        result = prime * result + ((this.stakind5 == null) ? 0 : this.stakind5.hashCode());
        result = prime * result + ((this.staop1 == null) ? 0 : this.staop1.hashCode());
        result = prime * result + ((this.staop2 == null) ? 0 : this.staop2.hashCode());
        result = prime * result + ((this.staop3 == null) ? 0 : this.staop3.hashCode());
        result = prime * result + ((this.staop4 == null) ? 0 : this.staop4.hashCode());
        result = prime * result + ((this.staop5 == null) ? 0 : this.staop5.hashCode());
        result = prime * result + ((this.stacoll1 == null) ? 0 : this.stacoll1.hashCode());
        result = prime * result + ((this.stacoll2 == null) ? 0 : this.stacoll2.hashCode());
        result = prime * result + ((this.stacoll3 == null) ? 0 : this.stacoll3.hashCode());
        result = prime * result + ((this.stacoll4 == null) ? 0 : this.stacoll4.hashCode());
        result = prime * result + ((this.stacoll5 == null) ? 0 : this.stacoll5.hashCode());
        result = prime * result + ((this.stanumbers1 == null) ? 0 : Arrays.deepHashCode(this.stanumbers1));
        result = prime * result + ((this.stanumbers2 == null) ? 0 : Arrays.deepHashCode(this.stanumbers2));
        result = prime * result + ((this.stanumbers3 == null) ? 0 : Arrays.deepHashCode(this.stanumbers3));
        result = prime * result + ((this.stanumbers4 == null) ? 0 : Arrays.deepHashCode(this.stanumbers4));
        result = prime * result + ((this.stanumbers5 == null) ? 0 : Arrays.deepHashCode(this.stanumbers5));
        result = prime * result + ((this.stavalues1 == null) ? 0 : Arrays.deepHashCode(this.stavalues1));
        result = prime * result + ((this.stavalues2 == null) ? 0 : Arrays.deepHashCode(this.stavalues2));
        result = prime * result + ((this.stavalues3 == null) ? 0 : Arrays.deepHashCode(this.stavalues3));
        result = prime * result + ((this.stavalues4 == null) ? 0 : Arrays.deepHashCode(this.stavalues4));
        result = prime * result + ((this.stavalues5 == null) ? 0 : Arrays.deepHashCode(this.stavalues5));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatistic (");

        sb.append(starelid);
        sb.append(", ").append(staattnum);
        sb.append(", ").append(stainherit);
        sb.append(", ").append(stanullfrac);
        sb.append(", ").append(stawidth);
        sb.append(", ").append(stadistinct);
        sb.append(", ").append(stakind1);
        sb.append(", ").append(stakind2);
        sb.append(", ").append(stakind3);
        sb.append(", ").append(stakind4);
        sb.append(", ").append(stakind5);
        sb.append(", ").append(staop1);
        sb.append(", ").append(staop2);
        sb.append(", ").append(staop3);
        sb.append(", ").append(staop4);
        sb.append(", ").append(staop5);
        sb.append(", ").append(stacoll1);
        sb.append(", ").append(stacoll2);
        sb.append(", ").append(stacoll3);
        sb.append(", ").append(stacoll4);
        sb.append(", ").append(stacoll5);
        sb.append(", ").append(Arrays.deepToString(stanumbers1));
        sb.append(", ").append(Arrays.deepToString(stanumbers2));
        sb.append(", ").append(Arrays.deepToString(stanumbers3));
        sb.append(", ").append(Arrays.deepToString(stanumbers4));
        sb.append(", ").append(Arrays.deepToString(stanumbers5));
        sb.append(", ").append(Arrays.deepToString(stavalues1));
        sb.append(", ").append(Arrays.deepToString(stavalues2));
        sb.append(", ").append(Arrays.deepToString(stavalues3));
        sb.append(", ").append(Arrays.deepToString(stavalues4));
        sb.append(", ").append(Arrays.deepToString(stavalues5));

        sb.append(")");
        return sb.toString();
    }
}
