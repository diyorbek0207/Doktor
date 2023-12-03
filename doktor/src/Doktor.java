public class Doktor {
    private String maqsad="davolash";
    private String forma="doktorlar xalati";

    public String print1(){
        return maqsad;
    }

    public String print2(){
        return forma;
    }

    public static void main(String[] args) {
        Doktor doktor=new Doktor();
        Xirurg xirurg=new Xirurg();
        Lor lor =new Lor();
        System.err.println("Xirurg");
        System.out.println(xirurg.print1());
        System.out.println(xirurg.print2());
        xirurg.printt2();
        xirurg.print3();
        System.out.println();

        System.out.println("Lor");
        System.out.println(lor.print1());
        System.out.println(lor.print2());
        lor.print();
    }
}
