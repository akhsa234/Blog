package com.blog;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "COMMENTS", schema = "CUSTOMER", catalog = "")
public class CommentsEntity {
    private long id;
    private String code;
    private String body;
    private String name;
    private String creator;
    private Time currentDate;
    private Integer likes;
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
    @Column(name = "CODE")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "CREATOR")
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
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
    @Column(name = "LIKES")
    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
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

        CommentsEntity that = (CommentsEntity) o;

        if (id != that.id) return false;
        if (lockVersion != that.lockVersion) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (body != null ? !body.equals(that.body) : that.body != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (creator != null ? !creator.equals(that.creator) : that.creator != null) return false;
        if (currentDate != null ? !currentDate.equals(that.currentDate) : that.currentDate != null) return false;
        if (likes != null ? !likes.equals(that.likes) : that.likes != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (body != null ? body.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (creator != null ? creator.hashCode() : 0);
        result = 31 * result + (currentDate != null ? currentDate.hashCode() : 0);
        result = 31 * result + (likes != null ? likes.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (int) (lockVersion ^ (lockVersion >>> 32));
        return result;
    }
}
