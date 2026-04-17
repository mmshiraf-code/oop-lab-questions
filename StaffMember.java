abstract class StaffMember {

    private String fullName;
    private final String staffId;
    protected String department;

    private static int staffCount = 0; // (used in Q5)

    public StaffMember(String fullName, String staffId, String department) {
        this.fullName = fullName;
        this.staffId = staffId;
        this.department = department;
        staffCount++; // Q5 requirement
    }

    public String getFullName() {
        return fullName;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getDepartment() {
        return department;
    }

    public final void displayBasicDetails() {
        System.out.println("Name: " + fullName);
        System.out.println("Staff ID: " + staffId);
        System.out.println("Department: " + department);
    }

    public abstract double calculateMonthlyPayment();

    // Q5
    public static void showSystemName() {
        System.out.println("System: Campus Staff Payment System");
    }

    public static int getStaffCount() {
        return staffCount;
    }

    // Q6
    public void changeDepartment(String newDepartment) {
        if (newDepartment != null && !newDepartment.isEmpty()) {
            this.department = newDepartment;
        }
    }

    public final void showCommonNotice() {
        System.out.println("Notice: All staff must follow university rules.");
    }
}

//// StaffMember is abstract because it represents a general staff and 
// should not be instantiated directly.