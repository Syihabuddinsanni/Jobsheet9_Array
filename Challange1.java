package ChallangeArray;
   
    public class Challange1 {
       //public static void main(String[]args){
            String nama [] [] = {{"RENDY PRAYATA WIBAWA"}, {"RUQUL ADAM HIMAWAN"}, {"SHEVANDRA QEYSYA"}, {"NAUFAL GAJENDRA"}, {"MEMOREZA SABANA"}, {"MUHAMMAD DAMAR WIDYANSYAH"}, 
                {"VIKO ATHMAT VERANDA"}, {"FAKHAR REZA ALAMSYAKH"}, {"LUKMAN HIDAYATULLAH"}, {"MUHAMMAD IZZUL HAQ SYIHABUDDIN SANNI"}};
            String alamat [] [] = {{"Tuban"}, {"Srengat"}, {"Jombang"}, {"Malang"}, {"Tuban"}, {"Tulungagung"}, {"Probolinggo"}, {"Malang"}, {"Kepanjen"}
                    , {"Tuban"}};
        
            String hoby [] [] = {{"Main game"}, {"Main game"}, {"Membaca"}, {"Main game"}, {"Main game"}, {"Main game"}, {"Main game"}, {"Main game"}
                    , {"Main game"}, {"Main game"}};
           
            String nohp [] [] = {{"0858 041 46990"}, {"0859 193 774 917"}, {"0821 2291 4244"}, {"085 231 371 755"}, {"081 233 333 112"}, {"085 736 041 408"}
                    , {"081 455 028 343"}, {"081 217 507779"}, {"081 217 507779"}, {"0822 1009 2669"}};
        
            String ig [] [] = {{"@Rendiwibawa"}, {"@Adamhim_"}, {"@Sqeysa"}, {"@Pramuda_Yusril"}, {"@Noe_ewew"}, {"@Ozaz_"}, {"@Damawdsyh"}, {"@Captainhimer_"}, {"@Pak_Pres"}, {"@L_ahha_"}};
            
            public void tampil(String n){
                    System.out.println("------𝔹𝕚𝕠𝕕𝕒𝕥𝕒 𝕒𝕟𝕘𝕜𝕒𝕥𝕒𝕟 𝟚𝟠------");
                    System.out.println("===============================");
            }
             public void biodata (int n){
            for (int i = 0; i< 1; i++){
                for (int j = 0; j < 1; j++){
                System.out.println("NAMA      : "+nama [1][j]+"\n"+"Alamat    : "+alamat [1][j]+"\n"+"Hoby      : "+hoby [1] [j]+"\n"+"Nomor Hp  : "+nohp [1][j]+"\n"+"Instagram : "+ig [1][j]+"\n");
                    
                System.out.println("Nama      : "+nama [4][j]+"\n"+"Alamat    : "+alamat [4][j]+"\n"+"Hoby      : "+hoby [4] [j]+"\n"+"Nomor Hp  : "+nohp [4][j]+"\n"+"Instagram : "+ig [4][j]);
                
            }
            }
             }
             public static void main(String[]args){
                 Challange1 siswa = new Challange1();
                 siswa.tampil(null);
                 siswa.biodata(0);
                 
             }
    }
                    
        
            
        
        
    

