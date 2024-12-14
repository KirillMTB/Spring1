package org.example;

public class UserService {
    private SmsService smsService;

    public SmsService getSmsService() {
        return smsService;
    }

    public void setSmsService(SmsService smsService) {
        this.smsService = smsService;
    }

    public void notifyUser(String text) {
        smsService.sendSms(text);
    }



}
