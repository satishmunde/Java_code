public class Driver {
    public static void main(String[] args) {
        Members m1 = new Members();
        m1.setName("Satish Munde");
        m1.setAddress("Panvel");
        m1.setMembershipID(202);

        // System.out.println(m1.getName());
        // System.out.println(m1.getAddress());
        // System.out.println(m1.getMembershipid());


        // Book b1 = new Book();
        // b1.setAuthor("Satish Munde");
        // b1.setTitle("Qspider Navi Mumbai");
        // b1.setISBN("A1234");
        // b1.setAvailability(true);

        // System.out.println(b1.getAuthor());
        // System.out.println(b1.getTitle());
        // System.out.println(b1.getISBN());
        // System.out.println(b1.getAvailibilty());

        Transaction  t1 = new Transaction();
        t1.setMember(m1);
        System.out.println(t1.getMembers());
    }
}
