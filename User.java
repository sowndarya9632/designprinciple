//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class User {
   String Username;
   String email;
    User(String username,String email)
    {
       this.Username=username;
       this.email=email;
    }
   public  void showUser()
    {
       System.out.println("name : "+this.Username+" email : "+this.email);
    }
    public  void sendEmail()
    {
        System.out.println("email sent to "+this.email);
    }
    public  void saveToFile()
    {
        System.out.println("Saved to file Successfully");
    }

    public static void main(String[] args) {
        User user=new User("Anu","anu123@gmail.com");
        user.showUser();
        user.sendEmail();
        user.saveToFile();
    }
}