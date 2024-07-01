public class HealthRecord{
    
    private String name;
    private int age;
    private int id;
    private String bloodtype;
    private String disease;

    public HealthRecord(String name, int age, int id, String bloodtype, String disease){
        this.name = name;
        this.age = age;
        this.id = id;
        this.bloodtype = bloodtype;
        this.disease = disease;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setDisease(String disease){
        this.disease = disease;
    }
    
    public String getDisease(){
        return this.disease;
    }
 
    public String getName(){
        return this.name;
 
    }

    public int getid(){
        return this.id;
    }

    public String getbloodtype(){
        return this.bloodtype;
    }

}