package com.kari.kariboard.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
// 테이블 이름
@Table(name = "user")
public class UserEntity {
  
// 참고 https://coding-start.tistory.com/71
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//   컬럼 명 적을것
    @JoinColumn(name = "user_id")
    private int userId;
  
    @Column(name = "user_role",length = 255,nullable = false)
    private String role;
  
    @Column(name = "user_id",length = 255,nullable = false)
    private String username;
  
    @Column(name = "user_password",length = 255,nullable = false)
    private String password;
  
    @Column(name = "user_name",length = 255,nullable = false)
    private String name;
  
//   https://chunggaeguri.tistory.com/entry/MySQL-%EB%82%A0%EC%A7%9C-%EC%8B%9C%EA%B0%84-%EB%8D%B0%EC%9D%B4%ED%84%B0-%ED%83%80%EC%9E%85
//   mySql 날짜 타입 차이점
    @Column(name = "user_birth",length = 255,nullable = false)
    private Timestamp birth;
  
    @Column(name = "user_phone",length = 255,nullable = false)
    private String phone;
  
    @Column(name = "user_nick_name",length = 255,nullable = false)
    private String nickname;
  
    @Column(name = "user_email",length = 255,nullable = false)
    private String email;
  
    @Column(name = "user_profile_img_url",length = 255,nullable = false)
    private String profileImgUrl;
  
    @Column(name = "user_create_time",length = 255,nullable = false)
    private Timestamp createTime;

    @Column(name = "user_update_time",length = 255,nullable = false)
    private Timestamp updateTime;
}
