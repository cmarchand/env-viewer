/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package top.marchand.java.env.viewer;

/**
 *
 * @author cmarchand
 */
public class EnvViewer {
    
    public static void main(String[] args) {
        //System.out.println("*** System properties ***");
        System.getProperties().keySet().forEach((key) -> {
            System.out.println("ssp."+key.toString()+"="+System.getProperty(key.toString()));
        });
        //System.out.println();
        //System.out.println("*** Environment ***");
        System.getenv().keySet().forEach((key) -> {
            System.out.println("env."+key+"="+System.getenv(key));
        });
    }
    
}
