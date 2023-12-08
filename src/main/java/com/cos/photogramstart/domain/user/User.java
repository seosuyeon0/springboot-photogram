package com.cos.photogramstart.domain.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String username;
  private String password;

  private String name;
  private String website;
  //자기소개
  private String bio;
  private String email;
  private String phone;
  private String gender;

  //사진
  private String profileImageUrl;
  private String role;

    private LocalDateTime createDate;


  @PrePersist
  public void createDate() {
      this.createDate = LocalDateTime.now();

  }
}
