package com.example.mykey

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mykey.ui.theme.MykeyTheme

class DestinationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Destination()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Destination(){
    Column(modifier = Modifier.fillMaxSize()) {

        val mContext = LocalContext.current

        //topApp bar

        TopAppBar(title = { Text(text = "Destination", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Menu, contentDescription = "mENU",
                        tint = Color.White
                    )

                }

            },
            actions = {
                IconButton(onClick = {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                    mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
                }) {
                    Icon(
                        imageVector = Icons.Default.Share, contentDescription = "share",
                        tint = Color.White
                    )

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Settings, contentDescription = "settings",
                        tint = Color.White
                    )

                }
            }
        )
        //end of top app bar

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
            contentAlignment = Alignment.Center,
        ) {

            //MAKING AN IMAGE SPAN THE ENTIRE PAGE UNDER A SPECIFIED HEIGHT

            Image(
                painter = painterResource(id = R.drawable.lasvegas),
                contentDescription = "vegas",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )

            // END OF MAKING AN IMAGE SPAN THE ENTIRE PAGE UNDER A SPECIFIED HEIGHT

            androidx.compose.material3.Text(
                text = "Lets plan your next vacation",
                fontWeight = FontWeight.ExtraBold,
                color = Color.White,
                fontSize = 30.sp,
                textAlign = TextAlign.Center
            )

        }
        Spacer(modifier = Modifier.height(10.dp))
        //end of box
        var search by remember {
            mutableStateOf("")
        }
        //search bar

        OutlinedTextField(value = search, onValueChange = { search = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            placeholder = { androidx.compose.material3.Text(text = "What's your next destination") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "search"
                )
            })
        //end of search bar
        Spacer(modifier = Modifier.height(10.dp))

        androidx.compose.material3.Text(
            text = "Recently viewed",
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier.padding(start = 20.dp), fontStyle = FontStyle.Italic
        )

        Spacer(modifier = Modifier.height(10.dp))


        Row {

            Card(
                modifier = Modifier
                    .height(250.dp)
                    .width(200.dp)
            ) {
                Column {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.lasvegas),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    androidx.compose.material3.Text(
                        text = "Las Vegas",
                        fontSize = 15.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )

                }


            }
            //end of card 1



            Card(
                modifier = Modifier
                    .height(250.dp)
                    .width(200.dp)
            ) {
                Column {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.lasvegas),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    androidx.compose.material3.Text(
                        text = "Las Vegas",
                        fontSize = 15.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )

                }


            }
            //end of card 1



            Card(
                modifier = Modifier
                    .height(250.dp)
                    .width(200.dp)
            ) {
                Column {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.lasvegas),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    androidx.compose.material3.Text(
                        text = "Las Vegas",
                        fontSize = 15.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )

                }


            }
            //end of card 1



        }
        //end of row 1


    }
}

@Preview(showBackground = true)
@Composable
fun DestinationPreview() {
    Destination()

}