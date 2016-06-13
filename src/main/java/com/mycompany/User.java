package com.mycompany;

import java.io.Serializable;
import java.util.Set;

public class User implements Serializable {
    private static final long serialVersionUID = 8970843958060684481L;
    
    private String name;
    private String id;
    
    private Set<String> groups;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Set<String> getGroups() {
        return groups;
    }

    public void setGroups(Set<String> groups) {
        this.groups = groups;
    }


}
