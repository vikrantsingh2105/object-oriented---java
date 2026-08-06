class Employee{
    int emp_id;
    String name;
    double salary;
    float age;
     void Set_data(int id,String n,double s,float a) {
         
         emp_id=id;
         name=n;
         salary=s;
         age=a;
     }
     void display(){
        System.out.println("The employee ID is:"+emp_id);
        System.out.println("Name is:"+name);
        System.out.println("Salary:"+salary);
        System.out.println("Age is:"+age);
    }
    public static void main(String[]args){
        Employee ep = new Employee();
        Employee ep1 = new Employee();
        Employee ep2 = new Employee();
        Employee ep3 = new Employee();
        Employee ep4 = new Employee();
        ep.Set_data(234,"Rohit",30000,23.5f);
        ep.display();
        System.out.println();
        ep1.Set_data(321,"Sunny",45000,25f);
        ep1.display();
        System.out.println();
        ep2.Set_data(1024,"Devansh",60000,27.5f);
        ep2.display();
        System.out.println();
        ep3.Set_data(669,"Manish",100000,34.5f);
        ep3.display();
        System.out.println();
        ep4.Set_data(564,"Saksham",70000,19f);
        ep4.display();
    }
}
