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
<<<<<<< Updated upstream
       public static String ClassWithAnnotation(String url){
           return Utilitaire.class.getClassLoader().getResource(Utilitaire.class.getName()+".class").getPath();
       }
=======
    public static List<Class> getAllClasses(String pathPackage,String NamePackage) throws ClassNotFoundException{ 
        System.out.println(pathPackage);
        File file = new File(pathPackage);
        File[] listfile = file.listFiles();
        List<Class> valiny = new ArrayList<>();
            for (File allFile : listfile) {
                System.out.println(".class "+allFile.getName());
                if (allFile.isDirectory()) { // if not file package -> remake the function
                    List<Class> recusrsive =  Utilitaire.getAllClasses(pathPackage+"/"+allFile.getName(), NamePackage);
                    for (Class allClasses : recusrsive) {
                        valiny.add(allClasses);
                    }
                } else {
                    if (allFile.getName().endsWith(".class")) {
                        String name = NamePackage;
                        System.out.println("test "+pathPackage.substring(pathPackage.lastIndexOf("/")+1));
                        System.out.println("namePackage:" + NamePackage);
                        if (!pathPackage.substring(pathPackage.lastIndexOf("/")+1).equals(NamePackage)) { 
                            name = pathPackage.substring(pathPackage.indexOf(NamePackage)); // take the name of classe
<<<<<<< Updated upstream
//                            name = NamePackage.substring(pathPackage.)
                            System.out.println("NewName: "+name);
=======
>>>>>>> Stashed changes
                            name = name.replace("/", "."); 
                            System.out.println("allFile + "+allFile.getName());

                        }
                        Class kilasy = Class.forName(name+"."+allFile.getName().substring(0, allFile.getName().lastIndexOf(".class")));// package.classeName
                        valiny.add(kilasy);
                    }    
                }
        }
        return valiny;
    }
    
//                            name = NamePackage.substring(pathPackage.)
//                            System.out.println("NewName: "+name);
//                            name = name.replace("/", "."); 
//                        }
//                        Class kilasy = Class.forName(name+"."+allFile.getName().substring(0, allFile.getName().lastIndexOf(".class")));// package.classeName
//                        valiny.add(kilasy);
//                    }    
//                }
//        }
//        return valiny;
//    }
    
//                            name = NamePackage.substring(pathPackage.)
//                            System.out.println("NewName: "+name);
//                            name = name.replace("/", "."); 
//                        }
//                        Class kilasy = Class.forName(name+"."+allFile.getName().substring(0, allFile.getName().lastIndexOf(".class")));// package.classeName
//                        valiny.add(kilasy);
//                    }    
//                }
//        }
//        return valiny;
//    }
    
//                            name = NamePackage.substring(pathPackage.)
//                            System.out.println("NewName: "+name);
//                            name = name.replace("/", "."); 
//                        }
//                        Class kilasy = Class.forName(name+"."+allFile.getName().substring(0, allFile.getName().lastIndexOf(".class")));// package.classeName
//                        valiny.add(kilasy);
//                    }    
//                }
//        }
//        return valiny;
//    }
    
//                            name = NamePackage.substring(pathPackage.)
//                            System.out.println("NewName: "+name);
//                            name = name.replace("/", "."); 
//                        }
//                        Class kilasy = Class.forName(name+"."+allFile.getName().substring(0, allFile.getName().lastIndexOf(".class")));// package.classeName
//                        valiny.add(kilasy);
//                    }    
//                }
//        }
//        return valiny;
//    }
    
//    public static List<Class> getAllClasse(String path){
//        List<Class> valiny = new ArrayList<>();
//        File file = new File(path);
//        File[] files = file.listFiles();
//        for (File file1 : files) {
//            if (file1.getName().equals("model")) {
////                System.out.println("package principal: "+file1.getName() );
////               System.out.println("url vaovao : "+path);
//                String paths = file1.getPath().toString();
//                String newpaths = paths.replace("/", ".");
//                System.out.println("news paths :"+newpaths);
//                
//            }
//        }
//        return valiny;
//    }
//    
    
>>>>>>> Stashed changes
}
