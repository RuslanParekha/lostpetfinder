package com.com.model;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by ruslan on 14.03.17.
 */
@Entity
@Table(name = "photos")

public class Photo {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private byte[] body;

    public Photo() {
    }

    public Photo(String name, byte[] body) {
        this.name = name;
        this.body = body;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getBody() {
        return body;
    }

    public void setBody(byte[] body) {
        this.body = body;
    }
}
