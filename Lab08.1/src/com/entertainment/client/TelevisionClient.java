/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
 
package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;
import static com.entertainment.DisplayType.*;

class TelevisionClient {
  
    public static void main(String[] args) {
        Television tv = new Television("Samsung", 0, LED);
        System.out.println(tv);
        
        // TODO: change the channel
        tv.changeChannel("ESPN");    //internal station frequency is apparently 2137900


        System.out.println(tv);
    }
}