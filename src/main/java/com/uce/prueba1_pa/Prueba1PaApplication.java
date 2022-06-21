package com.uce.prueba1_pa;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.prueba1_pa.modelo.Propietario;
import com.uce.prueba1_pa.modelo.Vehiculo;
import com.uce.prueba1_pa.service.IGestorService;
import com.uce.prueba1_pa.service.IPropietarioService;
import com.uce.prueba1_pa.service.IVehiculoService;

@SpringBootApplication
public class Prueba1PaApplication implements CommandLineRunner{

	@Autowired 
	private IGestorService gestorService;

	@Autowired
	private IPropietarioService propietarioService;

	@Autowired
	private IVehiculoService vehiculoService;

	public static void main(String[] args) {
		SpringApplication.run(Prueba1PaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Vehiculo vehiculo = new Vehiculo();
		Propietario propietario	= new Propietario();

		// 1.
		vehiculo.setMarca("Toyota");
		vehiculo.setPlaca("PPP-132");
		vehiculo.setPrecio(new BigDecimal("10300"));
		vehiculo.setTipo("L");

		this.vehiculoService.ingresarVehiculo(vehiculo);

		// 2.
		vehiculo.setMarca("Ferrari");
		vehiculo.setPrecio(new BigDecimal("20300"));

		this.vehiculoService.actualizar(vehiculo);

		// 3.
		propietario.setApellido("Alonso");
		propietario.setCedula("176372857-8");
		propietario.setFechaNacimiento(LocalDateTime.of(1975, 02,22,01,01,01));
		propietario.setNombre("Fernando");

		this.propietarioService.ingresarPropietario(propietario);

		// 4.
		this.gestorService.matricularVehiculo("176372857-8", "PPP-132");

		
	}

}
