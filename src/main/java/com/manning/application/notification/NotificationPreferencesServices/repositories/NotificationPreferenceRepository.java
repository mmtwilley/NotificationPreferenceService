package com.manning.application.notification.NotificationPreferencesServices.repositories;

import com.manning.application.notification.NotificationPreferencesServices.entities.NotificationPreferences;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationPreferenceRepository extends JpaRepository<NotificationPreferences, Long> {
    NotificationPreferences findbyCustomerId(String customerid);
}
