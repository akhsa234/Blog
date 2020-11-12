package com.blog;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "PAPER", schema = "CUSTOMER", catalog = "")
public class PaperEntity {
    private long id;
    private String body;
    private String title;
    private Time currentDate;
    private Time releaseDate;
    private Time modifyDate;
    private String tags;
    private Integer likes;
    private Integer rate;
    private String description;
    private long lockVersion;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "BODY")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Basic
    @Column(name = "TITLE")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "CURRENT_DATE")
    public Time getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Time currentDate) {
        this.currentDate = currentDate;
    }

    @Basic
    @Column(name = "RELEASE_DATE")
    public Time getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Time releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Basic
    @Column(name = "MODIFY_DATE")
    public Time getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Time modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Basic
    @Column(name = "TAGS")
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Basic
    @Column(name = "LIKES")
    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    @Basic
    @Column(name = "RATE")
    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    @Basic
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "LOCK_VERSION")
    public long getLockVersion() {
        return lockVersion;
    }

    public void setLockVersion(long lockVersion) {
        this.lockVersion = lockVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PaperEntity that = (PaperEntity) o;

        if (id != that.id) return false;
        if (lockVersion != that.lockVersion) return false;
        if (body != null ? !body.equals(that.body) : that.body != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (currentDate != null ? !currentDate.equals(that.currentDate) : that.currentDate != null) return false;
        if (releaseDate != null ? !releaseDate.equals(that.releaseDate) : that.releaseDate != null) return false;
        if (modifyDate != null ? !modifyDate.equals(that.modifyDate) : that.modifyDate != null) return false;
        if (tags != null ? !tags.equals(that.tags) : that.tags != null) return false;
        if (likes != null ? !likes.equals(that.likes) : that.likes != null) return false;
        if (rate != null ? !rate.equals(that.rate) : that.rate != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (body != null ? body.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (currentDate != null ? currentDate.hashCode() : 0);
        result = 31 * result + (releaseDate != null ? releaseDate.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        result = 31 * result + (tags != null ? tags.hashCode() : 0);
        result = 31 * result + (likes != null ? likes.hashCode() : 0);
        result = 31 * result + (rate != null ? rate.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (int) (lockVersion ^ (lockVersion >>> 32));
        return result;
    }
}
