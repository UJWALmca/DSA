class Main{
    public static void main(String args[]){
        System.out.println("hello world");
        StringBuilder s= new StringBuilder();
        s.append("uj");
        System.out.println(s);
       StringBuilder j=new StringBuilder();
       j=s;
       System.out.println(j.hashCode()
       );
s.append("wal");
       System.out.println(s.hashCode());
       System.out.println(j.hashCode());
       
        
    }
                                }