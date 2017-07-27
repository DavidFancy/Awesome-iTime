package org.unimelb.itime.ui.presenter.contact;

import android.content.Context;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;

import org.unimelb.itime.base.ItimeBasePresenter;
import org.unimelb.itime.bean.Contact;
import org.unimelb.itime.bean.User;
import org.unimelb.itime.ui.mvpview.contact.MainContactsMvpView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Qiushuo Huang on 2017/6/21.
 */

public class ContactPresenter extends ItimeBasePresenter<MainContactsMvpView> {
    public ContactPresenter(Context context) {
        super(context);
    }

    public List<Contact> getContacts(){


        List<Contact> contacts = new ArrayList<>();
        Contact contact1 = new Contact();
        contact1.setAliasName("a");
        contact1.setAliasPhoto("http://avatar.csdn.net/A/9/C/1_waldmer.jpg");
        contact1.setContactUid("1");

        Contact contact2 = new Contact();
        contact2.setAliasName("b");
        contact2.setAliasPhoto("http://avatar.csdn.net/A/9/C/1_waldmer.jpg");
        contact2.setContactUid("2");

        Contact contact3 = new Contact();
        contact3.setAliasName("c");
        contact3.setAliasPhoto("http://avatar.csdn.net/A/9/C/1_waldmer.jpg");
        contact3.setContactUid("3");

        Contact contact4 = new Contact();
        contact4.setAliasName("d");
        contact4.setAliasPhoto("http://avatar.csdn.net/A/9/C/1_waldmer.jpg");
        contact4.setContactUid("4");

        Contact contact5 = new Contact();
        contact5.setAliasName("ad");
        contact5.setAliasPhoto("http://avatar.csdn.net/A/9/C/1_waldmer.jpg");
        contact5.setContactUid("5");

        contacts.add(contact1);
        contacts.add(contact5);
        contacts.add(contact2);
        contacts.add(contact3);
        contacts.add(contact4);

        int i=0;
        for(Contact contact:contacts){
            User user = new User();
            user.setEmail("123456@unimelb.edu.au");
            user.setUserId("123456@unimelb.edu.au");
            user.setUserUid(i+"");
            i++;
            contact.setUserUid(i+"");
            contact.setUserDetail(user);
        }

        return contacts;
    }
}
