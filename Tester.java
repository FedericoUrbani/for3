public class Tester {
    public static void main(String[] args) {
        String []arr=new String []{"Monday","Tuesday","Wednesday","Friday","Thursday","Saturday","Sunday"};

        for (int i=0; i<=arr.length; i++){

            if (i==0||i%2==0){
                arr[i]=arr[i].toUpperCase();
            }
        }
        for (String a: arr){
            System.out.println(a);
        }

    }
}
