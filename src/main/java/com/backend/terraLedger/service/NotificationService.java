package com.backend.terraLedger.service;

import com.backend.terraLedger.model.Notification;
import org.aspectj.weaver.ast.Not;

import java.util.List;

public interface NotificationService {
    List<Notification> getAllNotifications();
    Notification getNotificationById(Long id);
    Notification saveNotification(Notification notification);
    Notification updateNotification(Long id, Notification notification);
    void deleteNotificationById(Long id);
}
