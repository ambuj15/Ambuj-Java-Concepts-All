package oopsBasicConcepts.staticConcept;

public class StaticBlock2 {
    void show(){
        System.out.println("Hello");
    }
}

class Demo{
    public static StaticBlock2 sb2;

    static{
        sb2 = new StaticBlock2();
    }
}

class implementation{
    public static void main(String[] args) {
        Demo.sb2.show();
    }
}
