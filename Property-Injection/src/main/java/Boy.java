public class Boy {
    Agreement agreement = new Girl(); // <--- Property Injection
    public void chatWithGirl() {
        agreement.chats();
    }

    public void test() {
        agreement.chats();
    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.chatWithGirl();
    }
}