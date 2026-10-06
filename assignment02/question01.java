class Student{

    String name;
    double marks;
    String school = "Lumbini M.V.";
    public static int count = 0;

    void setDetails(String name, double marks){
        this.name = name;
        this.marks = marks;
        count += 1;
    }

    void displayDetails(){
        System.out.println("Student Name : "+name);
        System.out.println("Marks : "+marks);
        System.out.println("School : "+school);
    }

    String getGrade(){
        if (marks >= 75){
            return "A";
        }
        else if (marks >= 50){
            return "B";
        }else{
            return "C";
        }
    }

    double addBonus(double bonus){
        return (marks + bonus);
    }
}

class StudentTest{

    public static void main(String[] arg){

        Student student1 = new Student();

        student1.setDetails("W.P.R.D.Fernando", 88.5);

        student1.displayDetails();
        System.out.println("Grade : "+ student1.getGrade());
        double new_mark = student1.addBonus(10);
        System.out.println("New Marks : "+new_mark);

        System.out.println("");

        Student student2 = new Student();

        student2.setDetails("A.P.O.H.Perera", 99.9);
        student2.displayDetails();
        System.out.println("Grade : "+ student2.getGrade());

        System.out.println("");

        System.out.println("The total number of students : "+Student.count);
    }
}