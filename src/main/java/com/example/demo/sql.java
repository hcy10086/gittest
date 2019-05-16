package com.example.demo;

import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface sql {
    @Insert("insert into test(name,id) values(#{name},#{id})")
    public void insertT(bean user);

    @Delete("delete from test where id=#{id}")
    public void deleteById(int id);

    @Update("update test set name=#{name},age=#{id} where id=#{id}")
    public void updateT(bean user);

    @Select("select * from test where id=#{id}")
    public bean getUser(bean id);

    @Select("select * from test")
    public List<bean> getAllUsers();
}
