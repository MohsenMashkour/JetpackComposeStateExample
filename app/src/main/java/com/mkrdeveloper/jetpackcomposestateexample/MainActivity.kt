package com.mkrdeveloper.jetpackcomposestateexample

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mkrdeveloper.jetpackcomposestateexample.ui.theme.JetpackComposeStateExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeStateExampleTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp(){

    var count by remember {
        mutableStateOf(0)
    }

    Column(modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = {
            count++
            Log.d("Count","$count")
        }) {

            Text(text = "Count = $count")
        }
        Spacer(modifier = Modifier.size(25.dp))
        Text(text = "Count = $count")

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeStateExampleTheme {
        MyApp()
    }
}