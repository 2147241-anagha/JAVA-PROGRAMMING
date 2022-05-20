public class info extends studentDetails1 {
    int num=100;
    private int marks;
    private String performance;
    final String organisation_address ="Bangalore";
     
    @Override
    public void confidentialDetails(int s,String p) {
    this.marks=s;
    this.performance=p;
    System.out.println("marks=="+marks);
    System.out.println("performance=="+performance);
    System.out.println(super.num);
    }
     
    public static void main(String[] args) {
    info in =new info();
    in.confidentialDetails(5000,"good");
    }
     
    }