package com.chu.mapper;

import com.chu.entity.Tuser;
import com.chu.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
	//第四行注释
	@Select("SELECT * FROM USERS WHERE userNAME = #{name}")
    User findByName(@Param("name") String name);

	@Insert("INSERT INTO USERS(NAME, AGE) VALUES(#{name}, #{age})")
	int insert(@Param("name") String name, @Param("age") Integer age);

	@Select("SELECT user_id,user_name FROM t_user WHERE user_id = #{id}")
	List<Tuser> findById(@Param("id") String id);
}