
public class ScoreStatistucs {
public static void main(String[] args) {
    int[] scores={87,75,95,92,64,86,70,93,58,46};
    int sum=0;

    for(int i=0;i<scores.length;i++){
        sum+=scores[i];
     
    }
    double avg=(sum/scores.length);
    System.out.printf("學生人數:%d人\n",scores.length);
    System.out.printf("總分:%d分\n",sum);
    System.out.printf("平均分數:%.2f分\n",avg);
    
    System.out.println("個別成績");
        for(int i=0;i<scores.length;i++){
            System.out.println("第"+(i+1)+"位學生:"+scores[i]);
        }
}    
}
