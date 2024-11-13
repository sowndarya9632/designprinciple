public class SRP {
    String Username;
    String email;
    SRP(String username,String email)
    {
        this.Username=username;
        this.email=email;
    }
    public  void showUser()
    {
        System.out.println("name : "+this.Username+" email : "+this.email);
    }
}
