package com.pocket.teacher.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pocket.teacher.dto.UserDTO;
import com.pocket.teacher.frame.MyService;
import com.pocket.teacher.mapper.UserMapper;

@Service
public class UserService implements MyService<String, UserDTO>{
    
    @Autowired
    UserMapper mapper;

    @Override
    public int add(UserDTO v) throws Exception {
        return mapper.insert(v);
    }

    @Override
    public UserDTO get(String k) throws Exception {
        return mapper.select(k);
    }

    @Override
    public List<UserDTO> getAll(String k) throws Exception {
        return mapper.selectAll(k);
    }

    @Override
    public int modify(UserDTO v) throws Exception {
        return mapper.update(v);
    }

    @Override
    public int remove(String k) throws Exception {
        return mapper.delete(k);
    }
}
