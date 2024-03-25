package week03.methods.accessmodifiers;

public class AccessLevel {
    public  String publicString(){
        return " public string";
    }
    private String privateString(){
        return   "private string";
    }
    protected String protectedString(){
        return   "protected string";
    }
    String defaultString (){
        return   "default string";
    }


    public static class ReturnMetods {
        public static void main(String[] args) {
            int sum = sum (5,10);
            System.out.println(sum);

        }

        public  static  int sum(int number1,int number2){
            return number1 +number2;
        }

    }
}
