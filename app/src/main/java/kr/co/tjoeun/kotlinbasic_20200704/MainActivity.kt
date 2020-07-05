package kr.co.tjoeun.kotlinbasic_20200704

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //적용하기 버튼 눌린 경우
        applyBtn.setOnClickListener {

            //inputEdt 에 입력된 내용(text속성의 값)을 받아와서(get) 변수로 저장

            val inputContent = inputEdt.text.toString()

            // resultTxt 의 내용(text 속성의 값)으로 반영(set)
            resultTxt.text = inputContent

        }

        touchBtn.setOnClickListener {
            //터치 버튼이 눌리면 실행될 코드를 적는 공간

            Toast.makeText(this,"버튼 눌림", Toast.LENGTH_SHORT).show()

            Log.d("메인화면", "화면눌림")

            //코틀린 문법 / 개념 확인

            val num1 = 10
            num1.toString() // Int도 참조형 변수임을 확인

            //when 활용 연습

            when (num1) {
                10 -> {
                    Log.d("조건문연습", "num1에 10이 있다")
                    Log.d("조건문연습", " num1에 10이 있을때 둘째 줄")
                }

                15 -> {
                    Log.d("조건문연습", "num1에 15가 있다")
                }
                17, 18, 19 -> {
                    Log.d("조건문연습", "num1이 17,18,19중 하나다.")
                }
                in 20..29 -> {
                    Log.d("조건문연습", "num1이 20~29이다.")
                }
                else -> {
                    Log.d("조건문연습", "다른 숫자다.")
                }
            }

        }

    }
}