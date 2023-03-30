/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ETU1905.framework.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import static java.lang.System.out;

/**
 *
 * @author Mirado
 */
public class FrontServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
<<<<<<< Updated upstream
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        String path = request.getContextPath();
        out.println(path);
        String[] chemin = Utilitaire.Utilitaire.SplitUrl(path);
        for (String test : chemin) {
            out.println(test);
            }
=======
    
    @Override
    public void init()throws ServletException {
        try {
            String url = FrontServlet.class.getClassLoader().getResource("").getPath();
          
            File fichier = new File(url);
            File[] filePackage = fichier.listFiles();
            for (File packageFile : filePackage) {
               
                if(packageFile.isDirectory()){
                    List<Class> listclass = Utilitaire.getAllClasses(url+packageFile.getName(), packageFile.getName());
                    for (Class allclasses : listclass) {
                       Method[] fonction = allclasses.getMethods(); // get all method in a classes
                        for (Method method : fonction) {
                            if (method.isAnnotationPresent(ClassAnnotation.class)) {
                                ClassAnnotation annotation = method.getAnnotation(ClassAnnotation.class);
                                String valueMethod = annotation.methodName();
                                Mapping map = new Mapping(url, valueMethod);
                                this.mappingclass.put(annotation.methodName(), map);
                            }
                        }
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        String path = request.getContextPath();
        for (Map.Entry<String, Mapping> entry : mappingclass.entrySet()) {
            out.println("Valeur map :"+entry.getKey());
>>>>>>> Stashed changes
        }
        
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
