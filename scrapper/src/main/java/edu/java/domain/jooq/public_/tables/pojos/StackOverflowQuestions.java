/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.public_.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.util.Arrays;

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
public class StackOverflowQuestions implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Long linkId;
    private String descriptionMd5Hash;
    private Long[] answersIds;

    public StackOverflowQuestions() {}

    public StackOverflowQuestions(StackOverflowQuestions value) {
        this.id = value.id;
        this.linkId = value.linkId;
        this.descriptionMd5Hash = value.descriptionMd5Hash;
        this.answersIds = value.answersIds;
    }

    @ConstructorProperties({ "id", "linkId", "descriptionMd5Hash", "answersIds" })
    public StackOverflowQuestions(
        @NotNull Long id,
        @NotNull Long linkId,
        @NotNull String descriptionMd5Hash,
        @NotNull Long[] answersIds
    ) {
        this.id = id;
        this.linkId = linkId;
        this.descriptionMd5Hash = descriptionMd5Hash;
        this.answersIds = answersIds;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getId() {
        return this.id;
    }

    public void setId(@NotNull Long id) {
        this.id = id;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getLinkId() {
        return this.linkId;
    }

    public void setLinkId(@NotNull Long linkId) {
        this.linkId = linkId;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getDescriptionMd5Hash() {
        return this.descriptionMd5Hash;
    }

    public void setDescriptionMd5Hash(@NotNull String descriptionMd5Hash) {
        this.descriptionMd5Hash = descriptionMd5Hash;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long[] getAnswersIds() {
        return this.answersIds;
    }

    public void setAnswersIds(@NotNull Long[] answersIds) {
        this.answersIds = answersIds;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final StackOverflowQuestions other = (StackOverflowQuestions) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.linkId == null) {
            if (other.linkId != null)
                return false;
        }
        else if (!this.linkId.equals(other.linkId))
            return false;
        if (this.descriptionMd5Hash == null) {
            if (other.descriptionMd5Hash != null)
                return false;
        }
        else if (!this.descriptionMd5Hash.equals(other.descriptionMd5Hash))
            return false;
        if (this.answersIds == null) {
            if (other.answersIds != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.answersIds, other.answersIds))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.linkId == null) ? 0 : this.linkId.hashCode());
        result = prime * result + ((this.descriptionMd5Hash == null) ? 0 : this.descriptionMd5Hash.hashCode());
        result = prime * result + ((this.answersIds == null) ? 0 : Arrays.deepHashCode(this.answersIds));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("StackOverflowQuestions (");

        sb.append(id);
        sb.append(", ").append(linkId);
        sb.append(", ").append(descriptionMd5Hash);
        sb.append(", ").append(Arrays.deepToString(answersIds));

        sb.append(")");
        return sb.toString();
    }
}
