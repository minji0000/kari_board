package com.kari.kariboard.entity;import lombok.Builder;import lombok.Getter;import lombok.Setter;import java.security.Timestamp;@Getter@Setter@Builderpublic class UserEntity {    private int userId;    private String role;    private String username;    private String password;    private String name;    private Timestamp birth;    private String phone;    private String nickname;    private String email;    private String profileImgUrl;    private Timestamp createTime;    private Timestamp updateTime;}