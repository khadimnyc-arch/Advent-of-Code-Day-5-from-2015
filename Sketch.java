import java.io.*;
import java.util.*;
import processing.core.PApplet;

public class Sketch extends PApplet {
    String[] list = new String[1000];
    int currentIndex = 0;
    int count = 0;
    int incorrect = 0;

    public void settings() {
        size(600, 600);
        
    }

    public void setup() {
      frameRate(24);
        // import data from the text file
        try {
            Scanner s = new Scanner(new File("Input.txt"));
            // TASK: get the numbers, line by line into memory
            while(s.hasNextLine()){
                list[currentIndex] = s.nextLine();
                currentIndex++;
            }
            s.close();
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        } 
    }

  //draw function is a loop remeber this its diff from set up
  //238 nice strings in total
    public void draw() {
        background(220);
        System.out.println(mouseX + " , "+ mouseY);
        if(currentIndex<list.length){
          textSize(36);
          if(niceStringcheck(list[currentIndex])==true){
            present();
            fill(0,255,0);
          }else{
            redX();
            fill(255,0,0);}
          text(list[currentIndex],width/2-140,height/2);
          currentIndex++;
        } else{
          currentIndex = 0;
        }

    }


    public boolean niceStringcheck(String str){
      return vowels(str) && block(str) && forbidden(str); 
    }


    public boolean vowels(String str){
    int vowelCount = 0;
    String[] vowels = {"a","e","i","o","u"};
    for(int i = 0;i<str.length();i++){
      String ch = str.substring(i,i+1);
      for(int j = 0; j < vowels.length;j++){
        if(ch.equals(vowels[j]))
        vowelCount+=1;
      }
    }
    if(vowelCount>=3)
      return true;
    return false;
  }
  
//aaghfghfhgfghfyjfk
  public boolean block(String str){
    for(int i = 0;i<str.length()-1;i++){
      String ch = str.substring(i,i+1);//f
      if(ch.equals(str.substring(i+1,i+2))){
        return true;
      }
    }
    return false;
  }
 

  public boolean forbidden(String str){
    String[] forbid = {"ab","cd","pq","xy"};

    for(int i = 0; i<forbid.length;i++){
      String current = forbid[i];
      if(str.indexOf(current)==-1){
        return true;
      }
    }
    return false;
  }


  public void present(){
    fill(0,255,0);
    rect(50,70,100,100);
    fill(255,255,0);
    rect(85,70,25,100);
    rect(50,105,100,25);
    fill(255,0,0);
    rect(40,65,120,18);
  }

  public void redX(){
    strokeWeight(20);
    stroke(255,0,0);
    line(40,60,150,160);
    line(40,160,150,60);
    strokeWeight(0);
  }

}
