package week02;

public class NestedForLopp {
    public static void main(String[] args) {
        //birinci ( üst döngü)

        for (int i = 1; i<=10;i++){
            //ikinci (alt döngü)
            for (int j=1; j<=10;j++){
                System.out.println( i+ " x"+j+" ="+ (i *j));

            }

        }
    }
}