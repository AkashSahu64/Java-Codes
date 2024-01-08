class Throw{
    public static int area(int a) throws VoteAge{
        if(a<17){
            throw new VoteAge();
        }
        return a;
    }
    public static void main(String[] args){
        int a = 12;
        if (a < 17) {
            try {
                throw new VoteAge();
            }
            catch (Exception e){
                System.out.println(e.toString());
                System.out.println(e.toString());
            }
        }
    }
}
class VoteAge extends Exception{
    public String toString(){
        return "Age can not be less than 18";
    }
    public String getString(){
        return "Age can not be less than 18";
    }
}