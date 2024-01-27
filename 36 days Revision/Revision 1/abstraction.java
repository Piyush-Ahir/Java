interface animal {
    void noise();
}

class dog implements animal {
    public void noise(){
        System.out.println("Bark...");
    }
}

class cat implements animal  {
    public void noise(){
        System.out.println("Meow...");
    }
}

class Ansim {
    static void stimulator (animal a){
        a.noise();
    }
}

class abstraction {
    public static void main(String[] args) {
        dog d = new dog();
        cat c = new cat();

        Ansim.stimulator(d);
        Ansim.stimulator(c);
    }    
}
