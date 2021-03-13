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

//able to apply for credit cards 1
//fixed deposits 2
//receipt 1
//history of past transactions 2
//transfer of funds from other banks 2
//deposit 1
//withdrawal 1
//check balance 1
//accept credit cards on an array 2
//account check 1
//financing 2
//loaning 2
public interface Needs {
    public boolean register(String username, String password,String confirmation, int choice);
    public boolean login(String username, String password);
    public void logout();
    public int widthraw();
    public int deposit();
    public int balance();
    public int creditcards(String username);
    public String receipt(String username, int money);
    public void history(String username);
}
