//1. Create a class called Student with the following private variables:
//o name of type String
//o marks of type int
//2. Create a setter for name that only accepts values that are not empty.
//3. Create a setter for marks that only accepts values between 0 and 100.
//4. Create a getter for both name and marks.
//5. Create a method called calculateGrade() that returns a String:
//o "A" if marks is 75 or above
//o "B" if marks is between 50 and 74
//o "F" if marks is below 50
//6. In main():
//o Create two Student objectso
//o Assign the following values:
//1. Student 1 — name: "Alice", marks: 80
//2. Student 2 — name: "Bob", marks: 45
//o For each student print the name, marks and grade


    static class Student {
        private String name;
        private int marks;

         public void setName(String name) {
            if (name != null && !name.trim().isEmpty()) {
                this.name = name;
            } else {
                this.name = "empty"; 
            }
        }

        public void setMark(int marks){
            if (marks >= 00 &&  marks<=100){
                this.marks =marks;
            }else{
                this.marks = 0;
            }
        }

        public String getName() {
            return name;
        }
        public int getMarks() {
            return marks;
        }

        public String calculateGrade() {
            if (marks >= 75){
                return "A";
            }
            else if (marks >= 50){
                return "B";
            }
            else{
                return "F";
            }
        }
    }

    public static void main(String[] arg){
        Student student1= new Student();
        student1.setName("Alice");
        student1.setMark(80);

        Student student2 =new Student();
        student2.setName("bob");
        student2.setMark(45);


        System.out.println("name" + student1.getName() + ",marks" + student2.getMarks());
        System.out.println("name" + student2.getName() + "marks " + student2.getMarks());

        
    }
