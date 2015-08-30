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

    public int getmQuestion() {
        return mQuestion;
    }

    public void setmQuestion(int question) {
        mQuestion = question;
    }

    public boolean ismTrueQuerstion() {
        return mTrueQuerstion;
    }

    public void setTrueQuerstion(boolean trueQuerstion){
        mTrueQuerstion = trueQuerstion;
    }
}
