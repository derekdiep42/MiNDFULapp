package com.example.mentaldisorderapp;

public class Questions {

    public String mQuestions[] = {
            "I feel confident in the way I look",
            "I feel guilty for eating",
            "People often tell me that I am very skinny",
            "I experience insomnia and fatigue often",
            "My period is abnormal",
            "Sometimes I feel like I can't control my eating",
            "I force myself to vomit after meals sometimes",
            "I don't feel like having sex as much as usual",
            "I occasionally eat large amounts of food in one session",
            "I try diets often but see minimal results",
            "Sometimes I eat when I'm already full or not hungry",
            "Sometimes I have thoughts of death, suicide and self harm",
            "Often I feel hopeless, empty, and sad",
            "I often avoid social interactions and gatherings",
            "I feel guilty and often worry about my past",
            "Sometimes I have angry outbursts even over small things",
            "I often worry about worst case scenarios and over-think scenarios",
            "I hate the everlasting feeling of uncertainty",
            "Do you always feel threatened?",
            "I have an immense fear of being belittled",
            "I experience nausea, dizziness, and light-headedness often",
            "I often feel overwhelming regret and shame",
            "I am easily startled and always on guard",
            "Do you distance yourself from family and friends?",
            "Do you experience terrors often?",
            "You've lost interest in activities you usually enjoy (hobbies, sports, sex)",
            "Sometimes you feel scared of your partner",
            "You feel like you have little control over your choices " +
                    "(e.g. what you wear, how you use your money)",
            "You've spent significantly less time with your friends and family" +
                    "because your partner doesn't want you to",
            "You are afraid to say no to sex when your partner wants it",
            "Your partner threatens to harm you or your close ones",
            "Your partner refuses to use contraceptives during sex",
            "Your partner makes you feel like you owe them sex",
            "Your partner keeps close tabs on where you go and what you do",
            "I'm scared of gaining weight",
            "I often feel dehydrated",
            "I tend to eat a lot when I'm alone or in secret"
    };

    private String mAnswers[][] = {
            {"000000", "000000", "000000", "104440", "215550"},
            {"015550", "004440", "000000", "000000", "000000"},
            {"005500", "004400", "000000", "000000", "000000"},
            {"215000", "104000", "000000", "000000", "000000"},
            {"024500", "003400", "000000", "000000", "000000"},
            {"000550", "000440", "000000", "000000", "000000"},
            {"000900", "000800", "000000", "000000", "000000"},
            {"514500", "403400", "000000", "000000", "000000"},
            {"000090", "000080", "000000", "000000", "000000"},
            {"005050", "004040", "000000", "000000", "000000"},
            {"000250", "000140", "000000", "001000", "002000"},
            {"920000", "810000", "000000", "000000", "000000"},
            {"530000", "420000", "000000", "000000", "000000"},
            {"550000", "440000", "000000", "000000", "000000"},
            {"554330", "443220", "000000", "000000", "000000"},
            {"520000", "410000", "000000", "000000", "000000"},
            {"250000", "140000", "000000", "000000", "000000"},
            {"050000", "040000", "000000", "000000", "000000"},
            {"030004", "020003", "000000", "000000", "000000"},
            {"133220", "022110", "000000", "000000", "000000"},
            {"035520", "024410", "000000", "000000", "000000"},
            {"550000", "440000", "000000", "000000", "000000"},
            {"050005", "040004", "000000", "000000", "000000"},
            {"550000", "440000", "000000", "000000", "000000"},
            {"440000", "330000", "000000", "000000", "000000"},
            {"530000", "420000", "000000", "000000", "000000"},
            {"000009", "000008", "000000", "000000", "000000"},
            {"000005", "000004", "000000", "000000", "000000"},
            {"000005", "000004", "000000", "000000", "000000"},
            {"010005", "000004", "000000", "000000", "000000"},
            {"000009", "000008", "000000", "000000", "000000"},
            {"000005", "000004", "000000", "000000", "000000"},
            {"000005", "000004", "000000", "000000", "000000"},
            {"000005", "000004", "000000", "000000", "000000"},
            {"005550", "004440", "000000", "000000", "000000"},
            {"005350", "004240", "000000", "000000", "000000"},
            {"000050", "000040", "000000", "000000", "000000"}
    };

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice0() {
        String choice = "Strongly Agree";
        return choice;
    }

    public String getChoice1() {
        String choice = "Agree";
        return choice;
    }

    public String getChoice2() {
        String choice = "Neutral";
        return choice;
    }

    public String getChoice3() {
        String choice = "Disagree";
        return choice;
    }

    public String getChoice4() {
        String choice = "Strongly Disagree";
        return choice;
    }

    public String getAnswer0(int a) {
        String answer = mAnswers[a][0];
        return answer;
    }

    public String getAnswer1(int a) {
        String answer = mAnswers[a][1];
        return answer;
    }

    public String getAnswer2(int a) {
        String answer = mAnswers[a][2];
        return answer;
    }

    public String getAnswer3(int a) {
        String answer = mAnswers[a][3];
        return answer;
    }

    public String getAnswer4(int a) {
        String answer = mAnswers[a][4];
        return answer;
    }

    public String getQuestionNumber(int a) {
        String answer = "Question: " + (a + 1);
        return answer;
    }


}
