package org.unimelb.itime.ui.fragment.event;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.unimelb.itime.R;
import org.unimelb.itime.base.ItimeBaseActivity;
import org.unimelb.itime.base.ItimeBaseFragment;
import org.unimelb.itime.base.ToolbarInterface;
import org.unimelb.itime.bean.Event;
import org.unimelb.itime.databinding.FragmentEventCreateBinding;
import org.unimelb.itime.ui.mvpview.event.EventCreateMvpView;
import org.unimelb.itime.ui.presenter.EventCreatePresenter;
import org.unimelb.itime.ui.viewmodel.event.EventCreateViewModel;
import org.unimelb.itime.ui.viewmodel.ToolbarViewModel;

/**
 * Created by Paul on 2/6/17.
 */

public class FragmentEventCreate extends ItimeBaseFragment<EventCreateMvpView, EventCreatePresenter<EventCreateMvpView>>
        implements EventCreateMvpView, ToolbarInterface{
    private FragmentEventCreateBinding binding;
    private EventCreateViewModel vm;
    private ToolbarViewModel toolbarViewModel;
    private Event event;

    @Override
    public EventCreatePresenter<EventCreateMvpView> createPresenter() {
        return new EventCreatePresenter<>(getContext());
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (savedInstanceState==null) {
            if (event==null) {
                firstLoad();
            }else{
                reLoadPage();
            }
        }else{
            // rotate screen
            event = (Event) savedInstanceState.getSerializable(getString(R.string.event));
        }
    }

    private void firstLoad(){
        mockEvent();
        vm = new EventCreateViewModel(getPresenter());
        vm.setEvent(event);
        binding.setVm(vm);

        toolbarViewModel = new ToolbarViewModel<>(this);
        toolbarViewModel.setTitle(getString(R.string.new_event_toolbar_title));
        toolbarViewModel.setRightText(getString(R.string.new_event_toolbar_next));
        toolbarViewModel.setLeftIcon(getResources().getDrawable(R.drawable.icon_nav_close));
        binding.setToolbarvm(toolbarViewModel);
    }

    private void reLoadPage(){
        vm.setEvent(event);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable(getString(R.string.event), event);
    }

    private void mockEvent(){
        event = new Event();
    }

    public void setEvent(Event event) {
        this.event = event;
        vm.setEvent(event);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (binding==null) {
            binding = DataBindingUtil.inflate(inflater, R.layout.fragment_event_create, container, false);
        }
        return binding.getRoot();
    }

    @Override
    public void onNext() {

    }

    @Override
    public void onBack() {

    }

    @Override
    public void toNote(Event event) {
        FragmentEventCreateNote fragment = new FragmentEventCreateNote();
        fragment.setEvent(event);
        getBaseActivity().openFragment(fragment);
    }

    @Override
    public void toUrl(Event event) {
        FragmentEventCreateUrl fragment = new FragmentEventCreateUrl();
        getBaseActivity().openFragment(fragment);
    }

    @Override
    public void toRepeat(Event event) {
        FragmentEventRepeat fragment = new FragmentEventRepeat();
        getBaseActivity().openFragment(fragment);
    }
}

