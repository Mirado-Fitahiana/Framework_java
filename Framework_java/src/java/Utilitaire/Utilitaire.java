/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitaire;

/**
 *
 * @author Mirado
 */
public class Utilitaire {
       public static String[] SplitUrl(String url){
           if (url == null) {
               String[] part = {"/"};
               return part;
           }
           String[] ans = url.split("/");
           return ans;
       }    
       public static String ClassWithAnnotation(String url){
           return Utilitaire.class.getClassLoader().getResource(Utilitaire.class.getName()+".class").getPath();
       }
}
