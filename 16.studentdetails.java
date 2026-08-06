class Student{
    int roll_no;
    String name;
    float age;
     void Set_data(int r,String n,float a) {
         
         roll_no=r;
         name=n;
         age=a;
     }
     void display(){
        System.out.println("The roll number is:"+roll_no);
        System.out.println("Name is:"+name);
        System.out.println("Age is:"+age);
    }
    public static void main(String[]args){
        Student st = new Student();
        st.Set_data(15,"abc",23.5f);
        st.display();
    }
}
