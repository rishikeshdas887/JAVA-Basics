public class methodOverloading {
    static int add(int x, int y , int z){
        int sum=x+y+z;
        return sum;
    }
      static int add(int x , int z){
        int ans=x+z;
        return ans;
    }
    public static void main(String[] args) {
        int ans1=add(1,2,3);
        System.out.println("Ans1: "+ans1);
         int ans2=add(1,2);
          System.out.println("Ans2: "+ans2);
    }
}
