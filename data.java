package app;
import java.io.*;
class Data
{
    String name;
    Data(String wrd)
    {
        this.name = wrd;
    }
    public String send_to_file()
    {
        return this.name+" ";
    }
    public void saveObject(String fileName) throws IOException
    {
        File f = new File(fileName);
        if(f.exists())
        {
            FileWriter fw = new FileWriter(fileName,true);
            fw.write(this.send_to_file());
            fw.close();
        }
        else
        {
            FileWriter fw = new FileWriter(fileName);
			fw.write(this.send_to_file());
			fw.close();
        }
    }
    public static String retrievObject(String nameOfFile)throws IOException
    {
        char add[]= new char[10];
        File f = new File(nameOfFile);
        FileReader fr = new FileReader(nameOfFile);
        fr.read(add);
        fr.close();
        String add1 = new String(add);
        return add1;
    }

    public static Double addition(Double number)
    {
        Double number_one= number;
        Double number_two=10.67;
        return number_one+number_two;
    }
}