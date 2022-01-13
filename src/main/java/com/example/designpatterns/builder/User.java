package com.example.designpatterns.builder;

import lombok.ToString;

@ToString
public class User {
    Integer id;

    String name;

    Integer age;

    String description;

    private User(){

    }


    public static class UserBuilder{
      private User users=new User();

         public UserBuilder name(Integer id,String name){
             users.id=id;
             users.name=name;
             return this;
         }

        public UserBuilder age(Integer age){
            users.age=age;
            return this;
        }

        public UserBuilder description(String description){
             users.description=description;
             return this;
        }

        public User user(){
             return users;
        }

    }
}
