class Student
{
    int rollno;
    String name;
    int marks;
}

public class hello
{
    public static void main(String []args)
   {
        Student s1 = new Student();
        s1.rollno = 21;
        s1.name = "Ravi";
        s1.marks = 80;

        Student s2 = new Student();
        s2.rollno = 26;
        s2.name = "Shyam";
        s2.marks = 96;

        Student s3 = new Student();
        s3.rollno = 35;
        s3.name = "Kiran";
        s3.marks = 88;

        //System.out.println(s1.name + " : " + s1.marks);

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for(int i=0;i<students.length;i++)
        // {
        //     System.out.println(students[i].name + " : " + students[i].marks);
        // }
        for(Student stud : students)
        {
            System.out.println(stud.rollno + "." + stud.name + " : " + stud.marks);
        }

   }
}