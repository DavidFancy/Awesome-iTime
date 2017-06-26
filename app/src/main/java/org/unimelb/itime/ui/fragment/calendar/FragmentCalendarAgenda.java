package org.unimelb.itime.ui.fragment.calendar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.unimelb.itime.R;
import org.unimelb.itime.base.ItimeBaseFragment;
import org.unimelb.itime.base.ToolbarInterface;
import org.unimelb.itime.manager.EventManager;
import org.unimelb.itime.ui.mvpview.calendar.CalendarMvpView;
import org.unimelb.itime.ui.presenter.CalendarPresenter;

import david.itimecalendar.calendar.listeners.ITimeEventInterface;
import david.itimecalendar.calendar.ui.agendaview.AgendaViewBody;
import david.itimecalendar.calendar.ui.agendaview.MonthAgendaView;

/**
 * Created by yuhaoliu on 8/06/2017.
 */

public class FragmentCalendarAgenda extends ItimeBaseFragment<CalendarMvpView, CalendarPresenter<CalendarMvpView>> implements ToolbarInterface {
    private View root;
    private EventManager eventManager;
    private MonthAgendaView agendaView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_calendar_agenda, container, false);
        eventManager = EventManager.getInstance(getContext());
        initView();
        return root;
    }

    @Override
    public CalendarPresenter<CalendarMvpView> createPresenter() {
        return new CalendarPresenter<>(getContext());
    }

    @Override
    public void onNext() {

    }

    @Override
    public void onBack() {

    }

    private void initView(){
        agendaView = (MonthAgendaView) root.findViewById(R.id.agenda_view);
        //Set the data source with format of ITimeEventPackageInterface
        //ITimeEventPackageInterface is composed by two parts:
        //  1: regular events. 2: repeated events.
        agendaView.setDayEventMap(eventManager.getEventsPackage());
        agendaView.setOnEventClickListener(new AgendaViewBodyListener());
    }

    private class AgendaViewBodyListener implements AgendaViewBody.OnEventClickListener{
        @Override
        public void onEventClick(ITimeEventInterface iTimeEventInterface) {

        }
    }
}