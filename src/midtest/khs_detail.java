/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtest;

import java.util.ArrayList;
import java.util.Arrays;
import static midtest.Midtest.matkul;

/**
 * Ujian Mid Test Term -3 , Pelajaran : Pemograman Berorientasi Objek (PBO)
 * @author Richard Cenderawan 03082170009 17TI1
 */
public class khs_detail {
        private static ArrayList <MataKuliah> datamatkul = Midtest.matkul; 
        private ArrayList <khs> datakhs = Midtest.khs;
        
        private char[] kode_khs_detail = new char[8];
       
        private term dtterm = new term();
        private MataKuliah dtmatkul = new MataKuliah();
      
        
        
        public khs_detail (){}
        
        public khs_detail (char[] kode_khs_detail){
        this.kode_khs_detail = kode_khs_detail;
       
        }



        public char[] getkode_khs_detail(){
            return this.kode_khs_detail;
        }
  
        public void Setkode_khs_detail(char[] kode_khs_detail){
            this.kode_khs_detail = kode_khs_detail;
        }         
               
       
   

        public MataKuliah getDetailMataKuliah(char[] kodematkul){
            for(int i =0;i<datamatkul.size();i++){
                if(Arrays.equals(datamatkul.get(i).getkode_matakuliah(), kodematkul)){
                    return datamatkul.get(i);
                }
            }
            return null;
        } 
        
        public String tampilkanDataMatakuliah(){
            for(int i =0;i<datamatkul.size();i++){
                return             "\n Kode Mata Kuliah               : "+Arrays.toString(datamatkul.get(i).getkode_matakuliah())+"\n"+
                                   " Nama Mata Kuliah               : "+datamatkul.get(i).getnama_MataKuliah()+"\n"+
                                   " SKS                            : "+datamatkul.get(i).getsks()+"\n"+
                                   " Nilai                          : "+datamatkul.get(i).getNilai();
                        
        }
            return null;
    }
        

        
        

        
        
}
