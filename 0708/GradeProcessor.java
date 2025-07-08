
public class GradeProcessor {
    public static void main(String[] args) {
        int[] grade={78,85,92,67,88,95,73,90};

        int sum=0;

        for(int i=0;i<grade.length;i++){
            sum+=grade[i];
        }
        double avg=(sum/grade.length);
        System.out.println("總分:"+sum);
        System.out.printf("平均:%.2f\n",avg);
    

    int max = grade[0];
    int min = grade[0];
    int maxIndex=0;
    int minIndex=0;
    int comparisons=0;
    int overavg=0;
    for(int i=1;i<grade.length;i++){
        comparisons+=2;

    if(grade[i]>max){
        max=grade[i];
        maxIndex=i;
       
    }
   if(grade[i]<min){
    min=grade[i];
    minIndex=i;
   
   }
   if(grade[i]>avg){
    overavg++;
   }
    }
    System.out.printf("最高分:%d(位置:%d)\n", max, maxIndex);
    System.out.printf("最低分:%d(位置:%d)\n", min, minIndex);
    System.out.printf("超過平均分人數:%d\n",overavg);

    for(int i=0;i<grade.length;i++){
    System.out.println((i+1)+":"+grade[i]);
}

    }
}