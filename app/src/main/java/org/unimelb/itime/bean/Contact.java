package org.unimelb.itime.bean;

import android.support.annotation.Nullable;

import org.greenrobot.greendao.annotation.Convert;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

import java.io.Serializable;

/**
 * Created by yuhaoliu on 17/08/16.
 */
@Entity
public class Contact implements ITimeUserInfoInterface, Serializable {
    public static final long serialVersionUID = 1231245L;

    public static final String DELETED = "deleted";
    public static final String ACTIVATED = "activated";
    public static final String UNACTIVATED = "unactivated";
    public static final String SOURCE_EMAIL = "email";


    private String userUid="";
    @Id
    private String contactUid="";
    private int relationship;
    private int ratingVisibility;
    private int eventVisibility;
    private String source="";
    private String aliasName="";
    private String aliasPhoto="";
    private int catchCount;
    private long nextCatchupTime;
    private long lastCatchupTime;
    private String note="";
    private String status="";
    private int blockLevel;

    @Convert(converter = User.UserConverter.class , columnType = String.class)
    private User userDetail;

    public User getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(User userDetail) {
        this.userDetail = userDetail;
    }

    public Contact(User user){
        userDetail = user;
        aliasName = user.getPersonalAlias();
        aliasPhoto = user.getPhoto();
        status = ACTIVATED;
        contactUid = user.getUserUid();
        userUid = "";
        blockLevel = 0;
    }

//@Generated(hash = 283800893)
//    public Contact(String userUid, String contactUid, int relationship, int ratingVisibility, int eventVisibility, String source, String aliasName, String aliasPhoto, int catchCount, long nextCatchupTime, long lastCatchupTime, String note, String status, int blockLevel) {
//        this.userUid = userUid;
//        this.contactUid = contactUid;
//        this.relationship = relationship;
//        this.ratingVisibility = ratingVisibility;
//        this.eventVisibility = eventVisibility;
//        this.source = source;
//        this.aliasName = aliasName;
//        this.aliasPhoto = aliasPhoto;
//        this.catchCount = catchCount;
//        this.nextCatchupTime = nextCatchupTime;
//        this.lastCatchupTime = lastCatchupTime;
//        this.note = note;
//        this.status = status;
//        this.blockLevel = blockLevel;
//    }

@Generated(hash = 900700935)
public Contact(String userUid, String contactUid, int relationship, int ratingVisibility, int eventVisibility, String source, String aliasName, String aliasPhoto, int catchCount, long nextCatchupTime, long lastCatchupTime, String note, String status, int blockLevel,
        User userDetail) {
    this.userUid = userUid;
    this.contactUid = contactUid;
    this.relationship = relationship;
    this.ratingVisibility = ratingVisibility;
    this.eventVisibility = eventVisibility;
    this.source = source;
    this.aliasName = aliasName;
    this.aliasPhoto = aliasPhoto;
    this.catchCount = catchCount;
    this.nextCatchupTime = nextCatchupTime;
    this.lastCatchupTime = lastCatchupTime;
    this.note = note;
    this.status = status;
    this.blockLevel = blockLevel;
    this.userDetail = userDetail;
}

    

    

    

    //    @Generated(hash = 283800893)
//    public Contact(String userUid, String contactUid, int relationship, int ratingVisibility, int eventVisibility, String source, String aliasName, String aliasPhoto, int catchCount, long nextCatchupTime, long lastCatchupTime, String note, String status, int blockLevel) {
//        this.userUid = userUid;
//        this.contactUid = contactUid;
//        this.relationship = relationship;
//        this.ratingVisibility = ratingVisibility;
//        this.eventVisibility = eventVisibility;
//        this.source = source;
//        this.aliasName = aliasName;
//        this.aliasPhoto = aliasPhoto;
//        this.catchCount = catchCount;
//        this.nextCatchupTime = nextCatchupTime;
//        this.lastCatchupTime = lastCatchupTime;
//        this.note = note;
//        this.status = status;
//        this.blockLevel = blockLevel;
//    }




    @Generated(hash = 672515148)
    public Contact() {
    }

    public int getBlockLevel() {
        return blockLevel;
    }

    public void setBlockLevel(int blockLevel) {
        this.blockLevel = blockLevel;
    }

    public String getUserUid() {
        return userUid;
    }

    public void setUserUid(String userUid) {
        this.userUid = userUid;
    }


    public String getContactUid() {
        return contactUid;
    }

    public void setPhoto(String s) {
        this.setAliasPhoto(s);
    }

    @Nullable
    public String getPhoto() {
        return this.getUserDetail().getPhoto();
    }

    @Override
    public String getShowPhoto() {
        return aliasPhoto;
    }

    @Override
    public String getShowName() {
        return aliasName;
    }

    @Override
    public String getSecondInfo() {
        return userDetail.getEmail();
    }

    public void setContactUid(String contactUid) {
        this.contactUid = contactUid;
    }

    public int getRelationship() {
        return relationship;
    }

    public void setRelationship(int relationship) {
        this.relationship = relationship;
    }

    public int getRatingVisibility() {
        return ratingVisibility;
    }

    public void setRatingVisibility(int ratingVisibility) {
        this.ratingVisibility = ratingVisibility;
    }

    public int getEventVisibility() {
        return eventVisibility;
    }

    public void setEventVisibility(int eventVisibility) {
        this.eventVisibility = eventVisibility;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public String getAliasPhoto() {
        return aliasPhoto;
    }

    public void setAliasPhoto(String aliasPhoto) {
        this.aliasPhoto = aliasPhoto;
    }

    public int getCatchCount() {
        return catchCount;
    }

    public void setCatchCount(int catchCount) {
        this.catchCount = catchCount;
    }

    public long getNextCatchupTime() {
        return nextCatchupTime;
    }

    public void setNextCatchupTime(long nextCatchupTime) {
        this.nextCatchupTime = nextCatchupTime;
    }

    public long getLastCatchupTime() {
        return lastCatchupTime;
    }

    public void setLastCatchupTime(long lastCatchupTime) {
        this.lastCatchupTime = lastCatchupTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
