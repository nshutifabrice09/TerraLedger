package com.backend.terraLedger.service;

import com.backend.terraLedger.model.Notification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImplementation implements NotificationService{
    @Override
    public List<Notification> getAllNotifications() {
        return null;
    }

    @Override
    public Notification getNotificationById(Long id) {
        return null;
    }

    @Override
    public Notification saveNotification(Notification notification) {
        return null;
    }

    @Override
    public Notification updateNotification(Long id, Notification notification) {
        return null;
    }

    @Override
    public void deleteNotificationById(Long id) {

    }
}
