package Jobsheet9;

    public class Array5 {
        public static void main(String[] args){
            //Array multi dimensi lagi :v
            
            int [] [] [] nilai = {
                {{51, 89}, {60, 59}, {52, 47}},
                {{39, 58}, {71, 85}, {39, 78}},
                {{81, 32}, {51, 86}, {59, 31}}
            };
            for (int i= 0; i<nilai.length; i++){
                for(int j = 0; j<nilai[0].length; j++){
                    for(int k = 0; k<nilai[0] [0].length; k++){
                        System.out.print("nilai[" +i+ "][" +j+ "[" +k+ "] = " + nilai [i][j][k]+ "\t");
                        
                    }
                    System.out.println();
            }
                System.out.println();
            }
        }
    }
    
    

