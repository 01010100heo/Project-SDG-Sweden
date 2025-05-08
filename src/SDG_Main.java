/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import oru.inf.InfDB;
import oru.inf.InfException;


/**
 *
 * @author theow
 */
public class SDG_Main {
    private static InfDB idb;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                 try {
            idb = new InfDB("sdgsweden", "3306", "dbAdmin2024", "dbAdmin2024PW");
            
        } catch (InfException ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
}
