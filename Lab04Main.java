public class Lab04Main {
    public static void main(String[] args) {

        // System Name
        StaffMember.showSystemName();

        // Policy Header
        UniversityPolicy.showPolicyHeader();
        System.out.println("University: " + UniversityPolicy.UNIVERSITY_NAME);

        // Create objects (2 Lecturers + 1 LabAssistant)
        Lecturer l1 = new Lecturer("Ali", "L001", "IT", 3, 5000);
        Lecturer l2 = new Lecturer("Sara", "L002", "CS", 2, 6000);
        LabAssistant la1 = new LabAssistant("John", "LA001", "IT", 100, 50);

        // Change department (Q6)
        l1.changeDepartment("Software Engineering");

        // Display Details
        System.out.println("\n--- Lecturer 1 ---");
        l1.displayLecturerDetails();

        System.out.println("\n--- Lecturer 2 ---");
        l2.displayLecturerDetails();

        System.out.println("\n--- Lab Assistant ---");
        la1.displayLabAssistantDetails();

        // Payments
        double p1 = l1.calculateMonthlyPayment();
        double p2 = l2.calculateMonthlyPayment();
        double p3 = la1.calculateMonthlyPayment();

        System.out.println("\nPayments:");
        System.out.println("L1: " + p1);
        System.out.println("L2: " + p2);
        System.out.println("LA1: " + p3);

        // Total payment
        double total = p1 + p2 + p3;
        System.out.println("Total Payment: " + total);

        // Bonus
        System.out.println("\nBonus:");
        System.out.println("L1 Bonus: " + UniversityPolicy.calculateBonus(p1));
        System.out.println("L2 Bonus: " + UniversityPolicy.calculateBonus(p2));
        System.out.println("LA1 Bonus: " + UniversityPolicy.calculateBonus(p3));

        // Staff Count
        System.out.println("\nTotal Staff: " + StaffMember.getStaffCount());

        // Common Notice
        System.out.println("\nNotices:");
        l1.showCommonNotice();
        l2.showCommonNotice();
        la1.showCommonNotice();
    }
} // staffCount is static because it is shared among all objects to count total staff.
// changeDepartment() allows controlled updates instead of direct access, ensuring validation.