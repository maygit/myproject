package com.raycloud.myproject.test.bean;

/**
 * Created by 001117020012 on 2017/2/17.
 */
public class Ibatis {
    private String id;
    private String name;
    private String password;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Ibatis(){

    }
    public Ibatis(String id, String name,String password) {
        super();
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ibatis ibatis = (Ibatis) o;

        if (id != null ? !id.equals(ibatis.id) : ibatis.id != null) return false;
        if (name != null ? !name.equals(ibatis.name) : ibatis.name != null) return false;
        if (password != null ? !password.equals(ibatis.password) : ibatis.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Ibatis{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
