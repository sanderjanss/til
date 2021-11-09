package com.switchfully.til.domain;

import lombok.Builder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "til")
public class Til {

    // UI needs tid
    // Postman needs uuid
    @Id
    @Column(name = "uuid")
    private UUID uuid;
    // UI needs ownerName
    // UI also needs temployee
    // Postman needs owner
    // In java, a Person is needed
    @Column(name = "person")
    private String person;
    // UI needs til
    // Postman needs knowledgeOfTheDay
    @Column(name= "knowledge_of_the_day")
    private String knowledgeOfTheDay;

    public Til(UUID uuid, String knowledgeOfTheDay, String person) {
        this.uuid = uuid;
        this.person = person;
        this.knowledgeOfTheDay = knowledgeOfTheDay;
    }

    public Til() {

    }

    // UI needs ownerName
    // UI also needs temployee
    // Postman needs owner
    public String getPerson() {
        return person;
    }

    // UI needs til
    // Postman needs knowledgeOfTheDay
    public String getKnowledgeOfTheDay() {
        return knowledgeOfTheDay;
    }

    // UI needs tid
    // Postman needs uuid
    public UUID getUuid() {
        return uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Til til = (Til) o;
        return Objects.equals(getUuid(), til.getUuid());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUuid());
    }

    public static class TilBuilder{

        private UUID uuid;
        private String person;
        private String knowledgeOfTheDay;

        public TilBuilder setUuid(UUID uuid) {
            this.uuid = uuid;
            return this;
        }

        public TilBuilder setPerson(String person) {
            this.person = person;
            return this;
        }

        public TilBuilder setKnowledgeOfTheDay(String knowledgeOfTheDay) {
            this.knowledgeOfTheDay = knowledgeOfTheDay;
            return this;
        }

        public Til build(){
            return new Til(this.uuid, this.knowledgeOfTheDay, this.person);
        }
    }
}
