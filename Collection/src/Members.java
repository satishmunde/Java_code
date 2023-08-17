public class Members {
    private String name;
    private String address;
    private int membershipid;


    

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public int getMembershipid(){
        return membershipid;
    }
    
    public void setName( String name){
        this.name = name;

    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setMembershipID(int id){
        this.membershipid = id;
    }
}


