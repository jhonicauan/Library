package com.jhonicauan.Library.Model;

import lombok.Data;

@Data
public abstract class UserModel {
    private String name;
    private String email;
    private String password;
}
