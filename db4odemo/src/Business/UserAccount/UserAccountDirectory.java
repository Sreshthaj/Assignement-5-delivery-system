/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.DeliverManRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author Sreshtha
 */
public class UserAccountDirectory {
   //private RestaurantDirectory resDir;
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String name,String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setName(name);
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
//        userAccount.setContact(contact);
//        userAccount.setAddress(address);
        userAccountList.add(userAccount); 
        
                
        return userAccount;
    }
    
    public void deleteUserAccount(UserAccount user){
        userAccountList.remove(user);
    }
    
    public void updateUserAccount(UserAccount user,String name,String username, String password){
       
        user.setName(name);
        user.setUsername(username);
        user.setPassword(password);
    }
    public UserAccount createUserAccount(String username, String password,String contact, String address, Employee employee, Role role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public void removeAllAccounts() {
        for (int i = 0; i < userAccountList.size(); i++) {
            if (!userAccountList.get(i).getUsername().equalsIgnoreCase("admin")) {
                userAccountList.remove(i);
            }
        }

        for (int i = 0; i < userAccountList.size(); i++) {
            System.out.println(userAccountList.get(i).getEmployee());
        }
    }

    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }

    
}
