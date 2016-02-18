/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.jass2125.pesoa.jpa.core.servlets;

import io.github.jass2125.pesoa.jpa.core.beans.IManagerPerson;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;

/**
 * @author Anderson Souza 
 * @since 11:59:22, 16-Feb-2016 
 * Package io.github.jass2125.pesoa.jpa.core.servlets
 * Project Name pesoa-jpa
 * Encoding UTF-8
 * File Name RegisterPerson.java
 */

@WebServlet(urlPatterns = {"/add"})
public class RegisterPersonServlet extends HttpServlet {
    
    @EJB
    private IManagerPerson p;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean multiPart = ServletFileUpload.isMultipartContent(request);
        if(multiPart){
            ServletFileUpload upload = new ServletFileUpload();
            try{
                FileItemIterator it = upload.getItemIterator(request);
                while(it.hasNext()){
                    FileItemStream stream = it.next();
                    String fieldName = stream.getFieldName();
                    String name = stream.getName();
                    if( fieldName.equals("img") ) {
                        byte bytes[] = IOUtils.toByteArray(stream.openStream());
                    }
                }
                
                response.sendRedirect("load.jsp");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
        
        
        
        
        
        
//        Part name = request.getPart("name");
////        String namePart = name.getName();
//        Part birthday = request.getPart("birthday");
//        Part img = request.getPart("img");
//        String n = String.valueOf(name);
//        
//        response.getWriter().println("Name: " + name);
//        response.getWriter().println("Name To String: " + name.toString());
//        
//        response.getWriter().println("Birthday:" + birthday);
//        response.getWriter().println("Birthday To String: " + birthday.toString());
//        
//        response.getWriter().println("Imagem: " + img);
//        response.getWriter().println("Imagem To String:" + img.toString());
//        
//        InputStream stream = img.getInputStream();
//        img.write(img.getName());
//        
//        
//        response.getWriter().println("N To String:" + n.toString());
//        
    }
    
    

}
