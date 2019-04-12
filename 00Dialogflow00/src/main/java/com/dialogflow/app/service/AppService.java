package com.dialogflow.app.service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.dialogflow.app.model.data;
import com.dialogflow.app.model.fulfillmentText;
import com.dialogflow.app.model.payload;
import com.dialogflow.app.model.speech;

@Service
public class AppService  extends MappingJackson2HttpMessageConverter {

	private static AppService ourInstance = new AppService();
    
    public static AppService getInstance() {
        return ourInstance;
    }

    private AppService() {
    	setPrettyPrint(true);
    }
	
	public fulfillmentText getData() throws ParseException{
		
		String websiteResponse = "http://localhost:5555/out_bound/id/6206";
		
		RestTemplate restTemplate = new RestTemplate();
        String result 	= 	restTemplate.getForObject(websiteResponse, String.class);               
                    
        JSONObject root = new JSONObject(result);
                
        BigDecimal outBoundId 	=  root.getBigDecimal("outBoundId");        
		String fulfillText 		=  root.getString("message");        
		
		fulfillmentText fft = new fulfillmentText();
		speech spch = new speech();
	
		data data = new data();
		payload payload = new payload();				
		
		fft.setfulfillmentText(fulfillText);		
				
		fft.setPayload(payload);
		payload.setData(data);
		data.setSpeech(fulfillText);
		//spch.setSpeech(fulfillText);
								
		return fft;
				     
	}	
}
