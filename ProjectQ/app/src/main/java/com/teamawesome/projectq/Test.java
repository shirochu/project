package com.teamawesome.projectq;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Test extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonchoice1;
    private Button mButtonchoice2;
    private Button mButtonchoice3;
    private Button mButtonchoice4;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        mScoreView= (TextView) findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonchoice1 = (Button)findViewById(R.id.choice1);
        mButtonchoice2 = (Button)findViewById(R.id.choice2);
        mButtonchoice3 = (Button)findViewById(R.id.choice3);
        mButtonchoice4 = (Button)findViewById(R.id.choice4);

        mButtonchoice1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                if (mButtonchoice1.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(Test.this, "Juist", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Test.this, "Onjuist", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }

            }
        });

            mButtonchoice2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                if (mButtonchoice2.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(Test.this, "Juist", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Test.this, "Onjuist", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }

            }
            });
        mButtonchoice3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                if (mButtonchoice3.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(Test.this, "Juist", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Test.this, "Onjuist", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }

            }
        });
        mButtonchoice4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                if (mButtonchoice4.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(Test.this, "Juist", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Test.this, "Onjuist", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }

            }
        });
    }
    private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonchoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonchoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonchoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mButtonchoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;


    }
    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }
}
