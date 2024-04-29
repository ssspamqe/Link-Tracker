/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.public_.tables.pojos;


import jakarta.validation.constraints.Size;

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
public class GitHubRepositories implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Long linkId;
    private String name;
    private String owner;
    private String descriptionMd5Hash;
    private Long[] activitiesIds;

    public GitHubRepositories() {}

    public GitHubRepositories(GitHubRepositories value) {
        this.id = value.id;
        this.linkId = value.linkId;
        this.name = value.name;
        this.owner = value.owner;
        this.descriptionMd5Hash = value.descriptionMd5Hash;
        this.activitiesIds = value.activitiesIds;
    }

    @ConstructorProperties({ "id", "linkId", "name", "owner", "descriptionMd5Hash", "activitiesIds" })
    public GitHubRepositories(
        @NotNull Long id,
        @NotNull Long linkId,
        @NotNull String name,
        @NotNull String owner,
        @NotNull String descriptionMd5Hash,
        @NotNull Long[] activitiesIds
    ) {
        this.id = id;
        this.linkId = linkId;
        this.name = name;
        this.owner = owner;
        this.descriptionMd5Hash = descriptionMd5Hash;
        this.activitiesIds = activitiesIds;
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
    @Size(max = 128)
    @NotNull
    public String getName() {
        return this.name;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }

    @jakarta.validation.constraints.NotNull
    @Size(max = 128)
    @NotNull
    public String getOwner() {
        return this.owner;
    }

    public void setOwner(@NotNull String owner) {
        this.owner = owner;
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
    public Long[] getActivitiesIds() {
        return this.activitiesIds;
    }

    public void setActivitiesIds(@NotNull Long[] activitiesIds) {
        this.activitiesIds = activitiesIds;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final GitHubRepositories other = (GitHubRepositories) obj;
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
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.owner == null) {
            if (other.owner != null)
                return false;
        }
        else if (!this.owner.equals(other.owner))
            return false;
        if (this.descriptionMd5Hash == null) {
            if (other.descriptionMd5Hash != null)
                return false;
        }
        else if (!this.descriptionMd5Hash.equals(other.descriptionMd5Hash))
            return false;
        if (this.activitiesIds == null) {
            if (other.activitiesIds != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.activitiesIds, other.activitiesIds))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.linkId == null) ? 0 : this.linkId.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.owner == null) ? 0 : this.owner.hashCode());
        result = prime * result + ((this.descriptionMd5Hash == null) ? 0 : this.descriptionMd5Hash.hashCode());
        result = prime * result + ((this.activitiesIds == null) ? 0 : Arrays.deepHashCode(this.activitiesIds));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GitHubRepositories (");

        sb.append(id);
        sb.append(", ").append(linkId);
        sb.append(", ").append(name);
        sb.append(", ").append(owner);
        sb.append(", ").append(descriptionMd5Hash);
        sb.append(", ").append(Arrays.deepToString(activitiesIds));

        sb.append(")");
        return sb.toString();
    }
}