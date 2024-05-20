package br.com.fagnerleando.nikabot.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

public class GestorDePastas {

    private String pastaPadrao = "C:\\PrintGO\\";
    private String endereco;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPastaPadrao() {
        return pastaPadrao;
    }

    public void setPastaPadrao(String pastaPadrao) {
        this.pastaPadrao = pastaPadrao;
    }

    public void criaPastaPadrao(){
    
           File directory = new File(this.getPastaPadrao());
            
            if (!directory.exists()){
                
                directory.mkdir();
               
                System.out.println("PASTA PADRÃO NÃO EXISTE");

            }else{
                
                System.out.println("PASTA PADRÃO JÁ EXISTE");

            }
    
    }

    public boolean verificaExistePasta(String nomePasta){
    
            boolean resultadoP = false;
        
            String pasta = getPastaPadrao()+nomePasta;
            
            File directory = new File(pasta);
            
            if (!directory.exists()){
                
                resultadoP = false;
                System.out.println("PASTA NÃO EXISTE");

            }else{
                
                resultadoP = true;
                System.out.println("PASTA EXISTE");

            }
            
        try {
            Files.list(new File(getPastaPadrao()).toPath())
                    .forEach(path -> {
                           
                    });
        } catch (IOException ex) {
           System.out.println("Deu erro => " + ex);
        }
    
    
            return  resultadoP;
            
    }

    public ArrayList<Campanha> alteraNomePastaCampanha(ArrayList<Campanha> lista_de_campanhas , String idCampanhaAtualizacaoAtual ,String nomePastaAtual, String nomePastaAlterar){
            
               
                File pastaAtual = new File(getPastaPadrao()+nomePastaAtual);
                File pastaAlterar = new File(getPastaPadrao()+nomePastaAlterar);
            
            if((verificaExistePasta(nomePastaAtual) == true) && (verificaExistePasta(nomePastaAlterar) == false)){
                
                System.out.println("ENTROU NA VERIFICAÇÃO ");
          
                lista_de_campanhas.forEach(item->{
       
                if(item.getNome().toLowerCase().replace(' ', '_').equals(idCampanhaAtualizacaoAtual)){
                
                    item.setNome(nomePastaAlterar);
                    System.out.println("ALTEROU NOME NA LISTA ");
                                        
                }
 
                if (pastaAtual.renameTo(pastaAlterar)) {
                    
                    System.out.println("Directory renamed successfully");
                    
                    
                } else {
                    System.out.println("Failed to rename directory");
                }
                            
            
            });
                
//                reconheceStatusCadastroCampanha(1);
                
            }else{
            
            
             System.out.println("NÃO VALIDOU");
            
             
            }
                        
               criaPastaPadrao();
            
            return lista_de_campanhas;
                
    }
           
    
}
