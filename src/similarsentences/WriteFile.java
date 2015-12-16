/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package similarsentences;

import java.io.*;
import java.util.*;

/**
 *
 * @author Karen
 */
public class WriteFile {

    public static void getSentencesAndWrite(List<ArrayList> allSentences, List sentence) throws IOException {
        /**
         * @param differentWord1 word to write in the file
         * @param differentWord2 word to write in the file
         * @param sentenceToWrite1 sentence to write in the file
         * @param sentenceToWrite2 sentence to write in the file
         **/
        
        int count = 0;
        String differentWord1 = null;
        String differentWord2 = null;
        List sentenceToWrite1 = null;
        List sentenceToWrite2 = null;

        File outFile = new File("C:\\Users\\Karen\\Desktop\\FinalFile.txt");
        FileWriter fWriter = new FileWriter(outFile);
        PrintWriter pWriter = new PrintWriter(fWriter);
        pWriter.println("====");
        pWriter.println("\n");

            for (int i = 0; i < allSentences.size(); i++) { //compare the first value of allSentences Array
                for (int j = i + 1; j < allSentences.size(); j++) { //compare the second value of allSentences Array
                    for (int k = 0; k < sentence.size(); k++) { //compare the value of sentence Array
                        if (!allSentences.get(i).get(k).equals(allSentences.get(j).get(k))) {
                            count += 1;
                            differentWord1 = (String) allSentences.get(i).get(k);
                            differentWord2 = (String) allSentences.get(j).get(k);
                            sentenceToWrite1 = allSentences.get(i);
                            sentenceToWrite2 = allSentences.get(j);
                        }
                    }
                    //if there is less than 1 word different between the two sentences, then write it in the file
                    if (count <= 1) {
                        String firstSentence = String.join(" ", sentenceToWrite1);
                        String secondSentence = String.join(" ", sentenceToWrite2);

                        pWriter.println(firstSentence.trim());
                        pWriter.println(secondSentence.trim());
                        pWriter.println("The changing word was: " + differentWord1 + ", " + differentWord2);
                        pWriter.println("\n");
                    } else {
                        count = 0;
                    }
                }
            }
            pWriter.println("====");
            pWriter.close();
    }
}
