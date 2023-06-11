package Bab4;

public class Student2 {
    private String name;
    private int mark;
    //jawaban no 3, terjadi error
    //private void setName(String n){
        //name=n;
    //}
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setMark(int m){
        mark=m;
    }
    public int getMark(){
        return mark;
    }
}