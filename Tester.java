public class Tester {
    public static void main(String[] args) {
        String []arr=new String []{"Monday","Tuesday","Wednesday","Friday","Thursday","Saturday","Sunday"};

        for (int i=0; i<=arr.length;){


                arr[i]=arr[i].toUpperCase();
                i=i+2;

        }
        for (String a: arr){
            System.out.println(a);
        }

    }
}
