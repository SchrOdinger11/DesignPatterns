package BuilderDesignPattern;

public class User {
    public String firstName;
    public String lastName;
    public String age; 
    
    public String phone;
    public String address;
    public String gender;
    
       
    public User() {
        this.firstName = null;
        this.lastName = null;
        this.age = null;
        this.phone = null;
        this.address = null;
       
}
    public User build() {
        return this;
    }
    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    
    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    
    public User setAge(String age) {
        this.age = age;
        return this;
    }
    
    public User setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    
    public User setAddress(String address) {
        this.address = address;
        return this;
    }
    
    public User setGender(String s){
        this.gender= s;
        return this;
    }
    public User removeGender(){
        this.gender= null;
        return this;
    }
    public User removePhone(){
        this.phone= null;
        return this;
    }
    public User removeAddress(){
        this.address= null;
        return this;
    }
    public User removeAge(){
        this.age= null;
        return this;
    }
    public User removeLastName(){
        this.lastName= null;
        return this;
    }
    public User removeFirstName(){
        this.firstName= null;
        return this;
    }
    public void details() {
        
       if(firstName != null) System.out.println("First Name: " + firstName);
       if(lastName != null) System.out.println("Last Name: " + lastName);
       if(age != null) System.out.println("Age: " + age);
       if(phone != null) System.out.println("Phone: " + phone);
       if(address != null)System.out.println("Address: " + address);
        
    
}
}
