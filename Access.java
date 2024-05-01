public class Access {

     public static void main(String[] args) {
        Student st = new Student();
        st.SetCompany("Amezon");
        st.SetCompany_id(12345);
        st.SetSalary(40.000);

        System.out.println(st.company());
        System.out.println(st.company_id());
        System.out.println(st.Salary());
     }
}
    
