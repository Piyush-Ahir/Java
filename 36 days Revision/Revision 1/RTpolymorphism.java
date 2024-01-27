class animal {
    void noise(){
        System.out.println("Some type of noise");
    }
}

class dog extends animal {
    void noise(){
        System.out.println("Bark...");
    }
}

class cat extends animal  {
    void noise(){
        System.out.println("Meow...");
    }
}

class Ansim {
    static void stimulator (animal a){
        a.noise();
    }
}

class RTpolymorphism {
    public static void main(String[] args) {
        dog d = new dog();
        cat c = new cat();

        Ansim.stimulator(d);
        Ansim.stimulator(c);
    }    
}
