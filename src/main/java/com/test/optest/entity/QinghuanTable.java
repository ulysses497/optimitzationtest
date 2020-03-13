package com.test.optest.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "qinghuan")
public class QinghuanTable implements Serializable {
    private Long userid;

    private Date now;

    private String content;

    private static final long serialVersionUID = 1L;

    /**
     * @return userid
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * @return now
     */
    public Date getNow() {
        return now;
    }

    /**
     * @param now
     */
    public void setNow(Date now) {
        this.now = now;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", now=").append(now);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}