
package br.com.fagnerleando.nikabot.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class Campanha {
    
  private String idCampanha;
  private String nome;
  private String dtInicial;
  private String dtFinal;
  private ArrayList<LocalDate> lista_de_datas = new ArrayList<>();
  private ArrayList<LocalDateTime> lista_de_datas_programadas = new ArrayList<LocalDateTime>();
  private boolean statusCriarPasta;
  private boolean statusCampanha;
  private ArrayList<String> listaDeEnderecoPastasCampanha = new ArrayList<>();
  private ArrayList<ProgramacaoCampanha> listaDeProgramacaoCampanha = new ArrayList<>();
      
  public Campanha(String idCampanha, String nome, String dtInicial, String dtFinal, ArrayList<LocalDate> lista_de_datas, boolean statusCriarPasta, boolean statusCampanha) {
        this.idCampanha = idCampanha;
        this.nome = nome;
        this.dtInicial = dtInicial;
        this.dtFinal = dtFinal;
        this.lista_de_datas = lista_de_datas;
        this.statusCriarPasta = statusCriarPasta;
        this.statusCampanha = statusCampanha;        
                
    }
 
  public Campanha(){
    }

    public boolean isStatusCampanha() {
        return statusCampanha;
    }

    public void setStatusCampanha(boolean statusCampanha) {
        this.statusCampanha = statusCampanha;
    }
    
  public String getIdCampanha() {
        return idCampanha;
    }

  public void setIdCampanha(String idCampanha) {
        this.idCampanha = idCampanha;
    }

  public String getNome() {
        return nome;
    }

  public void setNome(String nome) {
        this.nome = nome;
    }

  public String getDtInicial() {
        return dtInicial;
    }

  public void setDtInicial(String dtInicial) {
        this.dtInicial = dtInicial;
    }

  public String getDtFinal() {
        return dtFinal;
    }

  public void setDtFinal(String dtFinal) {
        this.dtFinal = dtFinal;
    }

  public ArrayList<LocalDate> getLista_de_datas() {
        return lista_de_datas;
    }

  public void setLista_de_datas(ArrayList<LocalDate> lista_de_datas) {
        this.lista_de_datas = lista_de_datas;
    }
    
  public void novaAcao (){
    }

  public ArrayList<String> getListaDeEnderecoPastasCampanha() {
        return listaDeEnderecoPastasCampanha;
    }

  public void setListaDeEnderecoPastasCampanha(ArrayList<String> listaDeEnderecoPastasCampanha) {
        this.listaDeEnderecoPastasCampanha = listaDeEnderecoPastasCampanha;
    }
    
  public boolean isStatusCriarPasta() {
        return statusCriarPasta;
    }

  public void setStatusCriarPasta(boolean statusCriarPasta) {
        this.statusCriarPasta = statusCriarPasta;
    }
  
  public void criaListaDataHora(){
        
    int diaDtInicial = Integer.parseInt(getDtInicial().substring(0, 2));
    int mesDtInicial = Integer.parseInt(getDtInicial().substring(3, 5));
    int anoDtInicial = Integer.parseInt(getDtInicial().substring(6, 10));

    int diaDtFinal = Integer.parseInt(getDtFinal().substring(0, 2));
    int mesDtFinal = Integer.parseInt(getDtFinal().substring(3, 5));
    int anoDtFinal = Integer.parseInt(getDtFinal().substring(6, 10));
    
    System.out.println(getDtInicial() + " | " + getDtFinal());
        
    System.out.println(getDtInicial().substring(0, 2) + " | " + getDtInicial().substring(3, 5) + " | " + getDtInicial().substring(6, 10) 
            + " | " + getDtFinal().substring(0, 2) + " | " + getDtFinal().substring(3, 5) + " | " + getDtFinal().substring(6, 10));
        
    LocalDate dataInicial = LocalDate.of(anoDtInicial,mesDtInicial,diaDtInicial);
    LocalDate dataFinal = LocalDate.of(anoDtFinal,mesDtFinal,diaDtFinal);
        
        
        /* MONTA NOME DA PASTA DA CAMPANHA */
        setNome(getNome().toLowerCase().replace(" ", "_"));
        File directory = new File("C:\\PrintGO\\" + getNome());        
        if (!directory.exists()){ directory.mkdir(); }
        
        DateTimeFormatter formatterDataInicialCompleta = DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm_ss");        
        String timeStampLDT = LocalDateTime.now().format(formatterDataInicialCompleta);
        
        
        for (LocalDate date = dataInicial; date.isBefore(dataFinal); date = date.plusDays(1)) {    
       
            getLista_de_datas().add(date);
            setIdCampanha(timeStampLDT);        

            String dt_pasta = date.getDayOfMonth() + "_" + date.getMonthValue() + "_" + date.getYear();
            
        // cria pastas de cada data se marcado
        
        if(isStatusCriarPasta() == true){
                        
            String pasta = "C:\\PrintGO\\" + getNome()+ "\\"+ dt_pasta;
            getListaDeEnderecoPastasCampanha().add(pasta);
            File directory2 = new File(pasta.replace(' ', '_'));
            
            criaPastas(directory2, dt_pasta);
           
        }
        
        }   

        // CRIA A ULTIMA DATA DA PASTA
        getLista_de_datas().add(dataFinal);
        String dt_pasta = dataFinal.getDayOfMonth() + "_" + dataFinal.getMonthValue() + "_" + dataFinal.getYear();        
        String pasta = "C:\\PrintGO\\" + getNome()+ "\\"+ dt_pasta;
        getListaDeEnderecoPastasCampanha().add(pasta);
        File directory2 = new File(pasta.replace(' ', '_'));
        criaPastas(directory2, dt_pasta);
        
        String valor = getListaDeEnderecoPastasCampanha().get(getListaDeEnderecoPastasCampanha().size() - 1).replace("C:\\PrintGO\\"+getNome()+"\\", "").trim();
      
        Stream<Path> walk;
      
        try {
          
          walk = Files.walk(Paths.get("C:\\PrintGO\\" + getNome()));
                    
                  walk.filter(Files::isRegularFile).forEach(item-> {
        
                  if(!item.getFileName().toString().contains(valor)){
                  
                      System.out.println(item.getFileName().toString() + " | " + valor);
                      
                      File baobao = new File("C:\\PrintGO\\" + getNome()+"\\" + item.getFileName());
                        if (baobao.delete()) { 
                          System.out.println("Deleted the file: " + baobao.getName());
                        } else {
                          System.out.println("Failed to delete the file.");
                        }
                                            
                  }else{
                                        
                       Path escolhido = Paths.get("C:\\PrintGO\\" + getNome()+"\\" + item.getFileName());
                                            
                      try {
                          Files.setAttribute(escolhido, "dos:hidden", true, LinkOption.NOFOLLOW_LINKS);
                      } catch (IOException ex) {
                          Logger.getLogger(Campanha.class.getName()).log(Level.SEVERE, null, ex);
                      }
                  
                  }
                
        });
                  
      } catch (IOException ex) {
          Logger.getLogger(Campanha.class.getName()).log(Level.SEVERE, null, ex);
      }
              
    }
     
  public void criaPastas(File directory2 , String dt_pasta ){
  
      if (!directory2.exists()){
                directory2.mkdir();
          
        try {

             File myObj = new File("C:\\PrintGO\\" + getNome()+ "\\"+dt_pasta+".json");

             if (myObj.createNewFile()) {

               ObjectMapper mapper = new ObjectMapper();

               mapper.writeValue(new File("C:\\PrintGO\\" + getNome()+ "\\"+dt_pasta+".json"), this);

//               String jsonInString = mapper.writeValueAsString(this);
               mapper.writeValueAsString(this);

             } else {

               System.out.println("File already exists.");

             }

    } catch (IOException e) {
      System.out.println("An error occurred." + e);
    }
                                    
        }
  
  }
  
  public ArrayList<Campanha> AtualizaCampanha (
          ArrayList<Campanha> oldListCampanhaAtualizada,
          boolean atualizaNomePasta, String idCampanhaAtualizacaoAtual,
          String nomePastaAtual,String nomePastaAlterar, boolean statusCamapanhaMark){
  
      ArrayList<Campanha> newListCampanhaAtualizada = new ArrayList<>();
      
      oldListCampanhaAtualizada.stream().forEach(e->{
          
           System.out.println(e.getIdCampanha()+ " ********** " + idCampanhaAtualizacaoAtual);
                    
      if(e.getIdCampanha().contains(idCampanhaAtualizacaoAtual)){
     
          System.out.println("++++++++++++++++++++++++++" + e.isStatusCampanha() + "++++++++++++++++++++++++++++++++");          
                e.setStatusCampanha(statusCamapanhaMark);
          
      }
      
      });
       
      if(atualizaNomePasta){
      
      GestorDePastas novoGestor = new GestorDePastas();
           
      newListCampanhaAtualizada = novoGestor.alteraNomePastaCampanha(oldListCampanhaAtualizada, 
              idCampanhaAtualizacaoAtual, 
              nomePastaAtual, nomePastaAlterar);
       
      }
                
      return newListCampanhaAtualizada;
  }
  
}
