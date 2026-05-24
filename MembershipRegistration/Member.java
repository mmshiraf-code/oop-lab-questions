/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MembershipRegistration;

/**
 *
 * @author Shiraf
 */
class Member {

    private String memberName;
    private String membershipType;
    private boolean newsletterSelected;
    private int numberOfMonths;

    public Member(String memberName, String membershipType,
                  boolean newsletterSelected, int numberOfMonths) {

        this.memberName = memberName;
        this.membershipType = membershipType;
        this.newsletterSelected = newsletterSelected;
        this.numberOfMonths = numberOfMonths;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public boolean isNewsletterSelected() {
        return newsletterSelected;
    }

    public int getNumberOfMonths() {
        return numberOfMonths;
    }

    public int getMembershipFee() {

        if (membershipType.equals("Premium")) {
            return 2500;
        } else {
            return 1000;
        }

    }

    public double calculateTotalFee() {

        double total = getMembershipFee() * numberOfMonths;

        if (newsletterSelected) {
            total = total + 200;
        }

        return total;
    }

    public String getNewsletterMessage() {

        if (newsletterSelected) {
            return "Newsletter Selected";
        } else {
            return "Newsletter Not Selected";
        }

    }

}
