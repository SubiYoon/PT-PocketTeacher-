package com.pocket.teacher.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.pocket.teacher.dto.UserDTO;
import com.pocket.teacher.frame.MyMapper;

@Mapper
@Repository
public interface UserMapper extends MyMapper<String, UserDTO>{
    
}
