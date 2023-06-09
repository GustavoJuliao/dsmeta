package com.devsuper.dsmeta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsuper.dsmeta.entities.Sale;
import com.devsuper.dsmeta.services.SaleServices;
import com.devsuper.dsmeta.services.SmsService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleServices service;
	
	@Autowired
	private SmsService smsService;
	
	@GetMapping
	public Page<Sale> findSales(@RequestParam(value="minDate",defaultValue="") String minDate, 
			@RequestParam(value="maxDate",defaultValue="") String maxDate,
			Pageable pageable){
		
		return service.findSales(minDate,maxDate,pageable);
	}
	
	@GetMapping("/{saleId}/notification")
	public void notifySms(@PathVariable Long saleId){
		smsService.sendSms(saleId);
		}
	
	
	
	
}
