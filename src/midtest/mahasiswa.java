/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtest;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Ujian Mid Test Term -3 , Pelajaran : Pemograman Berorientasi Objek (PBO)
 * @author Richard Cenderawan 03082170009 17TI1
 */
public class mahasiswa {
        private ArrayList <khs> datakhs = Midtest.khs;
        private ArrayList <term> dataterm = Midtest.term;  
        private ArrayList <MataKuliah> datamatkul = Midtest.matkul;
       
        
        private char[] studentID = new char[10];
        private char[] nama = new char[50];
        private String jurusan;
        private char[] tahun_masuk = new char[4];
        private khs dtkhs = new khs();
        private term dtterm = new term();
        
       
        public mahasiswa(){          
        }
        
        public mahasiswa (char[] studentID , char[] nama , String jurusan , char[] tahun_masuk){
        this.studentID = studentID;
        this.nama = nama;
        this.jurusan = jurusan;
        this.tahun_masuk = tahun_masuk;
        }
        
        public char[] getstudentID(){
            return this.studentID;
        }
  
        public void SetstudentID(char[] studentID){
            this.studentID = studentID;
        }

        public char[] getnama(){
            return this.nama;
        }
  
        public void Setnama(char[] nama){
            this.nama = nama;
        }
        
        public String getjurusan(){
            return this.jurusan;
        }
  
        public void Setjurusan(String jurusan){
            this.jurusan = jurusan;
        }
           
        public char[] gettahun_masuk(){
            return this.tahun_masuk;
        }
  
        public void Settahun_masuk(char[] tahun_masuk){
            this.tahun_masuk = tahun_masuk;
        }

        public MataKuliah getDetailMataKuliah(char[] kodematkul){
            for(int i =0;i<datamatkul.size();i++){
                if(Arrays.equals(datamatkul.get(i).getkode_matakuliah(), kodematkul)){
                    return datamatkul.get(i);
                }
            }
            return null;
        } 

        
        public khs getDataKHS(char[] kodekhs){
            for(int i =0;i<datakhs.size();i++){
                if(Arrays.equals(datakhs.get(i).getkode_khs(), kodekhs)){
                    return datakhs.get(i);
                }
            }
            return null;
        }         
        
        public term getDetailterm(char[] kodeterm){
            for(int i =0;i<dataterm.size();i++){
                if(Arrays.equals(dataterm.get(i).getkode_term(), kodeterm)){
                    return dataterm.get(i);
                }
            }
            return null;
        }  
     

        public double getbobot(){
            for(int i =0;i<datakhs.size();i++){
                return datakhs.get(i).getIPKsemester();
            } 
            return 0;
            
        }
        public int getsks(){
            for(int i =0;i<datamatkul.size();i++){
                return datamatkul.get(i).getsks();
            } 
            return 0;
            
        }        
        public double getIPK(){
           
                int SKS, jlhKumulatif = 0;
                for(int i =0;i<datamatkul.size();i++){
                    SKS = datamatkul.get(i).getsks();
                    jlhKumulatif+=(SKS * getbobot());
                        
                }
            return jlhKumulatif;
        }
        
        public double gettotIPK(){
           
                double IPK = 0;
                int totSKS = 0 ;
                for(int i =0;i<datamatkul.size();i++){
                    totSKS = datamatkul.get(i).getsks();
                    
                       
                IPK = getIPK() / totSKS;
                }
            return IPK;
        }
        
       
        
}
 

                               
                             



        
        
        
