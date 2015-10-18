# Data-Structure
package sorting;

public class Patient {
    
    public Patient(String firstName,String lastName,int age,String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }
    
    public String getFullname(){
        return this.firstName.toUpperCase() +
                " " + this.lastName.toUpperCase();
    }
    
    public int getAge(){
        return this.age;
    }
    
    public String getAddress(){
        return this.address.toUpperCase();
    }
    
    public String toString(){
        return getFullname() + ", " + getAge() +
                ", " + getAddress();
    }
    
    private String firstName;
    private String lastName;
    private int age;
    private String address;
}
