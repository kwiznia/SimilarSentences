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
 * @author Karen Read the file and create a new String with the lines that
 * contains that tag.
 * 
 */
public class ReadFile {

    public static void readFile() throws IOException {
     /**
      * @param allSentence each sentence in one subArray.
     * @param sentence  contains the words from a sentence separate by comma
     * @throws IOException 
     */
        List<ArrayList> allSentences = new ArrayList();
        ArrayList<String> sentence = null; 
        try {
            //read file
            Scanner sc1 = new Scanner(new FileReader("C:\\Users\\Karen\\Desktop\\content.txt"));
            while (sc1.hasNextLine()) {
                Scanner sc2 = new Scanner(sc1.nextLine());
                sc2.useDelimiter("[[0-9], /:, /-]"); //I dont need the time and date for now
                sentence = new ArrayList<>();
                //add every word into the array
                while (sc2.hasNext()) { 
                    String word = sc2.next();
                    sentence.add(word);
                }
                allSentences.add(sentence);
            }
            WriteFile.getSentencesAndWrite(allSentences, sentence); 
        } catch (FileNotFoundException e) {}
    } 
}
