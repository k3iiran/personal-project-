package Bank;
class NationwideAccounts{
    public static void main(String xyz[]) {
        NationwideMain ref=new NationwideMain();
        try {
            ref.NetSalary(2000,12);
        }
        catch(AbsentiesException x) {
            System.out.println("Too many absenties");
        }
    }

	
}
