package Backend.Code;
// import java.util.*;

// class Student implements Comparable<Student> {

//     int age;

//     String name;

//     public Student(int age, String name) {

//         this.age = age;
//         this.name = name;

//     }

//     public String toString() {

//         return "Student[age = " + age + " name = " + name + "]";

//     }

//     @Override
//     public int compareTo(Student that) {
//         if (this.age > that.age) {
//             return 1;
//         } else {
//             return -1;
//         }

//     }

// }

// /**
//  * Coldvn
//  */
// public class Coldvn {

//     public static void main(String[] args) {

//         // Comparator<Student> comp =(Student i, Student j) -> {
//         //             return i.age > j.age ? 1 : -1;
//         //         };

//         Student student1 = new Student(98, "Ullas");
//         Student student2 = new Student(8, "Vaibhav");
//         Student student3 = new Student(2, "Nihar");
//         Student student4 = new Student(0, "Abhi");

//         // Student student[]=new Student[4];

//         // student[0]=student1;
//         // student[1]=student2;
//         // student[2]=student3;
//         // student[3]=student4;

//         // for (Student student5 : student) {
//         // System.out.println(student5);
//         // }

//         List<Student> studs = new ArrayList<Student>();
//         studs.add(student1);
//         studs.add(student2);
//         studs.add(student3);
//         studs.add(student4);
//         Collections.sort(studs);

//         for (Student student : studs) {
//             System.out.println(student);
//         }

//     }
// }
