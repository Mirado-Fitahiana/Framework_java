/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitaire;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

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
    public static List<Class> getAllClasses(String pathPackage,String NamePackage) throws ClassNotFoundException{ 
        File file = new File(pathPackage);
        File[] listfile = file.listFiles();
        List<Class> valiny = new ArrayList<>();
            for (File allFile : listfile) {
                if (allFile.isDirectory()) { // if not file package -> remake the function
                    List<Class> recusrsive =  Utilitaire.getAllClasses(pathPackage+"/"+allFile.getName(), NamePackage);
                    for (Class allClasses : recusrsive) {
                        System.out.println("allclasses: "+allClasses);
                        valiny.add(allClasses);
                    }
                } else {
                    if (allFile.getName().endsWith(".class")) {
                        String name = NamePackage;
                        if (!pathPackage.substring(pathPackage.lastIndexOf("/")+1).equals(NamePackage)) { 
                            name = NamePackage.substring(pathPackage.indexOf(NamePackage)); // take the name of classe
                            name = name.replace("/", "."); 
                        }
                        Class kilasy = Class.forName(name+"."+allFile.getName().substring(0, allFile.getName().lastIndexOf(".class")));// package.classeName
                        valiny.add(kilasy);
                    }    
                }
        }
        return valiny;
    }
    
    
}
