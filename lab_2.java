
class lab_2 {
    
    private int id;
    private float cgpa;
    
    //parameterless constructor
    
    public lab_2(){
        System.out.println("parameter less constructor is called");
    }
    
    //parameterized constructor
    
    public lab_2(int a, float b){
        id=a;
        cgpa=b;
    
        System.out.println("parameterized constructor is called");
        
        System.out.println("the value of id is:"+id+" and the value of cgpa is :"+ cgpa);
    }
    
    public lab_2(int id){
        this.id=id;
    
        System.out.println("parameterized constructor is called");
        
        System.out.println("the value of id is:"+id+" and the value of cgpa is :"+ cgpa);
    }
    
    
    
    //copy constructor
    public lab_2(lab_2 obj1){
        id=obj1.id;
        cgpa=obj1.cgpa;
    
        System.out.println("copy constructor is called");
    }
    
    
    public static void main(String[] args) {
        System.out.println("test");
    
        //calling parameterless constructor
        lab_2 obj1 = new  lab_2();
        
        //calling parameterized constructor
        lab_2 obj2 = new  lab_2(100,3.95f);
        
        //calling copy constructor
        lab_2 obj3 = new  lab_2(obj2);
    
        
        lab_2 obj4 = new  lab_2(200);
    
    }
    
    
}