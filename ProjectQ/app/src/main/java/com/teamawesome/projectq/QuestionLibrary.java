package com.teamawesome.projectq;

public class QuestionLibrary {
    private String mQuestions[] = {
            "Waar komt de term ‘Bug’ vandaan?",
            "De eerste muis was van...",
            "De eerste harde schijf had een capaciteit van:",
            "Bill Gates is Microsoft begonnen:",
            "De 12 engineers die de eerste IBM pc maakte, waren bekend als:",
            "Wie wordt geroepen als er iets mis met een computer/tv/smartphone",
            "Logisch nadenken is",
            "ISP staat voor",
            "1000 bit is",
            "Iemand belt met je met problemen of zijn computer. Wat zeg je?",
            "Waar staat LAN voor?",
            "Een firewall is voor",
            "Wanneer is de eerste elektronische computer in gebruik genomen?"
    };
    private String mChoices [][] = {
            {"Programmeur Humprey ‘Bugs’ Bogaard", "Een mot", "'Burned User Group'", "staat voor Buggered"},
            {"Plastic", "Metaal", "Hout", "Glas"},
            {"500 kb", "1 mb", "5 mb", "10 mb"},
            {"Terwijl hij werkte bij Apple", "In het kantoor van Apple", "In zijn garage", "met Steve Jobs"},
            {"the dozen eggheads", "The dirty dozen", "the 12 apostles", "Masters of the universe"},
            {"je vader", "je moeder", "je neef", "jou"},
            {"lastig", "leuk", "te doen", "the only way"},
            {"Internet Service Provider", "Internal Storage Partition", "International Storage Provide", "Internal Storage Provider"},
            {"1 kb", "1 mb", ">1 kb", "<1 kb"},
            {"Have you tried turning it off an on again?", "Have you tried turning it off an on again?", "Have you tried turning it off an on again?", "Have you tried turning it off an on again?"},
            {"Local Assisted Network", "Lucky Answer Noob", "Local Area Network", "Lucky Ass Noob"},
            {"Het verwijderen van virussen","Het buitenhouden van hackers", "Een deel van de computer dat beschermen tegen overheaten", "Geen van deze"},
            {"1945", "1965", "1943", "1953"}
    };
    private String mCorrectAnswers [] = {"Een mot","Hout","5 mb","In zijn garage","The dirty dozen","jou","the only way",
            "Internet Service Provider","<1 kb","Have you tried turning it off an on again?","Local Area Network",
            "Het buitenhouden van hackers","1943"};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }
    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }
    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }
    public String getChoice4(int a) {
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
