class equal extends Object{
    String name;
    int age;
    equal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj){
        equal e2 = (equal) obj;
        return this.name.equals(e2.name);
    }

    public static void main(String[] args) {

        equal e1 = new equal("Vasudev", 22);
        equal e2 = new equal("Unknown", 21);

        if(e1.equals(e2)){
            System.out.println("same name...");
        }
        else{
            System.out.println("Different name...");
        }

    }
}