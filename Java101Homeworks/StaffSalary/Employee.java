public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    int yearWorked = 2021- hireYear;
    int bonus;
    int tax;
    int raisedAmount;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.bonus = bonus;
        this.tax = tax;

    }

    void getTax(){
        if (salary<1000){
            salary = salary;
        } else if (salary > 1000) {
            tax = ((salary * 3) / 100);
            //salary = salary - ((salary * 3) / 100);
        }
    }

    void getBonus(){
        if (workHours>40){
            bonus = (workHours - 40) * 30;
        }else {
            bonus = 0;
        }
    }

    void raiseSalary(){
        if (yearWorked<10){
            raisedAmount = ((salary * 5) / 100);
            salary = salary + ((salary * 5) / 100);
            //System.out.println("Your Salary : " +salary);
        } else if (yearWorked >= 10 && yearWorked <= 20) {
            raisedAmount = ((salary * 10) / 100);
            salary = salary + ((salary * 10) / 100);
           // System.out.println("Your Salary : " +salary);
        } else if (yearWorked >= 20) {
            raisedAmount = ((salary * 15) / 100);
            salary += (salary * 15) / 100;
            //System.out.println("Your Salary : " +salary);
        }
    }

    public void toStringg(){
        System.out.println("Your Name : " + this.name);
        System.out.println("Your Salary : " + this.salary);
        System.out.println("Work Hours : " + this.workHours);
        System.out.println("Hired Year : " + this.hireYear);
        System.out.println("Tax : " +tax);
        System.out.println("Bonus : " +bonus);
        System.out.println("Salary Raise : " +raisedAmount);
        System.out.println("New Salary within taxes and bonus : " +salary);
    }
}
