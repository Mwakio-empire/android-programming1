package com.example.mykey

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mykey.ui.theme.MykeyTheme

class AssignmentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assign()

        }
    }
}

@Composable
fun Assign () {

    Column (modifier = Modifier
        .fillMaxSize()
        .padding(10.dp)
        .verticalScroll(rememberScrollState())
    ) {
        Spacer(modifier = Modifier.height(10.dp))
// Row-top
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(painter = painterResource(id = R.drawable.paw),
                contentDescription ="woof" ,
                modifier = Modifier.size(90.dp))

            androidx.compose.material3.Text(
                text = "Woof",
                fontSize = 50.sp ,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 20.dp)
                    
            )
        }
// End of Row-top

        Spacer(modifier = Modifier.height(15.dp))

        // Row1
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
                .background(androidx.compose.ui.graphics.Color.Gray)

        ){
            Image(painter = painterResource(id = R.drawable.dog1),
                contentDescription = "image 1",
                modifier = Modifier
                    .size(70.dp)
                    .padding(5.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(5.dp))

            Column {
                androidx.compose.material3.Text(
                    text = "Koda" ,
                    fontSize = 20.sp ,
                    fontFamily = FontFamily.Cursive ,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.height(5.dp))

                androidx.compose.material3.Text(
                    text = "2 years old" ,
                    fontSize = 15.sp ,
                    fontFamily = FontFamily.Serif
                )

            }

        }
        //  Row1 end

        Spacer(modifier = Modifier.height(15.dp))

        // Row2
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
                .background(androidx.compose.ui.graphics.Color.Gray)

        ){
            Image(painter = painterResource(id = R.drawable.dog2),
                contentDescription = "image 1",
                modifier = Modifier
                    .size(70.dp)
                    .padding(5.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(5.dp))

            Column {
                androidx.compose.material3.Text(
                    text = "Lola" ,
                    fontSize = 20.sp ,
                    fontFamily = FontFamily.Cursive ,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.height(5.dp))

                androidx.compose.material3.Text(
                    text = "2 years old" ,
                    fontSize = 15.sp ,
                    fontFamily = FontFamily.Serif
                )

            }

        }
        //  Row2 end


        Spacer(modifier = Modifier.height(15.dp))

        // Row3 START
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
                .background(androidx.compose.ui.graphics.Color.Gray)

        ){
            Image(painter = painterResource(id = R.drawable.dog3),
                contentDescription = "image 1",
                modifier = Modifier
                    .size(70.dp)
                    .padding(5.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(5.dp))

            Column {
                androidx.compose.material3.Text(
                    text = "Frankie" ,
                    fontSize = 20.sp ,
                    fontFamily = FontFamily.Cursive ,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.height(5.dp))

                androidx.compose.material3.Text(
                    text = "2 years old" ,
                    fontSize = 15.sp ,
                    fontFamily = FontFamily.Serif
                )

            }

        }
        //  Row3 end

        Spacer(modifier = Modifier.height(15.dp))

        // Row4
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
                .background(androidx.compose.ui.graphics.Color.Gray)

        ){
            Image(painter = painterResource(id = R.drawable.dog4),
                contentDescription = "image 1",
                modifier = Modifier
                    .size(70.dp)
                    .padding(5.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(5.dp))

            Column {
                androidx.compose.material3.Text(
                    text = "Nox" ,
                    fontSize = 20.sp ,
                    fontFamily = FontFamily.Cursive ,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.height(5.dp))

                androidx.compose.material3.Text(
                    text = "2 years old" ,
                    fontSize = 15.sp ,
                    fontFamily = FontFamily.Serif
                )

            }

        }
        //  Row4 end



        Spacer(modifier = Modifier.height(15.dp))

        // Row5
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
                .background(androidx.compose.ui.graphics.Color.Gray)

        ){
            Image(painter = painterResource(id = R.drawable.dog5),
                contentDescription = "image 1",
                modifier = Modifier
                    .size(70.dp)
                    .padding(5.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(5.dp))

            Column {
                androidx.compose.material3.Text(
                    text = "Faye" ,
                    fontSize = 20.sp ,
                    fontFamily = FontFamily.Cursive ,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.height(5.dp))

                androidx.compose.material3.Text(
                    text = "2 years old" ,
                    fontSize = 15.sp ,
                    fontFamily = FontFamily.Serif
                )

            }

        }
        //  Row5 end



        Spacer(modifier = Modifier.height(15.dp))

        // Row6
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
                .background(androidx.compose.ui.graphics.Color.Gray)

        ){
            Image(painter = painterResource(id = R.drawable.dog6),
                contentDescription = "image 1",
                modifier = Modifier
                    .size(70.dp)
                    .padding(5.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(5.dp))

            Column {
                androidx.compose.material3.Text(
                    text = "Bella" ,
                    fontSize = 20.sp ,
                    fontFamily = FontFamily.Cursive ,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.height(5.dp))

                androidx.compose.material3.Text(
                    text = "2 years old" ,
                    fontSize = 15.sp ,
                    fontFamily = FontFamily.Serif
                )

            }

        }
        //  Row6 end



        Spacer(modifier = Modifier.height(15.dp))

        // Row7
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
                .background(androidx.compose.ui.graphics.Color.Gray)

        ){
            Image(painter = painterResource(id = R.drawable.dog7),
                contentDescription = "image 1",
                modifier = Modifier
                    .size(70.dp)
                    .padding(5.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(5.dp))

            Column {
                androidx.compose.material3.Text(
                    text = "Moana" ,
                    fontSize = 20.sp ,
                    fontFamily = FontFamily.Cursive ,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.height(5.dp))

                androidx.compose.material3.Text(
                    text = "2 years old" ,
                    fontSize = 15.sp ,
                    fontFamily = FontFamily.Serif
                )

            }

        }
        //  Row7 end


        Spacer(modifier = Modifier.height(15.dp))

        // Row8
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
                .background(androidx.compose.ui.graphics.Color.Gray)

        ){
            Image(painter = painterResource(id = R.drawable.dog8),
                contentDescription = "image 1",
                modifier = Modifier
                    .size(70.dp)
                    .padding(5.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(5.dp))

            Column {
                androidx.compose.material3.Text(
                    text = "Nox" ,
                    fontSize = 20.sp ,
                    fontFamily = FontFamily.Cursive ,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.height(5.dp))

                androidx.compose.material3.Text(
                    text = "2 years old" ,
                    fontSize = 15.sp ,
                    fontFamily = FontFamily.Serif
                )

            }

        }
        //  Row8 end





    }

}


@Preview(showBackground = true)
@Composable
fun AssignPreview () {
    Assign()
}