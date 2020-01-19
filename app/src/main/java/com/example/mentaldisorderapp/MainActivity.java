package com.example.mentaldisorderapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button answer0, answer1, answer2, answer3, answer4;

    TextView questionNum, question;

    private Questions mQuestion = new Questions();

    private String[] mAnswer = new String[5];
    private int qNum = 0;
    private int mQuestionLength = mQuestion.mQuestions.length;
    private String results;

    private int[] mentIllness = new int[6];
    //dep - 0, aux - 1, ano - 2, bul - 3, bin - 4, dom - 5

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer0 = (Button) findViewById(R.id.answer0);
        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);

        questionNum = (TextView) findViewById(R.id.questionNum);
        question = (TextView) findViewById(R.id.question);

        mentIllness[0] = 0;
        mentIllness[1] = 0;
        mentIllness[2] = 0;
        mentIllness[3] = 0;
        mentIllness[4] = 0;
        mentIllness[5] = 0;

        updateQuestion(qNum);

        answer0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tempI[] = new int[6];
                tempI[0] = Character.getNumericValue(mAnswer[0].charAt(0));
                tempI[1] = Character.getNumericValue(mAnswer[0].charAt(1));
                tempI[2] = Character.getNumericValue(mAnswer[0].charAt(2));
                tempI[3] = Character.getNumericValue(mAnswer[0].charAt(3));
                tempI[4] = Character.getNumericValue(mAnswer[0].charAt(4));
                tempI[5] = Character.getNumericValue(mAnswer[0].charAt(5));

                mentIllness[0] += tempI[0];
                mentIllness[1] += tempI[1];
                mentIllness[2] += tempI[2];
                mentIllness[3] += tempI[3];
                mentIllness[4] += tempI[4];
                mentIllness[5] += tempI[5];

                qNum = qNum + 1;
                updateQuestion(qNum);
            }
        });

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tempI[] = new int[6];
                tempI[0] = Character.getNumericValue(mAnswer[1].charAt(0));
                tempI[1] = Character.getNumericValue(mAnswer[1].charAt(1));
                tempI[2] = Character.getNumericValue(mAnswer[1].charAt(2));
                tempI[3] = Character.getNumericValue(mAnswer[1].charAt(3));
                tempI[4] = Character.getNumericValue(mAnswer[1].charAt(4));
                tempI[5] = Character.getNumericValue(mAnswer[1].charAt(5));

                mentIllness[0] += tempI[0];
                mentIllness[1] += tempI[1];
                mentIllness[2] += tempI[2];
                mentIllness[3] += tempI[3];
                mentIllness[4] += tempI[4];
                mentIllness[5] += tempI[5];

                qNum = qNum + 1;
                updateQuestion(qNum);
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tempI[] = new int[6];
                tempI[0] = Character.getNumericValue(mAnswer[2].charAt(0));
                tempI[1] = Character.getNumericValue(mAnswer[2].charAt(1));
                tempI[2] = Character.getNumericValue(mAnswer[2].charAt(2));
                tempI[3] = Character.getNumericValue(mAnswer[2].charAt(3));
                tempI[4] = Character.getNumericValue(mAnswer[2].charAt(4));
                tempI[5] = Character.getNumericValue(mAnswer[2].charAt(5));

                mentIllness[0] += tempI[0];
                mentIllness[1] += tempI[1];
                mentIllness[2] += tempI[2];
                mentIllness[3] += tempI[3];
                mentIllness[4] += tempI[4];
                mentIllness[5] += tempI[5];

                qNum = qNum + 1;
                updateQuestion(qNum);
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tempI[] = new int[6];
                tempI[0] = Character.getNumericValue(mAnswer[3].charAt(0));
                tempI[1] = Character.getNumericValue(mAnswer[3].charAt(1));
                tempI[2] = Character.getNumericValue(mAnswer[3].charAt(2));
                tempI[3] = Character.getNumericValue(mAnswer[3].charAt(3));
                tempI[4] = Character.getNumericValue(mAnswer[3].charAt(4));
                tempI[5] = Character.getNumericValue(mAnswer[3].charAt(5));

                mentIllness[0] += tempI[0];
                mentIllness[1] += tempI[1];
                mentIllness[2] += tempI[2];
                mentIllness[3] += tempI[3];
                mentIllness[4] += tempI[4];
                mentIllness[5] += tempI[5];

                qNum = qNum + 1;
                updateQuestion(qNum);
            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tempI[] = new int[6];
                tempI[0] = Character.getNumericValue(mAnswer[4].charAt(0));
                tempI[1] = Character.getNumericValue(mAnswer[4].charAt(1));
                tempI[2] = Character.getNumericValue(mAnswer[4].charAt(2));
                tempI[3] = Character.getNumericValue(mAnswer[4].charAt(3));
                tempI[4] = Character.getNumericValue(mAnswer[4].charAt(4));
                tempI[5] = Character.getNumericValue(mAnswer[4].charAt(5));

                mentIllness[0] += tempI[0];
                mentIllness[1] += tempI[1];
                mentIllness[2] += tempI[2];
                mentIllness[3] += tempI[3];
                mentIllness[4] += tempI[4];
                mentIllness[5] += tempI[5];

                qNum = qNum + 1;
                updateQuestion(qNum);
            }
        });


    }

    private void updateQuestion(int num) {
        if (num < mQuestionLength) {
            question.setText(mQuestion.getQuestion(num));
            questionNum.setText(mQuestion.getQuestionNumber(num));

            answer0.setText(mQuestion.getChoice0());
            answer1.setText(mQuestion.getChoice1());
            answer2.setText(mQuestion.getChoice2());
            answer3.setText(mQuestion.getChoice3());
            answer4.setText(mQuestion.getChoice4());

            mAnswer[0] = mQuestion.getAnswer0(num);
            mAnswer[1] = mQuestion.getAnswer1(num);
            mAnswer[2] = mQuestion.getAnswer2(num);
            mAnswer[3] = mQuestion.getAnswer3(num);
            mAnswer[4] = mQuestion.getAnswer4(num);
        } else {
            int threshHold = 42;
            results = "";

            for (int i = 0; i < 6; i++) {
                if (mentIllness[i] >= threshHold) {
                    if (i == 0)
                        results = results + "Depression ";
                    if (i == 1)
                        results = results + "Anxiety ";
                    if (i == 2)
                        results = results + "Anorexia ";
                    if (i == 3)
                        results = results + "Bulimia ";
                    if (i == 4)
                        results = results + "Binge Eating ";
                    if (i == 5)
                        results = results + "Domestic Abuse ";
                }
            }

            if (results.equals("") || results.isEmpty()) {
                AlertDialog.Builder alertDialogBuilder2 = new AlertDialog.Builder(MainActivity.this);
                alertDialogBuilder2.setMessage("Your mental health seems to be in check!\nBut if you still have doubts contact us! Thank you!")
                        .setCancelable(false)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder2.create();
                alertDialog.show();
            } else {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
                alertDialogBuilder.setMessage("You have been diagnosed with: " + results +
                        "\nYou will now be directed to a certified expert :).\nSay Something to them!!! Trust me they're nice.")
                        .setCancelable(false)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                openActivity2();
                            }
                        });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        }

    }

    private void openActivity2() {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("Diagnosis", results);
        startActivity(intent);
    }
}
