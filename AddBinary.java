package week1_trainning;

public class AddBinary{
    private static int add(int a , int b ){
        int result= 0;
        int reminder = 0;

        while(a>0 && b > 0){
            reminder = reminder + a%10;
            a=a/10;
            reminder = reminder + b%10;
            b=b/10;
            if(reminder==1){
                result=result + reminder*10;
            }
            if(reminder==2){
                result = result *10;
                reminder =1;
            }

        }
        while(a>0){
            reminder = reminder +a%10;
            a=a/10;
            if(reminder==1){
                result=result*10 + reminder;
            }
        }
        while(b>0){
            reminder = reminder +b%10;
            b=b/10;
            if(reminder==1){
                result=result*10 + reminder;
            }
        }
        if (reminder==1){
            result = result *10 +reminder;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(add(10,11));
    }
}
