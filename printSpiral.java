package week1_trainning;

public class printSpiral {
    private static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];

        int rowBegin=0;
        int rowEnd=n-1;
        int columnBegin=0;
        int columnEnd=n-1;
        int counter =1;

        while(rowBegin<=rowEnd && columnBegin<=columnEnd){

            for(int i =columnBegin;i<=columnEnd;i++){
                result[rowBegin][i]=counter++;
            }
            rowBegin++;


            for(int i = rowBegin;i<=rowEnd;i++){
                result[i][columnEnd]=counter++;
            }
            columnEnd--;

            if(rowBegin <= rowEnd && columnBegin <= columnEnd){
                for(int i = columnEnd;i>=columnBegin;i--){
                    result[rowEnd][i]=counter++;
                }
                rowEnd--;
            }
            if(rowBegin<= rowEnd && columnBegin<=columnEnd){
                for(int i = rowEnd;i>=rowBegin;i--){
                    result[i][columnBegin]=counter++;
                }
                columnBegin++;
            }
        }
        for(int i=0 ;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(generateMatrix(6));

    }
}
