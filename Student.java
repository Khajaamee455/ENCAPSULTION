public class Student{

    private String company;
    private int company_id;
    private double Salary;

    // getter 

    public String company (){
        return company;

    }

    public int company_id(){
        return company_id;

    }

    public double Salary(){
        return Salary;

    }

    // Setter to set the values 

    public void SetCompany(String newcompany){
        this.company = newcompany;

    }

    public void SetCompany_id(int newcompany_id){
        this.company_id = newcompany_id;

    }

    public void SetSalary(double newSalary){
        this.Salary = newSalary;
    }


}