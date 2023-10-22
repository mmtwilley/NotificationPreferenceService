package com.manning.application.notification.NotificationPreferencesServices.services;


import com.manning.application.notification.NotificationPreferencesServices.entities.NotificationPreferences;
import com.manning.application.notification.NotificationPreferencesServices.formatters.NotificationPreferenceFormatter;
import com.manning.application.notification.NotificationPreferencesServices.model.NotificationPreferencesRequest;
import com.manning.application.notification.NotificationPreferencesServices.model.NotificationPreferencesResponse;
import com.manning.application.notification.NotificationPreferencesServices.repositories.NotificationPreferenceRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationPreferenceService {

    @Autowired
    NotificationPreferenceRepository notificationPreferenceRepository;

    @Autowired
    NotificationPreferenceFormatter notificationPreferenceFormatter;

    public NotificationPreferencesResponse getNotificationPreferences(@RequestBody NotificationPreferencesRequest notificationPreferencesRequest){
        NotificationPreferences notificationPreference = notificationPreferenceRepository.findbyCustomerId(notificationPreferencesRequest.getCustomerId());
        NotificationPreferencesResponse notificationPreferencesResponse = notificationPreferenceFormatter.formatNotificationResponse(notificationPreference);
        return notificationPreferencesResponse;
    }
}
