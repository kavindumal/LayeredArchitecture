public class Boy implements Di{
    Agreement agreement;


    public void chatWithGirl() {
        agreement.chats();
    }

    public void test() {
        agreement.chats();
    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.inject(new Girl()); // <----- Interface through Interface
        boy.chatWithGirl();
    }

    @Override
    public void inject(Agreement agreement) {
        this.agreement = agreement;
    }
}