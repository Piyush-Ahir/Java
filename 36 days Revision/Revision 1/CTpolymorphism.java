class Whatsapp {
    void send(int num){
        System.out.println("Sending number...");
    }
    void send(String txtmsg){
        System.out.println("Sending Message...");
    }
}

class CTpolymorphism {
    public static void main(String[] args) {
        Whatsapp w = new Whatsapp();
        w.send(21);
        w.send("Heyyy vasudev...");
    }    
}