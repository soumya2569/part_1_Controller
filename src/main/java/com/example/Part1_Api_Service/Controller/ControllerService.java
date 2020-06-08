package com.example.Part1_Api_Service.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Part1_Api_Service.Model.ResponseMessage;


@RestController
@CrossOrigin
public class ControllerService {


	@RequestMapping(value = "/message", method = RequestMethod.GET)
	public ResponseMessage getResponseMessage(){
		ResponseMessage message =  new ResponseMessage();
		
		message.setMessageCode("MSG001");
		message.setMessageDesc("Welcome ! Hello World");		

		return message;


	}

}
