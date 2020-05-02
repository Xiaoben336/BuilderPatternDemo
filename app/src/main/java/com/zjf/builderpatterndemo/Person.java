package com.zjf.builderpatterndemo;

public class Person {
    private static final String TAG = "Person";
    private int id;
    private String name;
    private String sex;
    private int height;
    private String occupation;

    private Person(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.sex = builder.sex;
        this.height = builder.height;
        this.occupation = builder.occupation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }


    static class Builder {
        private int id;
        private String name;
        private String sex;
        private int height;
        private String occupation;

        public Builder id(int id) {
            this.id = id;
            return this;
        }
        public Builder name(String name){
            this.name=name;
            return this;
        }
        public Builder sex(String sex){
            this.sex=sex;
            return this;
        }
        public Builder height(int height){
            this.height=height;
            return this;
        }

        public Builder occupation(String occupation){
            this.occupation=occupation;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}
