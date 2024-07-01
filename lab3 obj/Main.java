public class Main{
    public static void main(String[] args){
        HealthRecord p1 = new HealthRecord("joe", 18, 12345678, "A", "none");


        System.out.println("Name : " + p1.getName());
        System.out.println("Age : " + p1.getAge());
        System.out.println("id : " + p1.getid());
        System.out.println("bloodtype : " + p1.getbloodtype());
        System.out.println("disease : " + p1.getDisease());
    }

       
        
    
}
