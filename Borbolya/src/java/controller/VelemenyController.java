/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Foglalas;
import model.Velemeny;
import org.json.JSONArray;
import org.json.JSONObject;
import service.SzamolasService;
import service.VelemenyService;

/**
 *
 * @author Bjakushiki
 */
public class VelemenyController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        try (PrintWriter out = response.getWriter()) {
        VelemenyService service =  new VelemenyService();
        if(request.getParameter("task").equals("getAllVelemenyByID")){
                List<Velemeny> allVelemeny = service.getAllVelemenyByID(Integer.valueOf(request.getParameter("id")));
                JSONArray atkuldendo = new JSONArray();
                try{
                for(Velemeny v: allVelemeny){
                    JSONObject exObj = new JSONObject();
                    exObj.put("id", v.getId());
                    exObj.put("Apartmanid", v.getApartmanID());
                    exObj.put("nev", v.getNev());
                    exObj.put("email", v.getEmail());
                    exObj.put("ertekeles", v.getErtekeles());
                    exObj.put("tetszett", v.getTetszett());
                    exObj.put("nemTetszett", v.getNemTetszett());
                    exObj.put("megjegyzes", v.getMegjegyzes());
                    atkuldendo.put(exObj);
                    }
                }
                catch(Exception ex){
                        System.out.println(ex);
                        }
                out.write(atkuldendo.toString());
        }
        if(request.getParameter("task").equals("getAllVelemeny")){
        List<Velemeny> allVelemeny = service.getAllVelemeny();
        JSONArray atkuldendo = new JSONArray();
        try{
        for(Velemeny v: allVelemeny){
            JSONObject exObj = new JSONObject();
            exObj.put("Apartmanid", v.getApartmanID());
            exObj.put("nev", v.getNev());
            exObj.put("ertekeles", v.getErtekeles());
            exObj.put("megjegyzes", v.getMegjegyzes());
            atkuldendo.put(exObj);
            }
        }
        catch(Exception ex){
                System.out.println(ex);
                }
        out.write(atkuldendo.toString());
        }
        if(request.getParameter("task").equals("createVelemeny")){
                 
                String nev =request.getParameter("nev_in");
                Integer apartmanid = Integer.valueOf(request.getParameter("apartman_id"));
                String email  = request.getParameter("email_in");
                Double ertekeles = Double.valueOf(request.getParameter("ertekeles_in"));
                String tetszett  = request.getParameter("tetszett_in");
                String nemtetszett  = request.getParameter("nemtetszett_in");
                String megjegyzes = request.getParameter("megjegyzes_in");
                
                service.createVelemeny(nev, apartmanid, email, ertekeles, tetszett, nemtetszett,megjegyzes);

                
        }
        
        }
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
