public class Xirurg extends Doktor{
    private String yunalish="jarrohlik";
    private String turlari="ichki organizimlar";


    public void printt2(){

        System.out.println(yunalish);
    }

    public void print3(){
        System.out.println(turlari);
    }
    public static void main(String[] args) {
        Xirurg xirurg=new Xirurg();
        Doktor doktor =new Doktor();
        System.out.println(doktor.print1());
        System.out.println(doktor.print2());
        xirurg.print3();
        xirurg.printt2();
    }
}
