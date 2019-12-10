
public class RottenPotato
{
    static int[][] rating = { {4,6,2,5},
            {7,9,4,8},
            {6,9,3,7} };
    //row=reviewer
    //column=movie 

    public static void main(String args[]){
        System.out.println(movieAvgRating(rating,0));
        System.out.println(reviewerAvgRating(rating,0));
        System.out.println(avgRating2018(rating));
        System.out.println(hardestRater2018(rating));
        System.out.println(worstMovie2018(rating));
    }
    //question 1
    public static double movieAvgRating(int[][] rating, int movie){
        double sum=0;
        for(int r=0; r<rating.length; r++){
            sum=sum + rating[r][movie];
        }
        double avg=sum/rating.length;
        return avg;
    }
    //question 2
    public static double reviewerAvgRating(int[][] rating, int reviewer){
        double sum=0;
        for(int c=0; c<rating[0].length; c++){
            sum=sum+rating[reviewer][c];
        }
        double avg=sum/rating[0].length;
        return avg;
    }
    //question 3
    public static double avgRating2018(int[][] rating){
        double sum=0;
        int a=0;
        for(int r=0;r<rating.length; r++){
            for(int c=0; c<rating[0].length; c++){
                sum=sum+rating[r][c];
                a++;
            }
        }
        double avg=sum/a;
        return avg;
    }
    //question 4
    public static int hardestRater2018(int[][] rating){
        int sum1=0;
        int sum2=0;
        int sum3=0;
        for(int c=0; c<rating[0].length; c++){
            sum1=sum1+rating[0][c];
            sum2=sum2+rating[1][c];
            sum3=sum3+rating[2][c];
        }
        int avg1=sum1/rating[0].length;
        int avg2=sum2/rating[0].length;
        int avg3=sum3/rating[0].length;
        if(avg1<=avg2 && avg1<=avg3)
            return 0;
        else if(avg2<=avg1 && avg2<=avg3)
            return 1;
        else
            return 2;
    }
    //question 5
    public static int worstMovie2018(int[][] rating){
        int sum1=0;
        int sum2=0;
        int sum3=0;
        int sum4=0;
        for(int r=0; r<rating.length; r++){
            sum1=sum1+rating[r][0];
            sum2=sum2+rating[r][1];
            sum3=sum3+rating[r][2];
            sum4=sum4+rating[r][3];
        }
        int avg1=sum1/rating.length;
        int avg2=sum2/rating.length;
        int avg3=sum3/rating.length;
        int avg4=sum4/rating.length;
        if(avg1<=avg2 && avg1<=avg3 && avg1<=avg4)
            return 0;
        else if(avg2<=avg1 && avg2<=avg3 && avg2<=avg4)
            return 1;
        else if(avg3<=avg1 && avg3<=avg2 && avg3<=avg4)
            return 2;
        else
            return 3;
    }
    
}
