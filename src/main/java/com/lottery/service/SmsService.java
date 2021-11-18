package com.lottery.service;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

import com.lottery.model.SmsPojo;
import com.twilio.Twilio;
import com.twilio.exception.TwilioException;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
@Component
public class SmsService {
     private final String ACCOUNT_SID ="AC17079e85e94e14e57694715e7b8ef4b2";

    private final String AUTH_TOKEN = "eeaadce83c45612f3dc76d6f9bee48a1";

    private final String FROM_NUMBER = "+17625838103";

    public void send(SmsPojo sms) throws ParseException {
    	try {
    	Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
      
    	System.out.println("hello world2");
        int min = 100000;  
         int max = 999999; 
        int number=(int)(Math.random()*(max-min+1)+min);
        System.out.println(number);
        
        String msg ="Your OTP - "+number+ " please verify this OTP in your Application by Er Prince kumar Technoidentity.com";
        System.out.println(msg);
        System.out.println("hello world");
        Message message = Message.creator(new PhoneNumber(sms.getPhoneNumber()), new PhoneNumber (FROM_NUMBER), msg).create();
        		
                
        System.out.println(message);

    }
    	catch (TwilioException e) {
            System.out.println("An error occured from twillio."+e.getMessage());
        }}

    public void receive(MultiValueMap<String, String> smscallback) {
   
    }

}
