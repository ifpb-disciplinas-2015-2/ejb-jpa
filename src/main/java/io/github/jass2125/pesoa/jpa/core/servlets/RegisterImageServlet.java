/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.pesoa.jpa.core.servlets;

import io.github.jass2125.pesoa.jpa.core.beans.IManagerImage;
import io.github.jass2125.pesoa.jpa.core.business.Images;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;

/**
 * @author Anderson Souza
 * @since 11:59:22, 16-Feb-2016 Package
 * io.github.jass2125.pesoa.jpa.core.servlets Project Name pesoa-jpa Encoding
 * UTF-8 File Name RegisterPerson.java
 */
@WebServlet(urlPatterns = {"/add"})
@MultipartConfig(location = "/tmp")
public class RegisterImageServlet extends HttpServlet {

    @EJB
    private IManagerImage manager;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            byte img[] = getImage(request);
            response.getOutputStream().write(img);
            response.getOutputStream().flush();
            manager.add(new Images(img));
        } catch (Exception e) {
            e.printStackTrace();
        }
}
    

//    public void verify(HttpServletRequest req) throws IOException, ServletException {
//        List<Part> parts = (List<Part>) req.getParts();
//        for (Part it : parts) {
//            InputStream stream = it.getInputStream();
//            String value = IOUtils.toString(stream);
//            System.out.println("Name: " + it.getName());
//            System.out.println("Header: " + stream.toString());
//
//        }
//    }

    public byte[] getImage(HttpServletRequest req) throws IOException, ServletException {
        List<Part> parts = (List<Part>) req.getParts();
        for (Part it : parts) {
            if (it.getName().equals("img")) {
                InputStream stream = it.getInputStream();
                return IOUtils.toByteArray(stream);
            }
        }
        return null;
    }

}
