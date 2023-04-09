class User{
    private String fname, lname,address;
    private int age;
    private long mob;

    private User(String fn, String ln, String adr, int age, long mob){
        fname = fn;
        lname = ln;
        address=adr;
        this.age = age;
        this.mob = mob;

    }

    public static class Builder{
        String fname, lname,address;
        int age;
        long mob;

        public Builder(String fn, String ln){
            fname = fn;
            lname = ln;
        }
        public Builder setAge (int a){
            age = a;
            return this;
        }
        public Builder setAddress (String ad){
            address = ad;
            return this;

        }
        public Builder setMobile (long m){
            mob = m;
            return this;

        }

        public User build(){
            return new User(fname, lname, address, age, mob);
        }
    }

    public static void main(String [] args){
        User.Builder obj = new User.Builder("harsh", "dalal").setAge(22);
        System.out.println(obj.fname);
        System.out.println(obj.age);

    }
}