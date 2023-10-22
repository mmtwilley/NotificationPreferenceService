package com.manning.application.notification.NotificationPreferencesServices.formatters;

import com.manning.application.notification.NotificationPreferencesServices.entities.NotificationPreferences;
import com.manning.application.notification.NotificationPreferencesServices.model.NotificationPreferencesResponse;
import org.springframework.stereotype.Component;

@Component
public class NotificationPreferenceFormatter {

    public NotificationPreferencesResponse formatNotificationResponse(NotificationPreferences notificationPreferences){
        NotificationPreferencesResponse notificationPreferencesResponse = new NotificationPreferencesResponse();
        if(notificationPreferencesResponse != null && notificationPreferences.getId() != null){
            notificationPreferences.setEmailPreferenceFlag(notificationPreferences.isSmsPreferenceFlag());
            notificationPreferencesResponse.setSmsPreferenceFlag(notificationPreferences.isSmsPreferenceFlag());
            notificationPreferencesResponse.setEmailAddress(notificationPreferences.getEmailaddress());
            notificationPreferencesResponse.setEmailAddress(notificationPreferencesResponse.getEmailAddress());
            notificationPreferencesResponse.setStatus("SUCCESS");
            notificationPreferencesResponse.setStatusDescription("Notification Received Successfully");
        } else{
            notificationPreferencesResponse.setStatus("ERROR");
            notificationPreferencesResponse.setStatusDescription("Notification Failed");
        }
        return notificationPreferencesResponse;
    }

}
