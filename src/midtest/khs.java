/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtest;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import static midtest.Midtest.mahasiswa;

/**
 * Ujian Mid Test Term -3 , Pelajaran : Pemograman Berorientasi Objek (PBO)
 * @author Richard Cenderawan 03082170009 17TI1
 */
public class khs {
        private static ArrayList <term> dataterm = Midtest.term;
        private ArrayList <khs_detail> datakhsdetail = Midtest.khsdetail;
        private ArrayList <mahasiswa> datamhs = Midtest.mahasiswa;
        private static ArrayList <MataKuliah> datamatkul = Midtest.matkul;
       
        
        private char[] kode_khs = new char[10];
        private String keterangan;
        private char[] keterangan_singkat = new char[100];
        private term dtterm = new term();
        private MataKuliah dtmatkul = new MataKuliah();
            
      
        
        public khs(){}
        
        public khs (char[] kode_khs , String keterangan , char[] keterangan_singkat){
        this.kode_khs = kode_khs;
        this.keterangan = keterangan ;
        this.keterangan_singkat = keterangan_singkat;
        }

        
        public char[] getkode_khs(){
            return this.kode_khs;
        }
  
        public void Setkode_khs(char[] kode_khs){
            this.kode_khs = kode_khs;
        }        
        
        public String getketerangan(){
            return this.keterangan;
        }

        public void Setketerangan(String keterangan){
            this.keterangan = keterangan;
        } 
        
        public char[] getketerangan_singkat(){
            return this.keterangan_singkat;
        }
  
        public void Setketerangan_singkat(char[] keterangan_singkat){
            this.keterangan_singkat = keterangan_singkat;
        }
        

       public term getDetailterm(char[] kodeterm){
            for(int i =0;i<dataterm.size();i++){
                if(Arrays.equals(dataterm.get(i).getkode_term(), kodeterm)){
                    return dataterm.get(i);
                }
            }
            return null;
        }  
     
        
        public String tampilkanDataTerm(){
            for(int i =0;i<dataterm.size();i++){
                return             "\n Kode Term                      : "+Arrays.toString(dataterm.get(i).getkode_term())+"\n"+
                                   " Tahun Ajaran                   : "+Arrays.toString(dataterm.get(i).gettahun_ajaran())+"\n"+
                                   " Semester                       : "+Arrays.toString(dataterm.get(i).getsemester())+"\n";
                        
        }
            return null;
    }

        
        
        public MataKuliah getIPKsemester(char[] kdmatkul){
            for(int i =0;i<datamatkul.size();i++){
                if(Arrays.equals(datamatkul.get(i).getkode_matakuliah(), kdmatkul)){
                    return datamatkul.get(i);
                }
            }
            return null;
        }
        
        public double getIPKsemester(){
            for(int i =0;i<datamatkul.size();i++){
                return datamatkul.get(i).getNilai();
            } 
            return 0;
            
        }
     
}
              

        
        
 
               
            
 
        
        
      
        
        
        

    
