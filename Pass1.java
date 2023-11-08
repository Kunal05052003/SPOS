import java.util.*;
import java.io.*;
public class Pass1
{
	int address=0;
	int sadd[]=new int[10];
        int ladd[]=new int[10];
        public static void main(String args[])
        {

                BufferedReader br;
                OutputStream oo;
                String input=null;
                
                String IS[]={"ADD","SUB","MUL","MOV"};
                String UserReg[]={"AREG","BREG","CREG","DREG"};
                String AD[]={"START","END"};
                String DL[]={"DC","DS"};
                int lc=0;
                int scount=0,lcount=0;
                int flag=0,flag2=0,stored=0;
                
                String tokens[]=new String[30];
                String tt=null;
                
                String sv[]=new String[10];
                String lv[]=new String[10];
                int toke[]=new int[10];
                
                
               
                
                
           
                try
                {
                        br=new BufferedReader(new FileReader("initial.txt"));
                        File f = new File("IM.txt");
                        File f1 = new File("ST.txt");
                        File f2 = new File("LT.txt");
                        PrintWriter p = new PrintWriter(f);
                        PrintWriter p1 = new PrintWriter(f1);
                        PrintWriter p2 = new PrintWriter(f2);
	            int k=0,l=0;
	            
	            while(k<=100){
	            
	            	int val=0;
	            	int n=10;
	            	for (int i=0;i<n;i++){
	            		toke[i]=i+1;
	            		sv[i]="IS";
	      
	            	}
	            	for (int i=0;i<n;i++){
	            		sv[i]="DS"+sv[i];
	            		l++;
	      
	            	}for (int i=0;i<n;i++){
	            		toke[i]=i+1;
	            		scount+=1;
	            		
	      
	            	}
	            	k+=1;
	            
	            	
	            
	            
	            }
	            
	            
	            
	            
	            
	    }
	    catch(Exception e)
                {
                        e.printStackTrace();
                }}}
