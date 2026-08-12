public class Methodspractice5 {
    public static float CalculatePercentage(int Obtained ,float Total) {
        float result = (Obtained * 100) / Total;
        return result;
    }

    public static void main(String[] args) {
        float finalAns=CalculatePercentage(10,365);
        System.out.println(finalAns +" ");
    }
}
