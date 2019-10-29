/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacote_Util;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author EduardoCFN
 */
public class Mensagem implements Serializable{
    
    private String operacao;
    private Status status;
    
    /*
    chave : Object
    */
    
    Map<String, Object> params;
    
    public Mensagem(String operacao)
    {
        this.operacao = operacao;
        params = new HashMap<>();
    }
    
    public String getOperacao()
    {
        return operacao;
    }
    
    public void setStatus(Status s)
    {
        this.status = s;
    }
    
    public Status getStatus()
    {
        return status;
    }
    
    
    /*
        "NOME" --> "José"
        "IDADE" --> 35
    */
    public void setParam( String chave, Object valor)
    {
        params.put(chave, valor);
    }
    
    public Object getParam( String chave)
    {
        return params.get(chave);
    }
    
    @Override
    public String toString()
    {
        String m = "Operacao: " + operacao;
        m += "\nStatus: " + status;
        m += "\nParâmetros:\n";
        
        for (String p : params.keySet())
        {
            m += "\n" + p + ": " + params.get(p);
        }
        
        return m;
    }
    
}