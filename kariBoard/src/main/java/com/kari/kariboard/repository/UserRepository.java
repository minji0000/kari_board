package com.kari.kariboard.repository;

import com.kari.kariboard.dto.UserDTO;
import com.kari.kariboard.entity.UserEntity;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

// DB 접근을 위해 이용하며, 이 클래스에서만 UserEntity 타입을 사용한다.
@Repository
public class UserRepository extends JpaRepository<UserEntity, Integer>{

    @Autowired
    private SqlSession sqlSession;

    private final String NAMESPACE = "mapper.UserMapper";


    public UserDTO auth(UserDTO u) {
        return sqlSession.selectOne(NAMESPACE + ".auth", u);
    }

    public void register(UserDTO u) {
        sqlSession.insert(NAMESPACE + ".register", u);
    }

    public UserEntity selectOne(int id) {
        return sqlSession.selectOne(NAMESPACE + ".selectOne", id);
    }

}
