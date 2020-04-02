package com.geinek.blog.po;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "t_blog")
public class Blog {
    // article id.
    @Id
    @GeneratedValue
    private Long blogId;

    // article title.
    private String blogTitle;

    // article content.
    private String blogContent;

    // image shown on the top of the article page and home page.
    private String blogImageUrl;

    // article flag shown on the top.
    // eg. origin article
    private String blogFlag;

    // counts of view for the article.
    private Integer blogViews;

    // if canAppreciation equals true, guest can donate to the author's article with QR code.
    private boolean canAppreciation;

    // if shareStatement equals true, you can reproduced. Else, you can not.
    private boolean shareStatement;

    // if canComment equals true, you can turn on comment component. Else, you can not.
    private boolean canComment;

    // if published equals true means the article was published. Else, the article saves as a draft.
    private boolean isPublished;

    // if the article recommend on the home page.
    private boolean isRecommend;

    // article create time.
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    // article update time.
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;

    @ManyToOne
    private Type type;

    @ManyToMany(cascade = {CascadeType.PERSIST})
    private List<Tag> tags = new ArrayList<>();

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "blog")
    private List<Comment> comments = new ArrayList<>();

    public Blog() {

    }

    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent;
    }

    public String getBlogImageUrl() {
        return blogImageUrl;
    }

    public void setBlogImageUrl(String blogImageUrl) {
        this.blogImageUrl = blogImageUrl;
    }

    public String getBlogFlag() {
        return blogFlag;
    }

    public void setBlogFlag(String blogFlag) {
        this.blogFlag = blogFlag;
    }

    public Integer getBlogViews() {
        return blogViews;
    }

    public void setBlogViews(Integer blogViews) {
        this.blogViews = blogViews;
    }

    public boolean isCanAppreciation() {
        return canAppreciation;
    }

    public void setCanAppreciation(boolean canAppreciation) {
        this.canAppreciation = canAppreciation;
    }

    public boolean isShareStatement() {
        return shareStatement;
    }

    public void setShareStatement(boolean shareStatement) {
        this.shareStatement = shareStatement;
    }

    public boolean isCanComment() {
        return canComment;
    }

    public void setCanComment(boolean canComment) {
        this.canComment = canComment;
    }

    public boolean isPublished() {
        return isPublished;
    }

    public void setPublished(boolean published) {
        isPublished = published;
    }

    public boolean isRecommend() {
        return isRecommend;
    }

    public void setRecommend(boolean recommend) {
        isRecommend = recommend;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blogId=" + blogId +
                ", blogTitle='" + blogTitle + '\'' +
                ", blogContent='" + blogContent + '\'' +
                ", blogImageUrl='" + blogImageUrl + '\'' +
                ", blogFlag='" + blogFlag + '\'' +
                ", blogViews=" + blogViews +
                ", canAppreciation=" + canAppreciation +
                ", shareStatement=" + shareStatement +
                ", canComment=" + canComment +
                ", isPublished=" + isPublished +
                ", isRecommend=" + isRecommend +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
