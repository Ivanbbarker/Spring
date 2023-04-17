package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		//Cargar archivo Spring XML. En el parentesis debe ir el nombre exacto de nuestro archivo de configuracion XML
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext(
				"aplicationContext.xml");
		EmpleadoJefe empleado1 = new EmpleadoJefe();
		Empleados empleado2 = new EmpleadoJefe();

		empleado1.getResponsabilidades();

		Empleados Jaime = contexto.getBean("miEmpleado", EmpleadoJefe.class);
		System.out.println(
				"\nEl siguiente mensaje son las responsabilidades de un Empleado construido con Spring de tipo "
						+ Jaime.getResponsabilidades()+"\n");
		System.out.println(Jaime.getResponsabilidades());

		contexto.close();

	}

}
