package com.anthony.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.anthony.springboot.di.app.models.domain.ItemFactura;
import com.anthony.springboot.di.app.models.domain.Producto;
import com.anthony.springboot.di.app.models.service.IService;
import com.anthony.springboot.di.app.models.service.MyService;

@Configuration
public class AppConfig {


	@Primary
	@Bean("serviciosimple")
	public IService registrarMiServicio() {
		return new MyService();
	}
	
	@Bean("service2")
	public IService registrarMiServicioComplejo() {
		return new MyService();
	}
	
	@Bean("itemsFatura")
	public List<ItemFactura> registrarItems(){
		Producto producto1 = new Producto("Camara Sony",100);
		Producto producto2 = new Producto("Notebook Asus",150);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 4);
		
		return Arrays.asList(linea1,linea2);
	}
	
	@Bean("itemsFaturaOfficina")
	@Primary
	public List<ItemFactura> registrarItemsOfficina(){
		Producto producto1 = new Producto("Monitor Sony",300);
		Producto producto2 = new Producto("Notebook Apple",500);
		Producto producto3 = new Producto("Impresora HP",400);
		Producto producto4 = new Producto("Escritorio Officina",350);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 4);
		ItemFactura linea3 = new ItemFactura(producto3, 5);
		ItemFactura linea4 = new ItemFactura(producto4, 3);
		
		return Arrays.asList(linea1,linea2,linea3,linea4);
	}
}
