public class assignment3 {
    public static void main(String[] args) {
        for(int i=1;i<=260;i++){
            if(i==14){
                System.out.println("break");
                continue;
            }else if(i==26){
                System.out.println("break");
                break;
            }else{
                System.out.println(i);
            }
        }
    }
}
