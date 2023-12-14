public class Boy {
    Agreement agreement;

    public Boy(Agreement agreement) {
        this.agreement = agreement; //  <------- Constructor through Injection
    }

    public void chatWithGirl() {
        agreement.chats();
    }

    public void test() {
        agreement.chats();
    }

    public void setter(Agreement a) {
        this.agreement = a;  //  <------- Setter method through Injection
    }
    public static void main(String[] args) {
        Boy boy = new Boy(new Girl());
        boy.setter(new Girl());
        boy.chatWithGirl();
    }
}
