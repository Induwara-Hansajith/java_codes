class Employee {
    
    int employeeId;
    String employeeName;
    double basicSalary;

    
    Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    double calculateBonus(double bonusPercentage) {
        double bonus = (basicSalary * bonusPercentage) / 100;
        return bonus;
    }

    double calculateBonus(double bonusPercentage, double additionalAllowance) {
        double calculateBonus = calculateBonus(bonusPercentage);
        double totalBonus = (calculateBonus + additionalAllowance);
        return totalBonus;
    }

    double calculateFinalSalary(double bonusAmount) {
        double basicplusbonus = (basicSalary + bonusAmount);
        return basicplusbonus;
    }

    void displayEmployee() {
        System.out.println("Employee ID   : " + this.employeeId);
        System.out.println("Employee Name : " + this.employeeName);
        System.out.println("Basic Salary  : $" + this.basicSalary);
    }

    public static void main(String[] args) {
        
        Employee emp = new Employee(35534, "Fernando", 75000);

        
        emp.displayEmployee();
        System.out.println();

        
        double percentage = 10.0;
        double bonus1 = emp.calculateBonus(percentage);
        double finalSalary1 = emp.calculateFinalSalary(bonus1);

        System.out.println("Case 1 (Percentage: " + percentage + "%):");
        System.out.println("Bonus        : $" + bonus1);
        System.out.println("Final Salary : $" + finalSalary1);
        System.out.println();

        
        double allowance = 5000.0;
        double bonus2 = emp.calculateBonus(percentage, allowance);
        double finalSalary2 = emp.calculateFinalSalary(bonus2);

        System.out.println("Case 2 (Percentage: " + percentage + "%, Allowance: $" + allowance + "):");
        System.out.println("Total Bonus  : $" + bonus2);
        System.out.println("Final Salary : $" + finalSalary2);
    }
}