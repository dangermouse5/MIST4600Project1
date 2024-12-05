public class Main {
    public static void main(String[] args) {
        AccountManager accManager = new AccountManager();
        UserInterface userInterface = new UserInterface(accManager);
        
        accManager.createAccount("admin", "password", "Admin", null, true);
        accManager.createAccount("rdanko", "bass", "Rick", "Danko", false);
        accManager.createAccount("rrobertson", "guitar", "Robbie", "Robertson", false);
        accManager.createAccount("lhelm", "drums", "Levon", "Helm", false);
        accManager.createAccount("rmanuel", "piano", "Richard", "Manuel", false);
        accManager.createAccount("ghudson", "organ", "Garth", "Hudson", false);
    
        userInterface.start();
    }
}
