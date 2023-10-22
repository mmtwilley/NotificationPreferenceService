package com.manning.application.notification.NotificationPreferencesServices.controllers;

import com.manning.application.notification.NotificationPreferencesServices.model.NotificationPreferencesRequest;
import com.manning.application.notification.NotificationPreferencesServices.model.NotificationPreferencesResponse;
import com.manning.application.notification.NotificationPreferencesServices.services.NotificationPreferenceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification/preferences")
@Api(value="NotificationPreferencesService", description="Operations pertaining to managing Customer Notification Preferences")
public class NotificationPreferencesController {

    @Autowired
    private NotificationPreferenceService notificationPreferenceService;

    @PostMapping
    @ApiOperation(value = "Get the Notification Preferences for a Customer", response = NotificationPreferencesResponse.class)
    public NotificationPreferencesResponse getNotificationPreferences(@RequestBody NotificationPreferencesRequest notificationPreferencesRequest) {
        NotificationPreferencesResponse notificationPreferencesResponse=notificationPreferenceService.getNotificationPreferences(notificationPreferencesRequest);
        return notificationPreferencesResponse;
    }
}
