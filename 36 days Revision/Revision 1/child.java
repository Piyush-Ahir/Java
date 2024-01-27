class Parent {
    private void atm() {
        System.out.println("Atm access only limited to father");
    }
    protected void bike() {
        
        System.out.println("Bike access can permit to child");
    }

    void car() {
        System.out.println("car access directly given to child");
    }

    public void cycle() {
        System.out.println("Child can ride bicycle anytime...");
    }
}

class child {
    public static void main(String[] args) {
        Parent p = new Parent();
        // p.atm(); 
        // Private member we can't access one class to another class... 
        // If we want the same we need to override them...
        p.bike();
        p.car();
        p.cycle();
    }
}
