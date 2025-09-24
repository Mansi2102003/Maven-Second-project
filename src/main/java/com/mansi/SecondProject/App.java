package com.mansi.SecondProject;

/**
 * Hello world!
 */
//public class App {
 //   public static void main(String[] args) {
   //     System.out.println("Hello World!");
  //  }
//}
//package com.vogella.maven.lars;

import com.google.gson.Gson;

public class App 
{
    public static void main( String[] args )
    {
        Gson gson = new Gson();
        System.out.println(gson.toJson("Hello World!") );
    }
}