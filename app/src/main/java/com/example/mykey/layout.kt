package com.example.mykey

import android.content.Intent
import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mykey.ui.theme.MykeyTheme

class layout : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Layout()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout(){
    Column(modifier = Modifier.fillMaxSize()
        .paint(painterResource(id = R.drawable.background), contentScale = ContentScale.FillBounds)) {
        
        val mContext = LocalContext.current


        //topApp bar
        TopAppBar(title = { androidx.compose.material3.Text(text = "Home" , color = Color.White)},
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "mENU",
                        tint = Color.White)
                    
                }

            },
            actions = {
                IconButton(onClick = { val shareIntent=Intent(Intent.ACTION_SEND)
                    shareIntent.type="text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                    mContext.startActivity(Intent.createChooser(shareIntent, "Share"))}) {
                    Icon(imageVector = Icons.Default.Share, contentDescription = "share",
                        tint = Color.White)
                    
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Settings, contentDescription = "settings",
                        tint = Color.White)

                }
            }
            )
        //end of top app bar
        Spacer(modifier = Modifier.height(5.dp))
        androidx.compose.material3.Text(text = "Breeds of dogs", color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center)
        Divider()

        //row

        Row {
            Image(painter = painterResource(id =R.drawable.dog1 ) , contentDescription = "dog1",
                modifier = Modifier.size(width = 200.dp, height = 200.dp))
            Spacer(modifier = Modifier.width(20.dp))

            Column (){

                androidx.compose.material3.Text(text = "BULLDOG", color = Color.White,
                    fontSize = 18.sp)
                androidx.compose.material3.Text(text = "bulldog is an amazing dog", color = Color.White,
                    fontSize = 18.sp)
            }
        }
        Spacer(modifier = Modifier.height(5.dp))

        Row {
            Image(painter = painterResource(id =R.drawable.dog2 ) , contentDescription = "dog1",
                modifier = Modifier.size(width = 200.dp, height = 200.dp))
            
            Spacer(modifier = Modifier.width(20.dp))
            Column {
                androidx.compose.material3.Text(text = "GERMAN SHEPHERD",
                    fontSize = 18.sp)
                androidx.compose.material3.Text(text = "german shepherd is an amazing dog",
                    fontSize = 18.sp)
            }
            Spacer(modifier = Modifier.height(5.dp))
        


        }
        Row {
            Button(onClick = {  mContext.startActivity(Intent(mContext,MainActivity::class.java)) },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Red), modifier = Modifier

                    .padding(start = 30.dp, end = 30.dp)
                ){
                androidx.compose.material3.Text(text = "BACK")
                androidx.compose.material3.Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "arrowback")
            }
            Spacer(modifier = Modifier.height(5.dp))
            Button(onClick = { /*TODO*/ },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Red), modifier = Modifier

                    .padding(start = 30.dp, end = 30.dp)
            ){
                androidx.compose.material3.Text(text = "NEXT")
            }

        }
        




    }
}

@Preview(showBackground = true)
@Composable
fun LayoutPreview(){
    Layout()
}