/**
 * This file is a part of WhatsappMessage project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public class WhatsappMessage {

    private String content;
    private String senderName;
    private String recipientName;
    private int status;
    private long sentTimeMillis;

    public WhatsappMessage(String content, String senderName, String recipientName, int status, long sentTimeMillis) {
        this.content = content;
        this.senderName = senderName;
        this.recipientName = recipientName;
        this.status = status;
        this.sentTimeMillis = sentTimeMillis;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public long getSentTimeMillis() {
        return sentTimeMillis;
    }

    public void setSentTimeMillis(long sentTimeMillis) {
        this.sentTimeMillis = sentTimeMillis;
    }

    public void setStatus(int status) {
        if (status == 0 || status == 1 | status == (-1))
            this.status = status;
    }

    public boolean isDelivered() {
        if (status == 1)
            return isDelivered();
        else return false;
    }

    public boolean isSent() {
        if (status == 0)
            return isSent();
        else return false;
    }

    public boolean isIdle() {
        if (this.status == (-1))
            return isIdle();
        else return false;
    }

    public boolean isAtLeastSent() {
        if (status == 0 || status == 1)
            return isAtLeastSent();
        else return false;
    }

    private long millisPassedSinceSent() {
        return status == 1 || status == 0 ? millisPassedSinceSent() : 0;
    }

    public boolean isOld() {
        if (sentTimeMillis > 7)
            return isOld();
        else return false;
    }

    public String toString() {
        return "WhatsappMessage{" + '\n' +
                "Content: " + content + '\n' +
                "From: " + senderName + '\n' +
                "To: " + recipientName + '\n' +
                "Status: " + status +
                '\n' +
                "SentTimeMillis: " + sentTimeMillis;
    }
}


