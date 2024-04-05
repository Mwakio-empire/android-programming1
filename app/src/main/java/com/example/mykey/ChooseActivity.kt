package com.example.mykey

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.mykey.ui.theme.MykeyTheme
import kotlin.math.E

class ChooseActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Choose()

        }
    }
}

@Composable
fun Choose() {
    val mContext = LocalContext.current
    Column(modifier = Modifier.fillMaxSize()
        ,horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {



        //centering an image
        //IMAGE


            Image(painter = painterResource(id = R.drawable.model),
                contentDescription = "footy",
                modifier = Modifier
                    .size(300.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)




        //END OF IMAGE

        Spacer(modifier = Modifier.height(10.dp))

        Column(modifier = Modifier
            .fillMaxWidth()

            .height(360.dp),horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            //text
            androidx.compose.material3.Text(text = "Choose Your Product"
                ,
                fontSize = 34.sp,

                textAlign = TextAlign.Center,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.SansSerif,
                color = Color.Black)

            Spacer(modifier = Modifier.height(10.dp))

            androidx.compose.material3.Text(text = "Welcome to my app. We are here to provide you with the best products ", textAlign = TextAlign.Center,)



        }

        Button(
            onClick = {
                /*to do*/
            },
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta ), modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "NEXT")
        }



    }

}





@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ChoosePreview() {
    Choose()

}