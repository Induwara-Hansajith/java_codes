class student{
    int studentId;
    String studentName;
    double marks;

    //creating constructor
    void studentc(int studentId, String studentName, double marks){

        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
    }

    void displayDetails(){

        System.out.println("Student ID : "+studentId);
        System.out.println("Student Name : "+studentName);
        System.out.println("Marks : "+marks);
    }

    String getResult(){

        if (marks >= 50){
            return "Pass";
        }else{
            return "Fail";
        }
            
    }


    public static void main(String[] args){

        //creating objects
        student student1 = new student();
        student student2 = new student();

        //student 1
        student1.studentc(35534, "Fernando", 74.5);
        student1.displayDetails();
        student1.getResult();

        System.out.println();

        //student2
        student2.studentc(35682, "Perera", 99.9);
        student2.displayDetails();
        student2.getResult();
    }
}