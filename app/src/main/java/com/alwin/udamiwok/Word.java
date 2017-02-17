package com.alwin.udamiwok;

/**
 * Created by alwin on 15/02/2017.
 */

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    // Default language of words
    private String mDefaultLanguageWords;

    // Miwok language of words
    private String mMiwokLanguageWords;

    /** Create a new Word object
     *
     * @param defaultLanguageWords is the the word in default (English) language
     * @param miwokLanguageWords is the word in Miwok language
     */
    public Word(String defaultLanguageWords, String miwokLanguageWords) {
        mDefaultLanguageWords = defaultLanguageWords;
        mMiwokLanguageWords = miwokLanguageWords;
    }

    // Gets default (English) language words
    public String getDefaultLanguageWords(){
        return mDefaultLanguageWords;
    }

    // Gets Miwok language words
    public String getMiwokLanguageWords(){
        return mMiwokLanguageWords;
    }
}
