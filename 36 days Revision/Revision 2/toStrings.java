class toStrings {
    String name;
    int age;
    toStrings(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){

        return this.name + " " + this.age;
    }

    public static void main(String[] args) {

        toStrings e1 = new toStrings("Vasudev", 22);
        System.out.println(e1);
    }
}