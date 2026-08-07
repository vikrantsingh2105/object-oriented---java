class Student{
    int roll_no;
    String name;
    static String college="Sharda university";
    static {
        System.out.println("welcome");
    }
    Student(int r,String n) {
         
         roll_no=r;
         name=n;
     }
     void display(){
        System.out.println(roll_no+" "+name+" "+college);
    }
    public static void main(String[]args){
        Student st = new Student(23,"abc");
        st.display();
        Student st1 = new Student(29,"hdk");
        st1.display();
        Student st2 = new Student(30,"jkl");
        st2.display();
    }
}
