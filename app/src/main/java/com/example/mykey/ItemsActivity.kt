package com.example.mykey

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.mykey.ui.theme.MykeyTheme

class ItemsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Products()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Products(){
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current
        //topApp bar

        TopAppBar(title = { Text(text = "", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack, contentDescription = "back",
                        tint = Color.Black
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
                        imageVector = Icons.Default.ShoppingCart, contentDescription = "shopping",
                        tint = Color.Black
                    )

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Menu, contentDescription = "settings",
                        tint = Color.Black
                    )

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "notifications",
                        tint = Color.White
                    )


                }

            }
        )

        Row (modifier = Modifier.fillMaxWidth(),){
            //Button1
                Button(onClick = {
                    mContext.startActivity(Intent(mContext,DestinationActivity::class.java)) },colors = ButtonDefaults.buttonColors(Color.White )) {
                    Text(text = "Chairs", color = Color.Black)
                }
            //Button2

                Button(onClick = {
                    mContext.startActivity(Intent(mContext,DestinationActivity::class.java)) },colors = ButtonDefaults.buttonColors(Color.White )) {
                    Text(text = "Tables", color = Color.Black)
                }

            //Button3

            Button(onClick = {
                mContext.startActivity(Intent(mContext,DestinationActivity::class.java)) },colors = ButtonDefaults.buttonColors(Color.White )) {
                Text(text = "Sofa", color = Color.Black)
            }

            //Button4

            Button(onClick = {
                mContext.startActivity(Intent(mContext,DestinationActivity::class.java)) },colors = ButtonDefaults.buttonColors(Color.White )) {
                Text(text = "Beds", color = Color.Black)
            }

        }
        

        //Row2
        Row (){



        }



    }
}

@Preview(showBackground = true)
@Composable
fun ProductsPreview() {
    Products()

}