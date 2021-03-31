package com.example.final3

object Constants {
    const val USER_NAME: String = "Username"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answer"


    fun getQuestion(): ArrayList<Question> {
        val questionsList = java.util.ArrayList<Question>()

        val que1 = Question(1, "OSI Layer มีทั้งหมดกี่ Layer",

                "5 Layer",
                "6 Layer",
                "7 Layer",
                "8 Layer",
                3
        )
        questionsList.add(que1)

        val que2 = Question(2, "จงเรียงลำดับขนาดของเครือข่าย",

                "LAN MAN WAN",
                "LAN WAN MAN",
                "WAN MAN LAN",
                "WAN LAN MAN",
                1

        )
        questionsList.add(que2)

        val que3 = Question(3, "1 + 2 x 3 - 4 ÷ 4 = ?",

                "1 เท่า",
                "2 เท่า",
                "3 เท่า",
                "4 เท่า",
                4
        )
        questionsList.add(que3)

        val que4 = Question(4, "What country doest this flag belong to?",

                "4",
                "5",
                "6",
                "7",
                3
        )
        questionsList.add(que4)

        val que5 = Question(5, "IP Address 192.168.1.21/24 จัดเป็น IP คลาสใด",

                "Class A",
                "Class B",
                "Class C",
                "Class D",
                4
        )
        questionsList.add(que5)

        return questionsList
    }
}