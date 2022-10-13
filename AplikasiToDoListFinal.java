/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class AplikasiToDoListFinal {

    public static String[]model = new String[10];
    public static java.util.Scanner scanner=new java.util.Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     testViewShowToDoList();
        // TODO code application logic here
    }
/**
 * Menampilkan To Do List
 */
public static void showTodoList(){
    System.out.println("TODOLIST");
    for (int i = 0; i < model.length;i++){
     String todo=model[i];
     int no = i+1;
    
    if(todo!= null){
        System.out.println(no+"."+todo);
    }
    }
}
public static void testshowTodoList(){
    model[0] = "Belajar Java Dasar";
    model[1] = "Studi Kasus Java Dasar : Aplikasi To Do List";
    showTodoList();
}
/**
 * Menambahkan To Do ke List
     * @param todo
 */
public static void addToDoList(String todo){
    boolean isFull = true;
        for (int i = 0; i < model.length;i++){
            if(model[i] == null){
                isFull = false;
                break;
            }
        }
        if(isFull){
            String[] temp=model;
            model = new String[model.length*2];
            for(int i=0;i<temp.length;i++){
                model[i]=temp[i];
            }
        }
        for (int i = 0; i < model.length;i++){
        if(model[i] == null){
                model[i] = todo;
                break;
        }
    }
}
public static void testAddTodoList(){
    for(int i=0;i<25;i++){
        addToDoList("Contoh ToDo ke-" + i);
    }
    showTodoList();
}
/**
 * Menghapus To Do dari List
     * @param number
     * @return 
 */
public static boolean removeToDoList(Integer number){   
    if ((number -1)>=model.length){
    return false;
}else if (model[number -1]==null){
        return false;
        }else{
        for (int i=(number-1);i<model.length;i++){
        if(i==(model.length-1)){
        model[i]=null;
        }else{
        model[i]=model[i+1];
        }
        }
        return true;
}
}
public static void testRemoveToDoList(){
    addToDoList("satu");
    addToDoList("dua");
        addToDoList("tiga");
            addToDoList("empat");
                addToDoList("lima");
                
                boolean result=removeToDoList(20);
                System.out.println(result);
                
                result=removeToDoList(7);
                System.out.println(result);
                
                result=removeToDoList(2);
                System.out.println(result);
                
                showTodoList();
}
    public static String input(String info){
    System.out.println(info+ " : ");
    String data=scanner.nextLine();
    return data;
    
    }    
    public static void testInput(){
        String name=input("Nama");
        System.out.println("Hi " + name);
        
        String Channel = input("Channel");
        System.out.println(Channel);
    }
/**
 * Menampilkan menu To Do List
 */
public static void viewShowTodoList(){
    while(true){
        showTodoList();
        
        System.out.println("MENU : ");
        System.out.println("1. Tambah");
        System.out.println("1. Hapus");
        System.out.println("1. Keluar");
        
        String input=input("Pilih");
        
        if(input.equals("1")){
             viewAddTodoList();
        }else if
             (input.equals("2")){
            viewRemoveTodoList();
        }else if
            (input.equals("x")) {
             break;
        }else{
        System.out.println("Pilihan Tidak Dimengerti");
        }
    }
}
public static void testViewShowToDoList(){
addToDoList("Satu");
addToDoList("Dua");
addToDoList("Tiga");
addToDoList("Empat");
addToDoList("Lima");
viewShowTodoList();
}
/**
 * Menampilkan view menambahkan To Do List
 */
public static void viewAddTodoList(){
    System.out.println("Menambah To Do List");
    String todo = input("Todo (x Jika Batal");
    if (todo.equals("x")){
    }else{
        addToDoList(todo);
    }
}
public static void testViewAddToDoList(){
    addToDoList("Satu");
    addToDoList("Dua");
    viewAddTodoList();     
    showTodoList();
}
public static void viewRemoveTodoList(){
System.out.println("Menghapus To Do List");
String number = input ("Nomor yang Dihapus (x jika batal)");
if (number.equals("x")){
//batal
} else {
boolean success = removeToDoList(Integer.valueOf(number));
if (!success){
System.out.println("Gagal menghapus todolist : " + number);
}
}
}
public static void testViewRemoveTodoList() {
addToDoList("Satu");
addToDoList("Dua");
addToDoList("Tiga");

showTodoList();

viewRemoveTodoList();
showTodoList();
 
}
}




  