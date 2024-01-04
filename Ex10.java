import java.io.*;
class Data{
    public String name;
    public int english;
    public int math;
   
    public Data(){}
    public Data(String str,int e,int m){
        name=str;
        english=e;
        math=m;
    }
    public void writeData(BufferedWriter bfw) throws IOException{           
        bfw.write(name);
        bfw.newLine();
        bfw.write(Integer.toString(english));
        bfw.newLine();
        bfw.write(Integer.toString(math));
        bfw.newLine();
    }  
    public void show(){     
        System.out.println("姓名: "+name);
        System.out.println("英文成績: "+english);
        System.out.println("數學成績: "+math);
        System.out.println("平均："+(english+math)/2.0+"\n");
    } 
}

public class Ex10{
    public static void main(String args[]) throws IOException{
        FileWriter fw=new FileWriter("student.txt");
        BufferedWriter bfw=new BufferedWriter(fw);
        FileReader fr=new FileReader("student.txt");
        BufferedReader bfr=new BufferedReader(fr);  
        Data stu1=new Data("Ariel",92,85);
        Data stu2=new Data("Fiona",67,89);      
        
        stu1.writeData(bfw);
        stu2.writeData(bfw);
        bfw.flush();
        fw.close();
        
        readData(bfr);
        fr.close();     
    }
    public static void readData(BufferedReader bfr) throws IOException{  
        Data s=new Data();   
        String str;
        int count=0;
   
        while((str=bfr.readLine())!=null){ 
            if(count==0)
                s.name=str;
            if(count==1)
                s.english=Integer.parseInt(str);
            if(count==2){
                s.math=Integer.parseInt(str);
                count=-1;
                s.show();
            } 
            count++;           
        }      
    } 
}
