/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finals;

/**
 *
 * @author janke
 */


//String path1 = String.format("E:\\Programming\\java\\Finals\\%s.txt", FileName); for path
public class user_side implements Needs {
    private int initial_balance = 0;
    private int curr_money;
    private String username;
    private String password;
    private String confirmation;
    
    public int get_balance(){
        return initial_balance;
    }
    public int get_current(){
        return curr_money;
    }
    public String get_username(){
        return username;
    }
    public String get_pass(){
        return password;
    }
    @Override
    public int widthraw(){
        return curr_money;
    }
    @Override
    public int deposit(){
        return curr_money;
    }
    @Override
    public int balance(){
        return curr_money;
    }
    @Override
    public int creditcards(String Iusername){
        return 0;
    }@Override
    public String receipt(String Iusername, int money){
        return "";
    }@Override
    public void history(String Iusername){
        
    }@Override
    public boolean login(String Iusername, String Ipassword){
        username = Iusername;
        password = Ipassword;
        return true;
    }@Override
    public void logout(){
        
    }@Override
    public boolean register(String username, String password,String confirmation, int choice){
        
        return true;
    }
    public void transfer (int Tmoney){
        System.out.println("Transfer completed");
    }
}
