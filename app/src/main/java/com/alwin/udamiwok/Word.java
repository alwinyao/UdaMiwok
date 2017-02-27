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

    // Image resource ID of the words
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    // Constant value that represents no image was provided for this word
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Returns whether or not there is a image of the word
     */

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Create a new Word object
     *
     * @param defaultLanguageWords is the the word in default (English) language
     * @param miwokLanguageWords   is the word in Miwok language
     */

    public Word(String defaultLanguageWords, String miwokLanguageWords) {
        mDefaultLanguageWords = defaultLanguageWords;
        mMiwokLanguageWords = miwokLanguageWords;
    }

    /**
     * Create a new Word object
     *
     * @param defaultLanguageWords is the the word in default (English) language
     * @param miwokLanguageWords   is the word in Miwok language
     * @param imageResourceId      is the drawable image resource ID of words
     */
    public Word(String defaultLanguageWords, String miwokLanguageWords, int imageResourceId) {
        mDefaultLanguageWords = defaultLanguageWords;
        mMiwokLanguageWords = miwokLanguageWords;
        mImageResourceId = imageResourceId;
    }

    // Gets default (English) language words
    public String getDefaultLanguageWords() {
        return mDefaultLanguageWords;
    }

    // Gets Miwok language words
    public String getMiwokLanguageWords() {
        return mMiwokLanguageWords;
    }

    // Gets image resource ID of the words
    public int getImageResourceId() {
        return mImageResourceId;
    }
}