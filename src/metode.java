class angka{
    int total;

    void getGanjil(){
        System.out.println("Angka Ganjil 1-100");
        for (int i=0;i<=100;i++){
            if (i%2 !=0){
                total +=i;
                System.out.println(i+"");
            }

        }
    }

    void getTotal(){
        System.out.println("Total");
        int total=0;
        for (int i=1;i<=100;i+=2){
            total+=i;

            }
            System.out.println(total);

        }
    }








public class metode {
    public static void main(String[] args) {
        angka even = new angka();
        even.getGanjil();
        even.getTotal();


    }
}
