public class Boy {
    public void chatWithGirl() {
        Agreement agreement = new Girl();
        agreement.chats();
    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.chatWithGirl();
    }
}
