package com.benghaui.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonReslt <T>{

    private  Integer code;
    private  String message;
    private  T data;

 public CommonReslt(Integer code,String message){
     this(code,message,null);
 }
}
