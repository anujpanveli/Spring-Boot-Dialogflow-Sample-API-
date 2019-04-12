package com.dialogflow.app.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dialogflow.app.model.fulfillmentText;
import com.dialogflow.app.service.AppService;

@RestController
public class AppController {
		   
       private final AppService appService;
       
       @Autowired
       public AppController(AppService appService) {
           this.appService = appService;
       }        
	
       @RequestMapping("feedData/dialogflow")
   	public fulfillmentText getData() throws ParseException {
   		return  this.appService.getData();		
   	}	
}
