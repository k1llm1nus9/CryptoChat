package com.example.cryptochat.Model;

import com.example.cryptochat.Encryption.AESCrypt;

public class Chat {

    AESCrypt aes = new AESCrypt("lv39eptlvuhaqqsr");

    private String sender;
    private String receiver;
    private String message;
    private boolean isSeen;

    public Chat(String sender, String receiver, String message, boolean isSeem) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        this.isSeen = isSeem;
    }

    public Chat() {
    }


    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return decryptMessage(message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSeen() {
        return isSeen;
    }

    public void setSeen(boolean seen) {
        isSeen = seen;
    }

    public String decryptMessage(String msg) {
        String decryptedMessage = null;
        try {
            decryptedMessage = aes.decrypt(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return decryptedMessage;
    }
}
