package com.project.cars.entity;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

// Root response class
public class Dogs {

    private List<BreedData> data;
    private Meta meta;
    private Links links;

    // Getters and Setters
    public List<BreedData> getData() { return data; }
    public void setData(List<BreedData> data) { this.data = data; }

    public Meta getMeta() { return meta; }
    public void setMeta(Meta meta) { this.meta = meta; }

    public Links getLinks() { return links; }
    public void setLinks(Links links) { this.links = links; }

    // ------------------ Inner Classes ------------------

    public static class BreedData {
        private String id;
        private String type;
        private Attributes attributes;
        private Relationships relationships;

        public String getId() { return id; }
        public void setId(String id) { this.id = id; }

        public String getType() { return type; }
        public void setType(String type) { this.type = type; }

        public Attributes getAttributes() { return attributes; }
        public void setAttributes(Attributes attributes) { this.attributes = attributes; }

        public Relationships getRelationships() { return relationships; }
        public void setRelationships(Relationships relationships) { this.relationships = relationships; }
    }

    public static class Attributes {
        private String name;
        private String description;
        private Life life;
        @JsonProperty("male_weight")
        private Weight maleWeight;
        @JsonProperty("female_weight")
        private Weight femaleWeight;
        private boolean hypoallergenic;

        // Getters and Setters
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getDescription() { return description; }
        public void setDescription(String description) { this.description = description; }

        public Life getLife() { return life; }
        public void setLife(Life life) { this.life = life; }

        public Weight getMaleWeight() { return maleWeight; }
        public void setMaleWeight(Weight maleWeight) { this.maleWeight = maleWeight; }

        public Weight getFemaleWeight() { return femaleWeight; }
        public void setFemaleWeight(Weight femaleWeight) { this.femaleWeight = femaleWeight; }

        public boolean isHypoallergenic() { return hypoallergenic; }
        public void setHypoallergenic(boolean hypoallergenic) { this.hypoallergenic = hypoallergenic; }
    }

    public static class Life {
        private int min;
        private int max;

        public int getMin() { return min; }
        public void setMin(int min) { this.min = min; }

        public int getMax() { return max; }
        public void setMax(int max) { this.max = max; }
    }

    public static class Weight {
        private int min;
        private int max;

        public int getMin() { return min; }
        public void setMin(int min) { this.min = min; }

        public int getMax() { return max; }
        public void setMax(int max) { this.max = max; }
    }

    public static class Relationships {
        private Group group;

        public Group getGroup() { return group; }
        public void setGroup(Group group) { this.group = group; }
    }

    public static class Group {
        private GroupData data;

        public GroupData getData() { return data; }
        public void setData(GroupData data) { this.data = data; }
    }

    public static class GroupData {
        private String id;
        private String type;

        public String getId() { return id; }
        public void setId(String id) { this.id = id; }

        public String getType() { return type; }
        public void setType(String type) { this.type = type; }
    }

    public static class Meta {
        private Pagination pagination;

        public Pagination getPagination() { return pagination; }
        public void setPagination(Pagination pagination) { this.pagination = pagination; }
    }

    public static class Pagination {
        private int current;
        private int next;
        private int last;
        private int records;

        public int getCurrent() { return current; }
        public void setCurrent(int current) { this.current = current; }

        public int getNext() { return next; }
        public void setNext(int next) { this.next = next; }

        public int getLast() { return last; }
        public void setLast(int last) { this.last = last; }

        public int getRecords() { return records; }
        public void setRecords(int records) { this.records = records; }
    }

    public static class Links {
        private String self;
        private String current;
        private String next;
        private String last;

        public String getSelf() { return self; }
        public void setSelf(String self) { this.self = self; }

        public String getCurrent() { return current; }
        public void setCurrent(String current) { this.current = current; }

        public String getNext() { return next; }
        public void setNext(String next) { this.next = next; }

        public String getLast() { return last; }
        public void setLast(String last) { this.last = last; }
    }
}
