package group_project_software;

/**
 *
 * @author reemajez
 */
class Message {
    private String content; // The content of the message
    private String sender;  // The sender of the message

    // Constructor to initialize a Message object.
    Message(String messageContent, String sender) {
        this.content = messageContent;
        this.sender = sender;
    }

    // Getter for the content of the message.
    public String getContent() {
        return content;
    }

    // Getter for the sender of the message.
    public String getSender() {
        return sender;
    }
}


