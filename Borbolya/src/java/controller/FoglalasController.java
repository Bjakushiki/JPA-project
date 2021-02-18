/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Foglalas;
import model.Velemeny;
import org.json.JSONArray;
import org.json.JSONObject;

import service.FoglalasService;

/**
 *
 * @author Bjakushiki
 */
public class FoglalasController extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            FoglalasService service = new FoglalasService();
            if(request.getParameter("task").equals("createFoglalas")){
                String nev =request.getParameter("nev_in");
                Integer apartmanid = Integer.valueOf(request.getParameter("apartman_id"));
                String email  = request.getParameter("email_in");
                String telefon_in = request.getParameter("telefon_in");
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());                
                Date erkezes_in  = sdf.parse(request.getParameter("erkezes_in"));
                Date tavozas_in  = sdf.parse(request.getParameter("tavozas_in"));               
                Integer felnott_in = Integer.valueOf(request.getParameter("felnott_in"));
                Integer gyerek1_in = Integer.valueOf(request.getParameter("gyerek1_in"));
                Integer gyerek2_in = Integer.valueOf(request.getParameter("gyerek2_in"));
                Integer kisallat_in = Integer.valueOf(request.getParameter("kisallat_in"));
                String fizetesimod_in = request.getParameter("fizetesimod_in");
                service.createFoglalas(apartmanid, nev, email, telefon_in, erkezes_in, tavozas_in, felnott_in, gyerek1_in, gyerek2_in, kisallat_in, fizetesimod_in);
                
            }
            if(request.getParameter("task").equals("getAllFoglalasDatum")){
                List<Foglalas> allFoglalas = service.getAllFoglalasDatum(Integer.valueOf(request.getParameter("id")));
                JSONArray atkuldendo = new JSONArray();
                try{
                for(Foglalas v: allFoglalas){
                    JSONObject exObj = new JSONObject();
                    exObj.put("Apartmanid", v.getApartmanID());
                    exObj.put("erkezes", v.getErkezes());
                    exObj.put("tavozas", v.getTavozas());
                    atkuldendo.put(exObj);
                    }
                }
                catch(Exception ex){
                        System.out.println(ex);
                        }
                out.write(atkuldendo.toString());
        }
            
        }
        catch(Exception ex){
            System.out.println(ex.toString());
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
