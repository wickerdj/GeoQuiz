package com.example.wickerdj.geoquiz;

/**
 * Created by wickerdj on 8/29/15.
 */
public class TrueFalse {
    private int mQuestion;

    private boolean mTrueQuerstion;

    public TrueFalse(int question, boolean trueQuestion){
        mQuestion = question;
        mTrueQuerstion = trueQuestion;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public boolean isTrueQuestion() {
        return mTrueQuerstion;
    }

    public void setTrueQuestion(boolean trueQuestion){
        mTrueQuerstion = trueQuestion;
    }
}
