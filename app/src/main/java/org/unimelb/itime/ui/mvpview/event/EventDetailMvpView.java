package org.unimelb.itime.ui.mvpview.event;

import org.unimelb.itime.base.ItimeCommonMvpView;
import org.unimelb.itime.bean.Event;
import org.unimelb.itime.bean.TimeSlot;
import org.unimelb.itime.ui.mvpview.TaskBasedMvpView;

import java.sql.Time;
import java.util.List;

/**
 * Created by Paul on 4/09/2016.
 */
public interface EventDetailMvpView extends TaskBasedMvpView, ItimeCommonMvpView {
    void viewInCalendar();
    void viewInviteeResponse(TimeSlot timeSlot);
    void gotoGridView();
    void toResponse();
    void createEventFromThisTemplate(Event event);
    void proposeNewTimeslots(Event event);
    void viewUserProfile(String userUid);
    void onViewGoingInvitees();
    void toAllInvitees();
    void openUrl(String url);
    void showAllNote();
    void gotoConfirm(TimeSlot timeSlot);
    void onRejectAll();
    void remindEveryone();

    void gotoEdit();
    void onDelete();
}
