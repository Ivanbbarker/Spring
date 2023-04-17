package com.example.demo;

public class EmpleadoJefe implements Empleados {


    public EmpleadoJefe() {
    }
    
    @Override
    public String getResponsabilidades(){
        return "Director ejecutivo";
    }

    @Override
    public String getDocumentos(){
        return "Documentos: ";
    }

}
