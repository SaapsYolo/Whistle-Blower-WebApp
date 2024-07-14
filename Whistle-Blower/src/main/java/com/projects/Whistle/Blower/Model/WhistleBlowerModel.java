package com.projects.Whistle.Blower.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class WhistleBlowerModel {
    @Id
    @GeneratedValue
    private long id;
    private String userName;
    private String typeOfCrime;
    private String messagePost;
    private Date datePosted;

    public WhistleBlowerModel(long id, String userName, String typeOfCrime, String messagePost, Date datePosted) {
        this.id = id;
        this.userName = userName;
        this.typeOfCrime = typeOfCrime;
        this.messagePost = messagePost;
        this.datePosted = datePosted;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTypeOfCrime() {
        return typeOfCrime;
    }

    public void setTypeOfCrime(String typeOfCrime) {
        this.typeOfCrime = typeOfCrime;
    }

    public String getMessagePost() {
        return messagePost;
    }

    public void setMessagePost(String messagePost) {
        this.messagePost = messagePost;
    }

    public Date getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(Date datePosted) {
        this.datePosted = datePosted;
    }

    @Override
    public String toString() {
        return "WhistleBlowerModel{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", typeOfCrime='" + typeOfCrime + '\'' +
                ", messagePost='" + messagePost + '\'' +
                ", datePosted=" + datePosted +
                '}';
    }
}
