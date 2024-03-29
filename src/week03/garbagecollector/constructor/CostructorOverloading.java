package week03.garbagecollector.constructor;

public class CostructorOverloading {
    String country;
    String language;

    CostructorOverloading(String country, String english){//Parameterized Constructor (Parametreli Constructor
        this.country =country;
    }

    public CostructorOverloading() {

    }

    public static void main(String[] args) {
        //no-arg constructor. Şu an herhangi bir constructor tanımlanmadığı için
        // default constructor olarak bana no-args-constructor Java tarafından getiriliyor

        CostructorOverloading obj1=new CostructorOverloading();
        obj1.country=" Turkey";
        obj1.language= "Turkish";

        System.out.println(obj1.country+" "+obj1.language);
        //1de NoArgsConstructor kullandık. İki fieldin değerini de nesneyi oluşturduktan sonra ayrı ayrı atadık


        CostructorOverloading obj2 =new CostructorOverloading( "Germany", "English");
        obj2.language= "German";
        System.out.println(obj2.country+ " "+obj2.language);
        //2.de Parameterized Constructor kullandık. Fieldlardan birinin
        // değerini nesneyi oluştururken argüman olarak verdik (country), değerini
        // ise neneyi oluşturduktan sonra, dışarıdan yaptık.


        CostructorOverloading obj3= new CostructorOverloading(  "England" ,"English");
        System.out.println(obj3.country+" "+obj3.language);

        //3de bütün 



    }
}
