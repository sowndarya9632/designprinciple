public class SRPMain
{
    public static void main(String[] args) {
        User user=new User("Anu","anu123@gmail.com");
        user.showUser();

        sendEmail sm=new sendEmail();
        sm.showEmail(user,"hello");

        saveFile sf=new saveFile();
        sf.saveToFile(user);

    }
}
