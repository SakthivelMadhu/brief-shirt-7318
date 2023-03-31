package com.masai.DAO;


import java.util.List;

import model.User;

public interface UserDao {
    
    public void addUser(User user) throws Exception;
    
    public void updateUser(User user) throws Exception;
    
    public User getUserById(int userId) throws Exception;
    
    public User getUserByUsername(String username) throws Exception;
    
    public List<User> getAllUsers() throws Exception;
    
    public void deleteUser(int userId) throws Exception;
    
    public void changePassword(int userId, String newPassword) throws Exception;
    
}
