
package br.com.fagnerleando.nikabot.util;

import java.sql.Time;
import java.util.ArrayList;

public class ProgramacaoCampanha {

   private String idProgramacaoCampanha;
   private String idCampanha;
   private String nomeCampanha;
   private boolean statusCampanha;
   private ArrayList<Time> listaDeHorarios = new ArrayList<>();
   
   
   public ProgramacaoCampanha(){
   
   }

    public boolean isStatusCampanha() {
        return statusCampanha;
    }

    public void setStatusCampanha(boolean statusCampanha) {
        this.statusCampanha = statusCampanha;
    }
   
   
    
   
    public String getIdProgramacaoCampanha() {
        return idProgramacaoCampanha;
    }

    public void setIdProgramacaoCampanha(String idProgramacaoCampanha) {
        this.idProgramacaoCampanha = idProgramacaoCampanha;
    }

    public String getIdCampanha() {
        return idCampanha;
    }

    public void setIdCampanha(String idCampanha) {
        this.idCampanha = idCampanha;
    }
    
    public String getNomeCampanha() {
        return nomeCampanha;
    }

    public void setNomeCampanha(String idCampanha) {
        this.nomeCampanha = nomeCampanha;
    }
    
    public ArrayList<Time> getListaDeHorarios() {
        return listaDeHorarios;
    }

    public void setListaDeHorarios(ArrayList<Time> listaDeHorarios) {
        this.listaDeHorarios = listaDeHorarios;
    }
        
}