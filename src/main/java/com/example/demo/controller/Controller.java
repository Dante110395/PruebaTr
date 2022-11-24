package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Ordenes;
import com.example.demo.objects.SaveOrden;
import com.example.demo.services.OrdenesService;
import com.example.demo.services.ProductosServices;
import com.example.demo.services.PruebaServices;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/ContaSystem")
public class Controller {

    Logger logger= LoggerFactory.getLogger(Controller.class);

    @Autowired
	private PruebaServices pruebaServices;

	@Autowired
	private OrdenesService ordenesService;

	@Autowired
	private ProductosServices productosServices;

    /*@GetMapping("/prueba")
	public ResponseEntity<String> getPrueba(){
		logger.info(" Se consume método: getPrueba ");
		return ResponseEntity.ok(pruebaServices.saveRole());
	}*/

	@GetMapping("/saveSucursal")
	public ResponseEntity<Boolean> saveSucural(){
		logger.info(" Se consume método: saveSucural ");
		return ResponseEntity.ok(pruebaServices.saveSucursal());
	} 

	@PostMapping("/saveOrden")
	public ResponseEntity<Boolean> saveOrden(@RequestBody SaveOrden saved){

		logger.info("Se consume método: saveOrden");
		long startTime = System.currentTimeMillis();
		Boolean resp = ordenesService.saveOrdenes(saved);
		long endTime = System.currentTimeMillis();
		logger.info("tiempo: {} milisegundos",(endTime - startTime));
		return ResponseEntity.ok(resp);
	}	

	@GetMapping("/getOrden/{ordenId}")
	public ResponseEntity<Ordenes> getOrden(@PathVariable Long ordenId ){
		logger.info(" Se consume método: saveSucural ");
		long startTime = System.currentTimeMillis();
		Ordenes resp = ordenesService.getOrdenes(ordenId);
		long endTime = System.currentTimeMillis();
		logger.info("tiempo: {} milisegundos",(endTime - startTime));
		return ResponseEntity.ok(resp);
	} 

	@PutMapping("/updatePrice/{claveProd}")
	public ResponseEntity<Boolean> updatePrice (@PathVariable String claveProd,Float precio ){
		logger.info(" Se consume método: updatePrice ");
		long startTime = System.currentTimeMillis();
		Boolean resp = productosServices.updatePrecio(claveProd, precio);
		long endTime = System.currentTimeMillis();
		logger.info("tiempo: {} milisegundos",(endTime - startTime));
		return ResponseEntity.ok(resp);
	}

    
}
