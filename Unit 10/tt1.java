public class tt1 {
    public static void main(String[] args) {
        int i[] = { 12, 31, 1, 12, 123 };
        int b[] = new int[i.length-1];

        b[0] = i [0];
        for(int c: i){
            if (c>b[0]){
                b[0]=c;
            }
        }
        for(int x = 1; x<i.length-1;x++){
            b[x] = b[x-1];
            for(int n:i){
                if(n<b[x-1]){
                    if(n>b[x]){
                        b[x]=n;
                    }
                }
            }
        }
for(int z : b){
    System.out.println(z);
}
    }
}