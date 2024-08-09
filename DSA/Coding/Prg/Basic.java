package Backend.DSA.Coding.Prg;


import java.util.Stack;

class Student
{
    int age;
    String name;

public Student(int age ,String name){

this.age=age;
this.name=name;

}

    public String toString()
    {
 return "Student [Age ="+age+" Name ="+name+"]";
    }
}

public class Basic {

    public static void main(String[] args) {
        


     Stack<Student> stack=new Stack<Student>();

stack.push(new Student(21,"RCB"));
stack.push(new Student(1,"CSK"));
stack.push(new Student(2,"KKR"));
stack.push(new Student(0,"MI"));

        //  stack.push("MineCraft");
        //  stack.push("COC");
        //  stack.push("Hello");
        //  stack.push("COD");

System.out.println(stack);

         stack.pop();

 stack.pop();
        
// for (Student student : stack) {
    
//     System.out.println(student);
// }



    }
}