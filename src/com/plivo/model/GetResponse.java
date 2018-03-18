package com.plivo.model;

import java.util.List;

public class GetResponse {

    List<Contact> contactList;

    boolean nextPageToken;

    int pageNumber;

    public GetResponse(List<Contact> contactList, boolean nextPageToken, int pageNumber) {
        this.contactList = contactList;
        this.nextPageToken = nextPageToken;
        this.pageNumber = pageNumber;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public boolean isNextPageToken() {
        return nextPageToken;
    }

    public int getPageNumber() { return pageNumber; }
}
