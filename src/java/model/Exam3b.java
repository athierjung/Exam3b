package model;


public class Exam3b {
   private int CustomerID;
   private String CustomerName;
   private String FavoriteSubject;
   private int Age;

   public Exam3b() {
        this.CustomerID = 0;
        this.CustomerName = "";
        this.FavoriteSubject = "";
        this.Age = 0;
    }
   
   public Exam3b(int CustomerID, String CustomerName, String FavoriteSubject, int Age) {
        this.CustomerID = CustomerID;
        this.CustomerName = CustomerName;
        this.FavoriteSubject = FavoriteSubject;
        this.Age = Age;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getFavoriteSubject() {
        return FavoriteSubject;
    }

    public void setFavoriteSubject(String FavoriteSubject) {
        this.FavoriteSubject = FavoriteSubject;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    @Override
    public String toString() {
        return "Exam3b{" + "CustomerID=" + CustomerID + ", CustomerName=" + CustomerName + ", FavoriteSubject=" + FavoriteSubject + "Age=" + Age + '}';
    }
   
    
}