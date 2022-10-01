package com.example.birthdaygreetingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaygreetingapp.ui.theme.BirthDayGreetingAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthDayGreetingAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthDayGreeting(name = "Shubham")
                }
            }
        }
    }
}

@Composable
fun BirthDayGreeting(name: String){
    Column(modifier = Modifier.fillMaxSize()) {
        Text(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp), text = "Happy Birthday $name :)", fontSize = 30.sp, fontWeight = FontWeight.Bold)
        Text(modifier = Modifier.fillMaxWidth().padding(10.dp), text = "- From Shivam", fontSize = 20.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Right)
        Image(modifier = Modifier.fillMaxWidth().fillMaxHeight(), painter = painterResource(R.drawable.birthday), contentDescription = "Happy Birthday!!" )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    BirthDayGreetingAppTheme {
        BirthDayGreeting(name = "Shubham")
    }
}