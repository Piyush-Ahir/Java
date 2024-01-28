class MyCompany {
    private String password = "Loading...";

    // public service getter is used to get the information
    // from the private member of the class
    public String getPassword() {
        return password;
    }

    // public service setter is used to set the information
    // of the private member of the class
    public void setPassword(String password) {
        this.password = password;
    }
}

class Encapsulation {
    public static void main(String[] args) {

        MyCompany m = new MyCompany();
        System.out.println(m.getPassword());
        // It will print old password

        m.setPassword("Searching...");
        System.out.println(m.getPassword());
        // It will print new password
        
    }
}