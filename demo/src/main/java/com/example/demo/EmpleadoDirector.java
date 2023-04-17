package com.example.demo;

public class EmpleadoDirector {
    private GestionDocumentos documentoNuevo;

    public EmpleadoDirector(GestionDocumentos documentoNuevo){
        this.documentoNuevo = documentoNuevo;
    }

    public String getDocumento(){
        return "Informe del DIRECTOR: "+ documentoNuevo.getDocumento();
    }

}
